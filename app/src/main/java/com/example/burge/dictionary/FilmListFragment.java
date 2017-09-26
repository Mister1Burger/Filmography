package com.example.burge.dictionary;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;

/**
 * Created by Burge on 19.09.2017.
 */

public class FilmListFragment extends Fragment {
    private List<Film> films;
    GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cellgryd, container, false);
        gridView = view.findViewById(R.id.gridview);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Adapter adapter = new Adapter(getActivity());
        gridView.setAdapter(adapter);
        films = new ArrayList<>();
        Observable.just(films)
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster2,String.valueOf(R.string.Name2film),R.string.Rating2film,String.valueOf(R.string.About2film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster1,String.valueOf(R.string.Name1film),R.string.Rating1film,String.valueOf(R.string.About1film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster3,String.valueOf(R.string.Name3film),R.string.Rating3film,String.valueOf(R.string.About3film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster4,String.valueOf(R.string.Name4film),R.string.Rating4film,String.valueOf(R.string.About4film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster5,String.valueOf(R.string.Name5film),R.string.Rating5film,String.valueOf(R.string.About5film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster6,String.valueOf(R.string.Name6film),R.string.Rating6film,String.valueOf(R.string.About6film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster7,String.valueOf(R.string.Name7film),R.string.Rating7film,String.valueOf(R.string.About7film))))
                .doOnNext(films1 -> films1.add(new Film(R.drawable.poster8,String.valueOf(R.string.Name8film),R.string.Rating8film,String.valueOf(R.string.About8film))))
                .flatMap(Observable::fromIterable)
                .doOnNext(adapter::add)
                .toList()
                .subscribe(films1 -> {},throwable -> {});
        gridView.setOnItemClickListener(gridviewOnItemClickListener);


    }
    private GridView.OnItemClickListener gridviewOnItemClickListener = (parent, v, position, id) -> {
        // TODO Auto-generated method stub
        // выводим номер позиции
        Intent i = new Intent(getActivity(),FullImageFragment.class);
        // passing array index
        i.putExtra("id", position);
        startActivity(i);
    };


}
