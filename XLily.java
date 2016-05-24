package com.polymorphism.abstrak;

public class XLily extends XBunga {

    @Override
    void mekar() {
        System.out.println("Bunga mekar");
    }

    @Override
    void tumbuh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void mati() {
        System.out.println("Bunga Layu Sebelum Mati");
    }
    
}
