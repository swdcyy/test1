package com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Camera;
import android.graphics.Matrix;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextView;
import android.widget.LinearLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import q1c.a;
import android.animation.Animator$AnimatorListener;
import q1c.b;
import xyb.a;
import q87.c;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import n1c.h;
import android.graphics.Canvas;
import java.lang.Math;

public class PrettifyTextSwitcherView extends View	// class@0011dd
{
    public Camera b;
    public Matrix c;
    public PrettifyTextView d;
    public PrettifyTextView e;
    public float f;
    public int g;
    public ObjectAnimator h;
    public ObjectAnimator i;
    public boolean j;
    public Runnable k;
    public static final float l;

    static {
       PrettifyTextSwitcherView.l = (float)a1.e(8.00f);
    }
    public void PrettifyTextSwitcherView(Context p0){
       super(p0, null, 0);
    }
    public void PrettifyTextSwitcherView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PrettifyTextSwitcherView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Camera();
       this.c = new Matrix();
       this.f = 0;
       this.g = 0;
       this.j = false;
       this.k = new PrettifyTextSwitcherView$a(this);
       if (PatchProxy.applyVoid(null, this, PrettifyTextSwitcherView.class, "1")) {
       }else {
          this.d = new PrettifyTextView(this.getContext());
          PrettifyTextView prettifyText = new PrettifyTextView(this.getContext());
          this.e = prettifyText;
          prettifyText.setVisibility(8);
          this.setHorizontalFadingEdgeEnabled(true);
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, View.ALPHA, new float[2]{0,0x3f800000});
          this.h = objectAnimat;
          objectAnimat.setDuration(300);
          this.h.addListener(new a(this));
          objectAnimat = ObjectAnimator.ofFloat(this, View.ALPHA, new float[2]{0x3f800000,0});
          this.i = objectAnimat;
          objectAnimat.setDuration(300);
          this.i.addListener(new b(this));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PrettifyTextSwitcherView.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FilterTextSwitcher", "cancel", objArray);
       this.f = 0;
       this.i(true);
       this.d();
       k1.m(this.k);
       k1.r(this.k, 1200);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PrettifyTextSwitcherView.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FilterTextSwitcher", "finish", objArray);
       this.f = 0;
       this.i(0);
       this.d();
       k1.m(this.k);
       k1.r(this.k, 1200);
       return;
    }
    public final boolean c(){
       boolean b = (this.f > 0)? true: false;
       return b;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, PrettifyTextSwitcherView.class, "15")) {
          return;
       }
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrettifyTextSwitcherView.class, "14")) {
          return;
       }
       this.e.setName(p0);
       this.e.setType(p1);
       return;
    }
    public void f(String p0,String p1,int p2){
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PrettifyTextSwitcherView.class, "12")) {
          return;
       }
       this.g(p0, p1, p2, true, true);
       return;
    }
    public void g(String p0,String p1,int p2,boolean p3,boolean p4){
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PrettifyTextSwitcherView.class, "11")) {
             return;
          }
       }
       if (!p4) {
          PrettifyTextSwitcherView tg = this.g;
          if (tg != null && (tg != p2 && !this.getVisibility())) {
             return;
          }
       }
       this.d.setName(p0);
       this.d.setType(p1);
       this.g = p2;
       this.d();
       k1.m(this.k);
       if (this.i.isRunning()) {
          this.i.cancel();
       }
       if (this.getVisibility()) {
          this.setAlpha(0);
          this.setVisibility(0);
          this.h.start();
          this.j = p3;
       }else if(p3){
          k1.r(this.k, 1200);
       }
       return;
    }
    public CharSequence getCurName(){
       Object obj = PatchProxy.apply(null, this, PrettifyTextSwitcherView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getName();
    }
    public int getCurrentType(){
       return this.g;
    }
    public float getLeftFadingEdgeStrength(){
       return PrettifyTextSwitcherView.l;
    }
    public float getRightFadingEdgeStrength(){
       return PrettifyTextSwitcherView.l;
    }
    public void h(float p0){
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PrettifyTextSwitcherView.class, "2")) {
          return;
       }
       if (h.f(this.f, p0)) {
          return;
       }
       k1.m(this.k);
       this.setVisibility(0);
       this.f = p0;
       this.e.setVisibility(0);
       this.d();
       return;
    }
    public final void i(boolean p0){
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyTextSwitcherView.class, "16")) {
          return;
       }
       int i = 8;
       if (p0) {
          this.e.setVisibility(i);
       }else {
          this.d.setVisibility(i);
          PrettifyTextSwitcherView td = this.d;
          this.d = this.e;
          this.e = td;
       }
       return;
    }
    public void onDraw(Canvas p0){
       PrettifyTextSwitcherView tb;
       PrettifyTextSwitcherView tc;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTextSwitcherView.class, "7")) {
          return;
       }
       if (this.e.getVisibility()) {
          this.d.draw(p0);
       }else if(PatchProxy.applyVoidOneRefs(p0, this, PrettifyTextSwitcherView.class, "8")){
          PrettifyTextSwitcherView td = this.d;
          boolean b = this.c();
          if (!PatchProxy.isSupport(PrettifyTextSwitcherView.class) || !PatchProxy.applyVoidThreeRefs(td, p0, Boolean.valueOf(b), this, PrettifyTextSwitcherView.class, "9")) {
             p0.save();
             p0.translate(td.getX(), td.getY());
             tb = this.b;
             tc = this.c;
             tc.reset();
             f = (b)? Math.abs(this.f) * 0x41f00000: - (Math.abs(this.f) * 0x41f00000);
             tb.save();
             tb.rotateY(f);
             tb.getMatrix(tc);
             tb.restore();
             if (!b) {
                tc.preTranslate((float)(- td.getWidth()), 0);
                tc.postTranslate((float)td.getWidth(), 0);
             }
             p0.concat(tc);
             td.draw(p0);
             p0.restore();
          }
          td = this.e;
          b = this.c();
          if (!PatchProxy.isSupport(PrettifyTextSwitcherView.class) || !PatchProxy.applyVoidThreeRefs(td, p0, Boolean.valueOf(b), this, PrettifyTextSwitcherView.class, "10")) {
             p0.save();
             p0.translate(td.getX(), td.getY());
             tb = this.b;
             tc = this.c;
             tc.reset();
             f = 0x3f800000;
             f = (b)? - ((f - Math.abs(this.f)) * 0x41f00000): (f - Math.abs(this.f)) * 0x41f00000;
             tb.save();
             tb.rotateY(f);
             tb.getMatrix(tc);
             tb.restore();
             if (b) {
                tc.preTranslate((float)(- td.getWidth()), 0);
                tc.postTranslate((float)td.getWidth(), 0);
             }
             p0.concat(tc);
             td.draw(p0);
             p0.restore();
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PrettifyTextSwitcherView.class, "6")) {
             return;
          }
       }
       p3 = p3 - p1;
       int measuredWidt = this.d.getMeasuredWidth();
       p1 = this.d.getMeasuredHeight();
       p4 = ((p4 - p2) - p1) / 2;
       if (!this.e.getVisibility()) {
          p2 = this.e.getMeasuredWidth();
          int i1 = (int)((float)p3 * this.f);
          if (this.c()) {
             p3 = - p2;
          }
          p3 = p3 + i1;
          p1 = p1 + p4;
          this.e.layout(p3, p4, (p2 + p3), p1);
          this.d.layout(i1, p4, (measuredWidt + i1), p1);
       }else {
          this.d.layout(i, p4, (measuredWidt + i), (p1 + p4));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(PrettifyTextSwitcherView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PrettifyTextSwitcherView.class, "5")) {
          return;
       }
       this.d.measure(p0, p1);
       if (!this.e.getVisibility()) {
          this.e.measure(p0, p1);
       }
       this.setMeasuredDimension(this.d.getMeasuredWidth(), this.d.getMeasuredHeight());
       return;
    }
}
