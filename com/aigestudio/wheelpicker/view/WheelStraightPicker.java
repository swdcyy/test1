package com.aigestudio.wheelpicker.view.WheelStraightPicker;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import t4.c;
import java.util.List;
import android.graphics.Canvas;
import android.graphics.Region$Op;
import android.graphics.Rect;
import android.text.TextPaint;
import java.lang.Math;
import java.lang.Object;
import java.lang.String;
import android.view.MotionEvent;

public class WheelStraightPicker extends WheelCrossPicker	// class@000d6f
{

    public void WheelStraightPicker(Context p0){
       super(p0);
    }
    public void WheelStraightPicker(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void b(){
       super.b();
       this.v = this.I.l(this.n, this.p, this.t, this.u);
       this.w = this.I.h(this.n, this.p, this.t, this.u);
       this.N = this.I.a(this.p, this.t, this.u);
       int i = this.I.c(this.n, this.p, this.t, this.u);
       this.R = - i;
       this.S = i;
       AbstractWheelPicker to = this.o;
       this.P = (- this.N) * ((this.k.size() - to) - 1);
       this.Q = this.N * to;
    }
    public void e(Canvas p0){
       int i3;
       AbstractWheelPicker uAbstractWhe = this;
       Canvas uCanvas = p0;
       int i = - uAbstractWhe.o;
       int i1 = uAbstractWhe.k.size() - uAbstractWhe.o;
       while (i < i1) {
          int i2 = uAbstractWhe.I.q(uAbstractWhe.N, i, uAbstractWhe.E, uAbstractWhe.F, uAbstractWhe.C, uAbstractWhe.D);
          if (i2 > uAbstractWhe.S || i2 < uAbstractWhe.R) {
             i3 = i;
          }else {
             p0.save();
             uCanvas.clipRect(uAbstractWhe.K, Region$Op.DIFFERENCE);
             uAbstractWhe.d.setColor(uAbstractWhe.r);
             int i4 = Math.abs(i2) * 255;
             i4 = i4 / uAbstractWhe.S;
             i4 = i4 - 255;
             uAbstractWhe.d.setAlpha(i4);
             int i5 = uAbstractWhe.o + i;
             int i6 = i2;
             i3 = i;
             uAbstractWhe.I.r(p0, uAbstractWhe.d, uAbstractWhe.k.get(i5), i6, uAbstractWhe.x, uAbstractWhe.z);
             p0.restore();
             p0.save();
             uCanvas.clipRect(uAbstractWhe.K);
             uAbstractWhe.d.setColor(uAbstractWhe.s);
             i = i3 + uAbstractWhe.o;
             uAbstractWhe.I.r(p0, uAbstractWhe.d, uAbstractWhe.k.get(i), i6, uAbstractWhe.x, uAbstractWhe.z);
             p0.restore();
          }
          i = i3 + 1;
       }
       return;
    }
    public void j(MotionEvent p0){
       super.j(p0);
    }
    public void k(MotionEvent p0){
       this.O = this.I.m(this.E, this.F);
       super.k(p0);
    }
}
