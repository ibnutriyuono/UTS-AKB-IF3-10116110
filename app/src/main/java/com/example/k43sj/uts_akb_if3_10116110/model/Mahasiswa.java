package com.example.k43sj.uts_akb_if3_10116110.model;

/*
 * 20 Mei 2019
 * 10116110
 * Muhamad Ibnu Tri Yuono
 * IF-3
 */

public class Mahasiswa {
    private int image;
    private String nim,nama,kelas,telephone,email,instagram;

    public Mahasiswa(int image, String nim, String nama, String kelas, String telephone, String email, String instagram){
        this.image = image;
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.telephone = telephone;
        this.email = email;
        this.instagram = instagram;
    }

    public int getImage() {
        return image;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
