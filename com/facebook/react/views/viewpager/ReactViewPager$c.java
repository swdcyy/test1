package com.facebook.react.views.viewpager.ReactViewPager$c;
import androidx.viewpager.widget.ViewPager$i;
import com.facebook.react.views.viewpager.ReactViewPager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.IllegalStateException;
import cg.b;
import android.view.ViewGroup;
import df.b;
import df.c;
import java.lang.Float;
import cg.a;
import cg.c;

public class ReactViewPager$c implements ViewPager$i	// class@001441
{
    public final ReactViewPager b;

    public void ReactViewPager$c(ReactViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       String str;
       ReactViewPager$c uoc = ReactViewPager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                str = "settling";
             }else {
                throw new IllegalStateException("Unsupported pageScrollState");
             }
          }else {
             str = "dragging";
          }
       }else {
          str = "idle";
       }
       uoc = this.b;
       uoc.b.c(new b(uoc.getId(), str));
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(ReactViewPager$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, ReactViewPager$c.class, "1")) {
          return;
       }
       ReactViewPager$c tb = this.b;
       tb.b.c(new a(tb.getId(), p0, p1));
       return;
    }
    public void onPageSelected(int p0){
       ReactViewPager$c uoc = ReactViewPager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       uoc = this.b;
       if (uoc.c == null) {
          uoc.b.c(new c(uoc.getId(), p0));
       }
       return;
    }
}
