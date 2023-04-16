package com.kwai.slide.play.detail.bottom.atlasplayprogress.AtlasSegmentedProgressBar;
import android.view.View;
import com.kwai.slide.play.detail.bottom.atlasplayprogress.AtlasSegmentedProgressBar$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import qrd.l1;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import com.yxcorp.utility.Log;
import java.lang.Float;

public final class AtlasSegmentedProgressBar extends View	// class@0017a1
{
    public final String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final LinearInterpolator h;
    public final Paint i;
    public final RectF j;
    public final RectF k;
    public final SparseArray l;
    public boolean m;
    public boolean n;
    public float o;
    public float p;
    public ObjectAnimator q;
    public HashMap r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final AtlasSegmentedProgressBar$a w;

    static {
       AtlasSegmentedProgressBar.w = new AtlasSegmentedProgressBar$a(null);
       AtlasSegmentedProgressBar.s = 1;
       AtlasSegmentedProgressBar.t = a1.d(0x7f07031b);
       AtlasSegmentedProgressBar.u = a1.a(0x7f061c00);
       AtlasSegmentedProgressBar.v = a1.a(0x7f060620);
    }
    public void AtlasSegmentedProgressBar(Context p0){
       super(p0);
       this.b = "AtlasSegmentedProgressBar";
       this.c = AtlasSegmentedProgressBar.s;
       this.e = AtlasSegmentedProgressBar.t;
       this.f = AtlasSegmentedProgressBar.u;
       this.g = AtlasSegmentedProgressBar.v;
       this.h = new LinearInterpolator();
       this.i = new Paint(5);
       this.j = new RectF();
       this.k = new RectF();
       this.l = new SparseArray();
       this.setId(R.id.atlas_segment_progress);
    }
    public void AtlasSegmentedProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "AtlasSegmentedProgressBar";
       this.c = AtlasSegmentedProgressBar.s;
       this.e = AtlasSegmentedProgressBar.t;
       this.f = AtlasSegmentedProgressBar.u;
       this.g = AtlasSegmentedProgressBar.v;
       this.h = new LinearInterpolator();
       this.i = new Paint(5);
       this.j = new RectF();
       this.k = new RectF();
       this.l = new SparseArray();
       this.setId(R.id.atlas_segment_progress);
    }
    public void AtlasSegmentedProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "AtlasSegmentedProgressBar";
       this.c = AtlasSegmentedProgressBar.s;
       this.e = AtlasSegmentedProgressBar.t;
       this.f = AtlasSegmentedProgressBar.u;
       this.g = AtlasSegmentedProgressBar.v;
       this.h = new LinearInterpolator();
       this.i = new Paint(5);
       this.j = new RectF();
       this.k = new RectF();
       this.l = new SparseArray();
       this.setId(R.id.atlas_segment_progress);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasSegmentedProgressBar.class, "13")) {
          return;
       }
       AtlasSegmentedProgressBar tq = this.q;
       if (tq != null) {
          tq.cancel();
       }
       tq = this.p;
       float[] uofloatArray = new float[]{(0x3f800000 - ((float)p0 / 2500.00f)) * tq,tq};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, "mFillSegmentWidth", uofloatArray).setDuration((long)p0);
       objectAnimat.setInterpolator(this.h);
       this.q = objectAnimat;
       a.m(objectAnimat);
       objectAnimat.start();
       return;
    }
    public final void b(RectF p0,Canvas p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtlasSegmentedProgressBar.class, "6")) {
          return;
       }
       if (p1 != null) {
          this.i.setColor(this.f);
          p1.drawRoundRect(p0, (float)a1.d(R.dimen.arg_RES_7f07030a), (float)a1.d(R.dimen.arg_RES_7f07030a), this.i);
       }
       return;
    }
    public final void c(RectF p0,Canvas p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtlasSegmentedProgressBar.class, "5")) {
          return;
       }
       if (p1 != null) {
          this.i.setColor(this.g);
          p1.drawRoundRect(p0, (float)a1.d(R.dimen.arg_RES_7f07030a), (float)a1.d(R.dimen.arg_RES_7f07030a), this.i);
       }
       return;
    }
    public final boolean getMAutoPlay(){
       return this.m;
    }
    public final int getMCurrentSegmentIndex(){
       return this.d;
    }
    public final boolean getMEnableFillSegmentAnim(){
       return this.n;
    }
    public final int getMSegmentSpacePx(){
       return this.e;
    }
    public final float getMSegmentWidth(){
       return this.p;
    }
    public final int getMSegmentsCount(){
       return this.c;
    }
    public final int getMSelectedSegmentColor(){
       return this.f;
    }
    public final int getMUnSelectedSegmentColor(){
       return this.g;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasSegmentedProgressBar.class, "2")) {
          return;
       }
       if (this.getWidth() < this.e) {
          Log.d(this.b, "segment\'s space is larger than view width");
          return;
       }else {
          this.p = ((float)(((this.getWidth() - (this.e * (this.c - 1))) - this.getPaddingLeft()) - this.getPaddingRight()) * 0x3f800000) / (float)this.c;
          this.j.top = (float)this.getPaddingTop() + 0;
          this.j.bottom = (float)this.getHeight() + (float)this.getPaddingBottom();
          int i = 0;
          AtlasSegmentedProgressBar tc = this.c;
          while (i < tc) {
             float f = this.p + (float)this.e;
             float f1 = (float)i * f;
             f1 = f1 + (float)this.getPaddingLeft();
             this.j.left = f1;
             AtlasSegmentedProgressBar tj = this.j;
             f1 = tj.left + this.p;
             tj.right = f1;
             if (this.n != null) {
                if (!PatchProxy.isSupport(AtlasSegmentedProgressBar.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, this, AtlasSegmentedProgressBar.class, "4")) {
                   tj = this.d;
                   if (i < tj) {
                      this.b(this.j, p0);
                      this.l.put(i, Float.valueOf(this.j.left));
                   }else if(i == tj){
                      this.c(this.j, p0);
                      this.l.put(i, Float.valueOf(this.j.left));
                      RectF rectF = new RectF();
                      AtlasSegmentedProgressBar tj1 = this.j;
                      rectF.top = tj1.top;
                      rectF.bottom = tj1.bottom;
                      rectF.left = tj1.left;
                      RectF left = tj1.left;
                      AtlasSegmentedProgressBar to = (this.m != null)? this.o: this.p;
                      f1 = left + to;
                      rectF.right = f1;
                      this.k.set(rectF);
                      f = this.j.left + this.p;
                      this.k.right = f;
                      this.b(rectF, p0);
                   }else {
                      this.c(this.j, p0);
                      this.l.put(i, Float.valueOf(this.j.left));
                   }
                }
             }else if(PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, this, AtlasSegmentedProgressBar.class, "3")){
                if (this.d == i) {
                   this.k.set(this.j);
                   this.b(this.j, p0);
                   this.l.put(i, Float.valueOf(this.j.left));
                }else {
                   this.c(this.j, p0);
                   this.l.put(i, Float.valueOf(this.j.left));
                }
             }
             i = i + 1;
          }
          return;
       }
    }
    public final void setCount(int p0){
       if (PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasSegmentedProgressBar.class, "7")) {
          return;
       }
       if (p0 > 0 && p0 != this.c) {
          if (!PatchProxy.applyVoid(null, this, AtlasSegmentedProgressBar.class, "8")) {
             this.l.clear();
          }
          this.c = p0;
          this.invalidate();
       }
       return;
    }
    public final void setCurrentSegment(int p0){
       if (PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasSegmentedProgressBar.class, "9")) {
          return;
       }
       if (p0 != this.d && (p0 >= 0 && p0 < this.c)) {
          this.d = p0;
          this.invalidate();
       }
    label_0026 :
       return;
    }
    public final void setEnableFillSegmentAnim(boolean p0){
       this.n = p0;
    }
    public final void setMAutoPlay(boolean p0){
       this.m = p0;
    }
    public final void setMCurrentSegmentIndex(int p0){
       this.d = p0;
    }
    public final void setMEnableFillSegmentAnim(boolean p0){
       this.n = p0;
    }
    public final void setMFillSegmentWidth(float p0){
       if (PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AtlasSegmentedProgressBar.class, "1")) {
          return;
       }
       this.o = p0;
       this.invalidate();
       return;
    }
    public final void setMSegmentSpacePx(int p0){
       this.e = p0;
    }
    public final void setMSegmentWidth(float p0){
       this.p = p0;
    }
    public final void setMSegmentsCount(int p0){
       this.c = p0;
    }
    public final void setMSelectedSegmentColor(int p0){
       this.f = p0;
    }
    public final void setMUnSelectedSegmentColor(int p0){
       this.g = p0;
    }
    public final void setUnSelectedSegmentColor(int p0){
       if (PatchProxy.isSupport(AtlasSegmentedProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasSegmentedProgressBar.class, "10")) {
          return;
       }
       if (p0 != this.g) {
          this.g = p0;
          this.invalidate();
       }
       return;
    }
}
