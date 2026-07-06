package com.manoj.userService.Services.ImplService;

import com.manoj.userService.DTO.RegisterRequest;
import com.manoj.userService.DTO.UserResponse;
import com.manoj.userService.Models.User;
import com.manoj.userService.Repository.UserRepository;
import com.manoj.userService.Services.UserService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public  UserResponse register(RegisterRequest request) {

        if(userRepository.existsByEmail(request.getEmail()))
        {
            throw new RuntimeException("Email already exist");
        }
        User user=new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        User savedUser=userRepository.save(user);
        UserResponse userResponse=new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setFirstName(savedUser.getLastName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponse;
    }

    @Override
    public  UserResponse getUserProfile(String userId) {

        User user=userRepository.findById(userId)
                .orElseThrow(()->new RuntimeException("User Not Found"));
        UserResponse userResponse=new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setPassword(user.getPassword());
        userResponse.setFirstName(user.getLastName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());
        return userResponse;
    }
}
