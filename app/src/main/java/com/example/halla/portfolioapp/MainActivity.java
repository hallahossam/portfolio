package com.example.halla.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button moviesBtn, buildBiggerBtn, capstoneBtn,
            materialBtn, stockBtn, ubiquitousBtn;
    String projectName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesBtn = (Button) findViewById(R.id.btn_movies_app);
        buildBiggerBtn = (Button) findViewById(R.id.btn_build_bigger_app);
        capstoneBtn = (Button) findViewById(R.id.btn_capstone_app);
        materialBtn = (Button) findViewById(R.id.btn_make_material_app);
        stockBtn = (Button) findViewById(R.id.btn_stock_app);
        ubiquitousBtn = (Button) findViewById(R.id.btn_ubiquitous_app);

        moviesBtn.setOnClickListener(this);
        buildBiggerBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
        materialBtn.setOnClickListener(this);
        stockBtn.setOnClickListener(this);
        ubiquitousBtn.setOnClickListener(this);

    }




    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id) {
            case R.id.btn_movies_app:
                projectName = "Popular Movies";
                break;

            case R.id.btn_build_bigger_app:
                projectName = "Bigger";
                        break;

            case R.id.btn_capstone_app:
                projectName = "Capstone";
                break;

            case R.id.btn_make_material_app:
                projectName = "Material";
                break;

            case R.id.btn_stock_app:
                projectName = "Stock";
                break;

            default:
                projectName = "Go ubiquitous";
                break;
        }
        Toast.makeText(MainActivity.this, "This Button will launch "
              + projectName  + " project", Toast.LENGTH_LONG).show();

    }
}
