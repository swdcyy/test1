package com.kuaishou.commercial.tachikoma.view.ScratchCardView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.tachikoma.view.ScratchCardView$a;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import lnc.a1;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import qrd.l1;
import android.graphics.Matrix;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import k00.e;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import java.lang.Runnable;
import t45.c;
import android.graphics.Bitmap$Config;
import android.view.View$MeasureSpec;
import java.lang.Throwable;
import yx.j0;
import java.lang.Float;

public final class ScratchCardView extends View	// class@001690
{
    public Paint b;
    public Path c;
    public Canvas d;
    public Bitmap e;
    public Matrix f;
    public float g;
    public float h;
    public float i;
    public e j;
    public boolean k;
    public boolean l;
    public final Runnable m;
    public HashMap n;

    public void ScratchCardView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ScratchCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ScratchCardView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.i = 0x3f19999a;
       this.m = new ScratchCardView$a(this);
       this.setLayerType(1, null);
       this.c = new Path();
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(0);
       paint.setStrokeCap(Paint$Cap.ROUND);
       paint.setStrokeJoin(Paint$Join.ROUND);
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth((float)a1.e(10.00f));
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
       this.b = paint;
       this.f = new Matrix();
    }
    public void ScratchCardView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ScratchCardView.class, "5")) {
          return;
       }
       ScratchCardView te = this.e;
       if (te != null && te != null) {
          int measuredWidt = this.getMeasuredWidth();
          int measuredHeig = this.getMeasuredHeight();
          if (measuredWidt && measuredHeig) {
             if (te.getWidth() == measuredWidt && te.getHeight() == measuredHeig) {
                return;
             }else {
                this.f.reset();
                this.f.setScale((((float)measuredWidt * 0x3f800000) / (float)te.getWidth()), (((float)measuredHeig * 0x3f800000) / (float)te.getHeight()));
                this.e = Bitmap.createBitmap(te, 0, 0, te.getWidth(), te.getHeight(), this.f, true);
                this.d = new Canvas(te);
             }
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       ScratchCardView td;
       if (PatchProxy.applyVoidOneRefs(p0, this, ScratchCardView.class, "6")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       if (this.l == null) {
          ScratchCardView te = this.e;
          if (te != null) {
             p0.drawBitmap(te, 0, 0, null);
          }
          td = this.d;
          if (td != null) {
             td.drawPath(this.c, this.b);
          }
       }else if(!this.getVisibility()){
          td = this.j;
          if (td != null) {
             td.b();
          }
          this.setVisibility(8);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ScratchCardView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ScratchCardView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ScratchCardView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       int action = p0.getAction();
       if (action) {
          boolean b = false;
          if (action != 1) {
             int i = 2;
             if (action != i) {
                this.getParent().requestDisallowInterceptTouchEvent(b);
             }else {
                ScratchCardView tg = this.g;
                float f = (float)i;
                float f1 = ((p0.getX() - tg) / f) + tg;
                ScratchCardView th = this.h;
                this.c.quadTo(this.g, th, f1, (((p0.getY() - th) / f) + th));
                this.g = p0.getX();
                this.h = p0.getY();
             }
          }else {
             c.a(this.m);
             this.getParent().requestDisallowInterceptTouchEvent(b);
          }
       }else {
          this.g = p0.getX();
          float y = p0.getY();
          this.h = y;
          this.c.moveTo(this.g, y);
          this.getParent().requestDisallowInterceptTouchEvent(true);
          ScratchCardView tj = this.j;
          if (tj != null && this.k == null) {
             tj.a();
             this.k = true;
          }
       }
       this.invalidate();
       return true;
    }
    public final void setForegroundView(View p0){
       Bitmap uBitmap;
       if (PatchProxy.applyVoidOneRefs(p0, this, ScratchCardView.class, "4")) {
          return;
       }
       a.p(p0, "view");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Bitmap$Config obj = PatchProxy.applyOneRefs(p0, this, ScratchCardView.class, "9");
       Object obj1 = null;
       if (obj != patchProxyRe) {
       }else {
          obj = Bitmap$Config.RGB_565;
          Object obj2 = PatchProxy.applyTwoRefs(p0, obj, this, ScratchCardView.class, "10");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             p0.setDrawingCacheEnabled(true);
             p0.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
             p0.layout(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight());
             Bitmap drawingCache = p0.getDrawingCache();
             if (drawingCache == null) {
                drawingCache = PatchProxy.applyTwoRefs(p0, obj, this, ScratchCardView.class, "11");
                if (drawingCache != patchProxyRe) {
                }else {
                   try{
                      uBitmap = Bitmap.createBitmap(p0.getMeasuredWidth(), p0.getMeasuredHeight(), obj);
                      p0.layout(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight());
                      p0.draw(new Canvas(uBitmap));
                   }catch(java.lang.Exception e7){
                      j0.b("ScratchCardView", "convertViewToBitMap2 failed", e7);
                      uBitmap = obj1;
                   }
                   obj = uBitmap;
                }
             }
             obj = drawingCache;
          }
       }
       if (obj != null) {
          this.d = new Canvas(obj);
          obj1 = obj;
       }
       this.e = obj1;
       this.a();
       this.invalidate();
       return;
    }
    public final void setScratchCallback(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScratchCardView.class, "3")) {
          return;
       }
       a.p(p0, "callback");
       this.j = p0;
       return;
    }
    public final void setScratchFinishMinProgress(float p0){
       this.i = p0;
    }
    public final void setTouchWidth(float p0){
       if (PatchProxy.isSupport(ScratchCardView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScratchCardView.class, "2")) {
          return;
       }
       this.b.setStrokeWidth(p0);
       return;
    }
}
