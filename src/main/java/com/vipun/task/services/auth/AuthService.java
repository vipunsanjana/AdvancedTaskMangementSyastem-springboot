package com.vipun.task.services.auth;

import com.vipun.task.dto.SignupRequest;
import com.vipun.task.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
