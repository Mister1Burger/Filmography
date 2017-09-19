package com.example.burge.dictionary;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import io.reactivex.Observable;

/**
 * Created by Burge on 19.09.2017.
 */

public class FilmListFragment extends Fragment {
    private List<Film> films;
    @BindView(R2.id.gridview)
    GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cellgryd, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        Adapter adapter = new Adapter(getActivity());
        gridView.setAdapter(adapter);
        films = new ArrayList<>();
        Observable.just(films)
                .doOnNext(films -> films.add(new Film(R.drawable.poster2,String.valueOf(R.string.Name2film),R.string.Rating2film,String.valueOf(R.string.About2film)))
                        

                .doOnNext(films -> films.add(new Film(R.drawable.poster1,String.valueOf(R.string.Name1film),R.string.Rating1film,String.valueOf(R.string.About1film)))
        super.onViewCreated(view, savedInstanceState);


    }


}
