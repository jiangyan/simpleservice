package com.servision.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.servision.model.InternalUser;
import com.servision.repository.InternalUserRepository;

import java.util.List;

@RestController
@RequestMapping("/internalusers")
public class InternalUserController {

    @Autowired
    private InternalUserRepository internalUserRepository;

    @PostMapping
    public InternalUser createUser(@RequestBody InternalUser user) {
        return internalUserRepository.save(user);
    }

    @GetMapping
    public List<InternalUser> listUsers() {
        return internalUserRepository.findAll();
    }
}