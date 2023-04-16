package com.yxcorp.gifshow.detail.slideplay.SlidePlayCommentExpandIconView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Point;
import android.graphics.Path;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Math;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Float;

public class SlidePlayCommentExpandIconView extends View	// class@001710
{
    public float b;
    public float c;
    public int d;
    public final Paint e;
    public final Point f;
    public final Point g;
    public final Point h;
    public final Point i;
    public final Point j;
    public final boolean k;
    public int l;
    public int m;
    public int n;
    public final Path o;

    public void SlidePlayCommentExpandIconView(Context p0){
       super(p0, null);
    }
    public void SlidePlayCommentExpandIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SlidePlayCommentExpandIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 0;
       this.d = 0xff000000;
       this.f = new Point();
       this.g = new Point();
       this.h = new Point();
       this.i = new Point();
       this.j = new Point();
       this.o = new Path();
       int i = 0;
       TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(p1, c$b.z0, i, i);
       boolean booleanx = typedArray.getBoolean(8, i);
       this.d = typedArray.getColor(2, 0xff000000);
       int i1 = -1;
       this.l = typedArray.getDimensionPixelSize(6, i1);
       this.m = typedArray.getDimensionPixelSize(1, 30);
       this.n = typedArray.getDimensionPixelSize(7, 6);
       if (this.l == i1) {
          i = true;
       }
       this.k = i;
       typedArray.recycle();
       Paint paint = new Paint(1);
       this.e = paint;
       paint.setColor(this.d);
       paint.setStyle(Paint$Style.STROKE);
       paint.setDither(1);
       if (booleanx) {
          paint.setStrokeJoin(Paint$Join.ROUND);
          paint.setStrokeCap(Paint$Cap.ROUND);
       }
       if (!PatchProxy.applyVoid(null, this, SlidePlayCommentExpandIconView.class, "4")) {
          this.b();
          this.invalidate();
       }
       return;
    }
    public final void a(Point p0,double p1,Point p2){
       if (PatchProxy.isSupport(SlidePlayCommentExpandIconView.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, SlidePlayCommentExpandIconView.class, "6")) {
          return;
       }
       p1 = Math.toRadians(p1);
       Point x = this.h.x;
       SlidePlayCommentExpandIconView th = this.h;
       p2.set((int)(((double)x + ((double)(p0.x - x) * Math.cos(p1))) - ((double)(p0.y - this.h.y) * Math.sin(p1))), (int)(((double)th.y + ((double)(p0.x - th.x) * Math.sin(p1))) + ((double)(p0.y - this.h.y) * Math.cos(p1))));
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SlidePlayCommentExpandIconView.class, "5")) {
          return;
       }
       this.o.reset();
       float f = 20.00f;
       float f1 = (0x3f800000 - (this.b / 50.00f)) * f;
       if (f1 < 0) {
          f = 0;
       }else if(f1 - f > 0){
          f = f1;
       }
       this.a(this.f, (double)f, this.i);
       this.a(this.g, (double)(- f), this.j);
       SlidePlayCommentExpandIconView ti = this.i;
       Point y = ti.y;
       this.c = (float)((this.h.y - y) / 2);
       this.o.moveTo((float)ti.x, (float)y);
       ti = this.h;
       this.o.lineTo((float)ti.x, (float)ti.y);
       ti = this.j;
       this.o.lineTo((float)ti.x, (float)ti.y);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayCommentExpandIconView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       p0.translate(0, this.c);
       p0.drawPath(this.o, this.e);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SlidePlayCommentExpandIconView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SlidePlayCommentExpandIconView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!PatchProxy.isSupport(SlidePlayCommentExpandIconView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlidePlayCommentExpandIconView.class, "3")) {
          if (this.k != null) {
             this.l = (int)((float)p0 * 0.17f);
          }
          this.e.setStrokeWidth((float)this.n);
          this.h.set((p0 / 2), (p1 / 2));
          SlidePlayCommentExpandIconView th = this.h;
          p2 = this.m / 2;
          this.f.set((th.x - p2), th.y);
          th = this.h;
          this.g.set((th.x + p2), th.y);
       }
       this.b();
       return;
    }
    public void setMove(float p0){
       if (PatchProxy.isSupport(SlidePlayCommentExpandIconView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayCommentExpandIconView.class, "8")) {
          return;
       }
       this.b = p0;
       this.b();
       if (!PatchProxy.applyVoid(null, this, SlidePlayCommentExpandIconView.class, "7")) {
          this.postInvalidateOnAnimation();
       }
       return;
    }
}
