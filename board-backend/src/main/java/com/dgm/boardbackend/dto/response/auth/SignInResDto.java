package com.dgm.boardbackend.dto.response.auth;

import com.dgm.boardbackend.common.ResCode;
import com.dgm.boardbackend.common.ResMessage;
import com.dgm.boardbackend.dto.response.ResDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class SignInResDto extends ResDto {

    private String token;
    private int expirationTime;
    private SignInResDto(String token) {
        super(ResCode.SUCCESS, ResMessage.SUCCESS);
        this.token = token;
        this.expirationTime = 3600;
    }

    public static ResponseEntity<SignInResDto> success(String token) {
        SignInResDto result = new SignInResDto(token);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResDto> signInFail() {
        ResDto result = new ResDto(ResCode.SIGN_IN_FAIL, ResMessage.SIGN_IN_FAIL);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
    }

}
