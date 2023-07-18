package com.yash.greenstitch.service;

import com.yash.greenstitch.payload.LoginDto;
import com.yash.greenstitch.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}