package com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ix6.e;
import android.view.ViewGroup;
import java.lang.Integer;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import tw6.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;

public class LiveSlideViewPager extends GrootViewPager	// class@000cd6
{
    public final List R1;
    public final List S1;
    public e T1;

    public void LiveSlideViewPager(Context p0){
       super(p0, null);
    }
    public void LiveSlideViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.R1 = new ArrayList();
       this.S1 = new ArrayList();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       LiveSlideViewPager obj = PatchProxy.applyOneRefs(p0, this, LiveSlideViewPager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.T1;
       if (obj != null) {
          obj.e(p0);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void h0(int p0){
       if (PatchProxy.isSupport(LiveSlideViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSlideViewPager.class, "8")) {
          return;
       }
       LiveSlideViewPager tT1 = this.T1;
       if (tT1 != null) {
          tT1.a(p0);
       }
       return;
    }
    public void i0(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideViewPager.class, "3")) {
          return;
       }
       super.i0(p0);
       if (!this.S1.contains(p0)) {
          this.S1.add(p0);
       }
       return;
    }
    public void j0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideViewPager.class, "1")) {
          return;
       }
       super.j0(p0);
       if (!this.R1.contains(p0)) {
          this.R1.add(p0);
       }
       return;
    }
    public void m0(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideViewPager.class, "4")) {
          return;
       }
       super.m0(p0);
       this.S1.remove(p0);
       return;
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideViewPager.class, "2")) {
          return;
       }
       super.n0(p0);
       this.R1.remove(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSlideViewPager.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSlideViewPager.class, "7")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       LiveSlideViewPager tT1 = this.T1;
       if (tT1 != null) {
          tT1.c(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void setGrootViewPagerInterceptor(e p0){
       this.T1 = p0;
    }
}
