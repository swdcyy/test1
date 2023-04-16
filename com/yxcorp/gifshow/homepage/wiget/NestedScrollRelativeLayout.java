package com.yxcorp.gifshow.homepage.wiget.NestedScrollRelativeLayout;
import a2.v;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.wiget.NestedScrollRelativeLayout$a;
import android.view.ViewGroup;
import a2.u;
import android.view.View;
import a2.y;
import java.lang.Float;
import java.lang.Integer;

public class NestedScrollRelativeLayout extends RelativeLayout implements v	// class@001810
{
    public y b;
    public u c;
    public boolean d;
    public NestedScrollRelativeLayout$a e;

    public void NestedScrollRelativeLayout(Context p0){
       super(p0);
    }
    public void NestedScrollRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NestedScrollRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       NestedScrollRelativeLayout obj = PatchProxy.applyOneRefs(p0, this, NestedScrollRelativeLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 3 || actionMasked == 1) {
          obj = this.e;
          if (obj != null && this.d != null) {
             obj.b();
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final u getNestedScrollingChildHelper(){
       Object obj = PatchProxy.apply(null, this, NestedScrollRelativeLayout.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new u(this);
       }
       return this.c;
    }
    public final y getNestedScrollingParentHelper(){
       Object obj = PatchProxy.apply(null, this, NestedScrollRelativeLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new y(this);
       }
       return this.b;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class)) {
          p0 = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedScrollRelativeLayout.class, "9");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.getNestedScrollingChildHelper().a(p1, p2, p3);
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedScrollRelativeLayout.class, "3");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.getNestedScrollingChildHelper().b(p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedScrollRelativeLayout.class, "5")) {
             return;
          }
       }
       if (this.d != null) {
          NestedScrollRelativeLayout te = this.e;
          if (te != null) {
             te.a(p1, p2, p3, p4);
          }
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedScrollRelativeLayout.class, "10")) {
             return;
          }
       }
       this.onNestedScroll(p0, p1, p2, p3, p4, 0);
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedScrollRelativeLayout.class, "7")) {
          return;
       }
       this.onNestedScrollAccepted(p0, p1, p2, 0);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, NestedScrollRelativeLayout.class, "2")) {
          return;
       }
       this.getNestedScrollingParentHelper().c(p0, p1, p2, p3);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedScrollRelativeLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = (this.d != null && (p2 & 0x02))? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedScrollRelativeLayout.class, "8")) {
          return;
       }
       this.onStopNestedScroll(p0, 0);
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(NestedScrollRelativeLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NestedScrollRelativeLayout.class, "4")) {
          return;
       }
       this.getNestedScrollingParentHelper().d(p0);
       return;
    }
    public void setEnableNestScroll(boolean p0){
       this.d = p0;
    }
    public void setOnNestedPreScrollListener(NestedScrollRelativeLayout$a p0){
       this.e = p0;
    }
}
