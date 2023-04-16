package com.google.android.material.behavior.SwipeDismissBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.behavior.SwipeDismissBehavior$a;
import java.lang.Math;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.customview.widget.ViewDragHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;

public class SwipeDismissBehavior extends CoordinatorLayout$Behavior	// class@001639
{
    public ViewDragHelper a;
    public SwipeDismissBehavior$b b;
    public boolean c;
    public float d;
    public boolean e;
    public int f;
    public float g;
    public float h;
    public float i;
    public final ViewDragHelper$c j;

    public void SwipeDismissBehavior(){
       super();
       this.d = 0;
       this.f = 2;
       this.g = 0x3f000000;
       this.h = 0;
       this.i = 0x3f000000;
       this.j = new SwipeDismissBehavior$a(this);
    }
    public static float d(float p0,float p1,float p2){
       return Math.min(Math.max(p0, p1), p2);
    }
    public static int e(int p0,int p1,int p2){
       return Math.min(Math.max(p0, p1), p2);
    }
    public static float h(float p0,float p1,float p2){
       return ((p2 - p0) / (p1 - p0));
    }
    public boolean c(View p0){
       return true;
    }
    public final void g(ViewGroup p0){
       if (this.a == null) {
          ViewDragHelper viewDragHelp = (this.e != null)? ViewDragHelper.create(p0, this.d, this.j): ViewDragHelper.create(p0, this.j);
          this.a = viewDragHelp;
       }
       return;
    }
    public void i(float p0){
       this.i = SwipeDismissBehavior.d(0, p0, 0x3f800000);
    }
    public void j(float p0){
       this.h = SwipeDismissBehavior.d(0, p0, 0x3f800000);
    }
    public void k(int p0){
       this.f = p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       SwipeDismissBehavior tc = this.c;
       int actionMasked = p2.getActionMasked();
       if (actionMasked) {
          if (actionMasked == 1 || actionMasked == 3) {
             this.c = false;
          }
       }else {
          tc = p0.C(p1, (int)p2.getX(), (int)p2.getY());
          this.c = tc;
       }
       if (tc) {
          this.g(p0);
          return this.a.shouldInterceptTouchEvent(p2);
       }else {
          return false;
       }
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       SwipeDismissBehavior ta = this.a;
       if (ta == null) {
          return false;
       }
       ta.processTouchEvent(p2);
       return true;
    }
}
