package com.yxcorp.gifshow.log.widget.CommonLogViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Float;

public class CommonLogViewPager$a implements ViewPager$i	// class@001b5c
{
    public final CommonLogViewPager b;

    public void CommonLogViewPager$a(CommonLogViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       CommonLogViewPager$a uoa = CommonLogViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       CommonLogViewPager f = this.b.f;
       if (f != null) {
          f.onPageScrollStateChanged(p0);
       }
       f = this.b.i;
       if (f != null) {
          Iterator iterator = f.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrollStateChanged(p0);
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(CommonLogViewPager$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, CommonLogViewPager$a.class, "1")) {
          return;
       }
       CommonLogViewPager f = this.b.f;
       if (f != null) {
          f.onPageScrolled(p0, p1, p2);
       }
       f = this.b.i;
       if (f != null) {
          Iterator iterator = f.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageScrolled(p0, p1, p2);
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       CommonLogViewPager$a uoa = CommonLogViewPager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.b;
       if (uoa.m != null) {
          uoa.m(p0, "userScroll");
       }else if(uoa.n != p0){
          uoa.m(p0, "unknown1");
       }
       CommonLogViewPager f = this.b.f;
       if (f != null) {
          f.onPageSelected(p0);
       }
       uoa = this.b;
       if (uoa.g == null) {
          uoa.l(p0);
       }
       f = this.b.i;
       if (f != null) {
          Iterator iterator = f.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPageSelected(p0);
          }
       }
       return;
    }
}
