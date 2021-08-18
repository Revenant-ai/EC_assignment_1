package lab.assignment_1.Controllers;

import android.app.Activity;
import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Map;

import lab.assignment_1.Adapters.recycle_adap;
import lab.assignment_1.Data_Access.Voting_model;
import lab.assignment_1.R;

public class result_controller
{

    public void process_report(Context ct){
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> votes= new ArrayList<>();
        Voting_model vote_model=new Voting_model();
        Map<String,?> Voters=vote_model.fetch_value(ct);
        int i=0;
        for(Map.Entry<String,?>entry : Voters.entrySet()){
                name.add(i,entry.getKey());
                votes.add(i,(int)entry.getValue());
                i++;
            }
        Activity activity = (Activity) ct;
        RecyclerView report=activity.findViewById(R.id.poll_recycle);
        recycle_adap adap=new recycle_adap(name,votes,ct);
        report.setAdapter(adap);
        report.setLayoutManager(new LinearLayoutManager(ct));
    }
    public void process_result(Context ct){
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> votes= new ArrayList<>();
        Voting_model vote_model=new Voting_model();
        Map<String,?> Voters=vote_model.fetch_value(ct);
        int i=0;
        Map<String,Integer> result=null;
        for(Map.Entry<String,?>entry : Voters.entrySet()){
            name.add(i,entry.getKey());
            votes.add(i,(int)entry.getValue());
            i++;
        }
        int temp;
        String temp_;
        for(int j=0;j<votes.size();j++){
            for(int l=j+1;l<votes.size();l++){
                if(votes.get(j) < votes.get(l)){
                    temp = votes.get(j);
                    temp_ = name.get(j);
                    votes.set(j,votes.get(l));
                    name.set(j,name.get(l));
                    votes.set(l,temp);
                    name.set(l,temp_);

                }
            }
        }
        Activity activity = (Activity) ct;
        RecyclerView report=activity.findViewById(R.id.poll_recycle_result);
        recycle_adap adap=new recycle_adap(name,votes,ct);
        report.setAdapter(adap);
        report.setLayoutManager(new LinearLayoutManager(ct));
    }
}

