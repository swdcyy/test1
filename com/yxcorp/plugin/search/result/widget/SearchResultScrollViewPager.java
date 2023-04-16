package com.yxcorp.plugin.search.result.widget.SearchResultScrollViewPager;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import android.content.Context;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import android.util.AttributeSet;

public class SearchResultScrollViewPager extends NestedScrollViewPager	// class@000763
{

    public void SearchResultScrollViewPager(Context p0){
       super(p0);
       this.setScrollable(true);
    }
    public void SearchResultScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
}
