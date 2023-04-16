package com.kwai.library.widget.viewpager.GridViewPagerIndicator$a$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.GridViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Object;

public class GridViewPagerIndicator$a$a implements ViewPager$i	// class@000a6c
{
    public final PagerIndicator$c b;
    public final GridViewPagerIndicator$a c;

    public void GridViewPagerIndicator$a$a(GridViewPagerIndicator$a p0,PagerIndicator$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       this.b.onPageSelected(p0);
    }
}
