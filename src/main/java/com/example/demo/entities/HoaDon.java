package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
import java.util.Objects;

@Entity
public class HoaDon {
    private Integer id;
    private Integer idKh;
    private Integer idNv;
    private Date ngayMuaHang;
    private Integer trangThai;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IdKH", nullable = true)
    public Integer getIdKh() {
        return idKh;
    }

    public void setIdKh(Integer idKh) {
        this.idKh = idKh;
    }

    @Basic
    @Column(name = "IdNV", nullable = true)
    public Integer getIdNv() {
        return idNv;
    }

    public void setIdNv(Integer idNv) {
        this.idNv = idNv;
    }

    @Basic
    @Column(name = "NgayMuaHang", nullable = false)
    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
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
        HoaDon hoaDon = (HoaDon) o;
        return Objects.equals(id, hoaDon.id) && Objects.equals(idKh, hoaDon.idKh) && Objects.equals(idNv, hoaDon.idNv) && Objects.equals(ngayMuaHang, hoaDon.ngayMuaHang) && Objects.equals(trangThai, hoaDon.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKh, idNv, ngayMuaHang, trangThai);
    }
}
