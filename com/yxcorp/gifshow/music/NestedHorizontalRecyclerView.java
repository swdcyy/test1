package com.yxcorp.gifshow.music.NestedHorizontalRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import java.lang.Number;
import java.lang.Math;

public final class NestedHorizontalRecyclerView extends RecyclerView	// class@001fd4
{
    public boolean b;
    public Float c;
    public Float d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void NestedHorizontalRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void NestedHorizontalRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void NestedHorizontalRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       NestedHorizontalRecyclerView tc;
       float f1;
       int b;
       boolean b1;
       ViewGroup$LayoutParams layoutParams;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecyclerView$LayoutManager obj = PatchProxy.applyOneRefs(p0, this, NestedHorizontalRecyclerView.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getAction()): i;
       int i1 = 0;
       if (integer && !integer.intValue()) {
          this.c = Float.valueOf(p0.getRawX());
          this.d = Float.valueOf(p0.getRawY());
          this.b = i1;
          this.e = i1;
          this.f = i1;
          this.getParent().requestDisallowInterceptTouchEvent(true);
          View obj1 = PatchProxy.apply(i, this, NestedHorizontalRecyclerView.class, "2");
          String str = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             RecyclerView$LayoutManager layoutManage1 = this.getLayoutManager();
             if (layoutManage1 instanceof LinearLayoutManager && !layoutManage1.getOrientation()) {
                View childAt = this.getChildAt(i1);
                if (childAt != null) {
                   layoutParams = childAt.getLayoutParams();
                   Objects.requireNonNull(layoutParams, str);
                   if (childAt.getLeft() == layoutParams.leftMargin && !layoutManage1.getPosition(childAt)) {
                      b = true;
                   }
                }
             }
             b = false;
          }
          if (b) {
             this.e = true;
          }
          obj = PatchProxy.apply(i, this, NestedHorizontalRecyclerView.class, "3");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager) {
                obj = layoutManage;
                if (!obj.getOrientation()) {
                   i = obj.getItemCount() - true;
                   int i2 = n.z(this.getContext());
                   obj1 = this.getChildAt((this.getChildCount() - true));
                   if (obj1 != null) {
                      layoutParams = obj1.getLayoutParams();
                      Objects.requireNonNull(layoutParams, str);
                      if ((obj1.getRight() + layoutParams.rightMargin) >= this.getRight() && (layoutManage.getPosition(obj1) == i && obj1.getRight() <= i2)) {
                         i1 = 1;
                      }
                   }
                }
             }
             b1 = i1;
          }
          if (b1) {
             this.f = true;
          }
       }else {
          float f = 0.00f;
          if (integer && integer.intValue() == f) {
             f = p0.getRawX();
             float rawY = p0.getRawY();
             if (this.g != null && (this.e != null || this.f != null)) {
                tc = this.c;
                if (tc != null) {
                   f1 = f - tc.floatValue();
                   if (this.e == null || (f1 - (float)i1 > 0 || (this.f != null && f1 - (float)i1 < 0))) {
                      this.getParent().requestDisallowInterceptTouchEvent(i1);
                   }
                }
             }
             if (this.b == null) {
                tc = this.c;
                if (tc != null) {
                   f1 = tc.floatValue();
                   NestedHorizontalRecyclerView td = this.d;
                   if (td != null) {
                      f = Math.abs((f - f1));
                      rawY = Math.abs((rawY - td.floatValue()));
                      if (rawY - (float)30 > 0) {
                         this.b = true;
                         if (rawY - f > 0) {
                            this.getParent().requestDisallowInterceptTouchEvent(i1);
                         }
                      }
                   }
                }
             }
          }
       }
    label_016d :
       return super.dispatchTouchEvent(p0);
    }
    public final void setEnableSwitchEndEventToParent(boolean p0){
       this.g = p0;
    }
}
