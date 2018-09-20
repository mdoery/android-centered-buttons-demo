package com.mdoery.centeredbuttonsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by mdoery on 9/20/18.
 */

public class CenteredButtonWrongActivity extends AppCompatActivity {
    private static final String TAG = CenteredButtonDemoActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centered_button_demo_wrong);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn =(Button) findViewById(R.id.switchBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout();
            }
        });
    }

    public void swapLayout() {
        Intent intent = new Intent(CenteredButtonWrongActivity.this, CenteredButtonDemoActivity.class);
        CenteredButtonWrongActivity.this.startActivity(intent);
    }
}
