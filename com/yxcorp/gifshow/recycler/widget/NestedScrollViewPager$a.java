package com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class NestedScrollViewPager$a implements ViewPager$i	// class@0017bc
{
    public final NestedScrollViewPager b;

    public void NestedScrollViewPager$a(NestedScrollViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       NestedScrollViewPager$a uoa = NestedScrollViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.i != null) {
          uoa.j(p0, "userScroll");
       }else if(uoa.e != p0){
          uoa.j(p0, "unknown1");
       }
       return;
    }
}
