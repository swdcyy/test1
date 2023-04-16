package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import yoc.n;
import jwc.a$a;
import jwc.a;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$b;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import android.util.AttributeSet;
import fpc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$a;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Path$Direction;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import java.lang.Math;
import android.graphics.Bitmap;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View;

public final class ThumbnailViewV2 extends LinearLayout	// class@000dcf
{
    public final String b;
    public final int c;
    public final double d;
    public final float e;
    public final int f;
    public int g;
    public a h;
    public double i;
    public int j;
    public int k;
    public final int l;
    public final int m;
    public final Paint n;
    public final RectF o;
    public final Path p;
    public final Rect q;
    public final Rect r;
    public boolean s;
    public boolean t;
    public final int u;
    public final Runnable v;
    public final LinearBitmapContainer$b w;
    public HashMap x;

    public void ThumbnailViewV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       this.f = 3;
       ClipUtils c = ClipUtils.c;
       this.l = c.d().b().a;
       this.m = c.d().b().b;
       this.n = new Paint();
       this.o = new RectF();
       this.p = new Path();
       this.q = new Rect();
       this.r = new Rect();
       this.u = a1.e(2.00f);
       this.v = new ThumbnailViewV2$b(this);
       this.w = this.b();
    }
    public void ThumbnailViewV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       this.f = 3;
       ClipUtils c = ClipUtils.c;
       this.l = c.d().b().a;
       this.m = c.d().b().b;
       this.n = new Paint();
       this.o = new RectF();
       this.p = new Path();
       this.q = new Rect();
       this.r = new Rect();
       this.u = a1.e(2.00f);
       this.v = new ThumbnailViewV2$b(this);
       this.w = this.b();
    }
    public void ThumbnailViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1, p2);
       this.b = "ThumbnailView";
       this.c = a1.e(2.00f);
       this.d = 0x3f50624dd2f1a9fc;
       this.e = 0x3f400000;
       this.f = 3;
       ClipUtils c = ClipUtils.c;
       this.l = c.d().b().a;
       this.m = c.d().b().b;
       this.n = new Paint();
       this.o = new RectF();
       this.p = new Path();
       this.q = new Rect();
       this.r = new Rect();
       this.u = a1.e(2.00f);
       this.v = new ThumbnailViewV2$b(this);
       this.w = this.b();
    }
    public static final a a(ThumbnailViewV2 p0){
       p0 = p0.h;
       if (p0 == null) {
          a.S("segment");
       }
       return p0;
    }
    public final LinearBitmapContainer$b b(){
       Object obj = PatchProxy.apply(null, this, ThumbnailViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ThumbnailViewV2$a(this);
    }
    public void dispatchDraw(Canvas p0){
       ThumbnailViewV2 to;
       float f5;
       Rect rect;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThumbnailViewV2.class, "4")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.h == null) {
          return;
       }
       if (!this.getLocalVisibleRect(this.r)) {
          return;
       }
       if (p0 != null) {
          int i = p0.save();
          this.o.set(0, 0, (float)this.k, (float)this.getHeight());
          this.p.reset();
          if (this.s != null) {
             to = this.o;
             to.left = to.left + (float)this.u;
          }
          if (this.t != null) {
             to = this.o;
             to.right = to.right - (float)this.u;
          }
          ThumbnailViewV2 tc = this.c;
          float f = (float)tc;
          this.p.addRoundRect(this.o, f, (float)tc, Path$Direction.CCW);
          p0.clipPath(this.p);
          int count = this.w.getCount();
          int i1 = 0;
          int i2 = Math.max(i1, (this.r.left / this.l));
          int i3 = this.l * i2;
          for (; i2 < count && i3 < this.r.right; i2 = i2 + 1) {
             Bitmap uBitmap = this.w.a(i2);
             if (uBitmap != null) {
                float f1 = (float)uBitmap.getWidth();
                float f2 = (float)uBitmap.getHeight();
                float f3 = f2 / f1;
                float f4 = (float)this.m * 0x3f800000;
                f4 = f4 / (float)this.l;
                int i4 = 2;
                if (f3 - f4 > 0) {
                   f4 = f4 / f3;
                   f4 = f4 * f2;
                   f3 = f2 - f4;
                   f5 = (float)i4;
                   f3 = f3 / f5;
                   f2 = f2 + f4;
                   f2 = f2 / f5;
                   rect = new Rect(i1, (int)f3, (int)f1, (int)f2);
                }else {
                   f3 = f3 / f4;
                   f3 = f3 * f1;
                   f4 = f1 - f3;
                   f5 = (float)i4;
                   f4 = f4 / f5;
                   f1 = f1 + f3;
                   f1 = f1 / f5;
                   rect = new Rect((int)f4, i1, (int)f1, (int)f2);
                }
                int i5 = this.l + i3;
                this.q.set(i3, i1, i5, this.m);
                Object[] objArray = new Object[i1];
                a.D().s(this.b, "start draw index : "+i2+" x :  "+i3, objArray);
                p0.drawBitmap(uBitmap, rect, this.q, null);
             }
             i3 = i3 + this.l;
          }
          count = this.f + i2;
          for (; i2 < count; i2 = i2 + 1) {
             this.w.a(i2);
          }
          p0.restoreToCount(i);
       }
       return;
    }
    public final int getLocationX(){
       int[] obj = PatchProxy.apply(null, this, ThumbnailViewV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[2];
       this.getLocationOnScreen(obj);
       return obj[0];
    }
    public final int getTotalFrameSize(){
       return ((this.k / this.l) + 2);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThumbnailViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (this.o.left - p0.getX() <= 0 && p0.getX() - this.o.right <= 0)) {
          return super.onTouchEvent(p0);
       }
       return false;
    }
}
