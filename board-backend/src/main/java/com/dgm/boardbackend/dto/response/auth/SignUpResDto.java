package com.dgm.boardbackend.dto.response.auth;

import com.dgm.boardbackend.common.ResCode;
import com.dgm.boardbackend.common.ResMessage;
import com.dgm.boardbackend.dto.response.ResDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class SignUpResDto extends ResDto {

    private SignUpResDto() {
        super(ResCode.SUCCESS, ResMessage.SUCCESS);
    }

    public static ResponseEntity<SignUpResDto> success() {
        SignUpResDto result = new SignUpResDto();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResDto> duplicateEmail() {
        ResDto result = new ResDto(ResCode.DUPLICATE_EMAIL, ResMessage.DUPLICATE_EMAIL);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    public static ResponseEntity<ResDto> duplicateNickname() {
        ResDto result = new ResDto(ResCode.DUPLICATE_NICKNAME, ResMessage.DUPLICATE_NICKNAME);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    public static ResponseEntity<ResDto> duplicateTelNumber() {
        ResDto result = new ResDto(ResCode.DUPLICATE_TEL_NUMBER, ResMessage.DUPLICATE_TEL_NUMBER);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

}
