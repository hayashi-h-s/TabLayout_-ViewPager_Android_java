//package com.haya.tablayout_viewpager_java;
//
//import android.view.MotionEvent;
//
//import androidx.viewpager.widget.ViewPager;
//
//public class CustomViewPager extends ViewPager {
//
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent arg0) {
//        // Never allow swiping to switch between pages
//        if(swipeLock){
//            return super.onInterceptTouchEvent(arg0);
//        }
//        else{
//            return false;
//        }
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        // Never allow swiping to switch between pages
//        if(swipeLock){
//            return super.onTouchEvent(event);
//        }
//        else{
//            return false;
//        }
//    }
//}
