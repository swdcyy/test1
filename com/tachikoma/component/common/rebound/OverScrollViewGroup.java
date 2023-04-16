package com.tachikoma.component.common.rebound.OverScrollViewGroup;
import a2.w;
import android.widget.FrameLayout;
import android.content.Context;
import iq8.n;
import a2.y;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.animation.ValueAnimator;
import java.lang.Integer;
import com.tachikoma.component.common.rebound.OverScrollViewGroup$a;
import java.lang.Boolean;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import pn8.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import pn8.b;
import android.animation.Animator$AnimatorListener;

public final class OverScrollViewGroup extends FrameLayout implements w	// class@000ce1
{
    public final int b;
    public boolean c;
    public boolean d;
    public ValueAnimator e;
    public OverScrollViewGroup$a f;
    public boolean g;
    public float h;
    public final y i;
    public static final int j;

    public void OverScrollViewGroup(Context p0){
       super(p0);
       this.b = n.b(6);
       this.c = false;
       this.d = false;
       this.g = false;
       this.h = 2.00f;
       this.i = new y(this);
    }
    public void OverScrollViewGroup(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = n.b(6);
       this.c = false;
       this.d = false;
       this.g = false;
       this.h = 2.00f;
       this.i = new y(this);
    }
    public void OverScrollViewGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = n.b(6);
       this.c = false;
       this.d = false;
       this.g = false;
       this.h = 2.00f;
       this.i = new y(this);
    }
    public final int a(View p0,float p1){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, OverScrollViewGroup.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int width = (this.g != null)? p0.getWidth(): p0.getHeight();
       float f = (float)width;
       return (int)((((this.h * f) * f) / (f - Math.abs(p1))) - (this.h * f));
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, OverScrollViewGroup.class, "2")) {
          return;
       }
       OverScrollViewGroup te = this.e;
       if (te != null) {
          te.cancel();
          this.e.removeAllListeners();
       }
       return;
    }
    public final int c(View p0,float p1){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, OverScrollViewGroup.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int width = (this.g != null)? p0.getWidth(): p0.getHeight();
       float f = (float)width;
       return (int)(f - (((this.h * f) * f) / (Math.abs(p1) + (this.h * f))));
    }
    public void d(View p0,int p1){
       if (PatchProxy.isSupport(OverScrollViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, OverScrollViewGroup.class, "16")) {
          return;
       }
       if (this.g != null) {
          p0.setTranslationX((float)p1);
       }else {
          p0.setTranslationY((float)p1);
       }
       OverScrollViewGroup tf = this.f;
       if (tf != null) {
          tf.onOffsetChanged((- p1));
       }
       return;
    }
    public int getNestedScrollAxes(){
       return 0;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, OverScrollViewGroup.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return false;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(OverScrollViewGroup.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, OverScrollViewGroup.class, "9")) {
          return;
       }
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
       return;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollViewGroup.class, "10")) {
             return;
          }
       }
       if (this.g != null) {
          p2 = (int)p0.getTranslationX();
       }else {
          p2 = (int)p0.getTranslationY();
          p1 = p2;
       }
       if (p2 > 0 && p1 > 0) {
          if ((p2 - p1) <= 0) {
             p1 = p2;
          }
          p3[0] = (this.g != null)? p1: p1;
          this.d(p0, (p2 - p1));
       }else if(p2 < 0 && p1 < 0){
          if ((p2 - p1) >= 0) {
             p1 = p2;
          }
          p3[0] = (this.g != null)? p1: p1;
          this.d(p0, (p2 - p1));
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollViewGroup.class, "11")) {
             return;
          }
       }
       this.onNestedScroll(p0, p1, p2, p3, p4, 0);
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollViewGroup.class, "12")) {
             return;
          }
       }else {
          int i = this;
       }
       int[] ointArray = new int[2];
       this.onNestedScroll(p0, p1, p2, p3, p4, p5, ointArray);
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       float f1;
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, OverScrollViewGroup.class, "13")) {
             return;
          }
       }
       if (this.g != null) {
          p1 = (int)p0.getTranslationX();
       }else {
          p1 = (int)p0.getTranslationY();
          p3 = p4;
       }
       float f = 0x3fd9999a;
       if (p1 >= 0 && p3 < 0) {
          p6[0] = (this.g != null)? p3: p3;
          f1 = (float)p1;
          if (p5 == 1) {
             f1 = f1 * f;
          }
          f1 = (float)(- this.a(p0, f1));
          f = (p5 == 1)? (int)((float)this.c(p0, (f1 + (float)p3)) / f): this.c(p0, (f1 + (float)p3));
          this.d(p0, f);
       }else if(p1 <= 0 && p3 > 0){
          p6[0] = (this.g != null)? p3: p3;
          f1 = (float)p1;
          if (p5 == 1) {
             f1 = f1 * f;
          }
          f1 = (float)this.a(p0, f1);
          f = (p5 == 1)? (int)((float)(- this.c(p0, (f1 + (float)p3))) / f): - this.c(p0, (f1 + (float)p3));
          this.d(p0, f);
       }
       float translationX = (this.g != null)? p0.getTranslationX(): p0.getTranslationY();
       int i = (int)translationX;
       if (p1 && (Math.abs((p1 - i)) <= this.b && p5 == 1)) {
          p6[0] = (this.g != null)? 0: 0;
       }
    label_00d2 :
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(OverScrollViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, OverScrollViewGroup.class, "4")) {
          return;
       }
       this.onNestedScrollAccepted(p0, p1, p2, 0);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(OverScrollViewGroup.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, OverScrollViewGroup.class, "5")) {
          return;
       }
       this.i.c(p0, p1, p2, p3);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(OverScrollViewGroup.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, OverScrollViewGroup.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = false;
       boolean b1 = (this.c != null || !p3)? true: false;
       this.c = b1;
       b1 = (this.d != null || p3 == 1)? true: false;
       this.d = b1;
       if (this.g != null) {
          if (p2 & 0x01) {
             b = true;
          }
          return b;
       }else if(p2 & 0x02){
          b = true;
       }
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OverScrollViewGroup.class, "6")) {
          return;
       }
       this.onStopNestedScroll(p0, 0);
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(OverScrollViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, OverScrollViewGroup.class, "7")) {
          return;
       }
       this.i.e(p0, p1);
       boolean b = false;
       if (!p1) {
          this.c = b;
       }
       if (p1 == 1) {
          this.d = b;
       }
       float translationX = (this.g != null)? p0.getTranslationX(): p0.getTranslationY();
       translationX = (int)translationX;
       if (this.c != null || (this.d != null || (translationX && !PatchProxy.applyVoidOneRefs(p0, this, OverScrollViewGroup.class, "8")))) {
          translationX = (this.g != null)? p0.getTranslationX(): p0.getTranslationY();
          this.b();
          boolean b1 = (translationX < 0)? true: false;
          float[] uofloatArray = new float[]{(float)this.a(p0, translationX),0};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          this.e = valueAnimato;
          valueAnimato.setDuration(300);
          this.e.setInterpolator(new DecelerateInterpolator());
          this.e.addUpdateListener(new a(this, p0, b1));
          this.e.addListener(new b(this, p0));
          this.e.start();
       }
    label_009b :
       return;
    }
    public void setIsHorizontal(boolean p0){
       this.g = p0;
       this.h = (p0)? 2.00f: 4.00f;
       return;
    }
    public void setOnTargetViewOffsetListener(OverScrollViewGroup$a p0){
       this.f = p0;
    }
}
