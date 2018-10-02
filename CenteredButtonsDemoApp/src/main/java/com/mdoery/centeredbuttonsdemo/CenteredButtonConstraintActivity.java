package com.mdoery.centeredbuttonsdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mdoery on 9/20/18.
 */

public class CenteredButtonConstraintActivity extends CenteredButtonDemoActivity {
    private static final String TAG = CenteredButtonConstraintActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centered_button_demo_constraint);

        Button btnWrong = (Button) findViewById(R.id.btnWrong);
        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonConstraintActivity.this, R.id.btnWrong);
            }
        });
        Button btnRight = (Button) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapLayout(CenteredButtonConstraintActivity.this, R.id.btnRight);
            }
        });
    }

}
