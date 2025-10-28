package com.example.IA03.mapper;

import com.example.IA03.dto.request.UserCreationRequest;

import com.example.IA03.dto.response.UserResponse;
import com.example.IA03.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
}
