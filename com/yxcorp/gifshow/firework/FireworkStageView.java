package com.yxcorp.gifshow.firework.FireworkStageView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.SparseArray;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tfa.k;
import rfa.c;
import java.lang.Runnable;
import android.os.SystemClock;
import com.yxcorp.gifshow.firework.FireworkStageView$a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.firework.FireworkStageView$LayoutParams;
import vfa.b;
import rfa.b;
import java.lang.Long;
import java.lang.Number;
import tfa.k$a;
import java.lang.IllegalStateException;
import java.util.Objects;
import android.os.Handler;
import java.lang.Integer;
import android.view.View;
import a2.g;

public class FireworkStageView extends ViewGroup	// class@00100d
{
    public final SparseArray b;
    public boolean c;
    public int d;
    public long e;
    public FireworkStageView$a f;
    public static final int g;

    public void FireworkStageView(Context p0){
       super(p0);
       this.b = new SparseArray();
       this.c = true;
       this.d = 0;
       this.e = 0;
       this.f = null;
       this.a();
    }
    public void FireworkStageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new SparseArray();
       this.c = true;
       this.d = 0;
       this.e = 0;
       this.f = null;
       this.a();
    }
    public void FireworkStageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SparseArray();
       this.c = true;
       this.d = 0;
       this.e = 0;
       this.f = null;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, FireworkStageView.class, "1")) {
          return;
       }
       this.setTag("FireworkStageView");
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, FireworkStageView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.size() > 0)? true: false;
       return b;
    }
    public void c(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FireworkStageView.class, "12")) {
          return;
       }
       this.b.remove(p0.a);
       if (!this.b.size()) {
          if (this.c != null) {
             this.post(new c(this));
          }
          FireworkStageView tf = this.f;
          if (tf != null) {
             tf.b(this, (SystemClock.uptimeMillis() - this.e));
          }
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof FireworkStageView$LayoutParams;
    }
    public int d(b p0,long p1,b p2){
       FireworkStageView tf;
       if (PatchProxy.isSupport(FireworkStageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, this, FireworkStageView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null || !p1) {
          return -1;
       }else if(!this.b.size()){
          this.e = SystemClock.uptimeMillis();
          tf = this.f;
          if (tf != null) {
             tf.a(this);
          }
       }
       this.d = this.d + 1;
       k ok = new k(p0, this, p2, this.d, p1);
       this.b.put(this.d, tf);
       this.c = p0.d & this.c;
       k ok1 = k.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tf, ok1, "3")) {
          if (tf.j == null) {
             tf.l = SystemClock.uptimeMillis();
             if (tf.m.a(0)) {
                tf.d.c(tf);
             }else {
                tf.j = true;
                if (!PatchProxy.applyVoid(objArray, tf, ok1, "6")) {
                   tf.k = 0;
                   ok1 = tf.f;
                   if (ok1 != null) {
                      ok1.d(tf.e);
                   }
                   tf.d();
                }
             }
          }else {
             throw new IllegalStateException("Already in schedule, do not call action\(\) twice before cut\(\) has been called.");
          }
       }
       return this.d;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, FireworkStageView.class, "9")) {
          return;
       }
       int i = 0;
       while (i < this.b.size()) {
          k ok = this.b.valueAt(i);
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoid(null, ok, k.class, "4")) {
             ok.i.removeCallbacksAndMessages(null);
             ok.b();
             ok.a();
          }
          i = i + 1;
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FireworkStageView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FireworkStageView$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FireworkStageView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FireworkStageView$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FireworkStageView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FireworkStageView$LayoutParams(p0);
    }
    public long getLastExpectDuration(){
       k obj = PatchProxy.apply(null, this, FireworkStageView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b.get(this.d);
       if (obj == null) {
          return -1;
       }
       return obj.b;
    }
    public long getLastPlayingDuration(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, FireworkStageView.class, "10");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.b.get(this.d);
       long l = -1;
       if (obj == null) {
          return l;
       }
       Object obj1 = PatchProxy.apply(objArray, obj, k.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else if(!obj.l){
          l = SystemClock.uptimeMillis() - obj.l;
       }
       return l;
    }
    public final int getLayoutDirectionCompat(){
       Object obj = PatchProxy.apply(null, this, FireworkStageView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getLayoutDirection();
    }
    public int getPlayingCount(){
       Object obj = PatchProxy.apply(null, this, FireworkStageView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FireworkStageView.class, "13")) {
          return;
       }
       this.e();
       super.onDetachedFromWindow();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i3;
       int i = 0;
       if (PatchProxy.isSupport(FireworkStageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, FireworkStageView.class, "18")) {
             return;
          }
       }
       int childCount = this.getChildCount();
       if (!childCount) {
          return;
       }else {
          p1 = this.getWidth();
          p2 = this.getHeight();
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             if (childAt.getVisibility() != 8) {
                p4 = childAt.getMeasuredWidth();
                int measuredHeig = childAt.getMeasuredHeight();
                FireworkStageView$LayoutParams layoutParams = childAt.getLayoutParams();
                float f = layoutParams.a * (float)p1;
                int i1 = (int)f;
                float f1 = layoutParams.b * (float)p2;
                int i2 = (int)f1;
                layoutParams = layoutParams.c;
                if (layoutParams == -1) {
                   i3 = 17;
                }
                int i4 = g.b(i3, this.getLayoutDirectionCompat()) & 0x07;
                i3 = i3 & 0x70;
                if (i4 != 1) {
                   if (i4 == 5) {
                      i1 = i1 - p4;
                   }
                }else {
                   i4 = p4 / 2;
                   i1 = i1 - i4;
                }
                if (i3 != 0.00f) {
                   if (i3 == 0.00f) {
                      i2 = i2 - measuredHeig;
                   }
                }else {
                   i3 = measuredHeig / 2;
                   i2 = i2 - i3;
                }
                p4 = p4 + i1;
                measuredHeig = measuredHeig + i2;
                childAt.layout(i1, i2, p4, measuredHeig);
             }
             i = i + 1;
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FireworkStageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FireworkStageView.class, "17")) {
          return;
       }
       this.measureChildren(p0, p1);
       super.onMeasure(p0, p1);
       return;
    }
    public void setStatusListener(FireworkStageView$a p0){
       this.f = p0;
    }
}
