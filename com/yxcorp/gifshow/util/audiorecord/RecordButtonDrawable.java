package com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$State;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.System;
import java.lang.Math;
import android.view.animation.Interpolator;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$a;
import java.lang.Enum;
import nnc.e0;
import nnc.c0;
import nnc.y;
import nnc.a0;
import nnc.d0;
import nnc.z;
import nnc.f0;
import nnc.b0;
import nnc.x;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$b;
import android.graphics.Rect;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$c;
import android.graphics.ColorFilter;

public class RecordButtonDrawable extends Drawable	// class@001f4a
{
    public Paint a;
    public Drawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public RectF h;
    public float i;
    public int j;
    public int k;
    public long l;
    public long m;
    public Interpolator n;
    public RectF o;
    public RecordButtonDrawable$State p;
    public RecordButtonDrawable$State q;
    public RecordButtonDrawable$b r;
    public RecordButtonDrawable$c s;

    public void RecordButtonDrawable(Drawable p0,int p1,int p2){
       super();
       this.h = new RectF();
       this.m = 150;
       this.n = new AccelerateDecelerateInterpolator();
       this.o = new RectF();
       this.p = RecordButtonDrawable$State.INIT;
       this.q = null;
       this.b = p0;
       Paint paint = new Paint(1);
       this.a = paint;
       paint.setStyle(Paint$Style.FILL);
       this.a.setColor(p1);
       this.j = p1;
       this.k = p2;
    }
    public final void a(Canvas p0){
       this.a.setColor(this.k);
       p0.drawCircle((float)this.d, (float)this.e, (float)this.c, this.a);
       this.a.setColor(this.j);
       p0.drawCircle((float)this.d, (float)this.e, (float)this.f, this.a);
       this.b.draw(p0);
    }
    public final float b(){
       long l = System.currentTimeMillis();
       if (!this.l - -1) {
          this.l = l;
       }
       l = l - this.l;
       if (l - this.m >= 0) {
          this.q = null;
          this.d();
       }
       RecordButtonDrawable tm = this.m;
       float f = (!tm)? 0x3f800000: ((float)l * 0x3f800000) / (float)tm;
       this.invalidateSelf();
       return this.n.getInterpolation(Math.min(0x3f800000, f));
    }
    public final boolean c(RecordButtonDrawable$State p0){
       RecordButtonDrawable tp = this.p;
       if (p0 == tp) {
          return false;
       }
       this.q = tp;
       this.p = p0;
       this.l = -1;
       this.d();
       this.invalidateSelf();
       return true;
    }
    public final void d(){
       RecordButtonDrawable tq;
       int i = RecordButtonDrawable$a.a[this.p.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                tq = this.q;
                if (tq == RecordButtonDrawable$State.INIT) {
                   this.r = new e0(this);
                }else if(tq == RecordButtonDrawable$State.PLAY){
                   this.r = new c0(this);
                }else {
                   this.r = new y(this);
                }
             }
          }else {
             tq = this.q;
             if (tq == RecordButtonDrawable$State.INIT) {
                this.r = new a0(this);
             }else if(tq == RecordButtonDrawable$State.PAUSE){
                this.r = new d0(this);
             }else {
                this.r = new z(this);
             }
          }
       }else {
          tq = this.q;
          if (tq == RecordButtonDrawable$State.PAUSE) {
             this.r = new f0(this);
          }else if(tq == RecordButtonDrawable$State.PLAY){
             this.r = new b0(this);
          }else {
             this.r = new x(this);
          }
       }
       return;
    }
    public void draw(Canvas p0){
       RecordButtonDrawable tr = this.r;
       if (tr != null) {
          tr.draw(p0);
       }else {
          this.a(p0);
       }
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public boolean isStateful(){
       return true;
    }
    public void onBoundsChange(Rect p0){
       float f;
       super.onBoundsChange(p0);
       int i = p0.centerX();
       int i1 = p0.centerY();
       int i2 = Math.min(p0.width(), p0.height());
       int i3 = i2 / 2;
       this.c = i3;
       i3 = i3 - ((i2 * 2) / 74);
       this.d = i;
       this.e = i1;
       RecordButtonDrawable tb = this.b;
       if (tb != null) {
          f = (float)i3 * 0x3f124925;
          float f1 = (float)i;
          float f2 = (float)i1;
          tb.setBounds((int)(f1 - f), (int)(f2 - f), (int)(f1 + f), (int)(f2 + f));
       }
       this.f = i3;
       this.g = i3 / 2;
       float f3 = (float)i3;
       float f4 = 0.36f * f3;
       float f5 = (float)i;
       f = f5 - f4;
       float f6 = (float)i1;
       float f7 = f6 - f4;
       this.h.set(f, f7, (f5 + f4), (f6 + f4));
       this.i = f3 * 0.14f;
       return;
    }
    public boolean onStateChange(int[] p0){
       boolean b1;
       RecordButtonDrawable tb = this.b;
       int i = 0;
       boolean b = (tb != null && tb.isStateful())? this.b.setState(p0): 0;
       int len = p0.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             if (p0[i1] == 0x10100a1) {
                b1 = this.c(RecordButtonDrawable$State.PAUSE);
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             RecordButtonDrawable ts = this.s;
             if (ts != null && ts.R4()) {
                i = 1;
             }
             RecordButtonDrawable$State iNIT = (i)? RecordButtonDrawable$State.INIT: RecordButtonDrawable$State.PLAY;
             b1 = this.c(iNIT);
             break ;
          }
       }
       return (b1 | b);
    }
    public void setAlpha(int p0){
    }
    public void setColorFilter(ColorFilter p0){
    }
}
