package com.gh.sammie.loginbottomwithbottomsheetdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton, registerButton;
    private LinearLayout linearLayout;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login);
        registerButton = findViewById(R.id.register);

        //get the bottom sheet view
        linearLayout = findViewById(R.id.bottom_sheet);

        //init the bottom sheet view
        bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;
            case R.id.register:
                new CustomBottomSheetDialogFragment().show(getSupportFragmentManager(), "Dialog");
        }
    }
}
