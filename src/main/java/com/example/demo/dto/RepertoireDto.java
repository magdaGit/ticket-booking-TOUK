package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RepertoireDto {

    private Long id;
    private Long movieId;
    private LocalDate date;
    private LocalTime time;
    private Long roomId;
}
