package lab.assignment_1.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

import lab.assignment_1.Poll_result;
import lab.assignment_1.R;
import lab.assignment_1.poll_report;

public class recycle_adap extends RecyclerView.Adapter<recycle_adap.MyViewHolder>
{
    ArrayList<String> name;
    ArrayList<Integer> votes;
    Context ct;

    public recycle_adap(ArrayList<String> name, ArrayList<Integer> votes,Context ct) {
        this.name = name;
        this.votes = votes;
        this.ct=ct;
    }

    @NonNull
    @Override
    public recycle_adap.MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(ct);
        View view=inflater.inflate(R.layout.rank_layout_adap,parent,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull  recycle_adap.MyViewHolder holder, int position) {
        holder.name.setText(name.get(position));
        holder.votes.setText(votes.get(position).toString());

        if(position == 0 && ct instanceof Poll_result){
            holder.rank_card.setBackgroundTintList(ct.getResources().getColorStateList(R.color.green));
        }
        else if(position != 0 && ct instanceof Poll_result){
            holder.rank_card.setBackgroundTintList(ct.getResources().getColorStateList(R.color.red));
        }

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,votes;
        MaterialCardView rank_card;

        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.rank_name);
            votes=itemView.findViewById(R.id.rank_votes);
            rank_card=itemView.findViewById(R.id.rank_Card);
        }
    }
}
