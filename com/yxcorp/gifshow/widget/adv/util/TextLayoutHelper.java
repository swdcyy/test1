package com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper;
import java.lang.String;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;
import android.graphics.Typeface;
import java.lang.Integer;
import java.lang.Number;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Float;
import java.util.List;
import java.lang.Boolean;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Character;
import com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper$TextLayoutSplitTextException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.util.PostUtils;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Path;
import com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper$a;
import java.lang.Enum;
import java.util.LinkedList;
import faa.a;
import w46.b;
import java.util.Iterator;

public class TextLayoutHelper	// class@001931
{
    public float A;
    public View B;
    public String C;
    public String D;
    public int E;
    public int F;
    public boolean G;
    public long H;
    public long I;
    public Paint$Align J;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public TextBubbleConfig$ScaleMode g;
    public String h;
    public String[] i;
    public Paint j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Paint x;
    public float y;
    public float z;
    public static final int K;
    public static final int L;
    public static final int M;

    static {
       TextLayoutHelper.K = TextLayoutHelper.c(18.00f);
       TextLayoutHelper.L = TextLayoutHelper.c(28.80f);
       TextLayoutHelper.M = TextLayoutHelper.c(36.48f);
    }
    public void TextLayoutHelper(String p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,TextBubbleConfig$ScaleMode p9,boolean p10,int p11,int p12,int p13,int p14){
       TextLayoutHelper textLayoutHe = this;
       int i = p1;
       int i1 = p5;
       int i2 = p6;
       TextBubbleConfig$ScaleMode scaleMode = p9;
       super();
       textLayoutHe.a = TextLayoutHelper.c(9.00f);
       textLayoutHe.y = 0;
       textLayoutHe.z = 0;
       textLayoutHe.A = 0;
       int i3 = 0;
       textLayoutHe.F = i3;
       textLayoutHe.G = i3;
       textLayoutHe.H = 0;
       textLayoutHe.I = 500;
       TextPaint textPaint = new TextPaint(7);
       textLayoutHe.j = textPaint;
       textPaint.setColor(i);
       textLayoutHe.q = p10;
       textLayoutHe.b = i1;
       textLayoutHe.c = i2;
       textLayoutHe.k = i1;
       textLayoutHe.l = i2;
       textLayoutHe.d = p7;
       textLayoutHe.e = p8;
       textLayoutHe.g = scaleMode;
       textLayoutHe.h = p0;
       textLayoutHe.m = i;
       textLayoutHe.n = p2;
       textLayoutHe.o = p3;
       textLayoutHe.p = p4;
       textLayoutHe.s = TextLayoutHelper.a(p5);
       textLayoutHe.r = p11;
       textLayoutHe.t = p12;
       textLayoutHe.u = p13;
       Paint$Align uAlign = TextLayoutHelper.j(p14);
       textLayoutHe.J = uAlign;
       textLayoutHe.j.setTextAlign(uAlign);
       Object[] objArray = null;
       String str = PatchProxy.apply(objArray, this, TextLayoutHelper.class, "41");
       if (str != PatchProxyResult.class) {
       }else {
          str = QCurrentUser.me().getKwaiId();
          TextLayoutHelper t1 = textLayoutHe.t;
          if (t1 != 2) {
             if (t1 != 4) {
                str = "";
             }else {
                Resources resources = a.a().a().getResources();
                Object[] objArray1 = new Object[1];
                if (TextUtils.isEmpty(str)) {
                   str = QCurrentUser.me().getId();
                }
                objArray1[i3] = str;
                str = resources.getString(R.string.arg_RES_7f105170, objArray1);
             }
          }else if(TextUtils.isEmpty(str)){
             str = QCurrentUser.me().getId();
          }
          str = "¿ìÊÖºÅ: "+str;
       }
       textLayoutHe.C = str;
       String str1 = PatchProxy.apply(objArray, this, TextLayoutHelper.class, "42");
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = DateUtils.m();
       }
       textLayoutHe.D = str1;
       textLayoutHe.E = 1;
       TextLayoutHelper t = textLayoutHe.t;
       if (t == 1) {
          textLayoutHe.y = a.a().a().getResources().getDimension(0x7f070f8b);
          textLayoutHe.z = a.a().a().getResources().getDimension(0x7f070cb8);
          textLayoutHe.A = a.a().a().getResources().getDimension(0x7f070f8a);
          t = textLayoutHe.w;
          if (t > null) {
             textLayoutHe.z = (float)(t * 4);
          }
       }else if(t != 3 && (t == 4 || t == 5)){
          textLayoutHe.j.setTypeface(Typeface.DEFAULT_BOLD);
       }
       float f = (scaleMode == TextBubbleConfig$ScaleMode.VERTICAL)? (float)i1 * 0x3f333333: this.h();
       textLayoutHe.j.setTextSize(this.e(f));
       this.n(scaleMode);
       return;
    }
    public static float a(int p0){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.isSupport(textLayoutHe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, textLayoutHe, "5");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return ((((float)n.P(a.a().a(), (float)n.y(a.a().a())) / 360.00f) * (float)p0) / (float)TextLayoutHelper.c(360.00f));
    }
    public static int c(float p0){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.isSupport(textLayoutHe)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, textLayoutHe, "37");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return n.c(a.a().a(), p0);
    }
    public static String[] g(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(TextLayoutHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, TextLayoutHelper.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p1.size();
       String[] stringArray = new String[i];
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          int i3 = p1.get(i1).intValue() + i2;
          stringArray[i1] = p0.substring(i2, i3);
          i2 = i2 + p1.get(i1).intValue();
          if (!p2 && i > 1) {
             object oobject = stringArray[i1];
             String str = PatchProxy.applyOneRefs(oobject, null, TextLayoutHelper.class, "30");
             if (str != PatchProxyResult.class) {
             }else {
                str = "";
                if (oobject != null) {
                   str = Pattern.compile("\\n").matcher(oobject).replaceAll(str);
                }
             }
             stringArray[i1] = str;
          }
          i1 = i1 + 1;
       }
       return stringArray;
    }
    public static Paint$Align j(int p0){
       if (!p0) {
          return Paint$Align.LEFT;
       }
       if (p0 == 1) {
          return Paint$Align.CENTER;
       }
       if (p0 != 2) {
          return Paint$Align.CENTER;
       }
       return Paint$Align.RIGHT;
    }
    public static int k(String p0,int p1,int p2,float p3,boolean p4,Paint p5){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.isSupport(textLayoutHe)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Boolean.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, null, textLayoutHe, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p5.setTextSize(p3);
       int i = (Character.isSupplementaryCodePoint(p0.codePointAt(p1)))? p1 + 2: p1 + 1;
       try{
          float f = p5.measureText(p0, p1, i);
          boolean b = false;
          int i1 = 0;
          while (true) {
             float f1 = (float)p2;
             if (f - f1 < 0 && (i < p0.length() && (p4 || p0.charAt(i) != 10))) {
                int i2 = p0.codePointAt(i);
                if (Character.isSupplementaryCodePoint(i2)) {
                   i = i + 2;
                   b = true;
                }else {
                   i = i + 1;
                   b = false;
                }
                f1 = p5.measureText(p0, p1, i);
                i1 = i1 + 1;
                if (i1 >= 100) {
                   ExceptionHandler.handleCaughtException(new TextLayoutHelper$TextLayoutSplitTextException("getTextLengthInHorizontalMode startPos:"+p1+",width:"+p2+",textSize:"+p3+",textWidth:"+f1+",endPos:"+i+",codePointAt:"+i2));
                   return -1;
                }else {
                   f = f1;
                }
             }else if(f - f1 > 0){
                if (b) {
                   i = i - 2;
                   break ;
                }else {
                   i = i - 1;
                   break ;
                }
             }
          }
       }catch(java.lang.Exception e9){
          PostUtils.D("TextLayoutHelper", "getTextLengthInHorizontalMode", e9);
       }
       return (i - p1);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, TextLayoutHelper.class, "21")) {
          return;
       }
       this.f = this.j.getFontMetrics().descent - this.j.getFontMetrics().ascent;
       int i = 0;
       this.k = i;
       this.l = i;
       TextLayoutHelper ti = this.i;
       int len = ti.length;
       for (; i < len; i = i + 1) {
          this.k = Math.max(this.k, (int)Math.ceil((double)this.j.measureText(ti[i])));
          float f = (float)this.l + this.f;
          this.l = (int)f;
       }
       this.k = Math.max((this.b - ((int)this.y * 2)), this.k);
       this.l = Math.max(this.c, this.l);
       return;
    }
    public final void d(Canvas p0,float p1,float p2,float p3,float p4,float p5){
       float f4;
       RectF rectF;
       TextLayoutHelper x;
       Object[] objArray1;
       RectF rectF1;
       TextLayoutHelper a1;
       RectF rectF4;
       TextLayoutHelper obj = this;
       object oobject = p0;
       float f = p5;
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       int i = 2;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(textLayoutHe)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, textLayoutHe, "25")) {
             return;
          }
       }
       float f1 = 2.00f;
       float f2 = p2 + (obj.y * f1);
       float f3 = 0;
       if (p1 - f2 > 0) {
          if (f2 - p3 >= 0) {
             TextLayoutHelper a = obj.A;
             f = f - a;
             f4 = (float)obj.w;
             rectF = new RectF(f3, f, f2, ((p4 + a) + f));
             x = obj.x;
             if (PatchProxy.isSupport(textLayoutHe)) {
                objArray1 = new Object[i1];
                objArray1[i5] = oobject;
                objArray1[i4] = Float.valueOf(f4);
                objArray1[i] = rectF;
                objArray1[i3] = x;
                objArray1[i2] = Float.valueOf(f2);
                if (!PatchProxy.applyVoid(objArray1, obj, textLayoutHe, "27")) {
                }
             }else {
             }
          }else {
             a1 = obj.A;
             f = f - a1;
             TextLayoutHelper w = obj.w;
             RectF rectF2 = new RectF(f3, f, f2, ((p4 + (a1 * f1)) + f));
             x = obj.x;
             if (PatchProxy.isSupport(textLayoutHe)) {
                objArray1 = new Object[i1];
                objArray1[i5] = oobject;
                objArray1[i4] = Integer.valueOf(w);
                objArray1[i] = rectF2;
                objArray1[i3] = x;
                objArray1[i2] = Float.valueOf(f2);
                if (PatchProxy.applyVoid(objArray1, obj, textLayoutHe, "29")) {
                label_018c :
                   int i6 = this;
                }
             }
             p0.save();
             oobject.translate((- (f2 / f1)), f3);
             Path path = new Path();
             RectF left = rectF2.left;
             RectF top = rectF2.top;
             RectF right = rectF2.right;
             RectF bottom = rectF2.bottom;
             float f7 = (float)(w * 2);
             float f8 = (float)w;
             f1 = left - f8;
             path.moveTo(f1, top);
             path.lineTo((right + f8), top);
             f4 = right + f7;
             float f6 = top + f7;
             path.arcTo(new RectF(right, top, f4, f6), -90.00f, -90.00f, i5);
             path.lineTo(right, (bottom - f8));
             float f9 = bottom - f7;
             rectF2 = new RectF(right, f9, f4, bottom);
             path.arcTo(rectF2, -180.00f, -90.00f, i5);
             path.lineTo(f1, bottom);
             f7 = left - f7;
             right = new RectF(f7, f9, left, bottom);
             path.arcTo(right, -270.00f, -90.00f, i5);
             path.lineTo(left, (f8 + top));
             path.arcTo(new RectF(f7, top, left, f6), 0, -90.00f, i5);
             path.close();
             oobject.drawPath(path, x);
             p0.restore();
             goto label_018c ;
          }
       }else {
          float f5 = 0;
          if (f2 - p3 >= 0) {
             obj = this;
             TextLayoutHelper w1 = obj.w;
             RectF rectF3 = new RectF(f5, f, f2, (p4 + f));
             x = obj.x;
             if (PatchProxy.isSupport(textLayoutHe)) {
                objArray1 = new Object[i1];
                objArray1[i5] = oobject;
                objArray1[i4] = Integer.valueOf(w1);
                objArray1[i] = rectF3;
                objArray1[i3] = x;
                objArray1[i2] = Float.valueOf(f2);
                if (!PatchProxy.applyVoid(objArray1, obj, textLayoutHe, "26")) {
                }
             }else {
             }
          }else {
             obj = this;
             a1 = obj.w;
             rectF = new RectF(f5, f, f2, ((p4 + obj.A) + f));
             x = obj.x;
             if (PatchProxy.isSupport(textLayoutHe)) {
                objArray1 = new Object[i1];
                objArray1[i5] = oobject;
                objArray1[i4] = Integer.valueOf(a1);
                objArray1[i] = rectF;
                objArray1[i3] = x;
                objArray1[i2] = Float.valueOf(f2);
                if (!PatchProxy.applyVoid(objArray1, obj, textLayoutHe, "28")) {
                }
             }else {
             }
          }
       }
    label_027f :
       return;
    }
    public final float e(float p0){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.isSupport(textLayoutHe)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, textLayoutHe, "15");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return Math.max(Math.min(p0, this.h()), this.i());
    }
    public int f(){
       return this.l;
    }
    public float h(){
       TextLayoutHelper tt;
       if (this.q != null) {
          tt = this.t;
          if (tt == 1) {
             return ((float)TextLayoutHelper.M * this.s);
          }
          if (tt != 3 && (tt == 4 || tt == 5)) {
             return (float)this.u;
          }
          int m = (this.n != null)? TextLayoutHelper.M: TextLayoutHelper.L;
          return ((float)m * this.s);
       }else {
          tt = this.u;
          if (tt != null && tt > null) {
             return (float)tt;
          }
          return (float)TextLayoutHelper.K;
       }
    }
    public float i(){
       if (this.q == null) {
          return (float)this.a;
       }
       if (this.t == 3) {
          return (float)this.a;
       }
       int m = (this.n != null)? TextLayoutHelper.M: TextLayoutHelper.L;
       return ((float)m * this.s);
    }
    public int l(){
       return this.k;
    }
    public final void m(List p0,int p1){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.isSupport(textLayoutHe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, textLayoutHe, "4")) {
          return;
       }
       if (this.t != 5) {
          p0.add(Integer.valueOf(p1));
       }else if(p0.size() <= 1){
          p0.add(Integer.valueOf(p1));
       }
       return;
    }
    public final void n(TextBubbleConfig$ScaleMode p0){
       TextLayoutHelper textLayoutHe = TextLayoutHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, textLayoutHe, "2")) {
          return;
       }
       int i = 0;
       this.F = i;
       if (!TextUtils.isEmpty(this.h)) {
          int i1 = TextLayoutHelper$a.a[p0.ordinal()];
          StringBuilder str = 1;
          if (i1 != str) {
             if (i1 != 2) {
                if (i1 != 3) {
                   TextLayoutHelper textLayoutHe1 = 4;
                   if (i1 != textLayoutHe1) {
                      if (i1 == 5) {
                         this.a = i;
                         if (this.E <= str) {
                            TextLayoutHelper td = this.d;
                            TextLayoutHelper te = this.e;
                            if (!PatchProxy.isSupport(textLayoutHe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(td), Integer.valueOf(te), this, textLayoutHe, "3")) {
                               LinkedList linkedList = new LinkedList();
                               float textSize = this.j.getTextSize();
                               while (true) {
                                  float f = this.e(textSize);
                                  linkedList.clear();
                                  int i2 = 0;
                                  break ;
                               }
                               while (true) {
                                  te = this.h;
                                  boolean b = (this.t != str)? true: false;
                                  int i3 = TextLayoutHelper.k(te, i2, td, f, b, this.j);
                                  String str1 = " limitWidth :";
                                  String str2 = " current text size : ";
                                  String str3 = "scale mode:";
                                  String str4 = "text type : ";
                                  String str5 = "splitLinesByFirstHorizontalAfterVertical text :";
                                  if (i3 == -1) {
                                     Object[] objArray = new Object[i];
                                     a.D().t("TextLayoutHelper", str5+this.h+str4+this.t+str3+this.g.toString()+str2+f+str1+td, objArray);
                                     break ;
                                  }else if(!i3){
                                     ExceptionHandler.handleCaughtException(new TextLayoutHelper$TextLayoutSplitTextException(str5+this.h+str4+this.t+str3+this.g.toString()+str2+f+str1+td));
                                  }
                                  this.m(linkedList, i3);
                                  i2 = i2 + i3;
                                  if (i2 >= (this.h).length()) {
                                     te = this.h;
                                     int b1 = (this.t != str)? true: false;
                                     this.i = TextLayoutHelper.g(te, linkedList, b1);
                                     textSize = this.j.getFontMetrics().descent - this.j.getFontMetrics().ascent;
                                     this.f = textSize;
                                     this.k = i;
                                     this.l = i;
                                     te = this.i;
                                     b1 = te.length;
                                     for (int i4 = 0; i4 < b1; i4 = i4 + 1) {
                                        this.k = Math.max(this.k, (int)Math.ceil((double)this.j.measureText(te[i4])));
                                        float f1 = (float)this.l + this.f;
                                        this.l = (int)f1;
                                     }
                                     this.k = Math.max(this.b, this.k);
                                     i3 = Math.max(this.c, this.l);
                                     this.l = i3;
                                     if (i3 > this.e && this.t != textLayoutHe1) {
                                        f = f * 0x3f666666;
                                        textSize = this.e(f);
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }else {
                      this.o();
                   }
                }else {
                   this.a = i;
                   this.p(this.e, i);
                }
             }else {
                this.a = i;
                this.p(this.d, str);
             }
          }else {
             this.a = i;
             this.o();
          }
       }
       return;
    }
    public final void o(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, TextLayoutHelper.class, "17")) {
          return;
       }
       int i = this.b - ((int)this.y * 2);
       TextLayoutHelper tc = this.c;
       float textSize = this.j.getTextSize();
       while (true) {
          b = false;
          if (PatchProxy.isSupport(TextLayoutHelper.class)) {
             TextLayoutHelper obj = PatchProxy.applyTwoRefs(Float.valueOf(textSize), Integer.valueOf(i), this, TextLayoutHelper.class, "18");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_003e :
                LinkedList linkedList = new LinkedList();
                int i1 = 0;
                while (true) {
                   obj = this.h;
                   boolean b1 = (this.t != 1)? true: false;
                   int i2 = TextLayoutHelper.k(obj, i1, i, textSize, b1, this.j);
                   if (i2 == -1) {
                      Object[] objArray = new Object[b];
                      a.D().t("TextLayoutHelper", "splitLines startPos:"+i1+",width:"+i+",textSize:"+textSize, objArray);
                   }else if(!i2){
                      ExceptionHandler.handleCaughtException(new TextLayoutHelper$TextLayoutSplitTextException("splitLines text :"+this.h+"text type : "+this.t+"scale mode : "+this.g.toString()+" current text size : "+textSize+" width :"+i));
                   }else {
                      this.m(linkedList, i2);
                      i1 = i1 + i2;
                      if (i1 >= (this.h).length() || (this.r > null && linkedList.size() >= this.r)) {
                         obj = this.h;
                         if (this.t != 1) {
                            b = true;
                         }
                         this.i = TextLayoutHelper.g(obj, linkedList, b);
                         this.b();
                         b = true;
                      }
                   }
                }
                return;
             }
          }else {
             goto label_003e ;
          }
       }
       if (!b) {
          goto label_00f7 ;
       }else if(this.l <= tc){
          this.k = i;
          this.l = tc;
          return;
       }else {
          float f = 0x3f8ccccd;
          if (this.t != 1) {
             if (textSize - this.i() <= 0) {
                if (this.q == null) {
                label_0124 :
                   float f1 = (float)i * f;
                   i = (int)f1;
                }
             }else {
                textSize = textSize * 0x3f666666;
                textSize = this.e(textSize);
                continue ;
             }
          }else if(this.q == null){
             goto label_0124 ;
          }
          float f2 = (float)tc * f;
          tc = (int)f2;
       }
    }
    public final void p(int p0,boolean p1){
       String str;
       TextLayoutHelper h;
       int b;
       int i3;
       TextLayoutHelper h1;
       float this;
       String[] stringArray = this;
       int i = p0;
       if (PatchProxy.isSupport(TextLayoutHelper.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), stringArray, TextLayoutHelper.class, "14")) {
          return;
       }
       LinkedList linkedList = new LinkedList();
       float textSize = stringArray.j.getTextSize();
    label_002a :
       float f = stringArray.e(textSize);
       linkedList.clear();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          str = "TextLayoutHelper";
          String str1 = 1;
          if (p1) {
             h = stringArray.h;
             b = (stringArray.t != str1)? true: false;
             i3 = TextLayoutHelper.k(h, i2, p0, f, b, stringArray.j);
          }else if(PatchProxy.isSupport(TextLayoutHelper.class)){
             Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(i2), Integer.valueOf(p0), Float.valueOf(f), this, TextLayoutHelper.class, "23");
             if (obj != PatchProxyResult.class) {
                i3 = obj.intValue();
             }
          }
          stringArray.j.setTextSize(f);
          textSize = stringArray.j.getFontMetrics().descent - stringArray.j.getFontMetrics().ascent;
          int i4 = (Character.isSupplementaryCodePoint((stringArray.h).codePointAt(i2)))? i2 + 2: i2 + 1;
          int i6 = i4 - i2;
          float f1 = (float)i6 * textSize;
          int i9 = 0;
          try{
             this = (float)i;
             while (f1 - this < 0 && i4 < (stringArray.h).length()) {
                if (Character.isSupplementaryCodePoint((stringArray.h).codePointAt(i4))) {
                   i4 = i4 + 2;
                   i9 = 1;
                }else {
                   i4 = i4 + 1;
                   i9 = 0;
                }
                i6 = i4 - i2;
                f1 = (float)i6 * textSize;
             }
             if (f1 - this > 0) {
                if (i9) {
                   i4 = i4 - 2;
                }else {
                   i4 = i4 - 1;
                }
             }
          }catch(java.lang.Exception e0){
             PostUtils.D(str, "getTextLengthInVerticalMode", e0);
          }
          i4 = i4 - i2;
          i3 = i4;
          if (i3 == -1) {
             break ;
          }else {
             stringArray.m(linkedList, i3);
             i2 = i2 + i3;
             if (i2 >= (stringArray.h).length() || (stringArray.r > null && linkedList.size() >= stringArray.r)) {
                if (p1) {
                   h1 = stringArray.h;
                   if (stringArray.t != 1) {
                      i1 = true;
                   }
                   stringArray.i = TextLayoutHelper.g(h1, linkedList, i1);
                }else {
                   h1 = stringArray.h;
                   String[] stringArray1 = PatchProxy.applyTwoRefs(h1, linkedList, stringArray, TextLayoutHelper.class, "20");
                   if (stringArray1 != PatchProxyResult.class) {
                   }else {
                      i4 = linkedList.size();
                      int[] ointArray = new int[i4];
                      Iterator iterator = linkedList.iterator();
                      b = 0;
                      int i5 = 0;
                      i2 = 0;
                      while (iterator.hasNext()) {
                         Integer integer = iterator.next();
                         i6 = integer.intValue() + i5;
                         String str2 = h1.substring(i5, i6);
                         int i7 = str2.codePointCount(i1, str2.length());
                         ointArray[i2] = str2.length();
                         i2 = i2 + 1;
                         i5 = i5 + integer.intValue();
                         b = Math.max(b, i7);
                         iterator = iterator;
                      }
                      String[] stringArray2 = new String[b];
                      StringBuilder[] stringBuilde = new StringBuilder[b];
                      i2 = 0;
                      int i8 = 0;
                      while (i2 < i4) {
                         i6 = ointArray[i2] + i8;
                         String[] stringArray3 = (h1.substring(i8, i6)).split("");
                         TextLayoutHelper textLayoutHe = h1;
                         i8 = 1;
                         while (i8 < stringArray3.length) {
                            i3 = i8 - 1;
                            if (stringBuilde[i3] == null) {
                               stringBuilde[i3] = "";
                            }
                            StringBuilder str3 = stringBuilde[i3]+stringArray3[i8];
                            i8 = i8 + 1;
                            i4 = i4;
                         }
                         i2 = i2 + 1;
                         i8 = i6;
                         h1 = textLayoutHe;
                         String str4 = null;
                      }
                      for (i1 = 0; i1 < b; i1 = i1 + 1) {
                         stringArray2[i1] = stringBuilde[i1];
                      }
                      stringArray1 = stringArray2;
                   }
                   stringArray.i = stringArray1;
                }
                this.b();
                if (p1) {
                   h = stringArray.e;
                   if (stringArray.l <= h) {
                      stringArray.l = h;
                      return;
                   }
                }
                if (!p1) {
                   h = stringArray.d;
                   if (stringArray.k <= h) {
                      stringArray.k = h;
                      return;
                   }
                }
                f = f * 0x3f666666;
                textSize = stringArray.e(f);
                goto label_002a ;
             }
          }
       }
       Object[] objArray = new Object[i1];
       a.D().t(str, "splitLinesByOneSideExtension startPos:"+i2+",sizeLimit:"+i+",textSize:"+f, objArray);
       return;
    }
}
