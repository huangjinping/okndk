package org.diss.okndk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.diss.okndk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'okndk' library on application startup.
    static {
        System.loadLibrary("okndk");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI() + sumByJNI(1202, 23));

    }

    /**
     * A native method that is implemented by the 'okndk' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public native int sumByJNI(int a, int b);

}