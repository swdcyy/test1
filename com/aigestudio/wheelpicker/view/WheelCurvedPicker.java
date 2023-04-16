package com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import android.content.Context;
import java.util.HashMap;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import t4.c;
import java.util.List;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Math;
import android.graphics.Region$Op;
import android.graphics.Rect;
import android.text.TextPaint;
import java.lang.String;
import android.view.MotionEvent;

public class WheelCurvedPicker extends WheelCrossPicker	// class@000d6e
{
    public final HashMap T;
    public final HashMap U;
    public final Matrix U0;
    public final Camera V;
    public int V0;
    public final Matrix W;
    public int W0;
    public int X0;
    public int Y0;

    public void WheelCurvedPicker(Context p0){
       super(p0);
       this.T = new HashMap();
       this.U = new HashMap();
       this.V = new Camera();
       this.W = new Matrix();
       this.U0 = new Matrix();
    }
    public void WheelCurvedPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.T = new HashMap();
       this.U = new HashMap();
       this.V = new Camera();
       this.W = new Matrix();
       this.U0 = new Matrix();
    }
    public void b(){
       super.b();
       int i = this.I.n(this.n, this.p, this.t, this.u);
       this.V0 = i;
       this.N = (int)(180.00f / (float)(this.n + 1));
       this.v = this.I.p(i, this.t, this.u);
       this.w = this.I.e(this.V0, this.t, this.u);
       this.R = -90;
       this.S = 90;
       AbstractWheelPicker to = this.o;
       this.P = (- this.N) * ((this.k.size() - to) - 1);
       this.Q = this.N * to;
    }
    public void clearCache(){
       this.T.clear();
       this.U.clear();
       this.I.clearCache();
    }
    public void e(Canvas p0){
       int i3;
       int i = - this.o;
       int i1 = this.k.size() - this.o;
       while (i < i1) {
          i1 = this.N * i;
          int i2 = this.O + this.W0;
          i1 = i1 + i2;
          if (i1 <= this.S && i1 >= this.R) {
             if (this.T.containsKey(Integer.valueOf(i1))) {
                i2 = this.T.get(Integer.valueOf(i1)).intValue();
             }else {
                double d2 = Math.sin(Math.toRadians((double)i1)) * (double)this.V0;
                i2 = (int)d2;
                this.T.put(Integer.valueOf(i1), Integer.valueOf(i2));
             }
             if (!i2) {
                i1 = 1;
             }
             if (this.U.containsKey(Integer.valueOf(i1))) {
                i3 = this.U.get(Integer.valueOf(i1)).intValue();
             }else {
                double d = Math.cos(Math.toRadians((double)i1)) * (double)this.V0;
                double d1 = (double)this.V0 - d;
                i3 = (int)d1;
                this.U.put(Integer.valueOf(i1), Integer.valueOf(i3));
             }
             this.V.save();
             this.I.f(this.V, i1);
             this.V.getMatrix(this.W);
             this.V.restore();
             this.I.d(this.W, i2, this.x, this.y);
             this.V.save();
             this.V.translate(0, 0, (float)i3);
             this.V.getMatrix(this.U0);
             this.V.restore();
             this.I.d(this.U0, i2, this.x, this.y);
             this.W.postConcat(this.U0);
             p0.save();
             p0.concat(this.W);
             p0.clipRect(this.K, Region$Op.DIFFERENCE);
             this.d.setColor(this.r);
             i1 = Math.abs(i1) * 255;
             i1 = i1 / this.S;
             i1 = i1 - 255;
             this.d.setAlpha(i1);
             i3 = this.o + i;
             Canvas uCanvas = p0;
             int i4 = i2;
             this.I.r(uCanvas, this.d, this.k.get(i3), i4, this.x, this.z);
             p0.restore();
             p0.save();
             p0.clipRect(this.K);
             this.d.setColor(this.s);
             i3 = this.o + i;
             this.I.r(uCanvas, this.d, this.k.get(i3), i4, this.x, this.z);
             p0.restore();
          }
          i = i + 1;
       }
       return;
    }
    public void j(MotionEvent p0){
       this.Y0 = this.I.j(this.C, this.D, this.V0);
       int i = this.I.k(this.C, this.D);
       if (Math.abs(i) >= this.V0) {
          this.X0 = (i >= 0)? this.X0 + 1: this.X0 - 1;
          i = 0;
          this.C = i;
          this.D = i;
          this.Y0 = i;
       }
       this.W0 = (this.X0 * 80) + this.Y0;
       super.j(p0);
       return;
    }
    public void k(MotionEvent p0){
       this.O = this.O + this.W0;
       this.W0 = 0;
       this.Y0 = 0;
       this.X0 = 0;
       super.k(p0);
    }
}
