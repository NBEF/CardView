package com.infotech.cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sk_mbuguah on 10/11/2017.
 */

public class RecyclerViewCardViewAdapter extends RecyclerView.Adapter<RecyclerViewCardViewAdapter.ViewHolder> {

    Context context;

    List<Subjects> subjects;

    public RecyclerViewCardViewAdapter(List<Subjects> getDataAdapter, Context context){

        super();

        this.subjects = getDataAdapter;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Subjects getDataAdapter1 =  subjects.get(position);

        holder.SubjectName.setText(getDataAdapter1.getName());

    }

    @Override
    public int getItemCount() {

        return subjects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView SubjectName;


        public ViewHolder(View itemView) {

            super(itemView);

            SubjectName = (TextView) itemView.findViewById(R.id.TextViewCard) ;


        }
    }
}
