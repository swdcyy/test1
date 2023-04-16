package com.yxcorp.gifshow.activity.share.widget.DragPreviewContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Math;
import java.lang.System;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import java.lang.Number;

public class DragPreviewContainer extends FrameLayout	// class@00149a
{
    public int b;
    public long c;
    public DraggedFrameLayout$b d;
    public VelocityTracker e;
    public int f;
    public int g;
    public boolean h;

    public void DragPreviewContainer(Context p0){
       super(p0, null);
    }
    public void DragPreviewContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DragPreviewContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, DragPreviewContainer.class, "3")) {
          return;
       }
       DragPreviewContainer te = this.e;
       if (te != null) {
          te.clear();
       }else {
          this.e = VelocityTracker.obtain();
       }
       return;
    }
    public int getCurrentState(){
       return this.b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DragPreviewContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h == null) {
          return super.onInterceptTouchEvent(p0);
       }
       int i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
             }else {
                i = i - this.f;
                i1 = i1 - this.g;
                if (i1 > 0 && Math.abs(i1) > Math.abs(i)) {
                   return true;
                }else {
                }
             }
          }else {
          }
       }else {
          this.f = i;
          this.g = i1;
          this.a();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       DragPreviewContainer te;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, DragPreviewContainer.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       int actionMasked = p0.getActionMasked();
       int i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int i2 = i - this.f;
       int i3 = i1 - this.g;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_006d :
                   p0 = PatchProxy.apply(null, this, DragPreviewContainer.class, "5");
                   if (p0 != patchProxyRe) {
                      f = p0.floatValue();
                   }else {
                      te = this.e;
                      if (te == null) {
                         f = 0;
                      }else {
                         te.computeCurrentVelocity(1000, 0x44fa0000);
                         f = this.e.getYVelocity();
                      }
                   }
                   this.d.b(i2, i3, f);
                   if (!PatchProxy.applyVoid(null, this, DragPreviewContainer.class, "6")) {
                      te = this.e;
                      if (te != null) {
                         te.clear();
                         this.e.recycle();
                         this.e = null;
                      }
                   }
                }
             }else {
                long l = System.currentTimeMillis();
                if ((l - this.c) - this.d.c() > 0) {
                   this.d.a(i2, i3);
                   this.c = l;
                }
                if (!PatchProxy.applyVoidOneRefs(p0, this, DragPreviewContainer.class, "4")) {
                   if (this.e == null) {
                      this.a();
                   }
                   this.e.addMovement(p0);
                }
             }
          }else {
             goto label_006d ;
          }
       }else {
          this.f = i;
          this.g = i1;
          this.a();
       }
    label_00b8 :
       return true;
    }
    public void setCanIntercept(boolean p0){
       this.h = p0;
    }
    public void setCurrentState(int p0){
       this.b = p0;
    }
    public void setDragListener(DraggedFrameLayout$b p0){
       this.d = p0;
    }
}
