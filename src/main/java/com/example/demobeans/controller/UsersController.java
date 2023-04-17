package com.example.demobeans.controller;

import com.example.demobeans.dto.ResUserDto;
import com.example.demobeans.repository.UsersRepository;
import entity.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UsersController {
    private final UsersRepository usersRepository;
    private final ModelMapper modelMapper;

    @GetMapping(value = "/getAll")
    public List<ResUserDto> getAll() {

        return usersRepository
                .getAllUsers().stream()
                .map(user -> modelMapper.map(user, ResUserDto.class))
                .collect(Collectors.toList());
    }
}
