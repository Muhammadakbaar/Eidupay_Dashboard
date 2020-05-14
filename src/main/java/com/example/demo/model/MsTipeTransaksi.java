package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "mstipetransaksi")
public class MsTipeTransaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nama_tipe_transaksi;
    private String kode_transaksi;

    public MsTipeTransaksi(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_tipe_ransaksi() {
        return nama_tipe_transaksi;
    }

    public void setNama_tipe_ransaksi(String nama_tipe_ransaksi) {
        this.nama_tipe_transaksi = nama_tipe_ransaksi;
    }

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", nama_tipe_transaksi ='" + nama_tipe_transaksi + '\'' +
                ", kode_transaksi ='" + kode_transaksi + '\'' +
                '}';
    }
}
