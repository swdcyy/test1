package com.kwai.component.photo.detail.slide.widget.SlideSkeletonView;
import android.view.View;
import android.content.Context;
import android.graphics.Rect;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Integer;

public class SlideSkeletonView extends View	// class@000acb
{
    public final int A;
    public Paint b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public void SlideSkeletonView(Context p0){
       super(p0);
       this.c = new Rect();
       this.d = a1.h();
       int i = a1.e(11.00f);
       this.e = i;
       int i1 = a1.e(14.00f);
       this.f = i1;
       this.g = a1.e(6.00f);
       this.h = a1.e(8.00f);
       this.i = a1.e(14.00f);
       int i2 = a1.e(29.00f);
       this.j = i2;
       int i3 = a1.e(22.00f);
       this.k = i3;
       int i4 = a1.e(12.00f);
       this.l = i4;
       int i5 = a1.e(18.00f);
       this.m = i5;
       this.n = a1.e(21.00f);
       int i6 = a1.e(17.00f);
       this.o = i6;
       this.p = a1.e(74.00f);
       this.q = a1.e(168.00f);
       this.r = a1.e(214.00f);
       int i7 = a1.e(52.00f);
       this.s = i7;
       this.t = a1.e(32.00f);
       int i8 = a1.e(24.00f);
       this.u = i8;
       int i9 = a1.e(22.00f);
       this.v = i9;
       i4 = (((((i4 + (i9 * 2)) + i3) + (i5 * 3)) + (i7 * 4)) + i2) + (i8 * 2);
       this.w = i4;
       i4 = i4 - i1;
       this.x = i4;
       i4 = (i4 - i) - i6;
       this.y = i4;
       this.z = (i4 - i) - i6;
       this.A = i5 + i7;
       this.a();
    }
    public void SlideSkeletonView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new Rect();
       this.d = a1.h();
       int i = a1.e(11.00f);
       this.e = i;
       int i1 = a1.e(14.00f);
       this.f = i1;
       this.g = a1.e(6.00f);
       this.h = a1.e(8.00f);
       this.i = a1.e(14.00f);
       int i2 = a1.e(29.00f);
       this.j = i2;
       int i3 = a1.e(22.00f);
       this.k = i3;
       int i4 = a1.e(12.00f);
       this.l = i4;
       int i5 = a1.e(18.00f);
       this.m = i5;
       this.n = a1.e(21.00f);
       int i6 = a1.e(17.00f);
       this.o = i6;
       this.p = a1.e(74.00f);
       this.q = a1.e(168.00f);
       this.r = a1.e(214.00f);
       int i7 = a1.e(52.00f);
       this.s = i7;
       this.t = a1.e(32.00f);
       int i8 = a1.e(24.00f);
       this.u = i8;
       int i9 = a1.e(22.00f);
       this.v = i9;
       i4 = (((((i4 + (i9 * 2)) + i3) + (i5 * 3)) + (i7 * 4)) + i2) + (i8 * 2);
       this.w = i4;
       i4 = i4 - i1;
       this.x = i4;
       i4 = (i4 - i) - i6;
       this.y = i4;
       this.z = (i4 - i) - i6;
       this.A = i5 + i7;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlideSkeletonView.class, "1")) {
          return;
       }
       Paint paint = new Paint();
       this.b = paint;
       paint.setColor(a1.a(R.color.arg_RES_7f061bfb));
       this.b.setStyle(Paint$Style.FILL);
       return;
    }
    public void onDraw(Canvas p0){
       SlideSkeletonView tu;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSkeletonView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SlideSkeletonView.class, "4")) {
          this.b.setAlpha(15);
          tu = this.e;
          SlideSkeletonView tz = this.z;
          this.c.set(tu, (tz - this.n), (this.p + tu), tz);
          p0.drawRect(this.c, this.b);
          tu = this.e;
          tz = this.y;
          this.c.set(tu, (tz - this.o), (this.q + tu), tz);
          p0.drawRect(this.c, this.b);
          tu = this.e;
          tz = this.x;
          this.c.set(tu, (tz - this.o), (this.r + tu), tz);
          p0.drawRect(this.c, this.b);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SlideSkeletonView.class, "5")) {
          this.b.setAlpha(10);
          tu = this.u;
          p0.drawCircle((float)((this.d - this.g) - tu), (float)tu, (float)tu, this.b);
          int i = this.d - this.i;
          int i1 = (this.u * 2) + this.j;
          this.c.set((i - this.t), i1, i, (this.s + i1));
          p0.drawRect(this.c, this.b);
          this.c.offset(0, this.A);
          p0.drawRect(this.c, this.b);
          this.c.offset(0, this.A);
          p0.drawRect(this.c, this.b);
          this.c.offset(0, this.A);
          p0.drawRect(this.c, this.b);
          tu = this.v;
          p0.drawCircle((float)((this.d - this.h) - tu), (float)((this.w - this.l) - tu), (float)tu, this.b);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SlideSkeletonView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlideSkeletonView.class, "2")) {
          return;
       }
       this.setMeasuredDimension(this.d, this.w);
       return;
    }
}
