package me.jaycom.theprayerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.jaycom.theprayerapp.Adadpters.TimeBasedRecyclerAdadpter;
import me.jaycom.theprayerapp.Modals.TimeBasedModal;
import me.jaycom.theprayerapp.R;

public class TimeBasedFragment extends Fragment {

    RecyclerView recyclerView;
    List<TimeBasedModal> list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        list=new ArrayList<>();
        list.add(new TimeBasedModal("Early morning","5am-7am",R.drawable.early_morning));
        list.add(new TimeBasedModal("Morning","7am-9am",R.drawable.morning));
        list.add(new TimeBasedModal("Early noon","9am-11:59am",R.drawable.early_noon));
        list.add(new TimeBasedModal("Noon","12pm-3pm",R.drawable.noon));
        list.add(new TimeBasedModal("Early evening","3pm-6pm",R.drawable.early_evening));
        list.add(new TimeBasedModal("Night","9pm-12pm",R.drawable.night));
        list.add(new TimeBasedModal("Late night","12pm-2:30am",R.drawable.late_night));
        list.add(new TimeBasedModal("Owl","3am-5am",R.drawable.owl));

        View view=inflater.inflate(R.layout.fragment_timebasedprayers,container,false);

        recyclerView=(RecyclerView) view.findViewById(R.id.time_recycler);
        TimeBasedRecyclerAdadpter timeBasedRecyclerAdadpter=new TimeBasedRecyclerAdadpter(getContext(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(timeBasedRecyclerAdadpter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
