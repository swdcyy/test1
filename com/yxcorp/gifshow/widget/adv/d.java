package com.yxcorp.gifshow.widget.adv.d;
import com.yxcorp.gifshow.widget.adv.b;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig;
import com.yxcorp.gifshow.widget.adv.d$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import java.lang.Number;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import java.lang.Boolean;
import java.lang.Float;
import android.graphics.Rect;
import android.graphics.Paint;
import com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import android.graphics.Paint$FontMetrics;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import com.yxcorp.gifshow.v3.f;
import java.util.ArrayList;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import com.yxcorp.gifshow.widget.adv.d$b;
import java.lang.Enum;
import android.graphics.Paint$Align;
import java.lang.Integer;
import android.os.Handler;

public class d extends b	// class@00191e
{
    public final TextBubbleConfig A;
    public int B;
    public TextLayoutHelper C;
    public boolean D;
    public Handler E;
    public int u;
    public int v;
    public int w;
    public int x;
    public String y;
    public final BitmapDrawable z;
    public static final String F;

    static {
       d.F = a.a().a().getString(0x7f1009ce);
    }
    public void d(Resources p0,int p1,int p2,float p3,float p4,String p5,TextBubbleConfig p6){
       super(p0, p3, p4);
       boolean b = false;
       this.D = b;
       this.E = new d$a(this);
       p4 = this.h * 2.00f;
       float f = 0x3f666666;
       this.w = (int)(((float)p1 - p4) * f);
       this.x = (int)(((float)p2 - p4) * f);
       this.A = p6;
       Object obj = null;
       if (p6.z != null) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          BitmapDrawable uBitmapDrawa = PatchProxy.applyOneRefs(p6, obj, d.class, "2");
          if (uBitmapDrawa != patchProxyRe) {
          }else {
             TextBubbleConfig r = p6.r;
             if (p6.x != 1) {
                b = r;
             }
             Object obj1 = PatchProxy.applyOneRefs(p6, obj, d.class, "3");
             int i = (obj1 != patchProxyRe)? obj1.intValue(): (int)((((float)p6.B / (float)n.c(a.a().a(), 360.00f)) * ((float)n.P(a.a().a(), (float)n.y(a.a().a())) / 360.00f)) * (float)n.c(a.a().a(), 53.76f));
             Bitmap uBitmap = Bitmap.createBitmap(Math.max(p6.B, 1), Math.max(1, i), Bitmap$Config.ARGB_8888);
             new Canvas(uBitmap).drawColor(b);
             uBitmapDrawa = new BitmapDrawable(a.a().a().getResources(), uBitmap);
          }
          this.z = uBitmapDrawa;
       }else if(p6.c()){
          this.z = f.c(p0, p6.c(), obj);
       }else {
          this.z = obj;
       }
       this.g(p5);
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.a() && this.A.z == null)? true: false;
       return b;
    }
    public b b(){
       return this.e();
    }
    public void c(Canvas p0,float p1,float p2){
       int this;
       int len;
       float f5;
       int i2;
       ArrayList obj;
       Paint$FontMetrics uFontMetrics;
       float f6;
       int len1;
       int i3;
       float f7;
       TextLayoutHelper j;
       int i4;
       TextLayoutHelper textLayoutHe3;
       int i6;
       float f9;
       LinearGradient linearGradie;
       float f13;
       int i7;
       float f14;
       int i9;
       d uod = this;
       Canvas uCanvas = p0;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, d.class, "8")) {
          return;
       }
       p0.save();
       int i = 2;
       uCanvas.translate((float)((- uod.u) / i), (float)((- uod.v) / i));
       TextLayoutHelper textLayoutHe = null;
       this = 3;
       d uod1 = 1;
       d uod2 = null;
       if (uod.z != null) {
          if (!PatchProxy.applyVoidOneRefs(uCanvas, uod, d.class, "9")) {
             Bitmap bitmap = uod.z.getBitmap();
             if (!uod.A.b()[uod2] && (!uod.A.b()[uod1] && (uod.A.b()[i] || uod.A.b()[this]))) {
                i3 = bitmap.getWidth();
                len = bitmap.getHeight();
                i4 = uod.A.b()[uod2];
                i6 = uod.A.b()[uod1];
                i9 = uod.A.b()[i];
                i7 = uod.A.b()[this];
                uCanvas.drawBitmap(bitmap, new Rect(uod2, uod2, i7, i4), new Rect(uod2, uod2, i7, i4), textLayoutHe);
                int i10 = i3 - i6;
                d this2 = uod.u;
                uCanvas.drawBitmap(bitmap, new Rect(i10, uod2, i3, i4), new Rect((this2 - i6), uod2, this2, i4), textLayoutHe);
                this = len - i9;
                uod1 = uod.v;
                int i11 = i4;
                uCanvas.drawBitmap(bitmap, new Rect(uod2, this, i7, len), new Rect(uod2, (uod1 - i9), i7, uod1), textLayoutHe);
                Rect rect = new Rect(i10, this, i3, len);
                d u = uod.u;
                uod2 = uod.v;
                int i12 = i3;
                uCanvas.drawBitmap(bitmap, rect, new Rect((u - i6), (uod2 - i9), u, uod2), textLayoutHe);
                i2 = i11;
                uCanvas.drawBitmap(bitmap, new Rect(i7, 0, i10, i2), new Rect(i7, 0, (uod.u - i6), i2), textLayoutHe);
                rect = new Rect(i7, this, i10, len);
                d v = uod.v;
                uCanvas.drawBitmap(bitmap, rect, new Rect(i7, (v - i9), (uod.u - i6), v), textLayoutHe);
                uCanvas.drawBitmap(bitmap, new Rect(0, i2, i7, this), new Rect(0, i2, i7, (uod.v - i9)), textLayoutHe);
                v = uod.u;
                uCanvas.drawBitmap(bitmap, new Rect(i10, i2, i12, this), new Rect((v - i6), i2, v, (uod.v - i9)), textLayoutHe);
                rect = new Rect(i7, i2, i10, this);
                uCanvas.drawBitmap(bitmap, rect, super(i7, i2, (uod.u - i6), (uod.v - i9)), textLayoutHe);
             }else {
                uod.z.setBounds(uod2, uod2, uod.u, uod.v);
                uod.z.draw(uCanvas);
             }
          }
          this = 2;
          uCanvas.translate((float)(uod.A.a()[3] + ((((uod.u - uod.A.a()[1]) - uod.A.a()[3]) - uod.C.l()) / this)), (float)(uod.A.a()[0] + ((((uod.v - uod.A.a()[0]) - uod.A.a()[this]) - uod.C.f()) / this)));
       }
       uod1 = uod.C;
       Objects.requireNonNull(uod1);
       TextLayoutHelper textLayoutHe1 = TextLayoutHelper.class;
       if (!PatchProxy.applyVoidOneRefs(uCanvas, uod1, textLayoutHe1, "7")) {
          float TextLayoutHelper this1 = 2.00f;
          float f = 0.00f;
          TextLayoutHelper textLayoutHe2 = 4;
          float f1 = 0;
          if (TextUtils.isEmpty(uod1.h)) {
             if (!PatchProxy.applyVoidOneRefs(uCanvas, uod1, textLayoutHe1, "6") && uod1.x != null) {
                textLayoutHe1 = uod1.t;
                if (textLayoutHe1 != textLayoutHe2 && textLayoutHe1 != f) {
                   p0.save();
                   uCanvas.translate((float)(uod1.k / 2), f1);
                   if (uod1.G != null) {
                      uod1.x.setStrokeWidth(this1);
                      p0.drawLine(0, 0, 0, (float)uod1.l, uod1.x);
                   }
                   long l = System.currentTimeMillis();
                   if ((l - uod1.H) - uod1.I >= 0) {
                      uod1.G = uod1.G ^ 1;
                      uod1.H = l;
                   }
                   p0.restore();
                }
             }
          }else {
             TextLayoutHelper f2 = uod1.f;
             TextLayoutHelper i1 = uod1.i;
             len = (i1 != null)? i1.length: 1;
             float f3 = f2 * (float)len;
             float f4 = ((float)uod1.l - f3) / this1;
             Paint$FontMetrics ascent = uod1.j.getFontMetrics().ascent;
             p0.save();
             if (uod1.i == null) {
                String[] stringArray = new String[0];
                uod1.i = stringArray;
             }
             i1 = uod1.g;
             if (i1 == TextBubbleConfig$ScaleMode.FREE) {
                if (uod1.t == 3) {
                   uCanvas.translate((float)uod1.k, f1);
                   f5 = ((float)uod1.l - f3) / this1;
                }else {
                   f5 = 0;
                }
                if (uod1.t == f) {
                   f5 = (uod1.i.length > 1)? (f5 - ascent) - (float)f.b: f5 - ascent;
                   i2 = 0;
                   f2 = uod1.i;
                   while (i2 < f2.length) {
                      uCanvas.drawText(f2[i2], f1, f5, uod1.j);
                      obj = PatchProxy.apply(textLayoutHe, uod1, textLayoutHe1, "35");
                      f3 = (obj != PatchProxyResult.class)? obj.floatValue(): uod1.j.getFontMetrics().descent - uod1.j.getFontMetrics().ascent;
                      this = f.b * 2;
                      f3 = f3 + (float)this;
                      f3 = f3 + (float)f.a;
                      f5 = f5 + f3;
                      i2 = i2 + 1;
                   }
                }else {
                   textLayoutHe1 = uod1.i;
                   i = textLayoutHe1.length;
                   for (i2 = 0; i2 < i; i2 = i2 + 1) {
                      this1 = f5 - ascent;
                      uCanvas.drawText(textLayoutHe1[i2], f1, this1, uod1.j);
                      f5 = f5 + uod1.f;
                   }
                }
             }else if(i1 != TextBubbleConfig$ScaleMode.VERTICAL){
                uCanvas.translate((float)(uod1.k / 2), f1);
                if (uod1.t != 1 || (PatchProxy.isSupport(textLayoutHe1) && PatchProxy.applyVoidTwoRefs(uCanvas, Float.valueOf(f4), uod1, textLayoutHe1, "24"))) {
                   uFontMetrics = ascent;
                   f6 = 0;
                }else {
                   p0.save();
                   obj = new ArrayList();
                   this1 = uod1.i;
                   len = this1.length;
                   i4 = 0;
                   while (i4 < len) {
                      object oobject2 = this1[i4];
                      obj.add(Float.valueOf(uod1.j.measureText(oobject2, 0, oobject2.length())));
                      i4 = i4 + 1;
                      j = 0;
                   }
                   this = obj.size();
                   float f10 = 0x3f800000;
                   float f11 = f10 - uod1.z;
                   j = uod1.f;
                   float f12 = f4;
                   i1 = 1;
                   f13 = 0;
                   i7 = 0;
                   int i8 = 0x3ff0000000000000;
                   while (i7 < this) {
                      f9 = obj.get(i7).floatValue();
                      object oobject3 = uod1.i[i7];
                      if (oobject3.length() != 1 || (oobject3.charAt(0) == 0.00f || !oobject3.length())) {
                         f14 = 0x3f800000;
                         i1 = null;
                      }else {
                         f14 = f9;
                      }
                      if (i1 != null) {
                         f = f14 - f11;
                         if (Math.abs(f) - uod1.z <= 0) {
                            f1 = j + uod1.f;
                            if (f11 - f10 > 0) {
                               f11 = Math.max(f11, f14);
                            }
                         }
                      }
                      f = f11;
                      textLayoutHe2 = f1;
                      if (i1 != null) {
                         f11 = f14 - f;
                         if (Math.abs(f11) - uod1.z > 0) {
                            i1 = null;
                         }
                      }
                      if (i1 == null) {
                         float f15 = f10 - uod1.z;
                         if (f - f15) {
                            if ((double)f - i8 > 0) {
                               f7 = f12;
                               i8 = i7;
                               uFontMetrics = ascent;
                               uod1.d(p0, f13, f, f14, textLayoutHe2, f7);
                            }else {
                               f7 = f12;
                               i8 = i7;
                               uFontMetrics = ascent;
                               f6 = 0;
                            }
                            f12 = f7 + textLayoutHe2;
                            f13 = f;
                         }else {
                            i8 = i7;
                            uFontMetrics = ascent;
                            f6 = 0;
                         }
                         f11 = f14;
                         j = uod1.f;
                         i1 = 1;
                      }else {
                         i8 = i7;
                         uFontMetrics = ascent;
                         f11 = f;
                         j = textLayoutHe2;
                      }
                      i7 = i8 + 1;
                      ascent = uFontMetrics;
                      char c = 4;
                   }
                   f7 = f12;
                   uFontMetrics = ascent;
                   f6 = 0;
                   if ((double)f11 - i8 > 0) {
                      uod1.d(p0, f13, f11, 0, j, (float)Math.floor((double)f7));
                   }
                   p0.restore();
                }
                f2 = uod1.i;
                len1 = f2.length;
                this1 = f4;
                i3 = 0;
                while (i3 < len1) {
                   object oobject = f2[i3];
                   f7 = this1 - uFontMetrics;
                   j = uod1.j;
                   i4 = 6;
                   if (PatchProxy.isSupport(textLayoutHe1)) {
                      Object[] objArray = new Object[i4];
                      objArray[0] = uCanvas;
                      objArray[1] = oobject;
                      objArray[2] = Float.valueOf(f6);
                      objArray[3] = Float.valueOf(f7);
                      objArray[4] = j;
                      objArray[5] = Float.valueOf(f4);
                      if (PatchProxy.applyVoid(objArray, uod1, textLayoutHe1, "12")) {
                         oobject = 0;
                      }else {
                      label_0425 :
                         i6 = 0x41200000;
                         if (uod1.o != null || uod1.p != null) {
                            float f8 = 0;
                            if (PatchProxy.isSupport(textLayoutHe1)) {
                               objArray = new Object[i4];
                               objArray[0] = uCanvas;
                               objArray[1] = oobject;
                               objArray[2] = Float.valueOf(f8);
                               objArray[3] = Float.valueOf(f7);
                               objArray[4] = j;
                               objArray[5] = Float.valueOf(f4);
                               if (PatchProxy.applyVoid(objArray, uod1, textLayoutHe1, "11")) {
                               label_04d1 :
                                  int i5 = 0;
                               label_0587 :
                                  this1 = this1 + uod1.f;
                                  i3 = i3 + 1;
                                  f6 = 0;
                               }
                            }else {
                               textLayoutHe3 = 3;
                            }
                            i1 = uod1.n;
                            if (i1 != null) {
                               j.setColor(i1);
                               j.setStrokeJoin(Paint$Join.ROUND);
                               j.setStrokeMiter(i6);
                               j.setStrokeWidth((float)TextLayoutHelper.c(3.00f));
                               j.setShader(null);
                               j.setStyle(Paint$Style.STROKE);
                               p0.drawText(oobject, 0, oobject.length(), 0, f7, j);
                               j.setColor(uod1.m);
                               j.setStyle(Paint$Style.FILL);
                               j.setStrokeWidth(0);
                               j.setFakeBoldText(false);
                               f9 = uod1.f + f4;
                               linearGradie = new LinearGradient(0, f4, 0, f9, uod1.o, uod1.p, Shader$TileMode.REPEAT);
                               j.setShader(i1);
                               p0.drawText(oobject, 0, oobject.length(), 0, f7, j);
                               goto label_0587 ;
                            }else {
                               f9 = uod1.f + f4;
                               linearGradie = new LinearGradient(0, f4, 0, f9, uod1.o, uod1.p, Shader$TileMode.REPEAT);
                               j.setShader(i1);
                               p0.drawText(oobject, 0, oobject.length(), 0, f7, j);
                               goto label_0587 ;
                            }
                         }else {
                            i1 = uod1.n;
                            if (i1 != null) {
                               j.setColor(i1);
                               j.setStrokeJoin(Paint$Join.ROUND);
                               j.setStrokeMiter(i6);
                               j.setStrokeWidth((float)TextLayoutHelper.c(0x3fe66666));
                               j.setStyle(Paint$Style.FILL_AND_STROKE);
                               object oobject1 = oobject;
                               p0.drawText(oobject1, 0, oobject.length(), 0, f7, j);
                               j.setColor(uod1.m);
                               j.setStyle(Paint$Style.FILL);
                               j.setStrokeWidth(0);
                               j.setFakeBoldText(false);
                               p0.drawText(oobject1, 0, oobject.length(), 0, f7, j);
                            }else {
                               p0.drawText(oobject, 0, oobject.length(), 0, f7, j);
                            }
                         }
                      }
                   }else {
                      goto label_0425 ;
                   }
                   textLayoutHe3 = 3;
                   goto label_04d1 ;
                }
             }else {
                uFontMetrics = ascent;
                f2 = uod1.i;
                float f16 = (float)(uod1.k / (f2[0]).codePointCount(0, (f2[0]).length()));
                f2 = uod1.i;
                len1 = f2.length;
                for (this = 0; this < len1; this++) {
                   object oobject4 = f2[this];
                   len = 0;
                   i4 = 0;
                   while (len < oobject4.codePointCount(0, oobject4.length())) {
                      p0.save();
                      f13 = (float)len + 0x3f000000;
                      f13 = f13 * f16;
                      uCanvas.translate(f13, 0);
                      i9 = oobject4.offsetByCodePoints(i4, 1);
                      float f17 = f4 - uFontMetrics;
                      uCanvas.drawText(oobject4.substring(i4, i9), 0, f17, uod1.j);
                      p0.restore();
                      len = len + 1;
                      i4 = i9;
                   }
                   f4 = f4 + uod1.f;
                }
             }
             p0.restore();
          }
       }
    label_05e8 :
       p0.restore();
       return;
    }
    public Object clone(){
       return this.e();
    }
    public d e(){
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.b();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof d) {
          return b;
       }
       if (!super.equals(p0)) {
          return b;
       }
       if (p0.y == this.y && (p0.u == this.u && (p0.v == this.v && (p0.B == this.B && (p0.z == this.z && p0.A == this.A))))) {
          b = true;
       }
    label_0047 :
       return b;
    }
    public void f(){
       int intrinsicWid;
       TextBubbleConfig$ScaleMode scaleMode;
       TextLayoutHelper textLayoutHe2;
       int i6;
       TextLayoutHelper textLayoutHe = this;
       if (PatchProxy.applyVoid(null, textLayoutHe, d.class, "5")) {
          return;
       }
       d z = textLayoutHe.z;
       d uod = 4;
       int i = 1;
       if (z != null) {
          intrinsicWid = z.getIntrinsicWidth();
          int intrinsicHei = textLayoutHe.z.getIntrinsicHeight();
          int i1 = 2;
          int i2 = 3;
          int i3 = (intrinsicWid - textLayoutHe.A.a()[i]) - textLayoutHe.A.a()[i2];
          int i4 = (intrinsicHei - textLayoutHe.A.a()[i1]) - textLayoutHe.A.a()[0];
          int i5 = d$b.a[textLayoutHe.A.d().ordinal()];
          if (i5 != i) {
             if (i5 != i1) {
                if (i5 != i2) {
                   if (i5 == uod) {
                      d a = textLayoutHe.A;
                      scaleMode = a.d();
                      a = textLayoutHe.A;
                      textLayoutHe2 = new TextLayoutHelper(textLayoutHe.y, textLayoutHe.A.e(), a.t, a.u, a.v, i3, i4, textLayoutHe.w, textLayoutHe.x, scaleMode, a.z, textLayoutHe.B, a.x, 0, a.f.ordinal());
                      textLayoutHe.C = i5;
                      if (textLayoutHe.A.z != null) {
                         intrinsicWid = (i5.l() + textLayoutHe.A.a()[1]) + textLayoutHe.A.a()[3];
                         i6 = textLayoutHe.C.f() + textLayoutHe.A.a()[0];
                         i = textLayoutHe.A.a()[2];
                      }else {
                         float f = (float)i5.l() / (float)i3;
                         intrinsicWid = (int)((float)intrinsicWid * f);
                         intrinsicHei = (int)((float)intrinsicHei * f);
                      }
                   }
                }else {
                   uod = textLayoutHe.A;
                   scaleMode = uod.d();
                   uod = textLayoutHe.A;
                   textLayoutHe2 = new TextLayoutHelper(textLayoutHe.y, textLayoutHe.A.e(), uod.t, uod.u, uod.v, i3, i4, i3, textLayoutHe.x, scaleMode, uod.z, textLayoutHe.B, uod.x, 0, uod.f.ordinal());
                   textLayoutHe.C = intrinsicWid;
                   intrinsicWid = (intrinsicWid.l() + textLayoutHe.A.a()[1]) + textLayoutHe.A.a()[3];
                   i6 = textLayoutHe.C.f() + textLayoutHe.A.a()[0];
                   i = textLayoutHe.A.a()[2];
                }
             }else {
                uod = textLayoutHe.A;
                scaleMode = uod.d();
                uod = textLayoutHe.A;
                textLayoutHe2 = new TextLayoutHelper(textLayoutHe.y, textLayoutHe.A.e(), uod.t, uod.u, uod.v, i3, i4, textLayoutHe.w, i4, scaleMode, uod.z, textLayoutHe.B, uod.x, 0, uod.f.ordinal());
                textLayoutHe.C = intrinsicWid;
                intrinsicWid = (intrinsicWid.l() + textLayoutHe.A.a()[1]) + textLayoutHe.A.a()[3];
                i6 = textLayoutHe.C.f() + textLayoutHe.A.a()[0];
                i = textLayoutHe.A.a()[2];
             }
             intrinsicHei = i6 + i;
          }else {
             d a1 = textLayoutHe.A;
             scaleMode = a1.d();
             a1 = textLayoutHe.A;
             textLayoutHe2 = new TextLayoutHelper(textLayoutHe.y, textLayoutHe.A.e(), a1.t, a1.u, a1.v, i3, i4, i3, i4, scaleMode, a1.z, textLayoutHe.B, a1.x, 0, a1.f.ordinal());
             textLayoutHe.C = uod;
          }
          if (intrinsicWid != textLayoutHe.u || intrinsicHei != textLayoutHe.v) {
             textLayoutHe.u = intrinsicWid;
             textLayoutHe.v = intrinsicHei;
             this.d();
          }
       }else {
          uod = textLayoutHe.A;
          d w = textLayoutHe.w;
          TextBubbleConfig$ScaleMode scaleMode1 = uod.d();
          uod = textLayoutHe.A;
          TextLayoutHelper textLayoutHe3 = new TextLayoutHelper(textLayoutHe.y, textLayoutHe.A.e(), uod.t, uod.u, uod.v, (int)((float)w * 0x3f19999a), (int)((float)w * 0.10f), w, textLayoutHe.x, scaleMode1, uod.z, textLayoutHe.B, uod.x, 0, uod.f.ordinal());
          textLayoutHe.C = z;
          intrinsicWid = z.l();
          i6 = textLayoutHe.C.f();
          if (intrinsicWid != textLayoutHe.u || i6 != textLayoutHe.v) {
             textLayoutHe.u = intrinsicWid;
             textLayoutHe.v = i6;
             this.d();
          }
       }
       z = textLayoutHe.A;
       if (z.x == 1) {
          uod = textLayoutHe.C;
          if (uod != null) {
             TextBubbleConfig r = z.r;
             TextBubbleConfig y = z.y;
             Objects.requireNonNull(uod);
             TextLayoutHelper textLayoutHe1 = TextLayoutHelper.class;
             if (!PatchProxy.isSupport(textLayoutHe1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(r), Integer.valueOf(y), uod, textLayoutHe1, "1")) {
                textLayoutHe1 = uod.t;
                if (textLayoutHe1 == 1 || (textLayoutHe1 == 4 || textLayoutHe1 == 5)) {
                   uod.v = r;
                   uod.w = y;
                   Paint paint = new Paint();
                   uod.x = paint;
                   paint.setColor(uod.v);
                   uod.x.setStyle(Paint$Style.FILL);
                   uod.x.setAntiAlias(true);
                   uod.z = (float)(uod.w * 4);
                   uod.n(uod.g);
                }
             }
          }
       }
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (TextUtils.isEmpty(p0) && this.A.x == 1) {
          this.E.sendEmptyMessage(1);
          this.D = true;
       }else {
          this.E.removeMessages(1);
          this.D = false;
       }
       this.y = p0;
       this.f();
       return;
    }
    public int getIntrinsicHeight(){
       return this.v;
    }
    public int getIntrinsicWidth(){
       return this.u;
    }
    public void onBoundsChange(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       super.onBoundsChange(p0);
       if (this.z == null) {
          this.f();
       }
       return;
    }
}
