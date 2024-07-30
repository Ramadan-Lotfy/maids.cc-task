package com.maids.cc.services;

import com.maids.cc.mapper.BookDTOMapper;
import com.maids.cc.repositries.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImp {
    private final BookRepository bookRepository;
    private final BookDTOMapper bookDTOMapper;
}
