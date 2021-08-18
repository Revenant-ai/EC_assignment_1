package lab.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
    Button add_cand,vote,result,report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        add_cand=findViewById(R.id.add_user_btn);
        vote=findViewById(R.id.vote_btn);
        result=findViewById(R.id.poll_result_btn);
        report=findViewById(R.id.summary_btn);

        add_cand.setOnClickListener(v -> {
            Intent intent;
            intent=new Intent(getApplicationContext(),add_candidate.class);
            startActivity(intent);
        });

        vote.setOnClickListener(v -> {
            Intent intent;
            intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });

        report.setOnClickListener(v -> {
            Intent intent;
            intent=new Intent(getApplicationContext(),poll_report.class);
            startActivity(intent);
        });

        result.setOnClickListener(v -> {
            Intent intent;
            intent=new Intent(getApplicationContext(),Poll_result.class);
            startActivity(intent);
        });
    }
}