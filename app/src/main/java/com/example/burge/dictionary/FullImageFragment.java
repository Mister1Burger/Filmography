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

import butterknife.BindView;

/**
 * Created by Burge on 18.09.2017.
 */

public class FullImageFragment extends Activity {
    @BindView(R2.id.full_image_view)
    ImageView fullImageView;
    @BindView(R2.id.about_text)
    TextView aboutText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        // get intent data
        Intent intent = getIntent();

        // Selected image id
        int position = intent.getExtras().getInt("id");
        Adapter imageAdapter = new Adapter(this);

        fullImageView.setImageResource(imageAdapter.films.get(position).poster);
        aboutText.setText(String.valueOf(imageAdapter.films.get(position).description));
    }
}
//        int position = adapter.getItemId(   );
//        imageView.setImageResource(adapter.mThumbIds[position]);
//        textView.setText(adapter.aboutPoster[position]);




