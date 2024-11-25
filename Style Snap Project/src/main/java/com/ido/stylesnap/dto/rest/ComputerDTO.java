package com.ido.stylesnap.dto.rest;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDTO {
    private String serial;
    private String name;
    private Integer price;
    private LocalDate release;
}
