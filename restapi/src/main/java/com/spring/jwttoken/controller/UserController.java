package com.spring.jwttoken.controller;

import com.spring.jwttoken.dto.UserDto;
import com.spring.jwttoken.entity.UserEntity;
import com.spring.jwttoken.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserEntity> signup(@RequestBody @Valid UserDto userDto){
        return new ResponseEntity<>(userService.signup(userDto), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<String> getMyUserinfo(){
        return ResponseEntity.ok("user");
    }

    @PostMapping("/user/{username}")
    public ResponseEntity<String> getUserinfo(@PathVariable String username){
        return ResponseEntity.ok("admnin");
    }
}
