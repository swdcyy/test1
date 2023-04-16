package com.yxcorp.gifshow.v3.widget.OffsetCaliperBaseLine;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.Integer;
import lnc.q4;
import ekd.m1;
import android.graphics.Canvas;
import java.lang.Math;

public class OffsetCaliperBaseLine extends FrameLayout implements d	// class@001656
{
    public View b;
    public int c;
    public int d;
    public int e;
    public float f;
    public int g;
    public Paint h;
    public int i;
    public boolean j;

    public void OffsetCaliperBaseLine(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 15;
       this.setWillNotDraw(false);
       Paint paint = new Paint(7);
       this.h = paint;
       paint.setColor(-2130706433);
       this.h.setStyle(Paint$Style.FILL);
       this.h.setStrokeWidth((float)a1.e(0x3f800000));
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport(OffsetCaliperBaseLine.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, OffsetCaliperBaseLine.class, "10")) {
          return;
       }
       this.j = false;
       int i = (int)((this.f * (float)((this.d + (this.c / 2)) - this.i)) / (float)this.e) - (this.b.getMeasuredWidth() / 2);
       if (p0) {
          this.b.animate().translationX((float)i).setDuration(80);
       }else {
          this.b.setTranslationX((float)i);
       }
       return;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(OffsetCaliperBaseLine.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OffsetCaliperBaseLine.class, "7")) {
          return;
       }
       OffsetCaliperBaseLine td = this.d;
       OffsetCaliperBaseLine tc = this.c;
       int i = td - (tc / 2);
       this.i = q4.b((this.i + p0), i, (td + (tc / 2)));
       this.a(true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetCaliperBaseLine.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a163e);
       return;
    }
    public int getCurrentOffset(){
       return this.i;
    }
    public void onDraw(Canvas p0){
       float f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetCaliperBaseLine.class, "9")) {
          return;
       }
       super.onDraw(p0);
       if (this.f <= 0) {
          return;
       }
       int i = this.g - Math.max(1, a1.e(0x3f000000));
       int i1 = Math.max(1, a1.e(0x3f000000)) + this.g;
       int i2 = this.g - a1.e(2.00f);
       int i3 = this.g + a1.e(2.00f);
       int i4 = this.c / this.e;
       int i5 = 0;
       while (i5 <= i4) {
          float f = (float)i5 * this.f;
          int i6 = (int)f;
          int i7 = i5 % 5;
          if (!i7) {
             f1 = (float)i6;
             p0.drawLine(f1, (float)i2, f1, (float)i3, this.h);
          }else {
             f1 = (float)i6;
             p0.drawLine(f1, (float)i, f1, (float)i1, this.h);
          }
          i5 = i5 + 1;
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, OffsetCaliperBaseLine.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(OffsetCaliperBaseLine.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, OffsetCaliperBaseLine.class, "8")) {
          return;
       }
       super.onMeasure(p0, p1);
       OffsetCaliperBaseLine tc = this.c;
       if (tc > null) {
          this.f = (float)this.getMeasuredWidth() / (float)Math.max((tc / this.e), 1);
       }
       this.g = this.getMeasuredHeight() / 2;
       if (this.j == null) {
          this.j = true;
          this.a(false);
       }
       return;
    }
    public void setCurrentOffset(int p0){
       if (PatchProxy.isSupport(OffsetCaliperBaseLine.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OffsetCaliperBaseLine.class, "4")) {
          return;
       }
       this.i = p0;
       this.a(false);
       return;
    }
}
