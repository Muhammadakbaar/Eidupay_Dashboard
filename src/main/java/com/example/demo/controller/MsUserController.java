package com.example.demo.controller;

import com.example.demo.model.MsTipeTransaksi;
import com.example.demo.model.MsUser;
import com.example.demo.repository.MsTipeTransaksiRepository;
import com.example.demo.repository.MsUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MsUserController {
    private MsUserRepository msUserRepository;

    @Autowired
    public MsUserController(MsUserRepository msUserRepository){
        this.msUserRepository = msUserRepository;
    }
    @GetMapping("/user/all")
    Iterable<MsUser> all(){
        return msUserRepository.findAll();
    }
    @GetMapping("/user/{id}")
    MsUser userById(@PathVariable Long id){
        return msUserRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/user/save")
    MsUser save(@RequestBody MsUser user){
        return msUserRepository.save(user);
    }
}
