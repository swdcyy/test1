package com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.VelocityTracker;
import java.lang.Math;
import h3.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import o56.c;
import o56.a;
import android.app.Application;
import android.view.ViewConfiguration;

public class LiveAggregateBannerViewPager extends ViewPager	// class@000c6f
{
    public float b;
    public int c;
    public ViewParent d;
    public VelocityTracker e;

    public void LiveAggregateBannerViewPager(Context p0){
       super(p0, null);
    }
    public void LiveAggregateBannerViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 5.00f;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       LiveAggregateBannerViewPager obj = PatchProxy.applyOneRefs(p0, this, LiveAggregateBannerViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d != null) {
          int i = (int)p0.getX();
          if (!p0.getAction()) {
             this.c = i;
             this.d.requestDisallowInterceptTouchEvent(true);
             LiveAggregateBannerViewPager te = this.e;
             if (te == null) {
                this.e = VelocityTracker.obtain();
             }else {
                te.clear();
             }
             this.e.addMovement(p0);
          }
          int i1 = (p0.getAction() == 3)? 1: 0;
          int i2 = (p0.getAction() == 1)? 1: 0;
          if (i1 | i2) {
             this.d.requestDisallowInterceptTouchEvent(false);
             obj = this.e;
             if (obj != null) {
                obj.clear();
             }
          }else if(p0.getAction() == 2){
             i = i - this.c;
             this.e.addMovement(p0);
             this.e.computeCurrentVelocity(1000);
             if (Math.abs(this.e.getYVelocity()) - Math.abs(this.e.getXVelocity()) > 0) {
                this.d.requestDisallowInterceptTouchEvent(false);
             }else if(!this.getCurrentItem() && (float)i - this.b > 0){
                this.d.requestDisallowInterceptTouchEvent(false);
             }else if(this.getAdapter() != null && (this.getCurrentItem() == (this.getAdapter().j() - true) && (float)i - (- this.b) < 0)){
                this.d.requestDisallowInterceptTouchEvent(false);
             }
          }
       }
    label_00ca :
       return super.onInterceptTouchEvent(p0);
    }
    public void setViewParent(ViewParent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAggregateBannerViewPager.class, "1")) {
          return;
       }
       this.d = p0;
       if (p0 instanceof CustomRecyclerView && !p0.isNestedScrollingEnabled()) {
          this.d.setNestedScrollingEnabled(true);
       }
       this.b = (float)ViewConfiguration.get(a.a().a()).getScaledTouchSlop();
       return;
    }
}
