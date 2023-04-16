package com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout;
import a2.x;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import a2.y;
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
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout$c;
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout$b;
import android.animation.ValueAnimator;
import c06.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.component.photofeatures.widget.NestedParentConstraintLayout$a;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewConfiguration;

public class NestedParentConstraintLayout extends ConstraintLayout implements x	// class@00127d
{
    public final y B;
    public final int C;
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
    public final void L(int p0){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedParentConstraintLayout.class, "10")) {
          return;
       }
       this.setTranslationY((this.getTranslationY() + (float)p0));
       return;
    }
    public int getCurrentOffset(){
       Object obj = PatchProxy.apply(null, this, NestedParentConstraintLayout.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getTranslationY();
    }
    public int getNestedScrollAxes(){
       Object obj = PatchProxy.apply(null, this, NestedParentConstraintLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.B.a();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedParentConstraintLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedFling(p0, p1, p2, p3))? true: false;
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getCurrentOffset());
       }
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedParentConstraintLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (super.onNestedPreFling(p0, p1, p2))? true: false;
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getCurrentOffset());
       }
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, NestedParentConstraintLayout.class, "7")) {
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
          this.L((- p2));
          p3[p1] = p3[p1] + p2;
       }
       if (p2 > 0) {
          if ((p2 - this.getCurrentOffset()) > 0 && this.getCurrentOffset()) {
             p3[p1] = p3[p1] + this.getCurrentOffset();
             this.L((- this.getCurrentOffset()));
          }else if((p2 - this.getCurrentOffset()) < 0){
             this.L((- p2));
             p3[p1] = p3[p1] + p2;
          }
       }
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getCurrentOffset());
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedParentConstraintLayout.class, "3")) {
             return;
          }
       }
       super.onNestedScroll(p0, p1, p2, p3, p4);
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getCurrentOffset());
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedParentConstraintLayout.class, "2")) {
          return;
       }
       this.B.b(p0, p1, p2);
       NestedParentConstraintLayout tE = this.E;
       if (tE != null) {
          tE.a(this.getCurrentOffset());
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedParentConstraintLayout.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.isEnabled();
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentConstraintLayout.class, "4")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       this.B.d(p0);
       if (this.getCurrentOffset() > this.C) {
          NestedParentConstraintLayout tD = this.D;
          if (tD != null) {
             tD.a();
          }
       }else if(this.getCurrentOffset() && this.getCurrentOffset() <= this.C){
          int[] ointArray = new int[]{this.getCurrentOffset(),0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(150);
          valueAnimato.addUpdateListener(new a(this));
          valueAnimato.addListener(new NestedParentConstraintLayout$a(this));
          valueAnimato.start();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       NestedParentConstraintLayout tD;
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedParentConstraintLayout.class, "9");
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
             action = i - this.F;
             if (action > 0 && Math.abs(action) > ViewConfiguration.getTouchSlop()) {
                tD = this.D;
                if (tD != null) {
                   tD.a();
                }
             }else {
                tD = this.E;
                if (tD != null) {
                   tD.a(this.getCurrentOffset());
                }
             }
             this.F = i;
          }
       }else {
          this.F = i;
       }
       return super.onTouchEvent(p0);
    }
    public void setCurrentOffset(int p0){
       if (PatchProxy.isSupport(NestedParentConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedParentConstraintLayout.class, "11")) {
          return;
       }
       this.setTranslationY((float)p0);
       return;
    }
    public void setOnDragListener(NestedParentConstraintLayout$b p0){
       this.D = p0;
    }
    public void setOnTopChangeListener(NestedParentConstraintLayout$c p0){
       this.E = p0;
    }
}
