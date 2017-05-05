package com.sgcc.cpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);

        StringBuffer sf=new StringBuffer();
        sf.append("手机CPU型号：\n");
        sf.append("isArmCpu："+ CPUFrameworkHelper.isArmCpu()+"\n");
        sf.append("isArm7Compatible："+ CPUFrameworkHelper.isArm7Compatible()+"\n");
        sf.append("isMipsCpu："+ CPUFrameworkHelper.isMipsCpu()+"\n");
        sf.append("isX86Cpu："+ CPUFrameworkHelper.isX86Cpu()+"\n");
        sf.append("isArm64Cpu："+ CPUFrameworkHelper.isArm64Cpu()+"\n");
        sf.append("isMips64Cpu："+ CPUFrameworkHelper.isMips64Cpu()+"\n");
        sf.append("isX86_64Cpu："+ CPUFrameworkHelper.isX86_64Cpu()+"\n");


        tv.setText(sf.toString());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}
