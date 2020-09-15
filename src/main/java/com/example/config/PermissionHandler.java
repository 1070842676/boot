package com.example.config;

import com.example.entity.Result;
import io.jsonwebtoken.SignatureException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wangH
 * @date 2020/9/10 14:11
 */
@RestControllerAdvice
public class PermissionHandler {
    @ExceptionHandler(value = {SignatureException.class})
    public Result authorizationException(SignatureException e){
        return new Result(500,"服务器错误",e.getMessage());
    }
}
