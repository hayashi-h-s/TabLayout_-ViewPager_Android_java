package com.haya.tablayout_viewpager_java;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class OriginalFragmentPagerAdapter extends FragmentPagerAdapter {

    private CharSequence[] tabTitles = {"タブ1", "タブ2", "タブ３"};

    public OriginalFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
//    https://docs.oracle.com/javase/jp/7/api/java/lang/CharSequence.html
//CharSequence は char 値の読むことのできる文字シーケンス


    // getPageTitle()メソッド：タブの総数分のタブのタイトルをタブに反映しています。
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }


    ///getItem()メソッド：
    // positionに対応したFragmentを反映しています。タブを選択するたびに呼ばれます。
    // その時に引数としてposition受け取るので、そのpositionに対応したFragmentを返します。
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Main1Fragment();
            case 1:
                return new Main2Fragment();
            case 2:
                return new MainFragment3();
            default:
                return null;
        }
    }

    //getCount()メソッド：タブの総数を返しています。
    @Override
    public int getCount() {
        return tabTitles.length;
    }
}