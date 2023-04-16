package com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.graphics.Canvas;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import faa.a;
import q87.c;
import java.lang.Math;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$c;
import tyc.k4;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;

public class LinearBitmapContainer extends LinearLayout	// class@0019de
{
    public LinearBitmapContainer$a b;
    public Paint c;
    public boolean d;
    public LinearBitmapContainer$c e;
    public final Path f;
    public final Rect g;
    public final Rect h;
    public boolean i;
    public static final int j;

    static {
       LinearBitmapContainer.j = a1.d(0x7f070fda);
    }
    public void LinearBitmapContainer(Context p0){
       super(p0);
       this.c = new Paint();
       this.f = new Path();
       this.g = new Rect();
       this.h = new Rect();
       this.a();
    }
    public void LinearBitmapContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new Paint();
       this.f = new Path();
       this.g = new Rect();
       this.h = new Rect();
       this.a();
    }
    public void LinearBitmapContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Paint();
       this.f = new Path();
       this.g = new Rect();
       this.h = new Rect();
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LinearBitmapContainer.class, "1")) {
          return;
       }
       this.i = PostExperimentUtils.c();
       return;
    }
    public void dispatchDraw(Canvas p0){
       LinearBitmapContainer b1;
       int width;
       int height;
       int count;
       int i2;
       Object[] objArray2;
       int i5;
       boolean b = this;
       LinearBitmapContainer obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, b, LinearBitmapContainer.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       Paint paint = null;
       String str = "LinearBitmapContainer";
       int i = 0;
       if (b.i != null) {
          if (!PatchProxy.applyVoidOneRefs(obj, b, LinearBitmapContainer.class, "5")) {
             b1 = b.b;
             if (b1 != null) {
                width = b1.getWidth();
                height = b1.getHeight();
                count = b1.getCount();
                if (width > 0 && (count > 0 && b.getLocalVisibleRect(b.h))) {
                   int i1 = p0.save();
                   obj.clipPath(b.f);
                   Object[] objArray = new Object[i];
                   a.D().s(str, "start draw", objArray);
                   i2 = Math.max(i, (b.h.left / width));
                   int i3 = i2 * width;
                   for (; i2 < count && i3 < b.h.right; i2 = i2 + 1) {
                      Bitmap uBitmap = b1.a(i2);
                      if (uBitmap != null) {
                         if (width == uBitmap.getWidth() && height == uBitmap.getHeight()) {
                            obj.drawBitmap(uBitmap, (float)i3, 0, paint);
                         }else {
                            int i4 = i3 + width;
                            b.g.set(i3, i, i4, height);
                            Object[] objArray1 = new Object[i];
                            a.D().s(str, "start draw index : "+i2+" x :  "+i3, objArray1);
                            obj.drawBitmap(uBitmap, paint, b.g, paint);
                         }
                      }
                      i3 = i3 + width;
                   }
                   objArray2 = new Object[i];
                   a.D().s(str, "end draw", objArray2);
                   Object[] objArray3 = new Object[i];
                   a.D().s(str, "start preload i: "+i2+" j: "+3, objArray3);
                   i5 = i2;
                   int i6 = i2 + 3;
                   while (i5 < i6) {
                      b1.a(i5);
                      i5 = i5 + 1;
                   }
                   obj.restoreToCount(i1);
                   b.d = true;
                   obj = b.e;
                   if (obj != null) {
                      obj.a();
                      b.e = paint;
                   }
                }
             }
          }
          return;
       }else {
          String str1 = "dispatchDraw: width: ";
          Object[] objArray4 = new Object[i];
          a.D().s(str, str1+this.getWidth(), objArray4);
          b1 = b.b;
          if (b1 != null && (b1.getWidth() > 0 && b.b.getCount() > 0)) {
             objArray2 = new Object[i];
             a.D().s(str, str1+b.b.getWidth()+", count: "+b.b.getCount(), objArray2);
             int i7 = p0.save();
             obj.clipPath(k4.a(p0.getWidth(), p0.getHeight(), LinearBitmapContainer.j));
             b.d = true;
             i5 = n.y(a.a().a());
             width = this.getVisibleLeftOnCanvas();
             height = (width < 0)? (- width) / b.b.getWidth(): 0;
             count = (((i5 * 2) / b.b.getWidth()) + 1) + height;
             if (count > b.b.getCount()) {
                count = b.b.getCount();
             }
             objArray2 = new Object[i];
             a.D().y(str, "dispatchDraw: screenWidth="+i5+" canvasLeft="+width+" currentFrameIndex="+height+" endFrameIndex="+count+" mAdapter.getWidth\(\)="+b.b.getWidth(), objArray2);
             i5 = b.b.getWidth() * height;
             while (height < count) {
                Object[] objArray5 = new Object[i];
                a.D().w(str, "dispatchDraw: firstFrameX="+i5, objArray5);
                Bitmap uBitmap1 = b.b.a(height);
                if (uBitmap1 != null) {
                   i2 = b.b.getWidth() + i5;
                   Rect rect = new Rect(i5, i, i2, b.b.getHeight());
                   obj.drawBitmap(uBitmap1, paint, rect, b.c);
                   objArray5 = new Object[i];
                   a.D().s(str, "drawBitmap: dstRect: "+rect, objArray5);
                   i5 = i5 + b.b.getWidth();
                }
                height = height + 1;
                LinearBitmapContainer e = b.e;
                if (e != null) {
                   e.a();
                   b.e = paint;
                }
             }
             obj.restoreToCount(i7);
             Object[] objArray6 = new Object[i];
             a.D().s("PRODUCTION_PERFORMANCE", "dispatchDraw", objArray6);
          }
       label_026c :
          return;
       }
    }
    public LinearBitmapContainer$a getAdapter(){
       return this.b;
    }
    public final int getVisibleLeftOnCanvas(){
       int[] obj = PatchProxy.apply(null, this, LinearBitmapContainer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[2];
       this.getLocationOnScreen(obj);
       return obj[0];
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LinearBitmapContainer.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LinearBitmapContainer.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.f.set(k4.a((p3 - p1), (p4 - p2), LinearBitmapContainer.j));
       }
       return;
    }
    public void setAdapter(LinearBitmapContainer$a p0){
       this.b = p0;
    }
    public void setFirstDrawListener(LinearBitmapContainer$c p0){
       this.e = p0;
    }
}
