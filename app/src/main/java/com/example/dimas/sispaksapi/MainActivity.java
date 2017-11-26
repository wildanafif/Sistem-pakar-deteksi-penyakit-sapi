package com.example.dimas.sispaksapi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.dimas.sispaksapi.Model.CF;
import com.example.dimas.sispaksapi.Model.Penyakit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<String, Integer> dataJumlahPenyakit = new HashMap<String,Integer>(); 
    private Map<String, Double> dataPrior=new HashMap<String,Double>(); ;
    private ArrayList<Penyakit> listPenyakit= new ArrayList<Penyakit>();
    private Map<String, Integer> inputan=new HashMap<String,Integer>();
    private String namaPenyakit;


    String keyPenyakitPosteriorMax;
    private Map<String, Double> posterior=new HashMap<String,Double>();

    private double [] Cf_X_InputUser= new double[65];

    private ArrayList<CF> listCFPakar= new ArrayList<CF>();
    private TextView txHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txHasil= (TextView)findViewById(R.id.hasil);
        setDataJumlahPenyakit();
        prior();
        initInputuser();
        getDataTraining();



    }

    private void initInputuser() {
        Intent intent = getIntent();
       this.inputan = (HashMap<String, Integer>)intent.getSerializableExtra("inputan");
//        Log.d("init", "initInputuser: "+this.inputan.toString());
//        this.inputan.put("G1",0);
//        this.inputan.put("G2",1);
//        this.inputan.put("G3",0);
//        this.inputan.put("G4",0);
//        this.inputan.put("G5",0);
//        this.inputan.put("G6",0);
//        this.inputan.put("G7",1);
//        this.inputan.put("G8",0);
//        this.inputan.put("G9",1);
//        this.inputan.put("G10",0);
//        this.inputan.put("G11",0);
//        this.inputan.put("G12",0);
//        this.inputan.put("G13",0);
//        this.inputan.put("G14",0);
//        this.inputan.put("G15",0);
//        this.inputan.put("G16",0);
//        this.inputan.put("G17",1);
//        this.inputan.put("G18",0);
//        this.inputan.put("G19",0);
//        this.inputan.put("G20",1);
//        this.inputan.put("G21",0);
//        this.inputan.put("G22",0);
//        this.inputan.put("G23",0);
//        this.inputan.put("G24",0);
//        this.inputan.put("G25",0);
//        this.inputan.put("G26",0);
//        this.inputan.put("G27",0);
//        this.inputan.put("G28",0);
//        this.inputan.put("G29",0);
//        this.inputan.put("G30",0);
//        this.inputan.put("G31",0);
//        this.inputan.put("G32",0);
//        this.inputan.put("G33",0);
//        this.inputan.put("G34",0);
//        this.inputan.put("G35",0);
//        this.inputan.put("G36",0);
//        this.inputan.put("G37",0);
//        this.inputan.put("G38",0);
//        this.inputan.put("G39",0);
//        this.inputan.put("G40",0);
//        this.inputan.put("G41",0);
//        this.inputan.put("G42",0);
//        this.inputan.put("G43",0);
//        this.inputan.put("G44",0);
//        this.inputan.put("G45",0);
//        this.inputan.put("G46",0);
//        this.inputan.put("G47",0);
//        this.inputan.put("G48",0);
//        this.inputan.put("G49",0);
//        this.inputan.put("G50",0);
//        this.inputan.put("G51",0);
//        this.inputan.put("G52",0);
//        this.inputan.put("G53",0);
//        this.inputan.put("G54",0);
//        this.inputan.put("G55",0);
//        this.inputan.put("G56",0);
//        this.inputan.put("G57",0);
//        this.inputan.put("G58",0);
//        this.inputan.put("G59",0);
//        this.inputan.put("G60",0);
//        this.inputan.put("G61",1);
//        this.inputan.put("G62",0);
//        this.inputan.put("G63",1);
//        this.inputan.put("G64",1);
//        this.inputan.put("G65",0);


    }

    //Init Jumlah Penyakit
    private  void setDataJumlahPenyakit(){
        this.dataJumlahPenyakit.put("P1",30);
        this.dataJumlahPenyakit.put("P2",27);
        this.dataJumlahPenyakit.put("P3",30);
        this.dataJumlahPenyakit.put("P4",22);
        this.dataJumlahPenyakit.put("P5",15);
        this.dataJumlahPenyakit.put("P6",39);
        this.dataJumlahPenyakit.put("P7",17);
        this.dataJumlahPenyakit.put("P8",20);
        this.dataJumlahPenyakit.put("P9",26);
        this.dataJumlahPenyakit.put("P10",5);
        this.dataJumlahPenyakit.put("P11",20);
        this.dataJumlahPenyakit.put("P12",5);
        this.dataJumlahPenyakit.put("P13",3);
        this.dataJumlahPenyakit.put("P14",21);
        this.dataJumlahPenyakit.put("P15",16);
        this.dataJumlahPenyakit.put("P16",8);
        
    }
    
    //hitung prior
    private void prior() {
        
        //nyari total 304
        int total=0;
        for (int value : this.dataJumlahPenyakit.values()){
            total +=value;
        }
        //end nyari total
        
        //prior
        for (Map.Entry<String, Integer> entry: this.dataJumlahPenyakit.entrySet()){
            Double nilaiPrior= entry.getValue().doubleValue()/total;
            this.dataPrior.put(entry.getKey().toString(),nilaiPrior);
        }
    }

    private void likelihood(){
        for (Map.Entry<String, Integer> entry: this.dataJumlahPenyakit.entrySet()){
            double tPosterior=this.dataPrior.get(entry.getKey());
            for (Map.Entry<String, Integer> entryInput: this.inputan.entrySet()){
                if (entryInput.getValue()==1){
                    double tLikelihood =getPembilang(entry.getKey(),entryInput.getKey())/ entry.getValue().doubleValue();

                    if (tLikelihood==0.0){
                        tLikelihood=0.001;
                    }
                    if (tPosterior==0){
                        tPosterior=tLikelihood;
                    }else{
                        tPosterior=tPosterior*tLikelihood;
                    }
                    Log.d("pos", "likelihood: "+entry.getKey()+", "+entryInput.getKey()+"="+tLikelihood+" deg pem:"+getPembilang(entry.getKey(),entryInput.getKey())+" penyb"+entry.getValue() +" dg posterior = "+tPosterior);

                }
            }
            //tPosterior=tPosterior*1000000000000000000000000000000000000.0;
            this.posterior.put(entry.getKey(),tPosterior);

        }
        getMax();
        Log.d("posterior", "posterior: "+this.posterior.toString());

    }

    void getMax(){
        String key = null;
        double val=0.0;
        for (Map.Entry<String, Double> entry: this.posterior.entrySet()){
            if (entry.getValue()>val){
                val=entry.getValue();
                key=entry.getKey();
            }
        }
        //String max= Collections.max(this.posterior.keySet());
        Log.d("jj", "getMax: "+key);
        this.keyPenyakitPosteriorMax=key;

        getCFPakar();
    }

    //nyari pembilang
    private int getPembilang(String pPenyakit, String gejala){
        int total=0;
        for (Penyakit penyakit : this.listPenyakit){
            //Log.d("", "getPembilang: "+penyakit.getPenyakit()+"="+pPenyakit);
            if (penyakit.getPenyakit().matches(pPenyakit)){
                for (Map.Entry<String, Integer> entry: penyakit.getGejala().entrySet()){
                    if (entry.getKey().matches(gejala)){
                        if (entry.getValue()==1){
                            //Log.d("", "getPembilang: "+penyakit.getPenyakit()+"="+pPenyakit);
                            total++;
                        }
                    }

                }
            }
        }



        return total;
    }

    private void ProsesCF() {
        int x=1;
        for (CF cf : this.listCFPakar){
            for (Map.Entry<String, Double> entry: cf.getPenyakit().entrySet()){
                if (entry.getKey().matches(this.keyPenyakitPosteriorMax)){
                    double temp=cf.getPenyakit().get(this.keyPenyakitPosteriorMax)*this.inputan.get("G"+x);
                    Log.d("Proses Cf dari pakar", "ProsesCF: "+entry.getKey()+", "+cf.getGejala()+", "+cf.getPenyakit().get(this.keyPenyakitPosteriorMax));
                    this.Cf_X_InputUser[x-1]=temp;
                    //Log.d("CF usr", "ProsesCF: "+this.Cf_X_InputUser[x-1]);
                }
            }
            x++;
        }
        double combine[]= new double[64];
        for (int i=0; i<this.Cf_X_InputUser.length-1;i++){
            double temp;
            if (i==0){
               temp= this.Cf_X_InputUser[0]+this.Cf_X_InputUser[1]*(1-this.Cf_X_InputUser[0]);
            }else{
                temp= this.Cf_X_InputUser[i+1]+combine[i-1]*(1-this.Cf_X_InputUser[i+1]);
            }
            combine[i]=temp;
            Log.d("combine", "ProsesCF: "+combine[i]);
        }

        double presentase= combine[combine.length-1]*100;
        this.txHasil.setText("Kesimpulan:\n" +
                "Berdasarkan perhitungan menggunakan naive bayes, sapi mengalami penyakit "+this.keyPenyakitPosteriorMax+" dengan nilai keyakinan (certainty factor) sebesar "+combine[combine.length-1]+" atau "+presentase+"%");
    }
    public void getDataTraining() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "http://wildanafif.id/demo/sispak/";
        final ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setMessage("Please Wait....");
        progressdialog.setTitle("Loading");
        progressdialog.show();
        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET,url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                //Toast.makeText(MapsActivity.this, ""+response, Toast.LENGTH_SHORT).show();
                for(int i=0;i<response.length();i++){

                    JSONObject json_data = null;
                    try {
                        json_data = response.getJSONObject(i);
                        Map<String, Integer> temp = new HashMap<String,Integer>();

                        for (int x=1;x<66 ; x++){
                            temp.put("G"+x, json_data.getInt("G"+x));

                        }
                        Penyakit penyakit= new Penyakit(json_data.getString("penyakit"),temp);
                        //Log.d("", "onResponse: "+penyakit.getGejala().toString());
                        listPenyakit.add(penyakit);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
                likelihood();

                progressdialog.dismiss();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("LOG", error.toString());
            }
        });
        requestQueue.add(jsonObjectRequest);
    }

    public void getCFPakar() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "http://wildanafif.id/demo/sispak/index.php/welcome/cfpakar";
        final ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setMessage("Please Wait....");
        progressdialog.setTitle("Loading");
        progressdialog.show();
        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET,url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                //Toast.makeText(MapsActivity.this, ""+response, Toast.LENGTH_SHORT).show();
                for(int i=0;i<response.length();i++){

                    JSONObject json_data = null;
                    try {
                        json_data = response.getJSONObject(i);
                        Map<String, Double> temp = new HashMap<String,Double>();

                        for (int x=1;x<17 ; x++){
                            temp.put("P"+x, json_data.getDouble("P"+x));

                        }
                        CF penyakit= new CF(json_data.getString("gejala"),temp);
                        //Log.d("CF PAKAR", "onResponse: "+penyakit.getPenyakit().toString());
                        listCFPakar.add(penyakit);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

                ProsesCF();
                progressdialog.dismiss();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("LOG CF", error.toString());
            }
        });
        requestQueue.add(jsonObjectRequest);
    }


}
