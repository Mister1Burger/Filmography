package com.example.burge.dictionary;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Burge on 18.09.2017.
 */

public class FullImageFragment extends Fragment {
    ImageView imageView;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.full_image, container, false);
        imageView = (ImageView) view.findViewById(R.id.full_image_view);
        textView = (TextView) view.findViewById(R.id.about_text);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Adapter adapter = new Adapter(getActivity());

        int position = adapter.getItemId(   );
        imageView.setImageResource(adapter.mThumbIds[position]);
        textView.setText(adapter.aboutPoster[position]);




    }


}
