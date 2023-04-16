package com.yxcorp.gifshow.widget.NestedParentConstraintLayout;
import a2.x;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import a2.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Float;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.NestedParentConstraintLayout$c;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.NestedParentConstraintLayout$b;
import android.animation.ValueAnimator;
import tyc.g3;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.NestedParentConstraintLayout$a;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewConfiguration;

public class NestedParentConstraintLayout extends ConstraintLayout implements x	// class@00188f
{
    public y B;
    public int C;
    public NestedParentConstraintLayout$b D;
    public NestedParentConstraintLayout$c E;
    public int F;
    public static final int G;

    public void NestedParentConstraintLayout(Context p0){
       super(p0, null, 0);
    }
    public void NestedParentConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedParentConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = n.c(this.getContext(), 0x41f00000);
       this.B = new y(this);
    }
    public int getNestedScrollAxes(){
       Object obj = PatchProxy.apply(null, this, NestedParentConstraintLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.a();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedParentConstraintLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedFling(p0, p1, p2, p3))? true: false;
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getTop());
       }
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedParentConstraintLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedPreFling(p0, p1, p2))? true: false;
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getTop());
       }
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, NestedParentConstraintLayout.class, "6")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       p3[0] = p3[0] + p1;
       p1 = 1;
       if (!p0.canScrollVertically(-1) && p2 < 0) {
          this.offsetTopAndBottom((- p2));
          p3[p1] = p3[p1] + p2;
       }
       if (p2 > 0) {
          if ((p2 - this.getTop()) > 0 && this.getTop()) {
             this.offsetTopAndBottom((- this.getTop()));
             p3[p1] = p3[p1] + (p2 - this.getTop());
          }else if((p2 - this.getTop()) < 0){
             this.offsetTopAndBottom((- p2));
             p3[p1] = p3[p1] + p2;
          }
       }
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getTop());
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedParentConstraintLayout.class, "2")) {
             return;
          }
       }
       super.onNestedScroll(p0, p1, p2, p3, p4);
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getTop());
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedParentConstraintLayout.class, "1")) {
          return;
       }
       this.B.b(p0, p1, p2);
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getTop());
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       return true;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentConstraintLayout.class, "3")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       this.B.d(p0);
       if (this.getTop() > this.C) {
          NestedParentConstraintLayout tD = this.D;
          if (tD != null) {
             tD.a();
          }
       }else if(this.getTop() && this.getTop() <= this.C){
          int[] ointArray = new int[]{this.getTop(),0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(150);
          valueAnimato.addUpdateListener(new g3(this));
          valueAnimato.addListener(new NestedParentConstraintLayout$a(this));
          valueAnimato.start();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       NestedParentConstraintLayout tD;
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedParentConstraintLayout.class, "8");
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
             if (Math.abs((i - this.F)) > ViewConfiguration.getTouchSlop()) {
                tD = this.D;
                if (tD != null) {
                   tD.a();
                }
             }else {
                tD = this.E;
                if (tD != null) {
                   tD.a(this.getTop());
                }
             }
             this.F = i;
          }
       }else {
          this.F = i;
       }
       return super.onTouchEvent(p0);
    }
    public void setOnDragListener(NestedParentConstraintLayout$b p0){
       this.D = p0;
    }
    public void setOnTopChangeListener(NestedParentConstraintLayout$c p0){
       this.E = p0;
    }
}
