package lab.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import lab.assignment_1.Controllers.result_controller;

public class poll_report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poll_report_layout);

        result_controller rc=new result_controller();
        rc.process_report(this);
    }
}