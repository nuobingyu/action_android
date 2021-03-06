package com.example.viewpager_pagetransformer;

import android.support.v4.view.ViewPager;
import android.view.View;

public class DepthPAgeTransformer implements ViewPager.PageTransformer{

    private static final float MIN_SCALE = 0.75f;

    @Override
    public void transformPage(View view, float position) {

        int pageWidth = view.getWidth();

        if(position < -1){
            view.setAlpha(0);
        }else if(position <= 0){
            view.setAlpha(1);
            view.setTranslationX(0);
            view.setScaleX(1);
            view.setScaleY(1);
        }else if(position <= 1 ){
            view.setAlpha(1 - position);
            view.setTranslationX(pageWidth * -position);
            float  scaleFatcor = MIN_SCALE +(1 - MIN_SCALE)* (1 - Math.abs(position));
            view.setScaleX(scaleFatcor);
            view.setScaleY(scaleFatcor);
        }else{
            view.setAlpha(0);
        }
    }
}
