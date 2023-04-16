package com.kwai.feature.post.api.music.widget.DragScrollContainerLayout;
import a2.x;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewConfiguration;
import a2.y;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import f46.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Math;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$b;
import android.view.MotionEvent;
import android.view.VelocityTracker;

public class DragScrollContainerLayout extends RelativeLayout implements x	// class@00141d
{
    public final y b;
    public int c;
    public DragScrollContainerLayout$b d;
    public int e;
    public float f;
    public boolean g;
    public boolean h;
    public static final int i;

    public void DragScrollContainerLayout(Context p0){
       super(p0, null, 0);
    }
    public void DragScrollContainerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DragScrollContainerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = n.c(this.getContext(), 0x41f00000);
       if (PatchProxy.applyVoidOneRefs(p0, this, DragScrollContainerLayout.class, "1")) {
       }else {
          this.f = (float)ViewConfiguration.get(p0).getScaledTouchSlop();
       }
       this.b = new y(this);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, DragScrollContainerLayout.class, "8")) {
          return;
       }
       int[] ointArray = new int[]{this.getCurrentOffset(),0};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.setDuration(150);
       valueAnimato.addUpdateListener(new a(this));
       valueAnimato.addListener(new DragScrollContainerLayout$a(this));
       valueAnimato.start();
       return;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DragScrollContainerLayout.class, "12")) {
          return;
       }
       this.setTranslationY((this.getTranslationY() + (float)p0));
       return;
    }
    public int getCurrentOffset(){
       Object obj = PatchProxy.apply(null, this, DragScrollContainerLayout.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getTop() + (int)this.getTranslationY());
    }
    public int getNestedScrollAxes(){
       Object obj = PatchProxy.apply(null, this, DragScrollContainerLayout.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.a();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, DragScrollContainerLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.onNestedFling(p0, p1, p2, p3);
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, DragScrollContainerLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!p0.canScrollVertically(-1) && (p2 < 0 && Math.abs(p2) - 0x43960000 > 0)) {
          this.h = true;
       }
    label_003e :
       return super.onNestedPreFling(p0, p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, DragScrollContainerLayout.class, "9")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       if (!p0.canScrollHorizontally(p1)) {
          p3[0] = p3[0] + p1;
       }
       if (!p0.canScrollVertically(-1) && p2 < 0) {
          this.b((- p2));
          p3[1] = p3[1] + p2;
          DragScrollContainerLayout td = this.d;
          if (td != null) {
             td.b();
          }
       }
       if (p2 > 0) {
          if ((p2 - this.getCurrentOffset()) > 0 && this.getCurrentOffset()) {
             p3[1] = p3[1] + this.getCurrentOffset();
             this.b((- this.getCurrentOffset()));
          }else if((p2 - this.getCurrentOffset()) < 0){
             this.b((- p2));
             p3[1] = p3[1] + p2;
          }
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DragScrollContainerLayout.class, "4")) {
             return;
          }
       }
       super.onNestedScroll(p0, p1, p2, p3, p4);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, DragScrollContainerLayout.class, "3")) {
          return;
       }
       this.b.b(p0, p1, p2);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, DragScrollContainerLayout.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.isEnabled();
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DragScrollContainerLayout.class, "7")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       this.b.d(p0);
       if (this.getCurrentOffset() > this.c || this.h != null) {
          this.h = false;
          DragScrollContainerLayout td = this.d;
          if (td != null) {
             td.a();
          }
       }else if(this.getCurrentOffset() && this.getCurrentOffset() <= this.c){
          this.a();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int[] obj = PatchProxy.applyOneRefs(p0, this, DragScrollContainerLayout.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return super.onTouchEvent(p0);
       }
       int i = (int)p0.getRawY();
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action == 2) {
                action = this.e - i;
                if (this.g == null) {
                   DragScrollContainerLayout tf = this.f;
                   if ((float)Math.abs(action) - tf > 0) {
                      float f = (action > 0)? (float)action - tf: (float)action + tf;
                      action = (int)f;
                      this.g = b;
                   }
                }
                this.e = i;
                obj = new int[2];
                this.onNestedPreScroll(this, 0, action, obj);
                if (action < 0) {
                   Object obj1 = PatchProxy.applyOneRefs(p0, this, DragScrollContainerLayout.class, "15");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      VelocityTracker velocityTrac = VelocityTracker.obtain();
                      velocityTrac.addMovement(p0);
                      velocityTrac.computeCurrentVelocity(1000);
                      b1 = (Math.abs(velocityTrac.getYVelocity()) - 0x43960000 > 0)? true: false;
                   }
                   if (b1) {
                      this.h = b;
                   }
                }
                this.h = false;
             }
          }else {
             this.g = false;
             if (this.getCurrentOffset() > this.c || this.h != null) {
                this.h = false;
                DragScrollContainerLayout td = this.d;
                if (td != null) {
                   td.a();
                }
             }else if(this.getCurrentOffset() && this.getCurrentOffset() <= this.c){
                this.a();
             }
          }
       }else {
          this.g = false;
          this.e = i;
       }
       if (this.g == null && !super.onTouchEvent(p0)) {
          b = false;
       }
       return b;
    }
    public void setCurrentOffset(int p0){
       if (PatchProxy.isSupport(DragScrollContainerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DragScrollContainerLayout.class, "13")) {
          return;
       }
       this.setTranslationY((float)p0);
       return;
    }
    public void setMaxDragSlop(int p0){
       this.c = p0;
    }
    public void setOnDragListener(DragScrollContainerLayout$b p0){
       this.d = p0;
    }
}
