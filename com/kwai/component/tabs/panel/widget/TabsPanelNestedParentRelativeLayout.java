package com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout;
import a2.x;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.utility.n;
import a2.y;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$c;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$b;
import android.animation.ValueAnimator;
import dh5.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$a;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewConfiguration;

public class TabsPanelNestedParentRelativeLayout extends RelativeLayout implements x	// class@000b89
{
    public y b;
    public int c;
    public TabsPanelNestedParentRelativeLayout$b d;
    public TabsPanelNestedParentRelativeLayout$c e;
    public int f;
    public float g;
    public static final int h;

    public void TabsPanelNestedParentRelativeLayout(Context p0){
       super(p0, null, 0);
    }
    public void TabsPanelNestedParentRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TabsPanelNestedParentRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = n.c(this.getContext(), 0x41f00000);
       this.b = new y(this);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabsPanelNestedParentRelativeLayout.class, "13")) {
          return;
       }
       this.setTranslationY(((float)p0 + this.getTranslationY()));
       return;
    }
    public float getInitPosition(){
       return this.g;
    }
    public int getNestedScrollAxes(){
       Object obj = PatchProxy.apply(null, this, TabsPanelNestedParentRelativeLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.a();
    }
    public int getOffsetFromInitPosition(){
       Object obj = PatchProxy.apply(null, this, TabsPanelNestedParentRelativeLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(this.getTranslationY() - this.g);
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, TabsPanelNestedParentRelativeLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedFling(p0, p1, p2, p3))? true: false;
       TabsPanelNestedParentRelativeLayout te = this.e;
       if (te != null) {
          te.a(this.getOffsetFromInitPosition());
       }
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, TabsPanelNestedParentRelativeLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedPreFling(p0, p1, p2))? true: false;
       TabsPanelNestedParentRelativeLayout te = this.e;
       if (te != null) {
          te.a(this.getOffsetFromInitPosition());
       }
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, TabsPanelNestedParentRelativeLayout.class, "7")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       if (!p0.canScrollHorizontally(p1)) {
          p3[0] = p3[0] + p1;
       }
       p1 = 1;
       if (!p0.canScrollVertically(-1) && p2 < 0) {
          this.a((- p2));
          p3[p1] = p3[p1] + p2;
       }
       if (p2 > 0) {
          if ((p2 - this.getOffsetFromInitPosition()) > 0 && this.getOffsetFromInitPosition()) {
             this.a((- this.getOffsetFromInitPosition()));
             p3[p1] = p3[p1] + (p2 - this.getOffsetFromInitPosition());
          }else if((p2 - this.getOffsetFromInitPosition()) < 0){
             this.a((- p2));
             p3[p1] = p3[p1] + p2;
          }
       }
       TabsPanelNestedParentRelativeLayout te = this.e;
       if (te != null) {
          te.a(this.getOffsetFromInitPosition());
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TabsPanelNestedParentRelativeLayout.class, "3")) {
             return;
          }
       }
       super.onNestedScroll(p0, p1, p2, p3, p4);
       TabsPanelNestedParentRelativeLayout te = this.e;
       if (te != null) {
          te.a(this.getOffsetFromInitPosition());
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TabsPanelNestedParentRelativeLayout.class, "2")) {
          return;
       }
       this.b.b(p0, p1, p2);
       TabsPanelNestedParentRelativeLayout te = this.e;
       if (te != null) {
          te.a(this.getOffsetFromInitPosition());
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, TabsPanelNestedParentRelativeLayout.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.isEnabled();
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelNestedParentRelativeLayout.class, "4")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       this.b.d(p0);
       if (this.getOffsetFromInitPosition() > this.c) {
          TabsPanelNestedParentRelativeLayout td = this.d;
          if (td != null) {
             td.a();
          }
       }else if(this.getOffsetFromInitPosition() && this.getOffsetFromInitPosition() <= this.c){
          int[] ointArray = new int[]{this.getOffsetFromInitPosition(),0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(150);
          valueAnimato.addUpdateListener(new c(this));
          valueAnimato.addListener(new TabsPanelNestedParentRelativeLayout$a(this));
          valueAnimato.start();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       TabsPanelNestedParentRelativeLayout td;
       Object obj = PatchProxy.applyOneRefs(p0, this, TabsPanelNestedParentRelativeLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return super.onTouchEvent(p0);
       }
       int i = (int)p0.getRawY();
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             if (Math.abs((i - this.f)) > ViewConfiguration.getTouchSlop()) {
                td = this.d;
                if (td != null) {
                   td.a();
                }
             }else {
                td = this.e;
                if (td != null) {
                   td.a(this.getOffsetFromInitPosition());
                }
             }
             this.f = i;
          }
       }else {
          this.f = i;
       }
       return super.onTouchEvent(p0);
    }
    public void setInitPosition(float p0){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TabsPanelNestedParentRelativeLayout.class, "10")) {
          return;
       }
       this.g = p0;
       this.setTranslationY(p0);
       return;
    }
    public void setOffsetFromInitPosition(int p0){
       if (PatchProxy.isSupport(TabsPanelNestedParentRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabsPanelNestedParentRelativeLayout.class, "12")) {
          return;
       }
       this.setTranslationY(((float)p0 + this.g));
       return;
    }
    public void setOnDragListener(TabsPanelNestedParentRelativeLayout$b p0){
       this.d = p0;
    }
    public void setOnTopChangeListener(TabsPanelNestedParentRelativeLayout$c p0){
       this.e = p0;
    }
}
