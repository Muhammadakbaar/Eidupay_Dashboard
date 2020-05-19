package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "`MsTipeTransaksi`")
public class MsTipeTransaksi {

    @Id
    @GeneratedValue
    private Long id_tipetransaksi;

    @Column(name = "`NamaTipeTransaksi`")
    private String nama_tipe_transaksi;

    @Column(name = "`KodeTransaksi`")
    private String kode_transaksi;

    public Long getIdTipetransaksi() {
        return id_tipetransaksi;
    }

    public void setId(Long id_tipetransaksi) {
        this.id_tipetransaksi = id_tipetransaksi;
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
