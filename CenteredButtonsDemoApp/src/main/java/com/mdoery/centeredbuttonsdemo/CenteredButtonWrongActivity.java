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

public class CenteredButtonWrongActivity extends CenteredButtonDemoActivity {
    private static final String TAG = CenteredButtonWrongActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centered_button_demo_wrong);

        Button btnConstraint = (Button) findViewById(R.id.btnConstraint);
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonWrongActivity.this, R.id.btnConstraint);
            }
        });

        Button btnRight = (Button) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonWrongActivity.this, R.id.btnRight);
            }
        });
    }
}
