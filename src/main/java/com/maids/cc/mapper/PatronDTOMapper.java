package com.maids.cc.mapper;

import com.maids.cc.dto.PatronDTO;
import com.maids.cc.models.Patron;

import java.util.function.Function;

public class PatronMapper implements Function<Patron, PatronDTO> {

        @Override
        public PatronDTO apply(Patron patron) {
            return new PatronDTO(
                    patron.getId(),
                    patron.getUsername(),
                    patron.getEmail(),
                    patron.getPassword(),
                    patron.getAge()
            );
        }
}
