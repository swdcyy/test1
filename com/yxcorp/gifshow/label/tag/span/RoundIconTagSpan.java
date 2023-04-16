package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import lnc.o7;
import android.text.style.ReplacementSpan;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$TYPE;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import cw9.e;
import androidx.core.graphics.drawable.a;
import qrd.l1;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$liveCorner$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$liveMargin$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livePadding$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingText$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$liveWidth$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$spanRect$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingRect$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$textPaint$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingBgPaint$2;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingTextPaint$2;
import android.graphics.Paint;
import gya.d;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import java.lang.Number;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.Float;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint$FontMetricsInt;
import zsd.u;

public class RoundIconTagSpan extends ReplacementSpan implements o7	// class@001a20
{
    public boolean A;
    public int B;
    public int C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final Drawable b;
    public final String c;
    public final int d;
    public final int e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public WeakReference m;
    public boolean n;
    public final p o;
    public final p p;
    public final p q;
    public final Paint r;
    public final RoundIconTagSpan$TYPE s;
    public final boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public float y;
    public boolean z;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final float P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final RoundIconTagSpan$a Y;

    static {
       RoundIconTagSpan.Y = new RoundIconTagSpan$a(null);
       RoundIconTagSpan.J = a1.a(0x7f060788);
       RoundIconTagSpan.K = a1.a(0x7f060624);
       RoundIconTagSpan.L = a1.d(0x7f070f6f);
       RoundIconTagSpan.M = a1.a(0x7f06060d);
       RoundIconTagSpan.N = a1.a(0x7f061b1b);
       RoundIconTagSpan.O = a1.a(0x7f061b1c);
       RoundIconTagSpan.P = (float)a1.d(0x7f07030a);
       RoundIconTagSpan.Q = a1.e(0x3fc00000);
       RoundIconTagSpan.R = a1.e(0x3fc00000);
       RoundIconTagSpan.S = a1.d(0x7f0702e3);
       RoundIconTagSpan.T = a1.d(0x7f07031b);
       RoundIconTagSpan.U = a1.d(0x7f0702a4);
       RoundIconTagSpan.V = a1.d(0x7f070295);
       RoundIconTagSpan.W = a1.d(0x7f070283);
       RoundIconTagSpan.X = a1.d(0x7f070271);
    }
    public void RoundIconTagSpan(RoundIconTagSpan$TYPE p0){
       super(p0, false, 0, 0, 0, false, 0, false, false, 0, 0, 0, 0, false, false, 0, 0, 0x1fffe, null);
    }
    public void RoundIconTagSpan(RoundIconTagSpan$TYPE p0,boolean p1,int p2,int p3,int p4,boolean p5,float p6,boolean p7,boolean p8,int p9,int p10,float p11,int p12,boolean p13,boolean p14,int p15,int p16){
       int u;
       int i;
       RoundIconTagSpan e;
       RoundIconTagSpan roundIconTag = this;
       a.p(p0, "type");
       super();
       roundIconTag.s = p0;
       roundIconTag.t = p1;
       roundIconTag.u = p2;
       roundIconTag.v = p3;
       roundIconTag.w = p4;
       roundIconTag.x = p5;
       roundIconTag.y = p6;
       roundIconTag.z = p7;
       roundIconTag.A = p8;
       roundIconTag.B = p9;
       roundIconTag.C = p10;
       roundIconTag.D = p11;
       roundIconTag.E = p12;
       roundIconTag.F = p13;
       roundIconTag.G = p14;
       roundIconTag.H = p15;
       roundIconTag.I = p16;
       Drawable uDrawable = a1.f(p0.getIcon());
       float f = e.c();
       if (!f - 0x3fa20000) {
          u = RoundIconTagSpan.U;
       }else if(!f - 0x3f900000){
          u = RoundIconTagSpan.V;
       }else if(!f - 0x3f800000){
          u = roundIconTag.E;
       }else if(!f - 0x3f638e39){
          u = RoundIconTagSpan.X;
       }else {
          e = roundIconTag.E;
          i = (int)((float)e * f);
          u = (int)((float)e * f);
       label_0081 :
          uDrawable.setBounds(0, 0, u, i);
          if (roundIconTag.G != null) {
             a.n(uDrawable, roundIconTag.u);
          }
          a.o(uDrawable, "drawable\(type.icon\).appl¡­his, textColor\)\n    }\n  }");
          roundIconTag.b = uDrawable;
          roundIconTag.c = "PingFangSC";
          roundIconTag.d = this.c(2);
          roundIconTag.e = this.c(0);
          roundIconTag.f = s.c(new RoundIconTagSpan$liveCorner$2(this));
          roundIconTag.g = s.c(new RoundIconTagSpan$liveMargin$2(this));
          roundIconTag.h = s.c(new RoundIconTagSpan$livePadding$2(this));
          roundIconTag.i = s.c(RoundIconTagSpan$livingText$2.INSTANCE);
          roundIconTag.j = s.c(new RoundIconTagSpan$liveWidth$2(this));
          roundIconTag.k = s.c(RoundIconTagSpan$spanRect$2.INSTANCE);
          roundIconTag.l = s.c(RoundIconTagSpan$livingRect$2.INSTANCE);
          roundIconTag.o = s.c(new RoundIconTagSpan$textPaint$2(this));
          roundIconTag.p = s.c(RoundIconTagSpan$livingBgPaint$2.INSTANCE);
          roundIconTag.q = s.c(new RoundIconTagSpan$livingTextPaint$2(this));
          roundIconTag.r = new Paint();
          return;
       }
       i = u;
       goto label_0081 ;
    }
    public void RoundIconTagSpan(RoundIconTagSpan$TYPE p0,boolean p1,int p2,int p3,int p4,boolean p5,float p6,boolean p7,boolean p8,int p9,int p10,float p11,int p12,boolean p13,boolean p14,int p15,int p16,int p17,u p18){
       int s;
       int i = p17;
       int i1 = (i & 0x02)? 0: p1;
       int j = (i & 0x04)? RoundIconTagSpan.J: p2;
       int k = (i & 0x08)? RoundIconTagSpan.K: p3;
       int m = (i & 0x10)? RoundIconTagSpan.M: p4;
       int i2 = (i & 0x20)? 0: p5;
       float f = (i & 0x40)? (float)RoundIconTagSpan.L: p6;
       int i3 = 1;
       int i4 = (i & 0x0080)? 1: p7;
       int i5 = (i & 0x0100)? 1: p8;
       int q = (i & 0x0200)? RoundIconTagSpan.Q: p9;
       int r = (i & 0x0400)? RoundIconTagSpan.R: p10;
       float p = (i & 0x0800)? RoundIconTagSpan.P: p11;
       int w = (i & 0x1000)? RoundIconTagSpan.W: p12;
       int i6 = (i & 0x2000)? 0: p13;
       if (!(i & 0x4000)) {
          i3 = p14;
       }
       if (0x8000 & i) {
          s = (i5)? RoundIconTagSpan.S: 0;
       }else {
          s = p15;
       }
       if (i & 0x10000) {
          if (i5) {
             i = (!i1)? RoundIconTagSpan.T: a1.d(R.dimen.arg_RES_7f07030a);
          }else {
             i = 0;
          }
       }else {
          i = p16;
       }
       super(p0, i1, j, k, m, i2, f, i4, i5, q, r, p, w, i6, i3, s, i);
       return;
    }
    public void RoundIconTagSpan(d p0){
       RoundIconTagSpan i;
       Object obj = p0;
       a.p(obj, "param");
       boolean b = false;
       super(RoundIconTagSpan$TYPE.KNOWLEDGE, b, obj.c, obj.b, obj.d, obj.e, (float)obj.f, obj.g, obj.h, obj.k, obj.m, obj.i, RoundIconTagSpan.W, true, 0, obj.j, obj.l);
       if (this.A != null) {
          i = (this.t == null)? this.I: a1.d(R.dimen.arg_RES_7f07030a);
       }else {
          i = 0;
       }
       this.I = i;
       if (this.A != null) {
          b = this.H;
       }
       this.H = b;
       return;
    }
    public void a(View p0,boolean p1){
       if (PatchProxy.isSupport(RoundIconTagSpan.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RoundIconTagSpan.class, "17")) {
          return;
       }
       a.p(p0, "widget");
       this.n = p1;
       p0.invalidate();
       return;
    }
    public final Drawable b(){
       Object[] objArray = null;
       RoundIconTagSpan obj = PatchProxy.apply(objArray, this, RoundIconTagSpan.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          objArray = obj.get();
       }
       if (objArray == null) {
          objArray = this.b;
          this.m = new WeakReference(objArray);
       }
       return objArray;
    }
    public final int c(int p0){
       if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RoundIconTagSpan.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a1.e((float)p0);
    }
    public final float d(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.f.getValue();
       }
       return obj.floatValue();
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       Paint paint;
       RoundIconTagSpan v;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       float f = p4;
       int i = p6;
       object oobject2 = p8;
       int i1 = 8;
       int i2 = 7;
       int i3 = 6;
       int i4 = 5;
       int i5 = 4;
       int i6 = 3;
       int i7 = 2;
       int i8 = 1;
       if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[i8] = oobject1;
          objArray[i7] = Integer.valueOf(p2);
          objArray[i6] = Integer.valueOf(p3);
          objArray[i5] = Float.valueOf(p4);
          objArray[i4] = Integer.valueOf(p5);
          objArray[i3] = Integer.valueOf(p6);
          objArray[i2] = Integer.valueOf(p7);
          objArray[i1] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, RoundIconTagSpan.class, "12")) {
             return;
          }
       }
       a.p(oobject, "canvas");
       a.p(oobject1, "text");
       a.p(oobject2, "paint");
       String str = obj.n(oobject1);
       int[] ointArray = obj.k(str, p2, p3);
       if (ointArray[0] >= ointArray[i8]) {
          return;
       }else {
          Drawable uDrawable = this.b();
          i3 = uDrawable.getBounds().width();
          i4 = uDrawable.getBounds().height();
          obj.r.set(oobject2);
          obj.r.clearShadowLayer();
          p0.save();
          float f1 = 0;
          if (obj.w != null) {
             oobject.translate(f1, (- (float)obj.c(i8)));
          }
          int i9 = ointArray[0];
          i5 = ointArray[i8];
          RoundIconTagSpan r = obj.r;
          if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
             Object[] objArray1 = new Object[i1];
             objArray1[0] = Float.valueOf(p4);
             objArray1[i8] = Integer.valueOf(p6);
             objArray1[i7] = Integer.valueOf(i3);
             objArray1[3] = str;
             objArray1[4] = Integer.valueOf(i9);
             objArray1[5] = Integer.valueOf(i5);
             objArray1[6] = r;
             objArray1[7] = oobject;
             if (PatchProxy.applyVoid(objArray1, obj, RoundIconTagSpan.class, "13")) {
             label_014f :
                RectF top = this.j().top;
                if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
                   Object[] objArray2 = new Object[]{oobject,Float.valueOf(top),Integer.valueOf(i4),Float.valueOf(p4),uDrawable};
                   if (PatchProxy.applyVoid(objArray2, obj, RoundIconTagSpan.class, "14")) {
                   label_01a4 :
                      int i10 = ointArray[0];
                      i9 = 1;
                      int i11 = ointArray[i9];
                      if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
                         objArray1 = new Object[]{Integer.valueOf(i3),oobject,str,Integer.valueOf(i10),Integer.valueOf(i11),Integer.valueOf(p6)};
                         if (PatchProxy.applyVoid(objArray1, obj, RoundIconTagSpan.class, "15")) {
                         label_0217 :
                            if (obj.t != null && !PatchProxy.applyVoidOneRefs(oobject, obj, RoundIconTagSpan.class, "16")) {
                               float f2 = this.j().right - (float)obj.I;
                               this.g().set((f2 - this.f()), (this.j().top + (float)obj.c(2)), f2, (this.j().bottom - (float)obj.c(2)));
                               RectF rectF = this.g();
                               f = this.d();
                               float f3 = this.d();
                               paint = PatchProxy.apply(null, obj, RoundIconTagSpan.class, "9");
                               if (paint == PatchProxyResult.class) {
                                  paint = obj.p.getValue();
                               }
                               oobject.drawRoundRect(rectF, f, f3, paint);
                               Paint$FontMetrics fontMetrics = this.i().getFontMetrics();
                               Paint$FontMetrics descent = fontMetrics.descent;
                               f3 = (this.g().centerY() + ((descent - fontMetrics.ascent) / (float)2)) - descent;
                               oobject.drawText(this.h(), this.g().centerX(), f3, this.i());
                            }
                            p0.restore();
                            return;
                         }
                      }
                      paint = this.l();
                      if (obj.n != null) {
                         v = obj.v;
                         if (v != null) {
                         label_01ee :
                            paint.setColor(v);
                            p0.drawText(str, i10, i11, (((this.j().left + (float)obj.H) + (float)i3) + (float)obj.e), (float)i, this.l());
                            goto label_0217 ;
                         }
                      }
                      v = obj.u;
                      goto label_01ee ;
                   }
                }
                p0.save();
                oobject.translate((f + (float)obj.H), (top + ((this.j().height() - (float)i4) * 0x3f000000)));
                uDrawable.draw(oobject);
                p0.restore();
                goto label_01a4 ;
             }
          }
          float f4 = (obj.t == null)? 0: this.f() + this.e();
          float f5 = (float)i;
          this.j().set(f, ((this.l().ascent() + f5) - (float)obj.B), (((((((float)obj.H + f) + (float)i3) + (float)obj.e) + (float)(int)this.l().measureText(str, i9, i5)) + (float)obj.I) + f4), ((f5 + this.l().descent()) + (float)obj.C));
          r.setStyle(Paint$Style.FILL);
          r.setColor(obj.w);
          oobject.drawRoundRect(this.j(), obj.D, obj.D, r);
          goto label_014f ;
       }
    }
    public final float e(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.g.getValue();
       }
       return obj.floatValue();
    }
    public final float f(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.j.getValue();
       }
       return obj.floatValue();
    }
    public final RectF g(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       int i = 2;
       if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, RoundIconTagSpan.class, "11");
          if (p4 != PatchProxyResult.class) {
             return p4.intValue();
          }
       }
       a.p(p0, "paint");
       a.p(p1, "text");
       if (this.x != null) {
          this.l().setTextSize(p0.getTextSize());
       }
       String str = this.n(p1);
       int[] ointArray = this.k(str, p2, p3);
       RoundIconTagSpan ts = this.s;
       ts = (ts != RoundIconTagSpan$TYPE.HASHTAG && (ts != RoundIconTagSpan$TYPE.CUSTOM_HASHTAG && (ts == RoundIconTagSpan$TYPE.KNOWLEDGE || (ts == RoundIconTagSpan$TYPE.KNOWLEDGE_COMMENT && (this.m(str, ointArray[1]) || this.m(str, (ointArray[1] + 1)))))))? 0: this.d * 2;
       if (ointArray[0] >= ointArray[1]) {
          return ts;
       }else {
          Drawable uDrawable = this.b();
          float f = (this.t == null)? 0: this.f() + this.e();
          return (int)(((float)((((this.H + uDrawable.getBounds().width()) + this.e) + (int)this.l().measureText(str, ointArray[0], ointArray[1])) + this.I) + f) + (float)ts);
       }
    }
    public final String h(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final Paint i(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final RectF j(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final int[] k(String p0,int p1,int p2){
       int[] obj;
       if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RoundIconTagSpan.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[]{p1,p2};
       while (obj[0] < obj[1]) {
          int i = 32;
          if (p0.charAt(obj[0]) == i || p0.charAt(obj[0]) == i) {
             p2 = obj[0] + 1;
             obj[0] = p2;
             p2 = 0;
          }else {
             p2 = 1;
          }
          int i1 = obj[1] - 1;
          if (p0.charAt(i1) != i) {
             i1 = obj[1] - 1;
             if (p0.charAt(i1) != i) {
             label_0064 :
                if (p2) {
                   break ;
                }
             }
          }
          p2 = obj[1] - 1;
          obj[1] = p2;
          p2 = 0;
          goto label_0064 ;
       }
       return obj;
    }
    public final Paint l(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final boolean m(CharSequence p0,int p1){
       if (PatchProxy.isSupport(RoundIconTagSpan.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, RoundIconTagSpan.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p1 >= p0.length() || (p0.charAt(p1) != ' ' && p0.charAt(p1) != ' ')) {
          b = false;
       }
    label_0037 :
       return b;
    }
    public final String n(CharSequence p0){
       String str;
       RoundIconTagSpan obj = PatchProxy.applyOneRefs(p0, this, RoundIconTagSpan.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj != RoundIconTagSpan$TYPE.HASHTAG && (obj != RoundIconTagSpan$TYPE.CUSTOM_HASHTAG && (obj == RoundIconTagSpan$TYPE.KNOWLEDGE || obj == RoundIconTagSpan$TYPE.KNOWLEDGE_COMMENT))) {
          str = u.g2(u.g2(p0.toString(), "#", " ", false, 4, null), "££", " ", false, 4, null);
       }else if(obj == RoundIconTagSpan$TYPE.AT){
          str = u.g2(p0.toString(), "@", " ", false, 4, null);
       }else {
          str = p0.toString();
       }
       return str;
    }
}
