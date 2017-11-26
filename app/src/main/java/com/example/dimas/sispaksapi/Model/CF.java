package com.example.dimas.sispaksapi.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wildan.afif on 11/19/2017.
 */

public class CF {
    private String gejala;
    private Map<String, Double> penyakit = new HashMap<String,Double>();

    public CF(String gejala, Map<String, Double> penyakit) {
        this.gejala = gejala;
        this.penyakit = penyakit;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public Map<String, Double> getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(Map<String, Double> penyakit) {
        this.penyakit = penyakit;
    }
}
