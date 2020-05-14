package com.example.demo.controller;

import com.example.demo.model.MsTipeTransaksi;
import com.example.demo.service.MsTipeTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MsTipeTransaksiController {
    MsTipeTransaksiService msTipeTransaksiService;

    @Autowired
    MsTipeTransaksiController(MsTipeTransaksiService msTipeTransaksiService){
        this.msTipeTransaksiService = msTipeTransaksiService;
    }
    @GetMapping("/")
    public String getHello(){
        return "Hello";
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MsTipeTransaksi getUserById(@PathVariable("id") Long id){
        MsTipeTransaksi msTipeTransaksi = msTipeTransaksiService.getMsTipeTransaksi(id);
        System.out.println(msTipeTransaksi);
        return msTipeTransaksi;
    }
}
