package com.example.IA03.controller;
import com.example.IA03.dto.request.AuthenticationRequest;
import com.example.IA03.dto.response.ApiResponse;
import com.example.IA03.dto.request.UserCreationRequest;


import com.example.IA03.dto.response.AuthenticationResponse;
import com.example.IA03.dto.response.UserResponse;
import com.example.IA03.entity.User;
import com.example.IA03.mapper.UserMapper;
import com.example.IA03.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;
    private final UserMapper userMapper;

    @PostMapping("/register")
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request)
    {
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userMapper.toUserResponse(userService.createUser(request)));
        return apiResponse;
    }
    @PostMapping("/login")
    ApiResponse<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        var result = userService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(result)
                .build();
    }
}
