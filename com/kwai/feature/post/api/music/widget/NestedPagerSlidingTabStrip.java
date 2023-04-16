package com.kwai.feature.post.api.music.widget.NestedPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.HorizontalScrollView;
import a2.u;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.MotionEvent;
import java.lang.Math;

public class NestedPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@00141e
{
    public boolean A1;
    public ViewParent B1;
    public boolean C1;
    public u w1;
    public float x1;
    public float y1;
    public float z1;

    public void NestedPagerSlidingTabStrip(Context p0){
       super(p0, null);
       this.F(p0);
    }
    public void NestedPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.F(p0);
    }
    public void NestedPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.F(p0);
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, NestedPagerSlidingTabStrip.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!this.canScrollHorizontally(i) && !this.canScrollHorizontally(-1)) {
          i = false;
       }
       return i;
    }
    public final void F(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedPagerSlidingTabStrip.class, "1")) {
          return;
       }
       this.w1 = new u(this);
       this.x1 = (float)ViewConfiguration.get(p0).getScaledTouchSlop();
       this.setNestedScrollingEnabled(true);
       return;
    }
    public float getLeftFadingEdgeStrength(){
       return 0;
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, NestedPagerSlidingTabStrip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.w1.m();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, NestedPagerSlidingTabStrip.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.B1 = this.getParent();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       NestedPagerSlidingTabStrip tB1;
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedPagerSlidingTabStrip.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action == 2 && this.A1 != null) {
          return true;
       }
       if (super.onInterceptTouchEvent(p0)) {
          return true;
       }
       float rawY = p0.getRawY();
       float rawX = p0.getRawX();
       action = action & 0x00ff;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action != 3) {
                   if (action == 5) {
                      this.w1.r();
                   }
                }
             }else {
                float f = (float)(int)rawY;
                int i = (int)Math.abs((f - this.y1));
                if ((float)(int)Math.abs(((float)(int)rawX - this.z1)) - this.x1 > 0 && (this.A1 == null && (this.C1 == null && this.E()))) {
                   this.y1 = f;
                   tB1 = this.B1;
                   if (tB1 != null) {
                      tB1.requestDisallowInterceptTouchEvent(false);
                   }
                   this.C1 = true;
                }
             label_007a :
                if ((float)i - this.x1 > 0 && this.C1 == null) {
                   this.y1 = f;
                   this.A1 = this.w1.p(2);
                   tB1 = this.B1;
                   if (tB1 != null) {
                      tB1.requestDisallowInterceptTouchEvent(true);
                   }
                }
             }
          }
          this.A1 = false;
          this.C1 = false;
          this.w1.r();
       }else {
          this.A1 = false;
          this.y1 = (float)(int)rawY;
          this.C1 = false;
          this.z1 = (float)(int)rawX;
       }
    label_00ad :
       return this.A1;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedPagerSlidingTabStrip.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float rawY = p0.getRawY();
       float x = p0.getX();
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             int i1 = 2;
             if (i != i1) {
                if (i == 3 || i == 6) {
                label_0097 :
                   if (this.A1 != null) {
                      this.w1.r();
                   }
                }
             }else {
                float f = (float)(int)rawY;
                x = (float)(int)(this.y1 - f);
                rawY = (float)(int)(this.z1 - (float)(int)x);
                if (this.A1 == null && (Math.abs(rawY) - this.x1 > 0 && (this.C1 == null && this.E()))) {
                   this.C1 = true;
                }
             label_0059 :
                if (this.C1 == null && (this.A1 == null && Math.abs(x) - this.x1 > 0)) {
                   ViewParent parent = this.getParent();
                   if (parent != null) {
                      parent.requestDisallowInterceptTouchEvent(true);
                   }
                   x = (x > 0)? x - this.x1: x + this.x1;
                   this.A1 = this.w1.p(i1);
                }
             label_0088 :
                if (this.A1 != null) {
                   this.y1 = f;
                   this.w1.c(0, (int)x, null, null);
                }
             }
          }else {
             goto label_0097 ;
          }
       }else {
          this.y1 = rawY;
          this.z1 = x;
       }
    label_00a5 :
       if (this.A1 != null) {
          return true;
       }else {
          return super.onTouchEvent(p0);
       }
    }
    public void setNestedScrollingEnabled(boolean p0){
       if (PatchProxy.isSupport(NestedPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NestedPagerSlidingTabStrip.class, "2")) {
          return;
       }
       this.w1.n(p0);
       return;
    }
}
