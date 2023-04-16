package com.yxcorp.gifshow.profile.widget.ConsumeScrollRecyclerViewPager;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import android.content.Context;
import android.util.AttributeSet;

public class ConsumeScrollRecyclerViewPager extends RecyclerViewPager	// class@0015ee
{

    public void ConsumeScrollRecyclerViewPager(Context p0){
       super(p0, null);
    }
    public void ConsumeScrollRecyclerViewPager(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ConsumeScrollRecyclerViewPager(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollHorizontally(int p0){
       return true;
    }
}
