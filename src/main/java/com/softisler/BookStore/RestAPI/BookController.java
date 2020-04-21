package com.softisler.BookStore.RestAPI;

import com.softisler.BookStore.Business.Abstract.IBookService;
import com.softisler.BookStore.Business.Constants.Messages;
import com.softisler.BookStore.Core.Utilities.Result.DataResult;
import com.softisler.BookStore.Core.Utilities.Result.Result;
import com.softisler.BookStore.Entities.Concrete.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private IBookService _bookService;

    @GetMapping("/books")
    public ResponseEntity<?> GetAll(){
        DataResult<List<Book>> result = _bookService.GetAll();

        if (result.Success) {
            return new ResponseEntity<>(result.Data, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<?> GetById(@PathVariable String id){
        DataResult<Optional<Book>> result = _bookService.GetById(id);

        if (result.Success) {
            return new ResponseEntity<>(result.Data, HttpStatus.OK);
        }
        return new ResponseEntity<>(result.Message, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/books/add")
    public ResponseEntity<?> Add(@RequestBody Book book){
        Result result = _bookService.Add(book);

        if (result.Success) {
            return new ResponseEntity<>(result.Message, HttpStatus.OK);
        }
        return new ResponseEntity<>(Messages.SomethingWrong, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/books/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable String id){
        Result result = _bookService.Delete(id);

        if (result.Success) {
            return new ResponseEntity<>(result.Message, HttpStatus.OK);
        }
        return new ResponseEntity<>(result.Message, HttpStatus.BAD_REQUEST);

    }

}
