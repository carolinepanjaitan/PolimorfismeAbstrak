package com.polymorphism.abstrak;

public class XLavender extends XBunga {

    @Override
    void mekar() {
        System.out.println("Bunga Mekar");
    }

    @Override
    void tumbuh() {
        System.out.println("Bunga Tumbuh");
    }

    @Override
    void mati() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
