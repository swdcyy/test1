package com.kuaishou.live.common.core.basic.widget.HaloBorderView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.System;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Region$Op;
import java.lang.Integer;

public class HaloBorderView extends View	// class@000f0b
{
    public Paint b;
    public Path c;
    public Path d;
    public Path e;
    public Path f;
    public PathMeasure g;
    public RectF h;
    public LinearGradient i;
    public RadialGradient j;
    public LinearGradient k;
    public float l;
    public float m;
    public int[] n;
    public float[] o;
    public int[] p;
    public float[] q;
    public int[] r;
    public float[] s;
    public float[] t;
    public float[] u;
    public float v;
    public float w;
    public static final float[] x;

    static {
       HaloBorderView.x = new float[2]{0,0x3f800000};
    }
    public void HaloBorderView(Context p0){
       super(p0, null);
    }
    public void HaloBorderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HaloBorderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 2;
       float[] uofloatArray = new float[i];
       this.t = uofloatArray;
       uofloatArray = new float[i];
       this.u = uofloatArray;
       this.w = (float)System.nanoTime();
       if (PatchProxy.applyVoid(null, this, HaloBorderView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(true);
          this.p = new int[i]{0xccf0a7ff,0xee6dff};
          uofloatArray = HaloBorderView.x;
          this.q = uofloatArray;
          this.n = new int[i]{0xffab5bed,0x40d200fd};
          this.o = uofloatArray;
          this.r = new int[i]{0x665200fd,0x333c00fd};
          this.s = uofloatArray;
          this.m = c.c(this.getResources()).density * 40.00f;
          this.l = c.c(this.getResources()).density * 2.50f;
       }
       return;
    }
    public void onDraw(Canvas p0){
       float length;
       float f1;
       float f2;
       RectF rectF = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, rectF, HaloBorderView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       HaloBorderView haloBorderVi = null;
       Object[] objArray = null;
       float f = 100.00f;
       if (rectF.c == null && !PatchProxy.applyVoid(objArray, rectF, HaloBorderView.class, "7")) {
          int paddingLeft = this.getPaddingLeft();
          int paddingTop = this.getPaddingTop();
          int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
          int i1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
          if (rectF.c == null) {
             float f3 = (float)paddingLeft;
             float f4 = (float)paddingTop;
             length = (float)(paddingLeft + i);
             f2 = (float)(paddingTop + i1);
             RectF rectF1 = new RectF(f3, f4, length, f2);
             rectF.h = rectF1;
             Path path = new Path();
             rectF.c = path;
             path.addRoundRect(rectF1, f, f, Path$Direction.CCW);
             rectF.g = new PathMeasure(rectF.c, haloBorderVi);
             float f5 = rectF.l - (c.c(this.getResources()).density * 0x3fc00000);
             Path path1 = new Path();
             rectF.d = path1;
             path1.addRoundRect(new RectF((f3 + f5), (f4 + f5), (length - f5), (f2 - f5)), f, f, Path$Direction.CCW);
             float f6 = f3 - f5;
             float f7 = f4 - f5;
             float f8 = length + f5;
             RectF rectF2 = new RectF(f6, f7, f8, (f5 + f2));
             path = new Path();
             rectF.e = path;
             path.addRoundRect(rectF2, f, f, Path$Direction.CCW);
             f1 = rectF.l - (c.c(this.getResources()).density * 0x3fc00000);
             Path path2 = new Path();
             rectF.f = path2;
             path2.addRoundRect(new RectF((f3 + f1), (f4 + f1), (length - f1), (f2 - f1)), f, f, Path$Direction.CCW);
             RadialGradient radialGradie = new RadialGradient(0, 0, rectF.m, rectF.p, rectF.q, Shader$TileMode.CLAMP);
             rectF.j = path2;
             LinearGradient linearGradie = new LinearGradient(rectF1.left, rectF1.top, rectF1.right, rectF1.bottom, rectF.n, rectF.o, Shader$TileMode.CLAMP);
             rectF.i = path2;
             LinearGradient linearGradie1 = new LinearGradient(rectF1.left, rectF1.top, rectF1.right, rectF1.bottom, rectF.r, rectF.s, Shader$TileMode.CLAMP);
             rectF.k = path2;
          }
       }
       rectF.b.setStrokeWidth(rectF.l);
       p0.save();
       rectF.b.setShader(rectF.k);
       rectF.b.setStyle(Paint$Style.FILL);
       obj.clipPath(rectF.f);
       obj.drawPath(rectF.f, rectF.b);
       p0.restore();
       rectF.b.setShader(rectF.i);
       rectF.b.setStyle(Paint$Style.STROKE);
       obj.drawRoundRect(rectF.h, f, f, rectF.b);
       length = rectF.g.getLength();
       f1 = rectF.v / 3.00f;
       rectF.g.getPosTan((f1 * length), rectF.t, objArray);
       f2 = 0x3f000000;
       f1 = (f1 - f2 > 0)? f1 - f2: f1 + f2;
       rectF.g.getPosTan((f1 * length), rectF.u, objArray);
       rectF.b.setShader(rectF.j);
       rectF.b.setStyle(Paint$Style.FILL);
       p0.save();
       obj.clipPath(rectF.e);
       obj.clipPath(rectF.d, Region$Op.DIFFERENCE);
       p0.save();
       HaloBorderView t = rectF.t;
       obj.translate(t[0], t[1]);
       obj.drawCircle(0, 0, rectF.m, rectF.b);
       p0.restore();
       p0.save();
       t = rectF.u;
       obj.translate(t[0], t[1]);
       obj.drawCircle(0, 0, rectF.m, rectF.b);
       p0.restore();
       p0.restore();
       rectF.v = rectF.v + (((float)System.nanoTime() - rectF.w) / 1000000000.00f);
       rectF.w = (float)System.nanoTime();
       if (rectF.v - 3.00f >= 0) {
          rectF.v = 0;
       }
       rectF.postInvalidateDelayed(20);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HaloBorderView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HaloBorderView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.c = null;
       return;
    }
    public void setBorderWidth(int p0){
       this.l = (float)p0;
    }
    public void setHaloRadiusDp(int p0){
       this.m = (float)p0;
    }
}
