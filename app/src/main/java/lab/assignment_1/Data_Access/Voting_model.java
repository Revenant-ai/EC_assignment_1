package lab.assignment_1.Data_Access;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Map;


public class Voting_model {

    public void store_voter(Context ct, String voter,int num_votes)
    {
        SharedPreferences spf=ct.getSharedPreferences("voting_pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor myedit=spf.edit();
        myedit.putInt(voter,num_votes);
        myedit.apply();
    }
    public Map<String,?> fetch_value(Context ct){
        SharedPreferences spf=ct.getSharedPreferences("voting_pref",Context.MODE_PRIVATE);
        Map<String, ?> all_entry=spf.getAll();
        return all_entry;

    }
    public boolean vote_status(Context ct, TextInputLayout student_id){
        SharedPreferences spf=ct.getSharedPreferences("candidate",Context.MODE_PRIVATE);
        if(spf.contains(student_id.getEditText().getText().toString()))
        {
            System.out.println(student_id.getEditText().getText().toString());
            return true;
        }
        else {
            SharedPreferences.Editor myedit=spf.edit();
            myedit.putString(student_id.getEditText().getText().toString(),"");
            myedit.apply();
            return false;
        }

    }
}
