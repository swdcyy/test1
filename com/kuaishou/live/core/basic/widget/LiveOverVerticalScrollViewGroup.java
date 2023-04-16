package com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup;
import a2.w;
import android.widget.FrameLayout;
import android.content.Context;
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
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup$b;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import d22.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import ekd.k1;
import lnc.a1;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup$c;
import d22.j;

public final class LiveOverVerticalScrollViewGroup extends FrameLayout implements w	// class@00090b
{
    public boolean b;
    public boolean c;
    public boolean d;
    public ValueAnimator e;
    public LiveOverVerticalScrollViewGroup$b f;
    public LiveOverVerticalScrollViewGroup$c g;
    public Runnable h;
    public final y i;
    public static final int j;

    public void LiveOverVerticalScrollViewGroup(Context p0){
       super(p0);
       this.b = false;
       this.c = false;
       this.i = new y(this);
    }
    public void LiveOverVerticalScrollViewGroup(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
       this.c = false;
       this.i = new y(this);
    }
    public void LiveOverVerticalScrollViewGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.c = false;
       this.i = new y(this);
    }
    public final int a(View p0,float p1){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, LiveOverVerticalScrollViewGroup.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)p0.getHeight() / 0x3f800000;
       float f1 = 2.00f * f;
       float f2 = f1 * f;
       return (int)((f2 / (f - Math.abs(p1))) - f1);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveOverVerticalScrollViewGroup.class, "2")) {
          return;
       }
       LiveOverVerticalScrollViewGroup te = this.e;
       if (te != null) {
          te.cancel();
          this.e.removeAllListeners();
       }
       return;
    }
    public final int c(View p0,float p1){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, LiveOverVerticalScrollViewGroup.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)p0.getHeight() / 0x3f800000;
       float f1 = 2.00f * f;
       return (int)(f - ((f1 * f) / (Math.abs(p1) + f1)));
    }
    public void d(View p0,int p1){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveOverVerticalScrollViewGroup.class, "16")) {
          return;
       }
       p0.setTranslationY((float)p1);
       LiveOverVerticalScrollViewGroup tf = this.f;
       if (tf != null) {
          tf.a(p1);
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOverVerticalScrollViewGroup.class, "8")) {
          return;
       }
       float translationY = p0.getTranslationY();
       this.b();
       int i = 1;
       boolean b = (translationY < 0)? true: false;
       float[] uofloatArray = new float[]{(float)this.a(p0, translationY),0};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       this.e = valueAnimato;
       valueAnimato.setDuration(300);
       this.e.setInterpolator(new DecelerateInterpolator());
       this.e.addUpdateListener(new i(this, p0, b));
       this.e.addListener(new LiveOverVerticalScrollViewGroup$a(this, p0));
       this.e.start();
       return;
    }
    public boolean getIsNeedControlBounceBack(){
       return this.d;
    }
    public int getNestedScrollAxes(){
       return 0;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveOverVerticalScrollViewGroup.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       LiveOverVerticalScrollViewGroup th = this.h;
       if (th != null) {
          k1.m(th);
       }
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return false;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, LiveOverVerticalScrollViewGroup.class, "9")) {
          return;
       }
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
       return;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveOverVerticalScrollViewGroup.class, "10")) {
             return;
          }
       }
       p1 = (int)p0.getTranslationY();
       if (p1 > 0 && p2 > 0) {
          if ((p1 - p2) <= 0) {
             p2 = p1;
          }
          p3[1] = p2;
          this.d(p0, (p1 - p2));
       }else if(p1 < 0 && p2 < 0){
          if ((p1 - p2) >= 0) {
             p2 = p1;
          }
          p3[1] = p2;
          this.d(p0, (p1 - p2));
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveOverVerticalScrollViewGroup.class, "11")) {
             return;
          }
       }
       this.onNestedScroll(p0, p1, p2, p3, p4, 0);
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, LiveOverVerticalScrollViewGroup.class, "12")) {
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
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, LiveOverVerticalScrollViewGroup.class, "13")) {
             return;
          }
       }
       p1 = (int)p0.getTranslationY();
       float f = 0x3fd9999a;
       if (p1 >= 0 && p4 < 0) {
          p6[1] = p4;
          f1 = (float)p1;
          if (p5 == 1) {
             f1 = f1 * f;
          }
          f1 = (float)(- this.a(p0, f1));
          f = (p5 == 1)? (int)((float)this.c(p0, (f1 + (float)p4)) / f): this.c(p0, (f1 + (float)p4));
          this.d(p0, f);
       }else if(p1 <= 0 && p4 > 0){
          p6[1] = p4;
          f1 = (float)p1;
          if (p5 == 1) {
             f1 = f1 * f;
          }
          f1 = (float)this.a(p0, f1);
          f = (p5 == 1)? (int)((float)(- this.c(p0, (f1 + (float)p4))) / f): - this.c(p0, (f1 + (float)p4));
          this.d(p0, f);
       }
       if (p1 && (Math.abs(((float)p1 - p0.getTranslationY())) - (float)a1.d(0x7f070334) <= 0 && p5 == 1)) {
          p6[1] = 0;
       }
    label_00b1 :
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveOverVerticalScrollViewGroup.class, "4")) {
          return;
       }
       this.onNestedScrollAccepted(p0, p1, p2, 0);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, LiveOverVerticalScrollViewGroup.class, "5")) {
          return;
       }
       this.i.c(p0, p1, p2, p3);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveOverVerticalScrollViewGroup.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = false;
       boolean b1 = (this.b != null || !p3)? true: false;
       this.b = b1;
       b1 = (this.c != null || p3 == 1)? true: false;
       this.c = b1;
       if (p2 & 0x02) {
          b = true;
       }
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOverVerticalScrollViewGroup.class, "6")) {
          return;
       }
       this.onStopNestedScroll(p0, 0);
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(LiveOverVerticalScrollViewGroup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveOverVerticalScrollViewGroup.class, "7")) {
          return;
       }
       this.i.e(p0, p1);
       boolean b = false;
       if (!p1) {
          this.b = b;
       }
       if (p1 == 1) {
          this.c = b;
       }
       if (this.b == null && (this.c == null && p0.getTranslationY())) {
          if (this.d != null && this.g.a((int)p0.getTranslationY())) {
             j oj = new j(this, p0);
             this.h = oj;
             k1.r(oj, 200);
             return;
          }else {
             this.e(p0);
          }
       }
       return;
    }
    public void setIsNeedControlBounceBack(boolean p0){
       this.d = p0;
    }
    public void setOnTargetViewOffsetListener(LiveOverVerticalScrollViewGroup$b p0){
       this.f = p0;
    }
    public void setOnTargetViewStopListener(LiveOverVerticalScrollViewGroup$c p0){
       this.g = p0;
    }
}
