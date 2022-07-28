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
public class QLMuon implements Serializable{
    private Bandoc  bandoc;
    private Sach sach;
    private int sluong;
    private String ttrang;

    public QLMuon() {
    }

    public QLMuon(Bandoc bandoc, Sach sach, int sluong, String ttrang) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.sluong = sluong;
        this.ttrang = ttrang;
    }

    public Bandoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(Bandoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }
    
    public Object[] toObjects(){
        return new Object[]{
          bandoc.getMa(),bandoc.getHoten(),
            sach.getMa(),sach.getTen(),sluong,ttrang
        };
    }
    
}
