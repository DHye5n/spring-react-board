package com.dgm.boardbackend.dto.response;

import com.dgm.boardbackend.common.ResCode;
import com.dgm.boardbackend.common.ResMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@AllArgsConstructor
public class ResDto {

    private String code;
    private String message;

    public static ResponseEntity<ResDto> databaseError() {
        ResDto responseBody = new ResDto(ResCode.DATABASE_ERROR, ResMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    public static ResponseEntity<ResDto> validationFailed() {
        ResDto responseBody = new ResDto(ResCode.VALIDATION_FAILED, ResMessage.VALIDATION_FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
}
