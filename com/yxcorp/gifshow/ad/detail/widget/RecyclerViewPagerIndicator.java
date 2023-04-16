package com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;

public class RecyclerViewPagerIndicator extends PagerIndicator	// class@001736
{
    public RecyclerViewPager F;
    public Map G;

    public void RecyclerViewPagerIndicator(Context p0){
       super(p0);
       this.G = new HashMap();
    }
    public void RecyclerViewPagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.G = new HashMap();
    }
    public void RecyclerViewPagerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = new HashMap();
    }
    public void j(RecyclerViewPager p0,int p1){
       if (PatchProxy.isSupport(RecyclerViewPagerIndicator.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RecyclerViewPagerIndicator.class, "1")) {
          return;
       }
       this.F = p0;
       super.setPager(new RecyclerViewPagerIndicator$a(this, p1));
       return;
    }
}
