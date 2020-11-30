package com.sonmob.vichat.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sonmob.vichat.R;
import com.sonmob.vichat.adapter.CallListAdapter;
import com.sonmob.vichat.adapter.ChatListAdapter;
import com.sonmob.vichat.model.CallList;
import com.sonmob.vichat.model.ChatList;

import java.util.ArrayList;
import java.util.List;

/**
 * create an instance of this fragment.
 */
public class CallsFragment extends Fragment {
    public CallsFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        List<CallList> lists = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        lists.add(new CallList("11", "xuan son","10/07/2020","https://cdn.pixabay.com/photo/2020/10/16/14/40/among-us-5659730_960_720.png","income"));
        lists.add(new CallList("12", "ngoc anh","11/08/2018","https://preview.redd.it/0j244l4o1sn51.png?width=440&format=png&auto=webp&s=c74e2de99bdb7da7471469d8274a4eaae244207e","income"));
        lists.add(new CallList("13", "thu huyen","12/12/2019","https://www.citypng.com/public/uploads/preview/-41601318596qfyeqk7mvf.png","income"));
        lists.add(new CallList("14", "lan anh","27/05/2020","https://e.gamevui.vn/web/2020/10/among-us-avatar-maker/Assets/PLAYER/PINK.png","income"));
        recyclerView.setAdapter(new CallListAdapter(lists, getContext()));

        return view;
    }
}