package com.example.dimas.sispaksapi.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wildan.afif on 11/4/2017.
 */

public class Penyakit {
    private String penyakit;
    private Map<String, Integer> gejala = new HashMap<String,Integer>();

    public Penyakit(String penyakit, Map<String, Integer> gejala) {
        this.penyakit = penyakit;
        this.gejala = gejala;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public Map<String, Integer> getGejala() {
        return gejala;
    }

    public void setGejala(Map<String, Integer> gejala) {
        this.gejala = gejala;
    }
}
