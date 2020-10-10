package com.haya.tablayout_viewpager_java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

// ListFragment を利用することがポイント
// ArrayAdapter を使うことが出来るようになる。
//https://android.keicode.com/basics/fragments-listfragment.php

public class Main1Fragment extends ListFragment {

    ViewGroup mRootView;

    private static final String[] texts = {
            // Globe Decade の楽曲リストより
            "Feel Like dance",
            "Joy to the love (globe)",
            "SWEET PAIN",
            "DEPARTURES (RADIO EDIT)",
            "FREEDOM (RADIO EDIT)",
            "Is this love",
            "Can't Stop Fallin' in Love",
            "FACE",
            "FACES PLACES",
            "Anytime smokin' cigarette",
            "Wanderin' Destiny",
            "Love again",
            "wanna Be A Dreammaker",
            "Sa Yo Na Ra",
            "sweet heart",
            "Perfume of love",
            "MISS YOUR BODY",
            "still growin' up",
            "biting her nails",
            "とにかく無性に…"
    };

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        texts);

        setListAdapter(adapter);
    }

}