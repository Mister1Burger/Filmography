package com.example.burge.dictionary;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;

/**
 * Created by Burge on 19.09.2017.
 */

public class FilmHolder {
    @BindView(R2.id.name_text)
    TextView name_tv;
    @BindView(R2.id.rating_text)
    TextView rating_tv;
    @BindView(R2.id.poster_image)
    ImageView poster_iv;
    @BindView(R2.id.rl)
    RelativeLayout rl;
}
