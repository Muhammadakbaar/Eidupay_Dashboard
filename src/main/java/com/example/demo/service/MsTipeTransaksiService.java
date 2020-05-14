package com.example.demo.service;

import com.example.demo.model.MsTipeTransaksi;
import com.example.demo.repository.MsTipeTransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsTipeTransaksiService {
    private MsTipeTransaksiRepository msTipeTransaksiRepository;

    @Autowired
    public MsTipeTransaksiService(MsTipeTransaksiRepository msTipeTransaksiRepository){
        this.msTipeTransaksiRepository = msTipeTransaksiRepository;
    }
    public MsTipeTransaksi getMsTipeTransaksi(Long id){
        return msTipeTransaksiRepository.getOne(id);
    }

}
