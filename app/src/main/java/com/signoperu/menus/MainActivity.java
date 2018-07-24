package com.signoperu.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.op1:
                Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_LONG).show();
                return true;
            case R.id.op2:
                finish();
                return true;
            case R.id.op3:
                startActivity(new Intent(MainActivity.this,MainActivity.class));
                return true;
            case R.id.op4:
                return true;
            case R.id.op5:
                return true;
            case R.id.op6:
                return true;
             default:


        }
        return super.onOptionsItemSelected(item);
    }
}
