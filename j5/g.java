package j5.g;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import java.lang.StringBuilder;
import android.graphics.RectF;
import android.graphics.Matrix;
import j5.g$a;
import j5.g$b;
import java.util.HashMap;
import androidx.collection.LongSparseArray;
import d5.n;
import h5.j;
import d5.a$a;
import d5.a;
import h5.k;
import h5.a;
import h5.b;
import android.graphics.Rect;
import a5.e;
import java.lang.Object;
import n5.c;
import a5.j;
import android.graphics.Canvas;
import com.airbnb.lottie.ex.model.DocumentData;
import java.util.Map;
import g5.b;
import java.lang.Integer;
import android.graphics.Paint;
import d5.o;
import java.lang.Float;
import m5.f;
import java.lang.String;
import java.util.List;
import g5.c;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.ex.model.DocumentData$Justification;
import java.util.ArrayList;
import i5.i;
import c5.d;
import android.graphics.Path;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import f5.a;
import a5.b;
import g5.h;
import android.graphics.Typeface;
import android.content.res.AssetManager;
import java.lang.CharSequence;
import a5.q;
import java.lang.Character;
import j5.g$c;
import java.lang.Enum;
import android.graphics.Paint$Style;
import java.util.Arrays;

public class g extends a	// class@00222f
{
    public final Paint A;
    public final Map B;
    public final LongSparseArray C;
    public final n D;
    public final f E;
    public final e F;
    public a G;
    public a H;
    public a I;
    public a J;
    public final StringBuilder w;
    public final RectF x;
    public final Matrix y;
    public final Paint z;

    public void g(f p0,Layer p1){
       k a;
       a uoa;
       super(p0, p1);
       this.w = new StringBuilder(2);
       this.x = new RectF();
       this.y = new Matrix();
       this.z = new g$a(this, 1);
       this.A = new g$b(this, 1);
       this.B = new HashMap();
       this.C = new LongSparseArray();
       this.E = p0;
       this.F = p1.b;
       n on = p1.q.d();
       this.D = on;
       on.a(this);
       this.d(on);
       Layer r = p1.r;
       if (r != null) {
          a = r.a;
          if (a != null) {
             uoa = a.a();
             this.G = uoa;
             uoa.a(this);
             this.d(this.G);
          }
       }
       if (r != null) {
          a = r.b;
          if (a != null) {
             uoa = a.a();
             this.H = uoa;
             uoa.a(this);
             this.d(this.H);
          }
       }
       if (r != null) {
          a = r.c;
          if (a != null) {
             uoa = a.a();
             this.I = uoa;
             uoa.a(this);
             this.d(this.I);
          }
       }
       if (r != null) {
          k d = r.d;
          if (d != null) {
             a uoa1 = d.a();
             this.J = uoa1;
             uoa1.a(this);
             this.d(this.J);
          }
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       super.c(p0, p1, p2);
       p0.set(0, 0, (float)this.F.b().width(), (float)this.F.b().height());
    }
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.a) {
          g tG = this.G;
          if (tG != null) {
             tG.l(p1);
          }else if(p0 == j.b){
             tG = this.H;
             if (tG != null) {
                tG.l(p1);
             }
          }
          if (p0 == j.o) {
             tG = this.I;
             if (tG != null) {
                tG.l(p1);
             }
          }
          if (p0 == j.p) {
             p0 = this.J;
             if (p0 != null) {
                p0.l(p1);
             }
          }
       }else {
          goto label_000f ;
       }
       return;
    }
    public void j(Canvas p0,Matrix p1,int p2){
       float f;
       float f1;
       float f2;
       int i2;
       int i3;
       float f3;
       c uoc;
       int i5;
       String str1;
       List list1;
       float f5;
       int i7;
       String str2;
       List list2;
       int i8;
       float f7;
       g j;
       a uoa1;
       boolean i9;
       String str6;
       a uoa2;
       g og = this;
       Canvas uCanvas = p0;
       p0.save();
       if (!og.E.E()) {
          p0.setMatrix(p1);
       }
       DocumentData uDocumentDat = og.D.h();
       b uob = og.F.e.get(uDocumentDat.b);
       if (uob == null) {
          p0.restore();
          return;
       }else {
          g g = og.G;
          if (g != null) {
             og.z.setColor(g.h().intValue());
          }else {
             og.z.setColor(uDocumentDat.h);
          }
          g = og.H;
          if (g != null) {
             og.A.setColor(g.h().intValue());
          }else {
             og.A.setColor(uDocumentDat.i);
          }
          int i = 100;
          int i1 = (og.u.g() == null)? 100: og.u.g().h().intValue();
          i1 = (i1 * 255) / i;
          og.z.setAlpha(i1);
          og.A.setAlpha(i1);
          g = og.I;
          if (g != null) {
             og.A.setStrokeWidth(g.h().floatValue());
          }else {
             og.A.setStrokeWidth((float)((uDocumentDat.j * (double)f.c()) * (double)f.d(p1)));
          }
          if (og.E.E()) {
             f = (float)uDocumentDat.c / 100.00f;
             f1 = f.d(p1);
             f2 = (float)uDocumentDat.f * f.c();
             List list = og.x(uDocumentDat.a);
             i2 = list.size();
             for (i3 = 0; i3 < i2; i3 = i6 + 1) {
                String str = list.get(i3);
                f3 = 0;
                int i4 = 0;
                while (i4 < str.length()) {
                   uoc = og.F.c().get(c.b(str.charAt(i4), uob.a(), uob.b()));
                   if (uoc == null) {
                      i5 = i3;
                      str1 = str;
                   }else {
                      i5 = i3;
                      str1 = str;
                      double d = uoc.a() * (double)f;
                      d = d * (double)f.c();
                      d = d * (double)f1;
                      double d1 = (double)f3 + d;
                      f3 = (float)d1;
                   }
                   i4 = i4 + 1;
                   i3 = i5;
                   str = str1;
                }
                str1 = str;
                p0.save();
                og.u(uDocumentDat.d, uCanvas, f3);
                i = i2 - 1;
                f3 = (float)i * f2;
                f3 = f3 / 2.00f;
                int i6 = i3;
                float f4 = (float)i6 * f2;
                f4 = f4 - f3;
                uCanvas.translate(0, f4);
                i = 0;
                while (i < str1.length()) {
                   str = str1;
                   uoc = og.F.c().get(c.b(str.charAt(i), uob.a(), uob.b()));
                   if (uoc == null) {
                      list1 = list;
                      f5 = f2;
                      i7 = i2;
                      str2 = str;
                   }else if(og.B.containsKey(uoc)){
                      list2 = og.B.get(uoc);
                      list1 = list;
                      f5 = f2;
                      i7 = i2;
                   }else {
                      c a = uoc.a;
                      i3 = a.size();
                      ArrayList uArrayList = new ArrayList(i3);
                      list1 = list;
                      i8 = 0;
                      while (i8 < i3) {
                         uArrayList.add(new d(og.E, og, a.get(i8)));
                         i8 = i8 + 1;
                         f2 = f2;
                         i2 = i2;
                      }
                      f5 = f2;
                      i7 = i2;
                      og.B.put(uoc, uArrayList);
                      list2 = uArrayList;
                   }
                   i8 = 0;
                   while (i8 < list2.size()) {
                      Path path = list2.get(i8).getPath();
                      path.computeBounds(og.x, false);
                      og.y.set(p1);
                      str2 = str;
                      double d2 = - uDocumentDat.g;
                      float f6 = (float)d2 * f.c();
                      og.y.preTranslate(0, f6);
                      og.y.preScale(f, f);
                      path.transform(og.y);
                      if (uDocumentDat.k != null) {
                         og.w(path, og.z, uCanvas);
                         og.w(path, og.A, uCanvas);
                      }else {
                         og.w(path, og.A, uCanvas);
                         og.w(path, og.z, uCanvas);
                      }
                      i8 = i8 + 1;
                      str = str2;
                   }
                   str2 = str;
                   f4 = (float)uoc.a() * f;
                   f4 = f4 * f.c();
                   f4 = f4 * f1;
                   f7 = (float)uDocumentDat.e / 10.00f;
                   j = og.J;
                   if (j != null) {
                      f7 = f7 + j.h().floatValue();
                   }
                   f7 = f7 * f1;
                   f4 = f4 + f7;
                   uCanvas.translate(f4, 0);
                   i = i + 1;
                   list = list1;
                   f2 = f5;
                   i2 = i7;
                   str1 = str2;
                }
                p0.restore();
             }
          }else {
             f = f.d(p1);
             g e = og.E;
             String str3 = uob.a();
             String str4 = uob.b();
             a uoa = null;
             if (e.getCallback() == null) {
                uoa1 = uoa;
             }else if(e.k == null){
                e.k = new a(e.getCallback(), uoa);
             }
             f m = e.k;
             if (uoa1 != null) {
                uoa = uoa1.a;
                uoa.a = str3;
                uoa.b = str4;
                uoa = uoa1.b.get(uoa);
                if (uoa == null) {
                   uoa = uoa1.c.get(str3);
                   if (uoa == null) {
                      uoa = Typeface.createFromAsset(uoa1.d, "fonts/"+str3+uoa1.f);
                      uoa1.c.put(str3, uoa);
                   }
                   i9 = str4.contains("Italic");
                   boolean b = str4.contains("Bold");
                   if (i9 && b) {
                      uoa2 = 3;
                   }else if(i9){
                      uoa2 = 2;
                   }else if(b){
                      uoa2 = 1;
                   }else {
                      uoa2 = null;
                   }
                   if (uoa.getStyle() != uoa2) {
                      uoa = Typeface.create(uoa, uoa2);
                   }
                   uoa1.b.put(uoa1.a, uoa);
                }
             }
             if (uoa != null) {
                DocumentData a1 = uDocumentDat.a;
                m = og.E.m;
                if (m != null) {
                   if (m.d != null && m.a.containsKey(a1)) {
                      a1 = m.a.get(a1);
                   }else if(m.d != null){
                      m.a.put(a1, a1);
                   }
                }
                og.z.setTypeface(uoa);
                og.z.setTextSize((float)(uDocumentDat.c * (double)f.c()));
                og.A.setTypeface(og.z.getTypeface());
                og.A.setTextSize(og.z.getTextSize());
                f3 = (float)uDocumentDat.f * f.c();
                List list3 = og.x(a1);
                i9 = list3.size();
                for (i3 = 0; i3 < i9; i3 = i3 + 1) {
                   String str5 = list3.get(i3);
                   og.u(uDocumentDat.d, uCanvas, og.A.measureText(str5));
                   int i10 = i9 - 1;
                   f1 = (float)i10 * f3;
                   f1 = f1 / 2.00f;
                   f2 = (float)i3 * f3;
                   f2 = f2 - f1;
                   uCanvas.translate(0, f2);
                   i10 = 0;
                   while (i10 < str5.length()) {
                      int i11 = str5.codePointAt(i10);
                      i2 = Character.charCount(i11) + i10;
                      while (i2 < str5.length()) {
                         int i12 = str5.codePointAt(i2);
                         j = (Character.getType(i12) != 16 && (Character.getType(i12) != 27 && (Character.getType(i12) != 6 && (Character.getType(i12) == 28 || Character.getType(i12) == 19))))? 1: null;
                         if (!j) {
                            break ;
                         }
                         i2 = i2 + Character.charCount(i12);
                         i11 = i11 * 31;
                         i11 = i11 + i12;
                         i8 = 0x40000000;
                      }
                      long l = (long)i11;
                      if (og.C.containsKey(l)) {
                         str6 = og.C.get(l);
                      }else {
                         (og.w).setLength(0);
                         for (i8 = i10; i8 < i2; i8 = i8 + Character.charCount(i11)) {
                            i11 = str5.codePointAt(i8);
                            StringBuilder str7 = og.w+i11;
                         }
                         str6 = og.w;
                         og.C.put(l, str6);
                      }
                      i10 = i10 + str6.length();
                      if (uDocumentDat.k != null) {
                         og.v(str6, og.z, uCanvas);
                         og.v(str6, og.A, uCanvas);
                      }else {
                         og.v(str6, og.A, uCanvas);
                         og.v(str6, og.z, uCanvas);
                      }
                      f7 = og.z.measureText(str6, 0, 1);
                      float f8 = (float)uDocumentDat.e / 10.00f;
                      g j1 = og.J;
                      if (j1 != null) {
                         f8 = f8 + j1.h().floatValue();
                      }
                      f8 = f8 * f;
                      f7 = f7 + f8;
                      uCanvas.translate(f7, 0);
                      i8 = 0x40000000;
                   }
                   p0.setMatrix(p1);
                }
             }
          }
          p0.restore();
          return;
       }
    }
    public final void u(DocumentData$Justification p0,Canvas p1,float p2){
       int i = g$c.a[p0.ordinal()];
       if (i != 2) {
          if (i == 3) {
             p1.translate(((- p2) / 2.00f), 0);
          }
       }else {
          p1.translate((- p2), 0);
       }
       return;
    }
    public final void v(String p0,Paint p1,Canvas p2){
       if (!p1.getColor()) {
          return;
       }
       if (p1.getStyle() == Paint$Style.STROKE && !p1.getStrokeWidth()) {
          return;
       }
       p2.drawText(p0, 0, p0.length(), 0, 0, p1);
       return;
    }
    public final void w(Path p0,Paint p1,Canvas p2){
       if (!p1.getColor()) {
          return;
       }
       if (p1.getStyle() == Paint$Style.STROKE && !p1.getStrokeWidth()) {
          return;
       }
       p2.drawPath(p0, p1);
       return;
    }
    public final List x(String p0){
       return Arrays.asList(((p0.replaceAll("\r\n", "\r")).replaceAll("\n", "\r")).split("\r"));
    }
}
