package com.locnht.SpringSecurityWithJWTToken.book;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookRequest {

    private Integer id;

    private String author;

    private String isbn;
}
