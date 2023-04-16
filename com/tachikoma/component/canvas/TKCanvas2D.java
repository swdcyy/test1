package com.tachikoma.component.canvas.TKCanvas2D;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.graphics.RectF;
import android.graphics.Rect;
import com.tkruntime.v8.V8Object;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gx4.c;
import com.tachikoma.component.canvas.TKPath;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Float;
import com.tachikoma.component.canvas.TKPaint;
import android.graphics.Paint;
import iq8.n;
import iq8.p;
import tx4.y;
import zp8.a;
import com.tachikoma.component.common.resource.TKImageResource;
import android.graphics.Bitmap;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.util.Map;
import nn8.a;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.canvas.TKCanvas2D$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Exception;

public class TKCanvas2D extends TKBaseNativeModule	// class@000cd9
{
    public RectF f;
    public Rect g;
    public boolean h;
    public Canvas mCanvas;

    public void TKCanvas2D(f p0){
       super(p0);
       this.f = new RectF();
       this.g = new Rect();
    }
    public void clipPath(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2D.class, "10")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          this.mCanvas.clipPath(this.getNativeModule(p0).getPath());
       }
       return;
    }
    public void drawCircle(float p0,float p1,float p2,V8Object p3){
       if (PatchProxy.isSupport(TKCanvas2D.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), p3, this, TKCanvas2D.class, "2")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          this.mCanvas.drawCircle((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), this.getNativeModule(p3).getPaint());
       }
       return;
    }
    public void drawColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas2D.class, "1")) {
          return;
       }
       if (this.h == null) {
          TKCanvas2D tmCanvas = this.mCanvas;
          if (tmCanvas != null) {
             tmCanvas.drawColor(p.b(p0));
          }
       }
       return;
    }
    public void drawImage(V8Object p0,Object p1,Object p2,V8Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TKCanvas2D.class, "9")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          String str = "Canvas2D";
          if (!y.a(p0)) {
             a.h(str, "drawImage\(\) image has been released.");
             return;
          }else {
             TKImageResource nativeModule = this.getNativeModule(p0);
             if (nativeModule == null) {
                a.h(str, "drawImage\(\) can\'t find native object from image.");
                return;
             }else {
                Bitmap bitmap = nativeModule.getBitmap();
                if (bitmap == null || bitmap.isRecycled()) {
                   a.h(str, "drawImage\(\) can\'t find active bitmap from image.");
                }else {
                   TKCanvas2D tKCanvas2D = null;
                   Paint paint = (p3 != null)? this.getNativeModule(p3).getPaint(): tKCanvas2D;
                   if (p2 != null) {
                      TKCanvas2D tg = this.g;
                      p2 = V8ObjectUtilsQuick.getValue(p2);
                      if (!PatchProxy.applyVoidTwoRefs(tg, p2, tKCanvas2D, a.class, "2")) {
                         str = "x";
                         float f = 0;
                         float f1 = (p2.containsKey(str))? p2.get(str).floatValue(): 0;
                         String str1 = "y";
                         float f2 = (p2.containsKey(str1))? p2.get(str1).floatValue(): 0;
                         String str2 = "width";
                         float f3 = (p2.containsKey(str2))? p2.get(str2).floatValue() + f1: 0;
                         if (p2.containsKey("height")) {
                            f = f2 + p2.get("height").floatValue();
                         }
                         tg.left = n.a(f1);
                         tg.top = n.a(f2);
                         tg.right = n.a(f3);
                         tg.bottom = n.a(f);
                      }
                      tKCanvas2D = this.g;
                      if (tKCanvas2D.right > nativeModule.getWidth()) {
                         tKCanvas2D.right = nativeModule.getWidth();
                      }
                      if (tKCanvas2D.bottom > nativeModule.getHeight()) {
                         tKCanvas2D.bottom = nativeModule.getHeight();
                      }
                   }
                   a.a(this.f, V8ObjectUtilsQuick.getValue(p1));
                   if (bitmap.isRecycled()) {
                      return;
                   }else {
                      this.mCanvas.drawBitmap(bitmap, tKCanvas2D, this.f, paint);
                      return;
                   }
                }
             }
          }
       }
       return;
    }
    public void drawLine(float p0,float p1,float p2,float p3,V8Object p4){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, tKCanvas2D, "5")) {
             return;
          }
       }
       if (this.h == null && this.mCanvas != null) {
          this.mCanvas.drawLine((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), (float)n.a(p3), this.getNativeModule(p4).getPaint());
       }
       return;
    }
    public void drawOval(Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKCanvas2D.class, "4")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          a.a(this.f, V8ObjectUtilsQuick.getValue(p0));
          this.mCanvas.drawOval(this.f, this.getNativeModule(p1).getPaint());
       }
       return;
    }
    public void drawPath(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKCanvas2D.class, "7")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          this.mCanvas.drawPath(this.getNativeModule(p0).getPath(), this.getNativeModule(p1).getPaint());
       }
       return;
    }
    public void drawRect(Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKCanvas2D.class, "3")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          a.a(this.f, V8ObjectUtilsQuick.getValue(p0));
          this.mCanvas.drawRect(this.f, this.getNativeModule(p1).getPaint());
       }
       return;
    }
    public void drawRoundRect(Object p0,float p1,float p2,V8Object p3){
       if (PatchProxy.isSupport(TKCanvas2D.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), p3, this, TKCanvas2D.class, "6")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          a.a(this.f, V8ObjectUtilsQuick.getValue(p0));
          this.mCanvas.drawRoundRect(this.f, (float)n.a(p1), (float)n.a(p2), this.getNativeModule(p3).getPaint());
       }
       return;
    }
    public void drawText(String p0,float p1,float p2,V8Object p3){
       if (PatchProxy.isSupport(TKCanvas2D.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), p3, this, TKCanvas2D.class, "8")) {
          return;
       }
       if (this.h == null && this.mCanvas != null) {
          if (TextUtils.isEmpty(p0)) {
             return;
          }else {
             this.mCanvas.drawText(p0, (float)n.a(p1), (float)n.a(p2), this.getNativeModule(p3).getPaint());
          }
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKCanvas2D, "17")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.setHasDestroyed();
       if (this.mCanvas != null) {
          if (p1) {
             this.mCanvas = null;
          }else {
             x.f(new TKCanvas2D$a(this));
          }
       }
       return;
    }
    public void restore(){
       if (PatchProxy.applyVoid(null, this, TKCanvas2D.class, "16")) {
          return;
       }
       if (this.h == null) {
          TKCanvas2D tmCanvas = this.mCanvas;
          if (tmCanvas != null) {
             try{
                tmCanvas.restore();
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public void rotate(float p0){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKCanvas2D, "12")) {
          return;
       }
       if (this.h == null) {
          tKCanvas2D = this.mCanvas;
          if (tKCanvas2D != null) {
             tKCanvas2D.rotate(p0);
          }
       }
       return;
    }
    public void save(){
       if (PatchProxy.applyVoid(null, this, TKCanvas2D.class, "15")) {
          return;
       }
       if (this.h == null) {
          TKCanvas2D tmCanvas = this.mCanvas;
          if (tmCanvas != null) {
             tmCanvas.save();
          }
       }
       return;
    }
    public void scale(float p0,float p1){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKCanvas2D, "13")) {
          return;
       }
       if (this.h == null) {
          tKCanvas2D = this.mCanvas;
          if (tKCanvas2D != null) {
             tKCanvas2D.scale(p0, p1);
          }
       }
       return;
    }
    public void setCanvas(Canvas p0){
       this.mCanvas = p0;
    }
    public void setHasDestroyed(){
       this.h = true;
    }
    public void skew(float p0,float p1){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKCanvas2D, "14")) {
          return;
       }
       if (this.h == null) {
          tKCanvas2D = this.mCanvas;
          if (tKCanvas2D != null) {
             tKCanvas2D.skew(p0, p1);
          }
       }
       return;
    }
    public void translate(float p0,float p1){
       TKCanvas2D tKCanvas2D = TKCanvas2D.class;
       if (PatchProxy.isSupport(tKCanvas2D) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKCanvas2D, "11")) {
          return;
       }
       if (this.h == null) {
          tKCanvas2D = this.mCanvas;
          if (tKCanvas2D != null) {
             tKCanvas2D.translate((float)n.a(p0), (float)n.a(p1));
          }
       }
       return;
    }
}
