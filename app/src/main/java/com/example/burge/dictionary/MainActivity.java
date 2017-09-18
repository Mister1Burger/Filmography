package com.example.burge.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mSelectText;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSelectText = (TextView) findViewById(R.id.info);
        GridView gridview = (GridView) findViewById(R.id.gridView1);
        gridview.setAdapter(new Adapter(this));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);
    }

    private GridView.OnItemClickListener gridviewOnItemClickListener = new GridView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position,
                                long id) {
            // TODO Auto-generated method stub
            // выводим номер позиции
            Intent i = new Intent(getApplicationContext(),
                    FullImageActivity.class);
            // passing array index
            i.putExtra("id", position);
            startActivity(i);
        }
    };
}
