package com.softisler.BookStore.Business.Abstract;

import com.softisler.BookStore.Core.Utilities.Result.DataResult;
import com.softisler.BookStore.Core.Utilities.Result.Result;
import com.softisler.BookStore.Entities.Concrete.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    DataResult<List<Book>> GetAll();
    DataResult<Optional<Book>> GetById(String id);
    Result Add(Book customer);
    Result Delete(String id);
}
