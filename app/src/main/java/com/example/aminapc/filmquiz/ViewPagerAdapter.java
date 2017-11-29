package com.example.aminapc.filmquiz;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;

/**
 * Created by Fujitsu E751 on 22/04/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private Integer[] image ={
            R.drawable.slika1,
            R.drawable.slika2,
            R.drawable.slika3,
            R.drawable.slika4,
            R.drawable.slika
    };


    public ViewPagerAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = mLayoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(image[position]);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view,0);
        return  view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
