package com.yxcorp.plugin.search.result.widget.HalfPageNestedScrollViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.plugin.search.result.widget.HalfPageNestedScrollViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class HalfPageNestedScrollViewPager$a implements ViewPager$i	// class@00075c
{
    public final HalfPageNestedScrollViewPager b;

    public void HalfPageNestedScrollViewPager$a(HalfPageNestedScrollViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       HalfPageNestedScrollViewPager$a uoa = HalfPageNestedScrollViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.h != null) {
          uoa.j(p0, "userScroll");
       }else if(uoa.d != p0){
          uoa.j(p0, "unknown1");
       }
       return;
    }
}
