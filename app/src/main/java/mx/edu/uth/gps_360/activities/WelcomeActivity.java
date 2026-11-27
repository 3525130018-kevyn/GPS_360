package mx.edu.uth.gps_360.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import mx.edu.uth.gps_360.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            startActivity(
                    new Intent(
                            WelcomeActivity.this,
                            LoginActivity.class
                    )
            );
        });
    }
}