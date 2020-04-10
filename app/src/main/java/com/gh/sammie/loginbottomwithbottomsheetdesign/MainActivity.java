package com.gh.sammie.loginbottomwithbottomsheetdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private Button LoginButton, RegisterButton;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.login);
        RegisterButton = findViewById(R.id.register);

        //get the bottom sheet view
        linearLayout = findViewById(R.id.bottom_sheet);

        //init the bottom sheet view
        final BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CustomBottomSheetDialogFragment().show(getSupportFragmentManager(), "Dialog");
            }
        });
    }

}
