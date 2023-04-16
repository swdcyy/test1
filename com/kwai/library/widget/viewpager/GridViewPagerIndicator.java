package com.kwai.library.widget.viewpager.GridViewPagerIndicator;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import com.kwai.library.widget.viewpager.GridViewPager;
import com.kwai.library.widget.viewpager.GridViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;

public class GridViewPagerIndicator extends PagerIndicator	// class@000a6e
{
    public GridViewPager F;
    public Map G;

    public void GridViewPagerIndicator(Context p0){
       super(p0);
       this.G = new HashMap();
    }
    public void GridViewPagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = new HashMap();
    }
    public void GridViewPagerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = new HashMap();
    }
    public void setViewPager(GridViewPager p0){
       this.F = p0;
       super.setPager(new GridViewPagerIndicator$a(this));
    }
}
