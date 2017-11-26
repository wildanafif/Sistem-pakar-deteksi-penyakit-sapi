package com.example.dimas.sispaksapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dimas.sispaksapi.Adapter.ListAdapaterGejala;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home extends AppCompatActivity  {
    Map<String, Integer> inputan=new HashMap<String,Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnHitung=(Button)findViewById(R.id.hitung);

        //step 1 buat Chexbox seperti dibawah sami 65 kali
        final CheckBox cbxPertanyaan1=(CheckBox)findViewById(R.id.pertanyaan1);
        final CheckBox cbxPertanyaan2=(CheckBox)findViewById(R.id.pertanyaan2);
        final CheckBox cbxPertanyaan3=(CheckBox)findViewById(R.id.pertanyaan3);
        final CheckBox cbxPertanyaan4=(CheckBox)findViewById(R.id.pertanyaan4);
        final CheckBox cbxPertanyaan5=(CheckBox)findViewById(R.id.pertanyaan5);
        final CheckBox cbxPertanyaan6=(CheckBox)findViewById(R.id.pertanyaan6);
        final CheckBox cbxPertanyaan7=(CheckBox)findViewById(R.id.pertanyaan7);
        final CheckBox cbxPertanyaan8=(CheckBox)findViewById(R.id.pertanyaan8);
        final CheckBox cbxPertanyaan9=(CheckBox)findViewById(R.id.pertanyaan9);
        final CheckBox cbxPertanyaan10=(CheckBox)findViewById(R.id.pertanyaan10);
        final CheckBox cbxPertanyaan11=(CheckBox)findViewById(R.id.pertanyaan11);
        final CheckBox cbxPertanyaan12=(CheckBox)findViewById(R.id.pertanyaan12);
        final CheckBox cbxPertanyaan13=(CheckBox)findViewById(R.id.pertanyaan13);
        final CheckBox cbxPertanyaan14=(CheckBox)findViewById(R.id.pertanyaan14);
        final CheckBox cbxPertanyaan15=(CheckBox)findViewById(R.id.pertanyaan15);
        final CheckBox cbxPertanyaan16=(CheckBox)findViewById(R.id.pertanyaan16);
        final CheckBox cbxPertanyaan17=(CheckBox)findViewById(R.id.pertanyaan17);
        final CheckBox cbxPertanyaan18=(CheckBox)findViewById(R.id.pertanyaan18);
        final CheckBox cbxPertanyaan19=(CheckBox)findViewById(R.id.pertanyaan19);
        final CheckBox cbxPertanyaan20=(CheckBox)findViewById(R.id.pertanyaan20);
        final CheckBox cbxPertanyaan21=(CheckBox)findViewById(R.id.pertanyaan21);
        final CheckBox cbxPertanyaan22=(CheckBox)findViewById(R.id.pertanyaan22);
        final CheckBox cbxPertanyaan23=(CheckBox)findViewById(R.id.pertanyaan23);
        final CheckBox cbxPertanyaan24=(CheckBox)findViewById(R.id.pertanyaan24);
        final CheckBox cbxPertanyaan25=(CheckBox)findViewById(R.id.pertanyaan25);
        final CheckBox cbxPertanyaan26=(CheckBox)findViewById(R.id.pertanyaan26);
        final CheckBox cbxPertanyaan27=(CheckBox)findViewById(R.id.pertanyaan27);
        final CheckBox cbxPertanyaan28=(CheckBox)findViewById(R.id.pertanyaan28);
        final CheckBox cbxPertanyaan29=(CheckBox)findViewById(R.id.pertanyaan29);
        final CheckBox cbxPertanyaan30=(CheckBox)findViewById(R.id.pertanyaan30);
        final CheckBox cbxPertanyaan31=(CheckBox)findViewById(R.id.pertanyaan31);
        final CheckBox cbxPertanyaan32=(CheckBox)findViewById(R.id.pertanyaan32);
        final CheckBox cbxPertanyaan33=(CheckBox)findViewById(R.id.pertanyaan33);
        final CheckBox cbxPertanyaan34=(CheckBox)findViewById(R.id.pertanyaan34);
        final CheckBox cbxPertanyaan35=(CheckBox)findViewById(R.id.pertanyaan35);
        final CheckBox cbxPertanyaan36=(CheckBox)findViewById(R.id.pertanyaan36);
        final CheckBox cbxPertanyaan37=(CheckBox)findViewById(R.id.pertanyaan37);
        final CheckBox cbxPertanyaan38=(CheckBox)findViewById(R.id.pertanyaan38);
        final CheckBox cbxPertanyaan39=(CheckBox)findViewById(R.id.pertanyaan39);
        final CheckBox cbxPertanyaan40=(CheckBox)findViewById(R.id.pertanyaan40);
        final CheckBox cbxPertanyaan41=(CheckBox)findViewById(R.id.pertanyaan41);
        final CheckBox cbxPertanyaan42=(CheckBox)findViewById(R.id.pertanyaan42);
        final CheckBox cbxPertanyaan43=(CheckBox)findViewById(R.id.pertanyaan43);
        final CheckBox cbxPertanyaan44=(CheckBox)findViewById(R.id.pertanyaan44);
        final CheckBox cbxPertanyaan45=(CheckBox)findViewById(R.id.pertanyaan45);
        final CheckBox cbxPertanyaan46=(CheckBox)findViewById(R.id.pertanyaan46);
        final CheckBox cbxPertanyaan47=(CheckBox)findViewById(R.id.pertanyaan47);
        final CheckBox cbxPertanyaan48=(CheckBox)findViewById(R.id.pertanyaan48);
        final CheckBox cbxPertanyaan49=(CheckBox)findViewById(R.id.pertanyaan49);
        final CheckBox cbxPertanyaan50=(CheckBox)findViewById(R.id.pertanyaan50);
        final CheckBox cbxPertanyaan51=(CheckBox)findViewById(R.id.pertanyaan51);
        final CheckBox cbxPertanyaan52=(CheckBox)findViewById(R.id.pertanyaan52);
        final CheckBox cbxPertanyaan53=(CheckBox)findViewById(R.id.pertanyaan53);
        final CheckBox cbxPertanyaan54=(CheckBox)findViewById(R.id.pertanyaan54);
        final CheckBox cbxPertanyaan55=(CheckBox)findViewById(R.id.pertanyaan55);
        final CheckBox cbxPertanyaan56=(CheckBox)findViewById(R.id.pertanyaan56);
        final CheckBox cbxPertanyaan57=(CheckBox)findViewById(R.id.pertanyaan57);
        final CheckBox cbxPertanyaan58=(CheckBox)findViewById(R.id.pertanyaan58);
        final CheckBox cbxPertanyaan59=(CheckBox)findViewById(R.id.pertanyaan59);
        final CheckBox cbxPertanyaan60=(CheckBox)findViewById(R.id.pertanyaan60);
        final CheckBox cbxPertanyaan61=(CheckBox)findViewById(R.id.pertanyaan61);
        final CheckBox cbxPertanyaan62=(CheckBox)findViewById(R.id.pertanyaan62);
        final CheckBox cbxPertanyaan63=(CheckBox)findViewById(R.id.pertanyaan63);
        final CheckBox cbxPertanyaan64=(CheckBox)findViewById(R.id.pertanyaan64);
        final CheckBox cbxPertanyaan65=(CheckBox)findViewById(R.id.pertanyaan65);


        //end chexbox

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step 2 buat kondisi sampai 65 kali
                if (cbxPertanyaan1.isChecked()){
                    inputan.put("G1",1);
                }else{
                    inputan.put("G1",0);
                }

                if (cbxPertanyaan2.isChecked()){
                    inputan.put("G2",1);
                }else{
                    inputan.put("G2",0);
                }

                if (cbxPertanyaan3.isChecked()){
                    inputan.put("G3",1);
                }else{
                    inputan.put("G3",0);
                }

                if (cbxPertanyaan4.isChecked()){
                    inputan.put("G4",1);
                }else{
                    inputan.put("G4",0);
                }

                if (cbxPertanyaan5.isChecked()){
                    inputan.put("G5",1);
                }else{
                    inputan.put("G5",0);
                }

                if (cbxPertanyaan6.isChecked()){
                    inputan.put("G6",1);
                }else{
                    inputan.put("G6",0);
                }

                if (cbxPertanyaan7.isChecked()){
                    inputan.put("G7",1);
                }else{
                    inputan.put("G7",0);
                }

                if (cbxPertanyaan8.isChecked()){
                    inputan.put("G8",1);
                }else{
                    inputan.put("G8",0);
                }

                if (cbxPertanyaan9.isChecked()){
                    inputan.put("G9",1);
                }else{
                    inputan.put("G9",0);
                }

                if (cbxPertanyaan10.isChecked()){
                    inputan.put("G10",1);
                }else{
                    inputan.put("G10",0);
                }

                if (cbxPertanyaan11.isChecked()){
                    inputan.put("G11",1);
                }else{
                    inputan.put("G11",0);
                }

                if (cbxPertanyaan12.isChecked()){
                    inputan.put("G12",1);
                }else{
                    inputan.put("G12",0);
                }

                if (cbxPertanyaan13.isChecked()){
                    inputan.put("G13",1);
                }else{
                    inputan.put("G13",0);
                }

                if (cbxPertanyaan14.isChecked()){
                    inputan.put("G14",1);
                }else{
                    inputan.put("G14",0);
                }

                if (cbxPertanyaan15.isChecked()){
                    inputan.put("G15",1);
                }else{
                    inputan.put("G15",0);
                }

                if (cbxPertanyaan16.isChecked()){
                    inputan.put("G16",1);
                }else{
                    inputan.put("G16",0);
                }

                if (cbxPertanyaan17.isChecked()){
                    inputan.put("G17",1);
                }else{
                    inputan.put("G17",0);
                }

                if (cbxPertanyaan18.isChecked()){
                    inputan.put("G18",1);
                }else{
                    inputan.put("G18",0);
                }

                if (cbxPertanyaan19.isChecked()){
                    inputan.put("G19",1);
                }else{
                    inputan.put("G19",0);
                }

                if (cbxPertanyaan20.isChecked()){
                    inputan.put("G20",1);
                }else{
                    inputan.put("G20",0);
                }

                if (cbxPertanyaan21.isChecked()){
                    inputan.put("G21",1);
                }else{
                    inputan.put("G21",0);
                }

                if (cbxPertanyaan22.isChecked()){
                    inputan.put("G22",1);
                }else{
                    inputan.put("G22",0);
                }

                if (cbxPertanyaan23.isChecked()){
                    inputan.put("G23",1);
                }else{
                    inputan.put("G23",0);
                }

                if (cbxPertanyaan24.isChecked()){
                    inputan.put("G24",1);
                }else{
                    inputan.put("G24",0);
                }

                if (cbxPertanyaan25.isChecked()){
                    inputan.put("G25",1);
                }else{
                    inputan.put("G25",0);
                }

                if (cbxPertanyaan26.isChecked()){
                    inputan.put("G26",1);
                }else{
                    inputan.put("G26",0);
                }

                if (cbxPertanyaan27.isChecked()){
                    inputan.put("G27",1);
                }else{
                    inputan.put("G27",0);
                }

                if (cbxPertanyaan28.isChecked()){
                    inputan.put("G28",1);
                }else{
                    inputan.put("G28",0);
                }

                if (cbxPertanyaan29.isChecked()){
                    inputan.put("G29",1);
                }else{
                    inputan.put("G29",0);
                }

                if (cbxPertanyaan30.isChecked()){
                    inputan.put("G30",1);
                }else{
                    inputan.put("G30",0);
                }

                if (cbxPertanyaan31.isChecked()){
                    inputan.put("G31",1);
                }else{
                    inputan.put("G31",0);
                }

                if (cbxPertanyaan32.isChecked()){
                    inputan.put("G32",1);
                }else{
                    inputan.put("G32",0);
                }

                if (cbxPertanyaan33.isChecked()){
                    inputan.put("G33",1);
                }else{
                    inputan.put("G33",0);
                }

                if (cbxPertanyaan34.isChecked()){
                    inputan.put("G34",1);
                }else{
                    inputan.put("G34",0);
                }

                if (cbxPertanyaan35.isChecked()){
                    inputan.put("G35",1);
                }else{
                    inputan.put("G35",0);
                }

                if (cbxPertanyaan36.isChecked()){
                    inputan.put("G36",1);
                }else{
                    inputan.put("G36",0);
                }

                if (cbxPertanyaan37.isChecked()){
                    inputan.put("G37",1);
                }else{
                    inputan.put("G37",0);
                }

                if (cbxPertanyaan38.isChecked()){
                    inputan.put("G38",1);
                }else{
                    inputan.put("G38",0);
                }

                if (cbxPertanyaan39.isChecked()){
                    inputan.put("G39",1);
                }else{
                    inputan.put("G39",0);
                }

                if (cbxPertanyaan40.isChecked()){
                    inputan.put("G40",1);
                }else{
                    inputan.put("G40",0);
                }

                if (cbxPertanyaan41.isChecked()){
                    inputan.put("G41",1);
                }else{
                    inputan.put("G41",0);
                }

                if (cbxPertanyaan42.isChecked()){
                    inputan.put("G42",1);
                }else{
                    inputan.put("G42",0);
                }

                if (cbxPertanyaan43.isChecked()){
                    inputan.put("G43",1);
                }else{
                    inputan.put("G43",0);
                }

                if (cbxPertanyaan44.isChecked()){
                    inputan.put("G44",1);
                }else{
                    inputan.put("G44",0);
                }

                if (cbxPertanyaan45.isChecked()){
                    inputan.put("G45",1);
                }else{
                    inputan.put("G45",0);
                }

                if (cbxPertanyaan46.isChecked()){
                    inputan.put("G46",1);
                }else{
                    inputan.put("G46",0);
                }

                if (cbxPertanyaan47.isChecked()){
                    inputan.put("G47",1);
                }else{
                    inputan.put("G47",0);
                }

                if (cbxPertanyaan48.isChecked()){
                    inputan.put("G48",1);
                }else{
                    inputan.put("G48",0);
                }

                if (cbxPertanyaan49.isChecked()){
                    inputan.put("G49",1);
                }else{
                    inputan.put("G49",0);
                }

                if (cbxPertanyaan50.isChecked()){
                    inputan.put("G50",1);
                }else{
                    inputan.put("G50",0);
                }
                if (cbxPertanyaan51.isChecked()){
                    inputan.put("G51",1);
                }else{
                    inputan.put("G51",0);
                }

                if (cbxPertanyaan52.isChecked()){
                    inputan.put("G52",1);
                }else{
                    inputan.put("G52",0);
                }

                if (cbxPertanyaan53.isChecked()){
                    inputan.put("G53",1);
                }else{
                    inputan.put("G53",0);
                }

                if (cbxPertanyaan54.isChecked()){
                    inputan.put("G54",1);
                }else{
                    inputan.put("G54",0);
                }

                if (cbxPertanyaan55.isChecked()){
                    inputan.put("G55",1);
                }else{
                    inputan.put("G55",0);
                }

                if (cbxPertanyaan56.isChecked()){
                    inputan.put("G56",1);
                }else{
                    inputan.put("G56",0);
                }

                if (cbxPertanyaan57.isChecked()){
                    inputan.put("G57",1);
                }else{
                    inputan.put("G57",0);
                }

                if (cbxPertanyaan58.isChecked()){
                    inputan.put("G58",1);
                }else{
                    inputan.put("G58",0);
                }

                if (cbxPertanyaan59.isChecked()){
                    inputan.put("G59",1);
                }else{
                    inputan.put("G59",0);
                }

                if (cbxPertanyaan60.isChecked()){
                    inputan.put("G60",1);
                }else{
                    inputan.put("G60",0);
                }

                if (cbxPertanyaan61.isChecked()){
                    inputan.put("G61",1);
                }else{
                    inputan.put("G61",0);
                }

                if (cbxPertanyaan62.isChecked()){
                    inputan.put("G62",1);
                }else{
                    inputan.put("G62",0);
                }

                if (cbxPertanyaan63.isChecked()){
                    inputan.put("G63",1);
                }else{
                    inputan.put("G63",0);
                }

                if (cbxPertanyaan64.isChecked()){
                    inputan.put("G64",1);
                }else{
                    inputan.put("G64",0);
                }

                if (cbxPertanyaan65.isChecked()){
                    inputan.put("G65",1);
                }else{
                    inputan.put("G65",0);
                }



                //Toast.makeText(Home.this, ""+inputan.get("G1"), Toast.LENGTH_SHORT).show();
                finish();
                Intent intent = new Intent(Home.this, MainActivity.class);
                intent.putExtra("inputan", (Serializable) inputan);
                startActivity(intent);
            }
        });



//                finish();
//                Intent intent = new Intent(Home.this, MainActivity.class);
//                intent.putExtra("inputan", (Serializable) inputan);
//                startActivity(intent);

    }


}
