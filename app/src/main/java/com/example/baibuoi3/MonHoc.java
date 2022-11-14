package com.example.baibuoi3;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {
    public String TenHinh;
    public String MaHp;
    public String TenGV;
    public String TenHP;

    public MonHoc(String tenHinh, String maHp, String tenGV, String tenHP) {
        TenHinh = tenHinh;
        MaHp = maHp;
        TenGV = tenGV;
        TenHP = tenHP;
    }

    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String tenHinh) {
        TenHinh = tenHinh;
    }

    public String getMaHp() {
        return MaHp;
    }

    public void setMaHp(String maHp) {
        MaHp = maHp;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String tenGV) {
        TenGV = tenGV;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String tenHP) {
        TenHP = tenHP;
    }
    public static List<MonHoc> LayDSMonHoc(){
        List<MonHoc> monHocs = new ArrayList<>();
        monHocs.add(new MonHoc(
                "hinh1",
                "CMP213",
                "Lap trinh di dong",
                "GV1"
        ));
        monHocs.add(new MonHoc(
                "hinh2",
                "CMP2132",
                "Lap trinh di dong2",
                "GV12"
        ));
        monHocs.add(new MonHoc(
                "hinh3",
                "CMP2133",
                "Lap trinh di dong3",
                "GV13"
        ));
        return  monHocs;
    }
}
