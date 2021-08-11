package com.example.dts_07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //mendeklarasikan listview dan menginisialisasi array
    private ListView lvItem,lvkota;
    private String[] namanegara = new String[]{
      "Indonesia","Malaysia","Singapore","Italy",
      "UK","Netherland","Argentina","Chile",
      "Mesir","Uganda"
    };
    private  String[] ibukota = new String[]{
      "Jakarta","Kuala Lumpur","Singapura","Roma",
       "London","Amsterdam","Buenos Aires","Santiago de Chile",
        "Kairo", "kampala"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tampil judul
        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem=(ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (
            MainActivity.this,R.layout.negara_view,R.id.txtNegara,namanegara
                );
        lvkota=(ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapterkota = new ArrayAdapter<String>
                (
                        MainActivity.this,R.layout.ibukota_view,R.id.txtIbuKota,ibukota
                );
       // menset data di dalam listview
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Negara yg dipilih:"+namanegara[i] +",Ibukotanya: "+ibukota[i],Toast.LENGTH_LONG).show();
            }
        });
    }


}
