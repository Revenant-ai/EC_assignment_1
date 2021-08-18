package lab.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import lab.assignment_1.Controllers.result_controller;

public class Poll_result extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poll_result_layout);

        result_controller rc=new result_controller();
        rc.process_result(this);
    }
}