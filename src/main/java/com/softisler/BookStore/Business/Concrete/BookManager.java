package com.softisler.BookStore.Business.Concrete;

import com.softisler.BookStore.Business.Abstract.IBookService;
import com.softisler.BookStore.Business.Constants.Messages;
import com.softisler.BookStore.Core.Utilities.Result.*;
import com.softisler.BookStore.DataAccess.Abstract.IBookDal;
import com.softisler.BookStore.Entities.Concrete.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookManager implements IBookService {

    @Autowired
    private IBookDal _bookDal;

    @Override
    public DataResult<List<Book>> GetAll() {
        return new SuccessDataResult<List<Book>>(_bookDal.findAll(), true);
    }

    @Override
    public DataResult<Optional<Book>> GetById(String id) {
        Optional<Book> tempResult = _bookDal.findById(id);
        if (tempResult != null){
            return new SuccessDataResult<Optional<Book>>(tempResult, true);
        }
        else
            return new ErrorDataResult<Optional<Book>>(null, false, Messages.BookNotFound);
    }

    @Override
    public Result Add(Book book) {
        _bookDal.save(book);
        return new SuccessResult(Messages.BookAdded);
    }

    @Override
    public Result Delete(String id) {
        Optional<Book> OptionalBook =  _bookDal.findById(id);
        Book tempBook = OptionalBook.get();
        _bookDal.delete(tempBook);
        return new SuccessResult(Messages.BookDeleted);
    }


}
