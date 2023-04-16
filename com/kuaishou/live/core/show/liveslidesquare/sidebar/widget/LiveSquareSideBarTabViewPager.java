package com.kuaishou.live.core.show.liveslidesquare.sidebar.widget.LiveSquareSideBarTabViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup;
import h3.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class LiveSquareSideBarTabViewPager extends ViewPager	// class@000cb4
{
    public int b;
    public int c;
    public boolean d;

    public void LiveSquareSideBarTabViewPager(Context p0){
       super(p0, null);
    }
    public void LiveSquareSideBarTabViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
       this.c = ViewConfiguration.get(p0).getScaledTouchSlop();
       this.setPageMargin(a1.d(R.dimen.arg_RES_7f070295));
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(LiveSquareSideBarTabViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveSquareSideBarTabViewPager.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.d != null) {
          return super.canScrollHorizontally(p0);
       }else {
          return false;
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarTabViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = (int)p0.getX();
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_005a :
                   this.getParent().requestDisallowInterceptTouchEvent(false);
                }
             }else {
                i = i - this.b;
                if (!this.getCurrentItem() && i > 0) {
                   this.getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.getAdapter() != null && (this.getCurrentItem() == (this.getAdapter().j() - 1) && i < 0)) {
                   this.getParent().requestDisallowInterceptTouchEvent(false);
                }
             }
          }else {
             goto label_005a ;
          }
       }else if(this.d != null){
          this.getParent().requestDisallowInterceptTouchEvent(1);
       }
       this.b = i;
    label_006f :
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarTabViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d != null) {
          return super.onInterceptTouchEvent(p0);
       }
       return false;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveSquareSideBarTabViewPager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveSquareSideBarTabViewPager.class, "1")) {
          return;
       }
       int scrollX = this.getScrollX();
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 != p2 && (!PatchProxy.isSupport(LiveSquareSideBarTabViewPager.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(scrollX), Integer.valueOf(p0), Integer.valueOf(p2), this, LiveSquareSideBarTabViewPager.class, "3"))) {
          this.scrollTo((int)(((float)scrollX / (float)p2) * (float)p0), this.getScrollY());
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarTabViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       int i = (int)p0.getX();
       if (this.getAdapter() != null && (this.getCurrentItem() == (this.getAdapter().j() - 1) && (p0.getAction() == 1 && (i - this.b) < (- this.c)))) {
          return 1;
       }
       return super.onTouchEvent(p0);
    }
    public void setScrollable(boolean p0){
       this.d = p0;
    }
}
