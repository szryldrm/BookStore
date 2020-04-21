package com.softisler.BookStore.Entities.Concrete;

import com.softisler.BookStore.Core.Entities.IEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Book implements IEntity {

    @Id
    public String id;
    public int authorId;
    public String name;
    public float price;
}
