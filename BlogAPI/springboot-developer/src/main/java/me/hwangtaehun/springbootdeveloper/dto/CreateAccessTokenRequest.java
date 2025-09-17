package me.hwangtaehun.springbootdeveloper.dto;

import lombok.*;

@Getter
@Setter
public class CreateAccessTokenRequest {
    private String refreshToken;
}