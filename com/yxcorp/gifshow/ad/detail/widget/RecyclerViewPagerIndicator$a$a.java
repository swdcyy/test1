package com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator$a$a;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class RecyclerViewPagerIndicator$a$a implements RecyclerViewPager$c	// class@001734
{
    public final PagerIndicator$c a;
    public final RecyclerViewPagerIndicator$a b;

    public void RecyclerViewPagerIndicator$a$a(RecyclerViewPagerIndicator$a p0,PagerIndicator$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,int p1){
       if (PatchProxy.isSupport(RecyclerViewPagerIndicator$a$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RecyclerViewPagerIndicator$a$a.class, "1")) {
          return;
       }
       this.a.onPageSelected(p0);
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
}
