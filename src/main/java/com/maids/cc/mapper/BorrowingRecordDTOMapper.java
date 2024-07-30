package com.maids.cc.mapper;

import com.maids.cc.dto.BorrowingRecordDTO;
import com.maids.cc.models.BorrowingRecord;

import java.util.function.Function;

public class BorrowingRecordMapper implements Function<BorrowingRecord, BorrowingRecordDTO> {

        @Override
        public BorrowingRecordDTO apply(BorrowingRecord borrowingRecord) {
            return new BorrowingRecordDTO(
                    borrowingRecord.getId(),
                    borrowingRecord.getBorrowingDate(),
                    borrowingRecord.getReturnDate(),
                    new BookMapper().apply(borrowingRecord.getBook()),
                    new PatronMapper().apply(borrowingRecord.getPatron())
            );
        }
}
