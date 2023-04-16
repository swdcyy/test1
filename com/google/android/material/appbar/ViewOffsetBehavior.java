package com.google.android.material.appbar.ViewOffsetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import sj.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class ViewOffsetBehavior extends CoordinatorLayout$Behavior	// class@001633
{
    public int tempLeftRightOffset;
    public int tempTopBottomOffset;
    public l viewOffsetHelper;

    public void ViewOffsetBehavior(){
       super();
       this.tempTopBottomOffset = 0;
       this.tempLeftRightOffset = 0;
    }
    public void ViewOffsetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.tempTopBottomOffset = 0;
       this.tempLeftRightOffset = 0;
    }
    public int getLeftAndRightOffset(){
       ViewOffsetBehavior tviewOffsetH = this.viewOffsetHelper;
       int i = (tviewOffsetH != null)? tviewOffsetH.b(): 0;
       return i;
    }
    public int getTopAndBottomOffset(){
       ViewOffsetBehavior tviewOffsetH = this.viewOffsetHelper;
       int i = (tviewOffsetH != null)? tviewOffsetH.c(): 0;
       return i;
    }
    public void layoutChild(CoordinatorLayout p0,View p1,int p2){
       p0.J(p1, p2);
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       this.layoutChild(p0, p1, p2);
       if (this.viewOffsetHelper == null) {
          this.viewOffsetHelper = new l(p1);
       }
       this.viewOffsetHelper.d();
       ViewOffsetBehavior ttempTopBott = this.tempTopBottomOffset;
       if (ttempTopBott != null) {
          this.viewOffsetHelper.f(ttempTopBott);
          this.tempTopBottomOffset = 0;
       }
       ttempTopBott = this.tempLeftRightOffset;
       if (ttempTopBott != null) {
          this.viewOffsetHelper.e(ttempTopBott);
          this.tempLeftRightOffset = 0;
       }
       return true;
    }
    public boolean setLeftAndRightOffset(int p0){
       ViewOffsetBehavior tviewOffsetH = this.viewOffsetHelper;
       if (tviewOffsetH != null) {
          return tviewOffsetH.e(p0);
       }
       this.tempLeftRightOffset = p0;
       return false;
    }
    public boolean setTopAndBottomOffset(int p0){
       ViewOffsetBehavior tviewOffsetH = this.viewOffsetHelper;
       if (tviewOffsetH != null) {
          return tviewOffsetH.f(p0);
       }
       this.tempTopBottomOffset = p0;
       return false;
    }
}
