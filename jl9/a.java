package jl9.a;
import il9.a;
import lnc.a1;
import jl9.b;
import android.view.animation.DecelerateInterpolator;
import jl9.a$b;
import il9.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import il9.f;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.cdnresource.e;
import com.yxcorp.gifshow.util.cdnresource.m;
import jl9.a$c;
import android.graphics.Canvas;
import java.lang.Long;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class a extends a	// class@002b07
{
    public final b e;
    public final DecelerateInterpolator f;
    public final a$b[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public static final int s;

    static {
       a.s = a1.e(33.00f);
    }
    public void a(){
       super();
       this.e = new b();
       this.f = new DecelerateInterpolator(2.00f);
       a$b[] uobArray = new a$b[4];
       this.g = uobArray;
       this.n = 0x3f800000;
    }
    public void b(int p0,e p1){
       Bitmap uBitmap;
       int i2;
       a uoa1;
       String str3;
       int i6;
       int i7;
       Bitmap uBitmap1;
       int i = this;
       int i1 = p0;
       String str = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a uoa = a.class;
       String str1 = "5";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), str, i, uoa, str1)) {
          return;
       }
       int b = false;
       if (i1 < str.B) {
          i.q = b;
          return;
       }else if(i.q != null){
          return;
       }else {
          boolean b1 = true;
          if (i1 > str.C) {
             i.q = b1;
             this.l();
             return;
          }else {
             object oobject = i.g[b];
             if (oobject == null) {
                oobject = this.f();
                i.a(oobject);
             }
             String str2 = null;
             if (PatchProxy.isSupport(uoe)) {
                uBitmap = PatchProxy.applyOneRefs(Integer.valueOf(p0), str, uoe, "4");
                if (uBitmap != patchProxyRe) {
                }else {
                label_005d :
                   i2 = 0;
                   int i10 = 0;
                   e c1 = str.c;
                   while (i2 < c1.length && i1 >= c1[i2]) {
                      i10 = i2 + 1;
                      int i11 = i10;
                      i10 = i2;
                      i2 = i11;
                   }
                   uBitmap = str.d.get(str.b[i10]);
                   if (uBitmap == null) {
                      e x1 = str.x;
                      CdnResource$ResourceKey resourceKey1 = (x1 != null)? x1.get(str.b[i10]): str2;
                      if (TextUtils.isEmpty(str.t)) {
                         uBitmap = e.g(str.v, resourceKey1, str.u);
                         if (uBitmap == null) {
                            str.A = str2;
                            uBitmap = e.e(str.b[i10]);
                         }else {
                            str.A = e.i(str.v, str.u);
                         }
                      }else {
                         uBitmap = m.a(str.t, resourceKey1);
                      }
                      str.d.put(str.b[i10], uBitmap);
                   }
                }
             }else {
                goto label_005d ;
             }
             long l = (long)0x2710;
             oobject.e(uBitmap, l, i.r);
             i2 = oobject.d() + b;
             i.g[b] = oobject;
             int i3 = i1;
             int i4 = 0;
             int i5 = 1;
             while (i3) {
                i4 = i4 + 1;
                b = i3 % 10;
                object oobject1 = i.g[i4];
                if (oobject1 == null) {
                   oobject1 = this.f();
                   uoa1 = uoa;
                   str3 = str1;
                   i6 = i4;
                   i7 = i5;
                }else if(oobject1.e != b){
                   uoa1 = uoa;
                   if (PatchProxy.applyVoid(null, oobject1, a$b.class, str1)) {
                      str3 = str1;
                      i6 = i4;
                      i7 = i5;
                   }else {
                      oobject1.m = 1;
                      i6 = i4;
                      i7 = i5;
                      long l1 = 0;
                      str3 = str1;
                      oobject1.c.a(255, 0, l1);
                      oobject1.b.d(l1);
                   }
                   oobject1 = this.f();
                }else {
                   uoa1 = uoa;
                   str3 = str1;
                   i6 = i4;
                   i7 = i5;
                   uoa = null;
                label_0135 :
                   if (PatchProxy.isSupport(uoe)) {
                      uBitmap1 = PatchProxy.applyOneRefs(Integer.valueOf(b), str, uoe, "3");
                      if (uBitmap1 != patchProxyRe) {
                      }else {
                      label_014a :
                         uBitmap1 = str.d.get(str.a[b]);
                         if (uBitmap1 == null) {
                            e x = str.x;
                            CdnResource$ResourceKey resourceKey = (x != null)? x.get(str.a[b]): null;
                            if (TextUtils.isEmpty(str.t)) {
                               uBitmap1 = e.g(str.v, resourceKey, str.u);
                               if (uBitmap1 == null) {
                                  str.z = null;
                                  uBitmap1 = e.e(str.a[b]);
                               }else {
                                  str.z = e.i(str.v, str.u);
                               }
                            }else {
                               uBitmap1 = m.a(str.t, resourceKey);
                            }
                            str.d.put(str.a[b], uBitmap1);
                         }
                      }
                   }else {
                      goto label_014a ;
                   }
                   oobject1.e(uBitmap1, l, false);
                   oobject1.e = b;
                   i2 = i2 + oobject1.d();
                   i3 = i3 / 10;
                   if (uoa) {
                      i.a(oobject1);
                   }
                   i.g[i6] = oobject1;
                   i5 = i7 + 1;
                   uoa = uoa1;
                   i4 = i6;
                   str1 = str3;
                   str2 = null;
                }
                uoa = 1;
                goto label_0135 ;
             }
             uoa1 = uoa;
             i7 = i5;
             a p = i.p;
             if ((p - 1) > i4) {
                int i8 = p - 1;
                while (i8 > i4) {
                   object oobject2 = i.g[i8];
                   if (oobject2 != null) {
                      oobject2.a();
                      i.g[i8] = null;
                   }
                   i8 = i8 - 1;
                }
             }
             i.p = i7;
             p = i.c;
             i.l = p;
             i.j = p - i2;
             this.k();
             if (i1 != 2) {
                e c = str.c;
                int len = c.length;
                int i9 = 0;
                while (true) {
                   if (i9 < len) {
                      if (i1 == c[i9]) {
                         b = 1;
                      label_0204 :
                         if (b) {
                         label_0206 :
                            if (!PatchProxy.applyVoid(null, i, uoa1, "8")) {
                               i.o = true;
                               a j = i.j;
                               i.h = j + ((i.l - j) / 2);
                               i.i = i.m + a.s;
                               i.n = 0;
                               i.e.d(800);
                               break ;
                            }
                         }
                      }else {
                         i9 = i9 + 1;
                      }
                   }else {
                      b = 0;
                      goto label_0204 ;
                   }
                }
             }else {
                goto label_0206 ;
             }
             return;
          }
       }
    }
    public f c(){
       a$b uob = PatchProxy.apply(null, this, a.class, "10");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new a$b();
       }
       return uob;
    }
    public void d(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (this.o != null) {
          p0.save();
          p0.scale(this.n, this.n, (float)this.h, (float)this.i);
          super.d(p0);
          p0.restore();
       }else {
          super.d(p0);
       }
       return;
    }
    public void h(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
       }else {
          super.h(p0);
          int i = 0;
          a tg = this.g;
          while (i < tg.length) {
             if (p0 == tg[i]) {
                tg[i] = null;
             }
             i = i + 1;
          }
       }
       return;
    }
    public void i(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.k();
       super.i(p0);
       if (this.o != null && (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "2"))) {
          this.e.c(p0);
          if (this.e.b()) {
             this.o = false;
          }else {
             float interpolatio = this.f.getInterpolation(this.e.a());
             float f = 2.00f;
             float f1 = 0x3f000000;
             if (interpolatio - f1 <= 0) {
                this.n = (interpolatio * f) + 0.20f;
             }else {
                interpolatio = ((interpolatio - f1) * f) - 0x3f800000;
                f1 = interpolatio * interpolatio;
                this.n = 0x3f99999a - (((f1 * ((interpolatio * 2.50f) + 0x3fc00000)) + 0x3f800000) * 0.20f);
             }
          }
       }
       return;
    }
    public void j(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       super.j(p0, p1);
       this.d = this.d - a.s;
       return;
    }
    public final void k(){
       int i3;
       int i4;
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       int i = Integer.MAX_VALUE;
       a tl = this.l;
       int i1 = 0;
       int i2 = 0;
       while (i1 < this.p) {
          object oobject = this.g[i1];
          if (oobject != null) {
             a$b h = oobject.h;
             if (!i1) {
                i2 = h;
             }
             if (i1 > 0) {
                i3 = h - i2;
                i3 = i3 / 2;
                i4 = this.d + i3;
             }else {
                i4 = this.d;
             }
             int i5 = i4 - h;
             if (i > i5) {
                i = i5;
             }
             i3 = tl - oobject.d();
             oobject.i = i3;
             oobject.j = i5;
             oobject.k = tl;
             oobject.l = i4;
             int i6 = tl - oobject.d();
          }
          i1 = i1 + 1;
       }
       this.k = i;
       this.m = this.d;
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          a$b uob = iterator.next();
          Objects.requireNonNull(uob);
          if (PatchProxy.applyVoid(null, uob, a$b.class, "7")) {
             continue ;
          }else {
             uob.m = 3;
             uob.c.a(uob.o, 0, 150);
             uob.d.a(0, a.s, 150);
             uob.b.d(150);
          }
       }
       return;
    }
}
