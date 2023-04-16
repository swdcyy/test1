package com.facebook.react.views.art.ARTShapeShadowNode;
import kf.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.graphics.Path;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Paint$Style;
import java.lang.StringBuilder;
import cb.a;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import com.facebook.react.bridge.ReadableArray;
import kf.b;
import java.lang.Math;
import android.graphics.Path$Direction;
import android.graphics.RectF;
import java.lang.Integer;

public class ARTShapeShadowNode extends a	// class@001390
{
    public Path g;
    public float[] h;
    public float[] i;
    public float[] j;
    public float k;
    public int l;
    public int m;

    public void ARTShapeShadowNode(){
       super();
       this.k = 0x3f800000;
       this.l = 1;
       this.m = 1;
    }
    public void b(Canvas p0,Paint p1,float p2){
       if (PatchProxy.isSupport(ARTShapeShadowNode.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, ARTShapeShadowNode.class, "8")) {
          return;
       }
       p2 = p2 * this.b;
       if (p2 - 0x3c23d70a > 0) {
          this.d(p0);
          if (this.g != null) {
             if (this.e(p1, p2)) {
                p0.drawPath(this.g, p1);
             }
             if (this.f(p1, p2)) {
                p0.drawPath(this.g, p1);
             }
             this.c(p0);
          }else {
             throw new JSApplicationIllegalArgumentException("Shapes should have a valid path \(d\) prop");
          }
       }
       this.markUpdateSeen();
       return;
    }
    public boolean e(Paint p0,float p1){
       float f6;
       int[] ointArray1;
       float[] uofloatArray1;
       Object obj = this;
       Object obj1 = p0;
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.isSupport(uARTShapeSha)) {
          Object obj2 = PatchProxy.applyTwoRefs(obj1, Float.valueOf(p1), obj, uARTShapeSha, "10");
          if (obj2 != PatchProxyResult.class) {
             return obj2.booleanValue();
          }
       }
       uARTShapeSha = obj.i;
       int i = 0;
       if (uARTShapeSha != null && uARTShapeSha.length > 0) {
          p0.reset();
          int i1 = 1;
          obj1.setFlags(i1);
          obj1.setStyle(Paint$Style.FILL);
          ARTShapeShadowNode i2 = obj.i;
          int i3 = (int)i2[i];
          int i4 = 2;
          int i5 = 4;
          if (i3) {
             String str = "ReactNative";
             if (i3 != i1) {
                a.x(str, "ART: Color type "+i3+" not supported!");
             }else {
                int i6 = 5;
                if (i2.length < i6) {
                   a.x(str, "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received "+obj.i.length);
                   return i;
                }else {
                   a d = obj.d;
                   float f = i2[i1] * d;
                   float f1 = i2[i4] * d;
                   float f2 = i2[3] * d;
                   float f3 = i2[i5] * d;
                   int i7 = (i2.length - i6) / i6;
                   int[] ointArray = null;
                   if (i7 > 0) {
                      ointArray = new int[i7];
                      float[] uofloatArray = new float[i7];
                      while (i < i7) {
                         ARTShapeShadowNode i8 = obj.i;
                         int i9 = i7 * 4;
                         i9 = i9 + i6;
                         i9 = i9 + i;
                         uofloatArray[i] = i8[i9];
                         i9 = i * 4;
                         i9 = i9 + i6;
                         int i10 = i9 + 0;
                         float f4 = i8[i10] * 0x437f0000;
                         int i11 = i9 + 1;
                         float f5 = i8[i11] * 0x437f0000;
                         i11 = i9 + 2;
                         f6 = i8[i11] * 0x437f0000;
                         i9 = i9 + 3;
                         float f7 = i8[i9] * 0x437f0000;
                         ointArray[i] = Color.argb((int)f7, (int)f4, (int)f5, (int)f6);
                         i = i + 1;
                         f5 = 5;
                      }
                      ointArray1 = ointArray;
                      uofloatArray1 = uofloatArray;
                   }else {
                      ointArray1 = ointArray;
                      uofloatArray1 = ointArray1;
                   }
                   LinearGradient linearGradie = new LinearGradient(f, f1, f2, f3, ointArray1, uofloatArray1, Shader$TileMode.CLAMP);
                   obj1.setShader(i1);
                }
             }
             i = true;
          }else if(i2.length > i5){
             f6 = (i2[i5] * p1) * 0x437f0000;
          }else {
             f6 = p1 * 0x437f0000;
          }
          i = 1;
          obj1.setARGB((int)f6, (int)(i2[i] * 0x437f0000), (int)(i2[i4] * 0x437f0000), (int)(i2[3] * 0x437f0000));
       }
       return i;
    }
    public boolean f(Paint p0,float p1){
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.isSupport(uARTShapeSha)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uARTShapeSha, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.k) {
          uARTShapeSha = this.h;
          if (uARTShapeSha != null && uARTShapeSha.length) {
             p0.reset();
             int i = 1;
             p0.setFlags(i);
             p0.setStyle(Paint$Style.STROKE);
             ARTShapeShadowNode tl = this.l;
             String str = " unrecognized";
             if (tl != null) {
                if (tl != i) {
                   if (tl == 2) {
                      p0.setStrokeCap(Paint$Cap.SQUARE);
                   }else {
                      throw new JSApplicationIllegalArgumentException("strokeCap "+this.l+str);
                   }
                }else {
                   p0.setStrokeCap(Paint$Cap.ROUND);
                }
             }else {
                p0.setStrokeCap(Paint$Cap.BUTT);
             }
             tl = this.m;
             if (tl != null) {
                if (tl != i) {
                   if (tl == 2) {
                      p0.setStrokeJoin(Paint$Join.BEVEL);
                   }else {
                      throw new JSApplicationIllegalArgumentException("strokeJoin "+this.m+str);
                   }
                }else {
                   p0.setStrokeJoin(Paint$Join.ROUND);
                }
             }else {
                p0.setStrokeJoin(Paint$Join.MITER);
             }
             p0.setStrokeWidth((this.k * this.d));
             tl = this.h;
             float f = (tl.length > 3)? (tl[3] * p1) * 0x437f0000: p1 * 0x437f0000;
             p0.setARGB((int)f, (int)(tl[b] * 0x437f0000), (int)(tl[i] * 0x437f0000), (int)(tl[2] * 0x437f0000));
             ARTShapeShadowNode tj = this.j;
             if (tj != null && tj.length > 0) {
                p0.setPathEffect(new DashPathEffect(this.j, 0));
             }
             return i;
          }
       }
       return b;
    }
    public void setFill(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTShapeShadowNode.class, "4")) {
          return;
       }
       this.i = b.b(p0);
       this.markUpdated();
       return;
    }
    public void setShapePath(ReadableArray p0){
       float f;
       float f1;
       int i3;
       float f2;
       int i4;
       float f3;
       float f4;
       int i6;
       float f5;
       float f6;
       a td1;
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uARTShapeSha, "1")) {
          return;
       }
       float[] uofloatArray = b.b(p0);
       Path path = PatchProxy.applyOneRefs(uofloatArray, this, uARTShapeSha, "11");
       if (path != PatchProxyResult.class) {
       }else {
          path = new Path();
          path.moveTo(0, 0);
          int i = 0;
          while (i < uofloatArray.length) {
             int i1 = i + 1;
             i = (int)uofloatArray[i];
             if (i) {
                Path$Direction uDirection = 1;
                if (i != uDirection) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i == 4) {
                            i = i1 + 1;
                            a td = this.d;
                            f = uofloatArray[i1] * td;
                            int i2 = i + 1;
                            f1 = uofloatArray[i] * td;
                            i3 = i2 + 1;
                            f2 = uofloatArray[i2] * td;
                            i4 = i3 + 1;
                            f3 = (float)Math.toDegrees((double)uofloatArray[i3]);
                            int i5 = i4 + 1;
                            f4 = (float)Math.toDegrees((double)uofloatArray[i4]);
                            i6 = i5 + 1;
                            if (!uofloatArray[i5] - 0x3f800000) {
                               uDirection = null;
                            }
                            f4 = f4 - f3;
                            f5 = 360.00f;
                            if (Math.abs(f4) - f5 >= 0) {
                               uDirection = (uDirection)? Path$Direction.CCW: Path$Direction.CW;
                               path.addCircle(f, f1, f2, uDirection);
                            }else {
                               f4 = f4 % f5;
                               if (f4 < 0) {
                                  f4 = f4 + f5;
                               }
                               if (uDirection != null && f4 - f5 < 0) {
                                  f5 = f5 - f4;
                                  f4 = f5 * 0xbf800000;
                               }
                               f6 = f - f2;
                               f5 = f1 - f2;
                               f = f + f2;
                               f1 = f1 + f2;
                               path.arcTo(new RectF(f6, f5, f, f1), f3, f4);
                            }
                         }else {
                            throw new JSApplicationIllegalArgumentException("Unrecognized drawing instruction "+i);
                         }
                      }else {
                         i = i1 + 1;
                         td1 = this.d;
                         f = uofloatArray[i1] * td1;
                         i4 = i + 1;
                         f2 = uofloatArray[i] * td1;
                         i = i4 + 1;
                         f4 = uofloatArray[i4] * td1;
                         i3 = i + 1;
                         f6 = uofloatArray[i] * td1;
                         i = i3 + 1;
                         f3 = uofloatArray[i3] * td1;
                         i6 = i + 1;
                         f5 = uofloatArray[i] * td1;
                         float f7 = f2;
                         f2 = f6;
                         path.cubicTo(f, f7, f4, f2, f3, f5);
                      }
                      i = i6;
                   }else {
                      i = i1 + 1;
                      td1 = this.d;
                      f = uofloatArray[i1] * td1;
                      i4 = i + 1;
                      f1 = uofloatArray[i] * td1;
                      path.lineTo(f, f1);
                   }
                }else {
                   path.close();
                   i = i1;
                }
             }else {
                i = i1 + 1;
                td1 = this.d;
                f = uofloatArray[i1] * td1;
                i4 = i + 1;
                f1 = uofloatArray[i] * td1;
                path.moveTo(f, f1);
             }
             i = i4;
          }
       }
       this.g = path;
       this.markUpdated();
       return;
    }
    public void setStroke(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTShapeShadowNode.class, "2")) {
          return;
       }
       this.h = b.b(p0);
       this.markUpdated();
       return;
    }
    public void setStrokeCap(int p0){
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.isSupport(uARTShapeSha) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uARTShapeSha, "6")) {
          return;
       }
       this.l = p0;
       this.markUpdated();
       return;
    }
    public void setStrokeDash(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTShapeShadowNode.class, "3")) {
          return;
       }
       this.j = b.b(p0);
       this.markUpdated();
       return;
    }
    public void setStrokeJoin(int p0){
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.isSupport(uARTShapeSha) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uARTShapeSha, "7")) {
          return;
       }
       this.m = p0;
       this.markUpdated();
       return;
    }
    public void setStrokeWidth(float p0){
       ARTShapeShadowNode uARTShapeSha = ARTShapeShadowNode.class;
       if (PatchProxy.isSupport(uARTShapeSha) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uARTShapeSha, "5")) {
          return;
       }
       this.k = p0;
       this.markUpdated();
       return;
    }
}
