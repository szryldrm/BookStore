package com.softisler.BookStore.DataAccess.Abstract;

import com.softisler.BookStore.Entities.Concrete.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBookDal extends MongoRepository<Book, String> {
}
