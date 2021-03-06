package com.movieflix.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asus on 12/12/2017.
 */

public class SliderIntroPagerAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context mContext_vp;
    private int[] Layouts;

    public SliderIntroPagerAdapter(Context context, int[] layouts ) {
        mContext_vp=context;
        Layouts=layouts;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)mContext_vp.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        View view = layoutInflater.inflate(Layouts[position], container, false);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return Layouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }

}
