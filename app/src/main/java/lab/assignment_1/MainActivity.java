package lab.assignment_1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import lab.assignment_1.Controllers.voting_controller;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    TextInputLayout student_id;
    RadioGroup radioGroup_voting;
    Button Vote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student_id=findViewById(R.id.student_id);
        radioGroup_voting=findViewById(R.id.radioGroup_voting);
        Vote=findViewById(R.id.btn_vote);

        Vote.setOnClickListener(v -> {
            voting_controller vc= new voting_controller();
            Toast.makeText(getApplicationContext(), vc.candidate_selected(radioGroup_voting, MainActivity.this , student_id),
                    Toast.LENGTH_LONG).show();
        });

    }

}