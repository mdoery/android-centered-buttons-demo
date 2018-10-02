package com.mdoery.centeredbuttonsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CenteredButtonDemoActivity extends AppCompatActivity {

    private static final String TAG = CenteredButtonDemoActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centered_button_demo);
        Button btnConstraint =(Button) findViewById(R.id.btnConstraint);
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonDemoActivity.this, R.id.btnConstraint);
            }
        });

        Button btnWrong = (Button) findViewById(R.id.btnWrong);
        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonDemoActivity.this, R.id.btnWrong);
            }
        });
    }

    protected void swapLayout(Activity a, int id) {
        Intent intent = null;
        switch (id) {
            case R.id.btnConstraint:
                intent = new Intent(a, CenteredButtonConstraintActivity.class);
                break;
            case R.id.btnWrong:
                intent = new Intent(a, CenteredButtonWrongActivity.class);
                break;
            case R.id.btnRight:
                intent = new Intent(a, CenteredButtonDemoActivity.class);
                break;
        }
        a.startActivity(intent);
    }

}
