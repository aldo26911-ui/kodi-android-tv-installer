// InstallationActivity.java

package com.example.kodiandroidtvinstaller;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class InstallationActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installation);

        progressBar = findViewById(R.id.progressBar);
        handleInstallationProgress();
    }

    private void handleInstallationProgress() {
        // Simulate installation progress
        new Thread(() -> {
            for (int progress = 0; progress <= 100; progress += 10) {
                runOnUiThread(() -> progressBar.setProgress(progress));
                try {
                    Thread.sleep(1000); // Simulating time taken for installation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}