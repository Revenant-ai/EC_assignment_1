package lab.assignment_1.Controllers;

import android.app.Activity;
import android.content.Context;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Map;

import lab.assignment_1.Data_Access.Voting_model;

public class voting_controller
{
    public String candidate_selected(RadioGroup rg, Context ct, TextInputLayout student_id){

        Activity activity = (Activity) ct;
        Voting_model vote_model=new Voting_model();

        if(!vote_model.vote_status(ct, student_id))
        {
            int select_radio_button=rg.getCheckedRadioButtonId();
            if(select_radio_button != -1){
                RadioButton candidate_select = activity.findViewById(select_radio_button);
                String voter_name= candidate_select.getText().toString();
                int cur_voter=1;
                Map<String,?> Voters=vote_model.fetch_value(ct);
                for(Map.Entry<String,?>entry : Voters.entrySet()){
                    if(entry.getKey().equals(voter_name)){
                        cur_voter=((int) entry.getValue())+1;
                    }
                }
                vote_model.store_voter(ct,voter_name,cur_voter);


                return "Your vote is registered";
            }
            else
            {
                return "wrong selection";
            }
        }
        else {
            return "You have already Voted";
        }
    }
}
