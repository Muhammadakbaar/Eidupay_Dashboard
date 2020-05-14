package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MsTipeTransaksi {
    @Id
    @GeneratedValue
    private Long id;
    private String nama_tipe_transaksi;
    private String kode_transaksi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_tipe_transaksi() {
        return nama_tipe_transaksi;
    }

    public void setNama_tipe_transaksi(String nama_tipe_transaksi) {
        this.nama_tipe_transaksi = nama_tipe_transaksi;
    }

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }
}
