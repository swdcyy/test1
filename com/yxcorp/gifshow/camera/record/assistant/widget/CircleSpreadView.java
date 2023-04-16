package com.yxcorp.gifshow.camera.record.assistant.widget.CircleSpreadView;
import android.view.View;
import com.yxcorp.gifshow.camera.record.assistant.widget.CircleSpreadView$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Integer;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CircleSpreadView extends View	// class@001d2f
{
    public final float b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final CircleSpreadView$a o;

    static {
       CircleSpreadView.o = new CircleSpreadView$a(null);
       CircleSpreadView.l = a1.e(2.50f);
       CircleSpreadView.m = a1.e(6.00f);
       CircleSpreadView.n = a1.e(0x3f800000);
    }
    public void CircleSpreadView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CircleSpreadView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CircleSpreadView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = (float)(CircleSpreadView.m - CircleSpreadView.l);
       Paint paint = new Paint();
       this.c = paint;
       Paint paint1 = new Paint();
       this.d = paint1;
       int i = 0;
       Integer integer = null;
       TypedArray typedArray = (p0 != null)? p0.obtainStyledAttributes(p1, c$b.L, p2, i): integer;
       Integer integer1 = (typedArray != null)? Integer.valueOf(typedArray.getColor(i, R.color.arg_RES_7f06005e)): integer;
       if (typedArray != null) {
          integer = Integer.valueOf(typedArray.getColor(1, R.color.arg_RES_7f06005e));
       }
       int i1 = (integer1 != null)? integer1.intValue(): a1.a(R.color.arg_RES_7f06005e);
       paint.setColor(i1);
       paint.setAntiAlias(1);
       paint1.setAlpha(255);
       i1 = (integer != null)? integer.intValue(): a1.a(R.color.arg_RES_7f06005e);
       paint1.setColor(i1);
       paint1.setStyle(Paint$Style.STROKE);
       paint1.setStrokeWidth((float)CircleSpreadView.n);
       paint1.setAntiAlias(1);
       return;
    }
    public void CircleSpreadView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDraw(Canvas p0){
       CircleSpreadView tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, CircleSpreadView.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       int i = 1;
       this.k = this.k + i;
       this.d.setAlpha((int)this.h);
       int l = CircleSpreadView.l;
       p0.drawCircle(this.e, this.f, (float)l, this.c);
       p0.drawCircle(this.e, this.f, ((float)l + this.g), this.d);
       int i1 = 0;
       float f = (float)i1;
       if (this.h - f > 0) {
          tb = this.b;
          if (this.g - tb < 0) {
             this.h = ((float)i - this.i) * 0x437f0000;
             this.g = tb * this.j;
          }
       }
       tb = this.k;
       float f1 = (float)i / 33.33f;
       float f2 = (float)tb * f1;
       this.i = (f2 * f2) * f2;
       float f3 = (float)tb * f1;
       f3 = f3 + 0xbf800000;
       f1 = (f3 * f3) * f3;
       this.j = f1 + 0x3f800000;
       if (this.g - this.b >= 0 || this.h - f <= 0) {
          f3 = 0;
          this.g = f3;
          this.h = 0x437f0000;
          this.i = f3;
          this.j = f3;
          this.k = i1;
       }
       this.postInvalidateDelayed((long)30);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CircleSpreadView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CircleSpreadView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)2;
       this.e = (float)p0 / f;
       this.f = (float)p1 / f;
       return;
    }
}
