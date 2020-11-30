package com.sonmob.vichat.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sonmob.vichat.R;
import com.sonmob.vichat.adapter.ChatListAdapter;
import com.sonmob.vichat.model.ChatList;

import java.util.ArrayList;
import java.util.List;

/**
 * create an instance of this fragment.
 */
public class ChatFragment extends Fragment {

    public ChatFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        List<ChatList> lists = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        lists.add(new ChatList("11","phung", "hello phung", "24/02/2018", "https://cdn.pixabay.com/photo/2020/10/16/14/40/among-us-5659730_960_720.png"));
        lists.add(new ChatList("13","xuan", "hello xuan", "19/10/2017","https://preview.redd.it/0j244l4o1sn51.png?width=440&format=png&auto=webp&s=c74e2de99bdb7da7471469d8274a4eaae244207e"));
        lists.add(new ChatList("12","son", "hello son", "14/12/2018","https://www.citypng.com/public/uploads/preview/-41601318596qfyeqk7mvf.png"));
        lists.add(new ChatList("14","xuan son", "hello xuan son", "01/12/2008","https://e.gamevui.vn/web/2020/10/among-us-avatar-maker/Assets/PLAYER/PINK.png"));
        lists.add(new ChatList("15","mr.xuan", "hello my friend", "22/02/2019","https://static.wikia.nocookie.net/among-us-wiki/images/3/34/Lime.png/revision/latest/top-crop/width/360/height/360?cb=20201013061604"));

        recyclerView.setAdapter(new ChatListAdapter(lists, getContext()));


        return view;

    }
}