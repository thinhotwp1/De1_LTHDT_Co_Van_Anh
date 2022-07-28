/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author chouv
 */
public class Sach implements Serializable{
    private int ma;
    private String ten,tacgia,cn;
    private int sluong;
    private static int sma=10000;

    public Sach() {
    }

    public Sach(int ma, String ten, String tacgia, String cn, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tacgia = tacgia;
        this.cn = cn;
        this.sluong = sluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
        ma,ten,tacgia,cn,sluong    
        };
    }
    
}
