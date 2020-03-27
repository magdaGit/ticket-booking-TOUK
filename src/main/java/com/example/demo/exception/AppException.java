package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppException extends RuntimeException {
    private ExceptionInfo exceptionInfo;

    public AppException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionInfo = ExceptionInfo.builder()
                .message(exceptionMessage)
                .dateTime(LocalDateTime.now())
                .build();
    }

    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }
}
