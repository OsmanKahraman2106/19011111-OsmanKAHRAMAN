package com.example.minimezun;

public class Mezun {
    private String adSoyad;
    private String email;
    private String sifre;

    public Mezun(String adSoyad, String email, String sifre) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.sifre = sifre;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}

