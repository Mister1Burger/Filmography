package com.example.burge.dictionary;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Burge on 17.09.2017.
 */

public class Adapter extends BaseAdapter{


    List<Film> films;
    FilmListner listner;
    private Context mContext;

    public Adapter(Context c) {
        mContext = c;
    }


    @Override
    public int getCount() {
        return 0;
    }

    public Object getItem(int position) {
        return films.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;

        if (convertView == null) {
            FilmHolder holder = new FilmHolder();
           // grid = new View(mContext);
            //LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.cellgryd, parent, false);
            holder.name_tv.setText(films.get(position).name);
            holder.rating_tv.setText(String.valueOf(films.get(position).rating));
            holder.poster_iv.setImageResource(films.get(position).poster);
            holder.rl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listner.getFilm(films.get(position).description);
                }
            });

        } else {
            grid = (View) convertView;
        }




        return grid;
    }



    public void add(Film film) {
        films.add(film);
        notifyDataSetChanged();
    }

    // references to our images
//    public Integer[] mThumbIds = { R.drawable.poster1, R.drawable.poster2,
//            R.drawable.poster3, R.drawable.poster4, R.drawable.poster5,
//            R.drawable.poster6, R.drawable.poster7, R.drawable.poster8,
//             };
//
//    public Integer[] nameOfPoster = {R.string.Poster1,R.string.Poster2,
//             R.string.Poster3, R.string.Poster4, R.string.Poster5,
//             R.string.Poster6, R.string.Poster7, R.string.Poster8, };
//
//    public Integer[] aboutPoster = {R.string.About1poster,R.string.About2poster,
//            R.string.About3poster, R.string.About4poster, R.string.About5poster,
//            R.string.About6poster, R.string.About7poster, R.string.About8poster, };


}
