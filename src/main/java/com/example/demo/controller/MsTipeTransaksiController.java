package com.example.demo.controller;

import com.example.demo.model.MsTipeTransaksi;
import com.example.demo.repository.MsTipeTransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MsTipeTransaksiController {
    private MsTipeTransaksiRepository msTipeTransaksiRepository;

    @Autowired
    public MsTipeTransaksiController(MsTipeTransaksiRepository msTipeTransaksiRepository){
        this.msTipeTransaksiRepository = msTipeTransaksiRepository;
    }
    @GetMapping("/user/all")
    Iterable<MsTipeTransaksi> all(){
        return msTipeTransaksiRepository.findAll();
    }
    @GetMapping("/user/{id}")
    MsTipeTransaksi userById(@PathVariable Long id){
        return msTipeTransaksiRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }
    @PostMapping("/user/save")
    MsTipeTransaksi save(@RequestBody MsTipeTransaksi user){
        return msTipeTransaksiRepository.save(user);
    }
}
