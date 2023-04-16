package com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout;
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
import com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout$b;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ao1.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.hotspot.slide.OverScrollLayout$c;

public class OverScrollLayout extends FrameLayout implements w	// class@001449
{
    public boolean b;
    public boolean c;
    public boolean d;
    public ValueAnimator e;
    public OverScrollLayout$b f;
    public OverScrollLayout$c g;
    public final y h;
    public static final int i;

    public void OverScrollLayout(Context p0){
       super(p0);
       this.b = false;
       this.c = false;
       this.h = new y(this);
    }
    public void OverScrollLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
       this.c = false;
       this.h = new y(this);
    }
    public void OverScrollLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.c = false;
       this.h = new y(this);
    }
    public final int a(View p0,float p1){
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, OverScrollLayout.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)p0.getHeight();
       float f1 = 0x3fe66666 * f;
       float f2 = f1 * f;
       return (int)((f2 / (f - Math.abs(p1))) - f1);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, OverScrollLayout.class, "2")) {
          return;
       }
       OverScrollLayout te = this.e;
       if (te != null) {
          te.cancel();
          this.e.removeAllListeners();
       }
       return;
    }
    public final int c(View p0,float p1){
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, OverScrollLayout.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)p0.getHeight();
       float f1 = 0x3fe66666 * f;
       return (int)(f - ((f1 * f) / (Math.abs(p1) + f1)));
    }
    public void d(View p0,int p1){
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, OverScrollLayout.class, "16")) {
          return;
       }
       p0.setTranslationY((float)p1);
       OverScrollLayout tf = this.f;
       if (tf != null) {
          tf.a(p1);
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OverScrollLayout.class, "8")) {
          return;
       }
       float translationY = p0.getTranslationY();
       this.b();
       int i = 0;
       boolean b = (translationY - i < 0)? true: false;
       float[] uofloatArray = new float[]{(float)this.a(p0, translationY),i};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       this.e = valueAnimato;
       valueAnimato.setDuration(300);
       this.e.setInterpolator(new DecelerateInterpolator());
       this.e.addUpdateListener(new a(this, p0, b));
       this.e.addListener(new OverScrollLayout$a(this, p0));
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
       if (PatchProxy.applyVoid(null, this, OverScrollLayout.class, "1")) {
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
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, OverScrollLayout.class, "9")) {
          return;
       }
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
       return;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollLayout.class, "10")) {
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
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollLayout.class, "11")) {
             return;
          }
       }
       this.onNestedScroll(p0, p1, p2, p3, p4, 0);
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, OverScrollLayout.class, "12")) {
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
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, OverScrollLayout.class, "13")) {
             return;
          }
       }
       if (p5) {
          return;
       }else {
          p1 = (int)p0.getTranslationY();
          if (p1 >= 0 && p4 < 0) {
             p6[1] = p4;
             this.d(p0, this.c(p0, ((float)(- this.a(p0, (float)p1)) + (float)p4)));
          }else if(p1 <= 0 && p4 > 0){
             p6[1] = p4;
             this.d(p0, (- this.c(p0, ((float)this.a(p0, (float)p1) + (float)p4))));
          }
          return;
       }
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, OverScrollLayout.class, "4")) {
          return;
       }
       this.onNestedScrollAccepted(p0, p1, p2, 0);
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, OverScrollLayout.class, "5")) {
          return;
       }
       this.h.c(p0, p1, p2, p3);
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(OverScrollLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, OverScrollLayout.class, "3");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, OverScrollLayout.class, "6")) {
          return;
       }
       this.onStopNestedScroll(p0, 0);
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, OverScrollLayout.class, "7")) {
          return;
       }
       this.h.e(p0, p1);
       boolean b = false;
       if (!p1) {
          this.b = b;
       }
       if (p1 == 1) {
          this.c = b;
       }
       if (this.b == null && (this.c == null && p0.getTranslationY())) {
          if (this.d != null) {
             OverScrollLayout tg = this.g;
             if (tg == null || !tg.a((int)p0.getTranslationY())) {
                this.e(p0);
             }
             return;
          }else {
             this.e(p0);
          }
       }
       return;
    }
    public void setEnableOverScroll(boolean p0){
       if (PatchProxy.isSupport(OverScrollLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, OverScrollLayout.class, "17")) {
          return;
       }
       int i = (p0)? 0: 2;
       this.setOverScrollMode(i);
       return;
    }
    public void setIsNeedControlBounceBack(boolean p0){
       this.d = p0;
    }
    public void setOnTargetViewOffsetListener(OverScrollLayout$b p0){
       this.f = p0;
    }
    public void setOnTargetViewStopListener(OverScrollLayout$c p0){
       this.g = p0;
    }
}
