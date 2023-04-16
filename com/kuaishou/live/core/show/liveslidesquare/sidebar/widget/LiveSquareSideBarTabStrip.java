package com.kuaishou.live.core.show.liveslidesquare.sidebar.widget.LiveSquareSideBarTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
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
import android.widget.HorizontalScrollView;
import android.view.ViewGroup;
import java.lang.Integer;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Math;

public class LiveSquareSideBarTabStrip extends PagerSlidingTabStrip	// class@000cb3
{
    public int A1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public int z1;
    public static final int B1;

    static {
       LiveSquareSideBarTabStrip.B1 = c.b(a.B.getResources(), 0x7f0702c5);
    }
    public void LiveSquareSideBarTabStrip(Context p0){
       super(p0, null);
    }
    public void LiveSquareSideBarTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSquareSideBarTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w1 = false;
       this.x1 = false;
       this.y1 = 0;
       this.z1 = 0;
       this.A1 = 0;
    }
    public boolean E(){
       boolean b = (this.x1 == null && this.w1 != null)? true: false;
       return b;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarTabStrip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.getParent().requestDisallowInterceptTouchEvent(true);
       return super.dispatchTouchEvent(p0);
    }
    public float getLeftFadingEdgeStrength(){
       return 0;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveSquareSideBarTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSquareSideBarTabStrip.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.getTabsContainer() != null && this.getTabsContainer().getChildCount() >= 2) {
          p0 = this.getMeasuredWidth();
          boolean b = false;
          int i1 = 0;
          for (int i = 0; i < this.getTabsContainer().getChildCount(); i = i + 1) {
             View childAt = this.getTabsContainer().getChildAt(i);
             i1 = i1 + childAt.getMeasuredWidth();
             p0 = p0 - childAt.getMeasuredWidth();
          }
          p0 = p0 / (this.getTabsContainer().getChildCount() - 1);
          for (i = 1; i < this.getTabsContainer().getChildCount(); i = i + 1) {
             View childAt1 = this.getTabsContainer().getChildAt(i);
             LinearLayout$LayoutParams layoutParams = childAt1.getLayoutParams();
             LiveSquareSideBarTabStrip tA1 = this.A1;
             layoutParams.leftMargin = (tA1 != null)? tA1: Math.max(p0, LiveSquareSideBarTabStrip.B1);
             i1 = i1 + layoutParams.leftMargin;
             childAt1.setLayoutParams(layoutParams);
          }
          if (i1 > this.getMeasuredWidth()) {
             b = true;
          }
          this.w1 = b;
       }
       return;
    }
    public void setCustomScrollOffset(int p0){
       this.y1 = p0;
    }
    public void setCustomTabItemLeftMargin(int p0){
       this.A1 = p0;
    }
    public void setIsOnlyShowOneTab(boolean p0){
       this.x1 = p0;
    }
    public void t(int p0,int p1){
       if (PatchProxy.isSupport(LiveSquareSideBarTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSquareSideBarTabStrip.class, "3")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       p1 = p1 + this.y1;
       int i = this.g.getChildAt(p0).getLeft() + p1;
       if (p0 > 0 || p1 > 0) {
          i = (i - (this.getWidth() / 2)) + (this.g.getChildAt(p0).getWidth() / 2);
       }
       if (i != this.z1) {
          this.z1 = i;
          this.smoothScrollTo(i, 0);
       }
       return;
    }
}
