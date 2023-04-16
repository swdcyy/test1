package com.tachikoma.component.canvas.TKPaint;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.graphics.Paint;
import iq8.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Shader;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import java.lang.Float;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.Paint$Cap;
import java.lang.CharSequence;
import android.text.TextUtils;
import iq8.p;
import android.graphics.Color;
import android.content.Context;
import wo8.b;
import android.graphics.Typeface;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import android.graphics.Paint$Join;
import com.tkruntime.v8.V8Array;
import java.util.List;
import java.lang.Number;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.RadialGradient;
import android.graphics.Paint$Style;
import nn8.a;
import android.graphics.Paint$Align;

public class TKPaint extends TKBaseNativeModule	// class@000cdc
{
    public DashPathEffect A;
    public Shader B;
    public LinearGradient C;
    public float D;
    public float E;
    public float F;
    public float G;
    public List H;
    public List I;
    public RadialGradient J;
    public float K;
    public float L;
    public float M;
    public List N;
    public List O;
    public float P;
    public float Q;
    public float R;
    public String S;
    public final Paint f;
    public boolean g;
    public String h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int n;
    public float o;
    public float p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public float u;
    public float v;
    public String w;
    public int x;
    public List y;
    public float z;

    public void TKPaint(f p0){
       super(p0);
       Paint paint = new Paint(1);
       this.f = paint;
       this.i = 255;
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 4.00f;
       this.p = 12.00f;
       this.u = 0;
       this.v = 0;
       this.x = -1;
       paint.setTextSize((float)n.b(12));
       paint.setStrokeWidth((float)n.b(1));
    }
    public void clearGradient(){
       if (PatchProxy.applyVoid(null, this, TKPaint.class, "20")) {
          return;
       }
       this.d(null);
       return;
    }
    public void clearShadowLayer(){
       if (PatchProxy.applyVoid(null, this, TKPaint.class, "23")) {
          return;
       }
       this.setShadowLayer(0, 0, 0, null);
       return;
    }
    public final void d(Shader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPaint.class, "21")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (p0 == this.B) {
          return;
       }
       this.B = p0;
       this.f.setShader(p0);
       return;
    }
    public Paint getPaint(){
       return this.f;
    }
    public Map measureText(String p0){
       float f1;
       float f3;
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TKPaint.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g != null) {
          return null;
       }
       obj = new HashMap();
       float f = this.f.measureText(p0);
       Paint$FontMetrics fontMetrics = this.f.getFontMetrics();
       Paint$FontMetrics uFontMetrics = null;
       if (fontMetrics != null) {
          f1 = Math.abs(fontMetrics.leading) + Math.abs(fontMetrics.ascent);
          float f2 = f1;
          f1 = Math.abs(fontMetrics.descent) + f1;
          f3 = f2;
       }else {
          f3 = 0;
       }
       obj.put("height", Float.valueOf(n.g(f1)));
       obj.put("width", Float.valueOf(n.g(f)));
       obj.put("baseLineY", Float.valueOf(n.g(f3)));
       return obj;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKPaint, "26")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.g = true;
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TKPaint.class, "25")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       this.f.reset();
       this.f.setFlags(1);
       this.f.setTextSize((float)n.b(12));
       this.f.setStrokeWidth((float)n.b(1));
       this.h = null;
       this.i = 255;
       this.j = 0x3f800000;
       this.m = 0;
       this.n = 0;
       this.l = 0;
       this.k = 0x3f800000;
       this.o = 4.00f;
       this.r = false;
       this.q = null;
       this.v = 0;
       this.s = false;
       this.t = false;
       this.p = 12.00f;
       this.u = 0;
       this.w = null;
       this.x = -1;
       this.B = null;
       this.A = null;
       this.y = null;
       this.z = 0;
       this.P = 0;
       this.Q = 0;
       this.R = 0;
       this.S = null;
       return;
    }
    public void setAlpha(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "2")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.j - p0) {
          return;
       }
       this.j = p0;
       this.f.setAlpha((int)((float)this.i * p0));
       return;
    }
    public void setBoldText(boolean p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKPaint, "10")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.r == p0) {
          return;
       }
       this.r = p0;
       this.f.setFakeBoldText(p0);
       return;
    }
    public void setCap(int p0){
       Paint$Cap bUTT;
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPaint, "5")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.m == p0) {
          return;
       }
       this.m = p0;
       tKPaint = this.f;
       if (p0 != 1) {
          bUTT = (p0 != 2)? Paint$Cap.BUTT: Paint$Cap.SQUARE;
       }else {
          bUTT = Paint$Cap.ROUND;
       }
       tKPaint.setStrokeCap(bUTT);
       return;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPaint.class, "1")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (TextUtils.equals(this.h, p0)) {
          return;
       }
       this.h = p0;
       int i = p.b(p0);
       this.i = Color.alpha(i);
       this.f.setColor(i);
       this.f.setAlpha((int)((float)this.i * this.j));
       return;
    }
    public void setFontFamily(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPaint.class, "9")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (TextUtils.equals(p0, this.q)) {
          return;
       }
       this.q = p0;
       TKPaint tf = this.f;
       Context context = this.getContext();
       String rootDir = this.getRootDir();
       Typeface typeface = PatchProxy.applyThreeRefs(context, p0, rootDir, null, b.class, "1");
       if (typeface != PatchProxyResult.class) {
       }else if(TextUtils.isEmpty(p0)){
          typeface = null;
       }else {
          b = -1;
          switch (p0.hashCode()){
              case 0xaaa60c03:
                if (p0.equals("monospace")) {
                   b = 3;
                }
                break;
              case 0xc206bce7:
                if (p0.equals("normal")) {
                   b = false;
                }
                break;
              case 0x35c093:
                if (p0.equals("sans")) {
                   b = true;
                }
                break;
              case 0x684317d:
                if (p0.equals("serif")) {
                   b = 2;
                }
                break;
              default:
          }
       label_0079 :
          if (b) {
             if (b != 1) {
                if (b != 2) {
                   if (b != 3) {
                      typeface = (p0.endsWith(".ttf") || p0.endsWith(".otf"))? b.b(context, p0, 0, rootDir): null;
                      if (typeface == null) {
                         typeface = b.b(context, p0+".ttf", 0, rootDir);
                      }
                      if (typeface == null) {
                         typeface = b.b(context, p0+".otf", 0, rootDir);
                      }
                   }else {
                      typeface = Typeface.MONOSPACE;
                   }
                }else {
                   typeface = Typeface.SERIF;
                }
             }else {
                typeface = Typeface.SANS_SERIF;
             }
          }else {
             typeface = Typeface.DEFAULT;
          }
       }
       tf.setTypeface(typeface);
       return;
    }
    public void setJoin(int p0){
       Paint$Join mITER;
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPaint, "6")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.n == p0) {
          return;
       }
       this.n = p0;
       tKPaint = this.f;
       if (p0 != 1) {
          mITER = (p0 != 2)? Paint$Join.MITER: Paint$Join.ROUND;
       }else {
          mITER = Paint$Join.BEVEL;
       }
       tKPaint.setStrokeJoin(mITER);
       return;
    }
    public void setLetterSpacing(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "14")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.v - p0) {
          return;
       }
       this.v = p0;
       this.f.setLetterSpacing(p0);
       return;
    }
    public void setLineDash(V8Array p0,float p1){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, tKPaint, "17")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       List list = null;
       if (p0 == null) {
          this.y = list;
          this.z = p1;
       }else {
          List list1 = p0.getList();
          if (this.z - p1 || !list1.equals(this.y)) {
             if (list1.size() < 2) {
                this.y = list1;
             }else {
                float[] uofloatArray = new float[list1.size()];
                for (int i = 0; i < list1.size(); i = i + 1) {
                   uofloatArray[i] = (float)n.a(list1.get(i).floatValue());
                }
                this.y = list1;
                list = new DashPathEffect(uofloatArray, (float)n.a(p1));
             }
             this.z = p1;
          }else {
             list = this.A;
          }
          if (list == this.A) {
             return;
          }else {
             this.A = list;
          }
       }
       this.f.setPathEffect(list);
       return;
    }
    public void setLinearGradient(float p0,float p1,float p2,float p3,V8Array p4,V8Array p5){
       LinearGradient linearGradie = this;
       float f = p0;
       float f1 = p1;
       float f2 = p2;
       float f3 = p3;
       TKPaint tKPaint = TKPaint.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(tKPaint)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, linearGradie, tKPaint, "18")) {
             return;
          }
       }
       if (linearGradie.g != null) {
          return;
       }else {
          List list = p4.getList();
          int i2 = 0;
          List list1 = (p5 != null)? p5.getList(): i2;
          if (!list1) {
             if (linearGradie.H != null) {
                i = 0;
             }
          }else {
             i = list1.equals(linearGradie.H);
          }
          if (linearGradie.C != null && (!linearGradie.D - f && (!linearGradie.E - f1 && (!linearGradie.F - f2 && (!linearGradie.G - f3 && (!i || !list.equals(linearGradie.I))))))) {
             if (list1) {
                i2 = new float[list1.size()];
                i = list1.size();
                for (int i3 = 0; i3 < i; i3 = i3 + 1) {
                   i2[i3] = list1.get(i3).floatValue();
                }
             }
             int i4 = i2;
             int[] ointArray = new int[list.size()];
             i = list.size();
             for (; i1 < i; i1 = i1 + 1) {
                ointArray[i1] = p.b(list.get(i1));
             }
             LinearGradient linearGradie1 = new LinearGradient((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), (float)n.a(p3), ointArray, i4, Shader$TileMode.CLAMP);
             linearGradie.C = i;
             linearGradie.D = f;
             linearGradie.E = f1;
             linearGradie.F = f2;
             linearGradie.G = f3;
             linearGradie.H = list1;
             linearGradie.I = list;
          }
          linearGradie.d(linearGradie.C);
          return;
       }
    }
    public void setPorterDuffMode(int p0){
       PorterDuff$Mode cLEAR;
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPaint, "16")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.x == p0) {
          return;
       }
       this.x = p0;
       tKPaint = null;
       switch (p0){
           case 0:
             cLEAR = PorterDuff$Mode.CLEAR;
             break;
           case 1:
             cLEAR = PorterDuff$Mode.SRC;
             break;
           case 2:
             cLEAR = PorterDuff$Mode.DST;
             break;
           case 3:
             cLEAR = PorterDuff$Mode.SRC_OVER;
             break;
           case 4:
             cLEAR = PorterDuff$Mode.DST_OVER;
             break;
           case 5:
             cLEAR = PorterDuff$Mode.SRC_IN;
             break;
           case 6:
             cLEAR = PorterDuff$Mode.DST_IN;
             break;
           case 7:
             cLEAR = PorterDuff$Mode.SRC_OUT;
             break;
           case 8:
             cLEAR = PorterDuff$Mode.DST_OUT;
             break;
           case 9:
             cLEAR = PorterDuff$Mode.SRC_ATOP;
             break;
           case 10:
             cLEAR = PorterDuff$Mode.DST_ATOP;
             break;
           case 11:
             cLEAR = PorterDuff$Mode.XOR;
             break;
           case 14:
             cLEAR = PorterDuff$Mode.SCREEN;
             break;
           case 15:
             cLEAR = PorterDuff$Mode.OVERLAY;
             break;
           case 16:
             cLEAR = PorterDuff$Mode.DARKEN;
             break;
           case 17:
             cLEAR = PorterDuff$Mode.LIGHTEN;
             break;
           default:
          label_0025 :
             cLEAR = tKPaint;
       }
       if (cLEAR != null) {
          this.f.setXfermode(new PorterDuffXfermode(cLEAR));
       }else {
          this.f.setXfermode(tKPaint);
       }
       return;
    }
    public void setRadialGradient(float p0,float p1,float p2,V8Array p3,V8Array p4){
       RadialGradient radialGradie = this;
       float f = p0;
       float f1 = p1;
       float f2 = p2;
       TKPaint tKPaint = TKPaint.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(tKPaint)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, radialGradie, tKPaint, "19")) {
             return;
          }
       }
       if (radialGradie.g != null) {
          return;
       }else {
          List list = p3.getList();
          int i2 = 0;
          List list1 = (p4 != null)? p4.getList(): i2;
          if (!list1) {
             if (radialGradie.N != null) {
                i = 0;
             }
          }else {
             i = list1.equals(radialGradie.N);
          }
          if (radialGradie.J != null && (!radialGradie.K - f && (!radialGradie.L - f1 && (!radialGradie.M - f2 && (!i || !list.equals(radialGradie.O)))))) {
             if (list1) {
                i2 = new float[list1.size()];
                i = list1.size();
                for (int i3 = 0; i3 < i; i3 = i3 + 1) {
                   i2[i3] = list1.get(i3).floatValue();
                }
             }
             int i4 = i2;
             int[] ointArray = new int[list.size()];
             i2 = list.size();
             for (; i1 < i2; i1 = i1 + 1) {
                ointArray[i1] = p.b(list.get(i1));
             }
             RadialGradient radialGradie1 = new RadialGradient((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), ointArray, i4, Shader$TileMode.CLAMP);
             radialGradie.J = i2;
             radialGradie.K = f;
             radialGradie.L = f1;
             radialGradie.M = f2;
             radialGradie.N = list1;
             radialGradie.O = list;
          }
          radialGradie.d(radialGradie.J);
          return;
       }
    }
    public void setShadowLayer(float p0,float p1,float p2,String p3){
       if (PatchProxy.isSupport(TKPaint.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), p3, this, TKPaint.class, "22")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.P - p0 && (!this.Q - p1 && (!this.R - p2 && TextUtils.equals(this.S, p3)))) {
          return;
       }
       this.P = p0;
       this.Q = p1;
       this.R = p2;
       this.S = p3;
       this.f.setShadowLayer((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), p.b(p3));
       return;
    }
    public void setStrikeThruText(boolean p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKPaint, "11")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.s == p0) {
          return;
       }
       this.s = p0;
       this.f.setStrikeThruText(p0);
       return;
    }
    public void setStrokeJoinMiterLimit(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "7")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.o - p0) {
          return;
       }
       this.o = p0;
       this.f.setStrokeMiter(p0);
       return;
    }
    public void setStrokeWidth(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "3")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.k - p0) {
          return;
       }
       this.k = p0;
       this.f.setStrokeWidth((float)n.a(p0));
       return;
    }
    public void setStyle(int p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKPaint, "4")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.l == p0) {
          return;
       }
       this.l = p0;
       tKPaint = this.f;
       Paint$Style fILL = (p0 != 1)? Paint$Style.FILL: Paint$Style.STROKE;
       tKPaint.setStyle(fILL);
       return;
    }
    public void setTextAlign(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPaint.class, "15")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (TextUtils.equals(this.w, p0)) {
          return;
       }
       this.w = p0;
       TKPaint tf = this.f;
       Paint$Align uAlign = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (uAlign != PatchProxyResult.class) {
       }else if(TextUtils.isEmpty(p0)){
          uAlign = Paint$Align.LEFT;
       }else {
          uAlign = -1;
          int i = p0.hashCode();
          if (i != -1364013995) {
             if (i != 0x32a007) {
                if (i == 0x677c21c && p0.equals("right")) {
                   uAlign = 3;
                }
             }else if(p0.equals("left")){
                uAlign = 1;
             }
          }else if(p0.equals("center")){
             uAlign = 2;
          }
          if (uAlign != 2) {
             if (uAlign != 3) {
                uAlign = Paint$Align.LEFT;
             }else {
                uAlign = Paint$Align.RIGHT;
             }
          }else {
             uAlign = Paint$Align.CENTER;
          }
       }
       tf.setTextAlign(uAlign);
       return;
    }
    public void setTextSize(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "8")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.p - p0) {
          return;
       }
       this.p = p0;
       this.f.setTextSize((float)n.a(p0));
       return;
    }
    public void setTextSkewX(float p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPaint, "13")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (!this.u - p0) {
          return;
       }
       this.u = p0;
       this.f.setTextSkewX(p0);
       return;
    }
    public void setUnderlineText(boolean p0){
       TKPaint tKPaint = TKPaint.class;
       if (PatchProxy.isSupport(tKPaint) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKPaint, "12")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (this.t == p0) {
          return;
       }
       this.t = p0;
       this.f.setUnderlineText(p0);
       return;
    }
}
