package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class KhachHang {
    private Integer id;
    private String ma;
    private String ten;
    private String sdt;
    private Integer trangThai;

    @Basic
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Ma", nullable = false, length = 255)
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "Ten", nullable = false, length = 255)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "SDT", nullable = false, length = 255)
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "TrangThai", nullable = false)
    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhachHang khachHang = (KhachHang) o;
        return Objects.equals(id, khachHang.id) && Objects.equals(ma, khachHang.ma) && Objects.equals(ten, khachHang.ten) && Objects.equals(sdt, khachHang.sdt) && Objects.equals(trangThai, khachHang.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ma, ten, sdt, trangThai);
    }
}
