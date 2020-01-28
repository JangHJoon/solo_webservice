package com.freelec.springboot.web.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
