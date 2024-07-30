package com.maids.cc.mapper;

import com.maids.cc.dto.BookDTO;
import com.maids.cc.models.Book;

import java.util.function.Function;

public class BookMapper implements Function<Book, BookDTO> {

        @Override
        public BookDTO apply(Book book) {
            return new BookDTO(
                    book.getId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublishedYear(),
                    book.getIsbn()
            );
        }

}
