package com.example.digitalbrandyug;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class startsending extends AppCompatActivity {
 boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startsending);
        ImageButton b1=findViewById(R.id.openbottomsheet_btn);
        View relativeLayout=findViewById(R.id.bottom_sheet1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status=!status;
                if(status){
                    relativeLayout.setVisibility(View.GONE);
                }else {
                    relativeLayout.setVisibility(View.VISIBLE);
                }


            }
        });
    }
}