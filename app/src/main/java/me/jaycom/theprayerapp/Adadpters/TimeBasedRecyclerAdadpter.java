package me.jaycom.theprayerapp.Adadpters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import me.jaycom.theprayerapp.Early_Morning;
import me.jaycom.theprayerapp.Modals.TimeBasedModal;
import me.jaycom.theprayerapp.R;

public class TimeBasedRecyclerAdadpter extends RecyclerView.Adapter<TimeBasedRecyclerAdadpter.TimeBasedViewHolder> {

    private Context mctx;
    private List<TimeBasedModal> timeBasedModalList;

    public TimeBasedRecyclerAdadpter(Context mctx, List<TimeBasedModal> timeBasedModalList) {
        this.mctx = mctx;
        this.timeBasedModalList = timeBasedModalList;
    }


    @NonNull
    @Override
    public TimeBasedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {

        View view;
        view = LayoutInflater.from(mctx).inflate(R.layout.time_based_list_item,viewGroup,false);
        final TimeBasedViewHolder timeBasedViewHolder=new TimeBasedViewHolder(view);
        timeBasedViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Toast.makeText(mctx,"test click "+ timeBasedViewHolder.getAdapterPosition(),Toast.LENGTH_SHORT).show();

            switch (timeBasedViewHolder.getAdapterPosition()){

                case 0 :
                    mctx.startActivity(new Intent(mctx, Early_Morning.class));
                    break;

                }

            }


        });
        return timeBasedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TimeBasedViewHolder timeBasedViewHolder, int i) {

        timeBasedViewHolder.session.setText(timeBasedModalList.get(i).getSession());
        timeBasedViewHolder.timezone.setText(timeBasedModalList.get(i).getTimezone());
        timeBasedViewHolder.bg.setImageResource(timeBasedModalList.get(i).getBg());
    }

    @Override
    public int getItemCount() {
        return timeBasedModalList.size();
    }

    class TimeBasedViewHolder extends RecyclerView.ViewHolder{

        private TextView session,timezone;
        private ImageView bg;
        private CardView cardView;

        public TimeBasedViewHolder(@NonNull View itemView) {
            super(itemView);

            session=(TextView) itemView.findViewById(R.id.session);
            timezone=(TextView) itemView.findViewById(R.id.timezone);
            bg=(ImageView)itemView.findViewById(R.id.bg);
            cardView=(CardView)itemView.findViewById(R.id.cardview_id);
        }
    }

}
