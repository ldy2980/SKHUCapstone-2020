package com.skhu.capstone2020.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.skhu.capstone2020.Model.GroupInfo;
import com.skhu.capstone2020.R;

public class ChatFragment extends Fragment {
    private GroupInfo groupInfo;

    public ChatFragment() {
    }

    public ChatFragment(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);


        return view;
    }
}
