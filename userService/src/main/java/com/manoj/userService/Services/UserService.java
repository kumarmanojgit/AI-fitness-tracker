package com.manoj.userService.Services;

import com.manoj.userService.DTO.RegisterRequest;
import com.manoj.userService.DTO.UserResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    @Nullable UserResponse register(RegisterRequest request);

    @Nullable UserResponse getUserProfile(String userId);
}
