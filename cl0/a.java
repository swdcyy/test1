package cl0.a;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.io.OutputStream;
import cl0.c;
import java.lang.Number;
import android.graphics.Color;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Math;
import cl0.b;

public class a	// class@0004da
{
    public int a;
    public int b;
    public int c;
    public int d;
    public Integer e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public OutputStream j;
    public Bitmap k;
    public byte[] l;
    public byte[] m;
    public int n;
    public byte[] o;
    public boolean[] p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean w;

    public void a(){
       super();
       this.e = null;
       this.g = -1;
       this.h = 0;
       this.i = false;
       boolean[] uobooleanArr = new boolean[256];
       this.p = uobooleanArr;
       this.q = 7;
       this.r = -1;
       this.s = false;
       this.t = true;
       this.u = false;
       this.v = 10;
    }
    public boolean a(Bitmap p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          int i = 0;
          if (PatchProxy.isSupport(a.class)) {
             obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(i), this, a.class, "4");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }
          }
          if (p0 != null && this.i != null) {
             if (this.u != null) {
                this.g(this.c, this.d);
             }else {
                this.g(p0.getWidth(), p0.getHeight());
             }
             this.k = p0;
             this.e();
             this.b();
             if (this.t != null) {
                if (!PatchProxy.applyVoid(null, this, a.class, "14")) {
                   this.n(this.a);
                   this.n(this.b);
                   this.j.write((this.q | 0x00f0));
                   this.j.write(i);
                   this.j.write(i);
                }
                this.l();
                if (this.g >= null) {
                   this.k();
                }
             }
             this.i();
             this.j(i, i);
             if (this.t == null) {
                this.l();
             }
             this.m();
             this.t = i;
             i = 1;
          }
       label_00a4 :
          b = i;
       }catch(java.io.IOException e0){
       }
       return b;
    }
    public final void b(){
       int i5;
       int i7;
       int i8;
       int i9;
       int i10;
       int i11;
       object oobject1;
       int i12;
       c uoc2;
       int i13;
       object oobject4;
       c uoc5;
       c c;
       c g;
       int i20;
       byte[] uobyteArray = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uobyteArray, a.class, "9")) {
          return;
       }
       a l = uobyteArray.l;
       int len = l.length;
       int i = len / 3;
       byte[] uobyteArray1 = new byte[i];
       uobyteArray.m = uobyteArray1;
       c uoc = new c(l, len, uobyteArray.v);
       c uoc1 = c.class;
       byte[] uobyteArray2 = PatchProxy.apply(objArray, uoc, uoc1, "2");
       int i1 = 255;
       int i2 = 3;
       int i3 = 256;
       int i4 = 1;
       if (uobyteArray2 != PatchProxyResult.class) {
          i5 = i;
       }else if(PatchProxy.applyVoid(objArray, uoc, uoc1, "1")){
          uoc1 = uoc.c;
          len = 1509;
          if (uoc1 < len) {
             uoc.d = i4;
          }
          c d = uoc.d;
          uoc.a = ((d - 1) / i2) + 30;
          c b = uoc.b;
          i8 = uoc1 / (d * 3);
          i12 = i8 / 100;
          i7 = 0;
          c uoc6 = 32;
          i10 = 1024;
          while (i7 < uoc6) {
             i9 = i7 * i7;
             i9 = i9 - 1024;
             i9 = i9 * 256;
             i9 = i9 / i10;
             i9 = i9 * 1024;
             uoc.i[i7] = i9;
             i7 = i7 + 1;
          }
          c = uoc.c;
          if (c < len) {
             len = 3;
          }else if(c % 499){
             len = 1497;
          }else if(c % 491){
             len = 1473;
          }else if(c % 487){
             len = 1461;
          }
          i7 = 2048;
          i9 = 0;
          int i14 = 0;
          int i15 = 1024;
          while (i9 < i8) {
             int i16 = i14 + 0;
             i10 = b[i16] & i1;
             i10 = i10 << 4;
             i16 = i14 + 1;
             i4 = b[i16] & i1;
             i4 = i4 << 4;
             i16 = i14 + 2;
             i11 = b[i16] & i1;
             i11 = i11 << 4;
             i16 = i8;
             c uoc7 = b;
             d = Integer.MAX_VALUE;
             i1 = Integer.MAX_VALUE;
             int i17 = 0;
             int i18 = -1;
             int i19 = -1;
             while (i17 < i3) {
                object oobject5 = uoc.e[i17];
                i5 = i;
                i = oobject5[0] - i10;
                if (i < 0) {
                   i = - i;
                }
                i13 = oobject5[1] - i4;
                if (i13 < 0) {
                   i13 = - i13;
                }
                i = i + i13;
                i3 = oobject5[2] - i11;
                if (i3 < 0) {
                   i3 = - i3;
                }
                i = i + i3;
                if (i < i1) {
                   i1 = i;
                   i18 = i17;
                }
                g = uoc.g;
                i3 = g[i17] >> 12;
                i = i - i3;
                if (i < d) {
                   i8 = i;
                   i19 = i17;
                }
                uoc5 = uoc.h;
                i3 = uoc5[i17] >> 10;
                i20 = uoc5[i17] - i3;
                uoc5[i17] = i20;
                i3 = i3 << 10;
                i = g[i17] + i3;
                g[i17] = i;
                i17 = i17 + 1;
                i3 = 256;
                i = i5;
             }
             i5 = i;
             g = uoc.h;
             i = g[i18] + 64;
             g[i18] = i;
             g = uoc.g;
             i = g[i18] - 0x10000;
             g[i18] = i;
             object oobject6 = uoc.e[i19];
             i1 = oobject6[0] - i10;
             i1 = i1 * i15;
             i3 = 1024;
             i1 = i1 / i3;
             i8 = oobject6[0] - i1;
             oobject6[0] = i8;
             i1 = oobject6[1] - i4;
             i1 = i1 * i15;
             i1 = i1 / i3;
             i8 = oobject6[1] - i1;
             oobject6[1] = i8;
             i = 2;
             i1 = oobject6[i] - i11;
             i1 = i1 * i15;
             i1 = i1 / i3;
             i8 = oobject6[i] - i1;
             oobject6[i] = i8;
             if (uoc6) {
                i13 = i19 - uoc6;
                if (i13 < -1) {
                   i13 = -1;
                }
                i8 = i19 + uoc6;
                if (i8 > 256) {
                   i8 = 256;
                }
                i1 = i19 + 1;
                i19 = i19 - 1;
                i = i19;
                i17 = 1;
                while (i1 < i8 || i > i13) {
                   i18 = i17 + 1;
                   i3 = uoc.i[i17];
                   if (i1 < i8) {
                      i20 = i1 + 1;
                      oobject1 = uoc.e[i1];
                      i17 = 0;
                      try{
                         int i21 = oobject1[i17] - i10;
                         i21 = i21 * i3;
                         i21 = i21 / 0x40000;
                         int i22 = oobject1[i17] - i21;
                         oobject1[i17] = i22;
                         i21 = oobject1[1] - i4;
                         i21 = i21 * i3;
                         i21 = i21 / 0x40000;
                         int i23 = oobject1[1] - i21;
                         oobject1[1] = i23;
                         i17 = 2;
                         i21 = oobject1[i17] - i11;
                         i21 = i21 * i3;
                         i21 = i21 / 0x40000;
                         int i24 = oobject1[i17] - i21;
                         oobject1[i17] = i24;
                         i1 = i20;
                      }catch(java.lang.Exception e0){
                      }
                   }
                   i17 = i18;
                   c uoc8 = 1024;
                }
             }
             i13 = i14 + len;
             if (i13 >= uoc1) {
                i13 = i13 - uoc.c;
             }
             i14 = i13;
             i9 = i9 + 1;
             if (!i12) {
                i12 = 1;
             }
             i13 = i9 % i12;
             if (!i13) {
                i13 = i15 / uoc.a;
                i15 = i15 - i13;
                i13 = i7 / 30;
                i7 = i7 - i13;
                i13 = i7 >> 6;
                if (i13 <= 1) {
                   i13 = 0;
                }
                for (i = 0; i < i13; i = i + 1) {
                   i1 = i13 * i13;
                   i2 = i * i;
                   i2 = i1 - i2;
                   i2 = i2 * 256;
                   i2 = i2 / i1;
                   i2 = i2 * i15;
                   uoc.i[i] = i2;
                }
                uoc6 = i13;
             }
             i8 = i16;
             b = uoc7;
             i = i5;
             i1 = 255;
             i3 = 256;
             i13 = this;
          }
       }
       i5 = i;
       for (i13 = 0; i13 < 256; i13 = i13 + 1) {
          uoc1 = uoc.e;
          object oobject2 = uoc1[i13];
          i = oobject2[0] >> 4;
          oobject2[0] = i;
          oobject2 = uoc1[i13];
          i = oobject2[1] >> 4;
          oobject2[1] = i;
          oobject2 = uoc1[i13];
          len = 2;
          i = oobject2[len] >> 4;
          oobject2[len] = i;
          uoc1[i13][3] = i13;
       }
       i13 = 0;
       int i6 = 0;
       i7 = 0;
       c uoc4 = 256;
       while (i13 < uoc4) {
          object oobject3 = uoc.e[i13];
          i8 = 1;
          i1 = oobject3[i8];
          i9 = i13 + 1;
          i3 = i13;
          i2 = i9;
          while (i2 < uoc4) {
             oobject4 = uoc.e[i2];
             if (oobject4[i8] < i1) {
                i1 = oobject4[i8];
                i3 = i2;
             }
             i2 = i2 + 1;
             uoc4 = 256;
             i8 = 1;
          }
          oobject4 = uoc.e[i3];
          if (i13 != i3) {
             i2 = oobject4[0];
             oobject4[0] = oobject3[0];
             oobject3[0] = i2;
             i2 = oobject4[1];
             oobject4[1] = oobject3[1];
             oobject3[1] = i2;
             i2 = oobject4[2];
             oobject4[2] = oobject3[2];
             oobject3[2] = i2;
             i8 = 3;
             i2 = oobject4[i8];
             oobject4[i8] = oobject3[i8];
             oobject3[i8] = i2;
          }
          if (i1 != i7) {
             i6 = i6 + i13;
             i = 1;
             i6 = i6 >> i;
             uoc.f[i7] = i6;
             i7 = i7 + i;
             while (i7 < i1) {
                uoc.f[i7] = i13;
             }
             i6 = i13;
             i7 = i1;
          }else {
             uoc5 = 1;
          }
          i13 = i9;
       }
       i = 1;
       len = 255;
       uoc.f[i7] = (i6 + len) >> i;
       i7 = i7 + i;
       i13 = 256;
       while (i7 < i13) {
          uoc.f[i7] = len;
          i7 = i7 + 1;
          uobyteArray2 = 255;
       }
       uobyteArray2 = new byte[768];
       int[] ointArray = new int[i13];
       for (i7 = 0; i7 < i13; i7 = i7 + 1) {
          ointArray[uoc.e[i7][3]] = i7;
       }
       i7 = 0;
       i = 0;
       while (i7 < i13) {
          i13 = ointArray[i7];
          i8 = i + 1;
          uoc2 = uoc.e;
          uobyteArray2[i] = (byte)uoc2[i13][0];
          i = i8 + 1;
          uobyteArray2[i8] = (byte)uoc2[i13][1];
          i8 = i + 1;
          uobyteArray2[i] = (byte)uoc2[i13][2];
          i7 = i7 + 1;
          i13 = 256;
       }
       a uoa = this;
       uoa.o = uobyteArray2;
       i6 = 0;
       a o = uoa.o;
       while (i6 < o.length) {
          len = o[i6];
          i = i6 + 2;
          o[i6] = o[i];
          o[i] = len;
          len = i6 / 3;
          uoa.p[len] = false;
          i6 = i6 + 3;
       }
       len = i5;
       i6 = 0;
       i7 = 0;
       while (i6 < len) {
          a l1 = uoa.l;
          i8 = i7 + 1;
          i1 = 255;
          i7 = l1[i7] & i1;
          i9 = i8 + 1;
          i8 = l1[i8] & i1;
          i2 = i9 + 1;
          i = l1[i9] & i1;
          i9 = uoc.f[i8];
          i3 = i9 - 1;
          i10 = 1000;
          i11 = -1;
          while (i9 < 256 || i3 >= 0) {
             i4 = 1;
             if (i9 < 256) {
                object oobject = uoc.e[i9];
                i4 = oobject[i4] - i8;
                if (i4 >= i10) {
                   i9 = 256;
                }else {
                   i9 = i9 + 1;
                   if (i4 < 0) {
                      i4 = - i4;
                   }
                   i1 = oobject[0] - i7;
                   if (i1 < 0) {
                      i1 = - i1;
                   }
                   i4 = i4 + i1;
                   if (i4 < i10) {
                      i1 = oobject[2] - i;
                      if (i1 < 0) {
                         i1 = - i1;
                      }
                      i4 = i4 + i1;
                      if (i4 < i10) {
                         i11 = oobject[3];
                         i10 = i4;
                      }
                   }
                }
             }
             if (i3 >= 0) {
                oobject1 = uoc.e[i3];
                i12 = i8 - oobject1[1];
                if (i12 >= i10) {
                   i3 = -1;
                }else {
                   i3 = i3 - 1;
                   if (i12 < 0) {
                      i12 = - i12;
                   }
                   i4 = oobject1[0] - i7;
                   if (i4 < 0) {
                      i4 = - i4;
                   }
                   i12 = i12 + i4;
                   if (i12 < i10) {
                      i4 = oobject1[2] - i;
                      if (i4 < 0) {
                         i4 = - i4;
                      }
                      i4 = i4 + i12;
                      if (i4 < i10) {
                         i11 = oobject1[3];
                         i10 = i4;
                      }
                   }
                   c uoc3 = 3;
                }
             }
             uoc2 = 255;
          }
          uoa.p[i11] = true;
          uoa.m[i6] = (byte)i11;
          i6 = i6 + 1;
          i7 = i2;
       }
       uoa.l = null;
       uoa.n = 8;
       uoa.q = 7;
       l = uoa.e;
       if (l != null) {
          uoa.f = uoa.c(l.intValue());
       }else if(uoa.w != null){
          uoa.f = uoa.c(0);
       }
       return;
    }
    public final int c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.o == null) {
          return -1;
       }else {
          int i = Color.red(p0);
          int i1 = Color.green(p0);
          p0 = Color.blue(p0);
          int i2 = 0x1000000;
          int len = this.o.length;
          int i3 = 0;
          int i4 = 0;
          while (i3 < len) {
             a to = this.o;
             int i5 = i3 + 1;
             i3 = to[i3] & 0x00ff;
             i3 = i - i3;
             int i6 = i5 + 1;
             i5 = to[i5] & 0x00ff;
             i5 = i1 - i5;
             int i7 = to[i6] & 0x00ff;
             i7 = p0 - i7;
             i3 = i3 * i3;
             i5 = i5 * i5;
             i3 = i3 + i5;
             i7 = i7 * i7;
             i3 = i3 + i7;
             i7 = i6 / 3;
             if (this.p[i7] && i3 < i2) {
                i2 = i3;
                i4 = i7;
             }
             i3 = i6 + 1;
          }
          return i4;
       }
    }
    public boolean d(){
       boolean b1;
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.i == null) {
          return false;
       }
       this.i = false;
       boolean b = true;
       try{
          this.j.write(59);
          this.j.flush();
          if (this.s != null) {
             this.j.close();
          }
          b1 = true;
       }catch(java.io.IOException e0){
          b1 = false;
       }
       this.f = 0;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = null;
       this.o = null;
       this.s = false;
       this.t = e0;
       return b1;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "11")) {
          return;
       }
       int width = this.k.getWidth();
       int height = this.k.getHeight();
       a ta = this.a;
       if (width != ta || height != this.b) {
          Bitmap uBitmap = Bitmap.createBitmap(ta, this.b, Bitmap$Config.ARGB_8888);
          new Canvas(uBitmap).drawBitmap(uBitmap, 0, 0, objArray);
          this.k = uBitmap;
       }
       int i = width * height;
       int[] ointArray = new int[i];
       this.k.getPixels(ointArray, 0, width, 0, 0, width, height);
       byte[] uobyteArray = new byte[(i * 3)];
       this.l = uobyteArray;
       boolean b = false;
       this.w = b;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i1 < i) {
          int i4 = ointArray[i1];
          if (!i4) {
             i2 = i2 + 1;
          }
          a tl = this.l;
          width = i3 + 1;
          height = i4 & 0x00ff;
          tl[i3] = (byte)height;
          i3 = width + 1;
          height = i4 >> 8;
          height = height & 0x00ff;
          tl[width] = (byte)height;
          width = i3 + 1;
          i4 = i4 >> 16;
          i4 = i4 & 0x00ff;
          tl[i3] = (byte)i4;
          i1 = i1 + 1;
          i3 = width;
       }
       if (((double)(i2 * 100) / (double)i) - 0x4010000000000000 > 0) {
          b = true;
       }
       this.w = b;
       return;
    }
    public void f(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.h = Math.round(((float)p0 / 10.00f));
       return;
    }
    public final void g(int p0,int p1){
       this.a = p0;
       this.b = p1;
    }
    public boolean h(OutputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.s = false;
       this.j = p0;
       try{
          this.o("GIF89a");
          boolean b = true;
          this.i = e0;
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public final void i(){
       int i;
       int i1;
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.j.write(33);
       this.j.write(249);
       this.j.write(4);
       if (this.e == null && this.w == null) {
          i = 0;
          i1 = 0;
       }else {
          i = 1;
          i1 = 2;
       }
       a tr = this.r;
       if (tr >= null) {
          i1 = tr & 0x07;
       }
       this.j.write((i | (((i1 << 2) | 0) | 0)));
       this.n(this.h);
       this.j.write(this.f);
       this.j.write(0);
       return;
    }
    public final void j(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "13")) {
          return;
       }
       this.j.write(44);
       this.n(p0);
       this.n(p1);
       this.n(this.a);
       this.n(this.b);
       if (this.t != null) {
          this.j.write(0);
       }else {
          this.j.write((this.q | 0x0080));
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       this.j.write(33);
       this.j.write(255);
       this.j.write(11);
       this.o("NETSCAPE2.0");
       this.j.write(3);
       this.j.write(1);
       this.n(this.g);
       this.j.write(0);
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       a to = this.o;
       this.j.write(to, 0, to.length);
       int i = this.o.length - 768;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.j.write(0);
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       b uob = new b(this.a, this.b, this.m, this.n);
       a tj = this.j;
       b uob1 = b.class;
       if (!PatchProxy.applyVoidOneRefs(tj, uob, uob1, "4")) {
          tj.write(uob.d);
          uob.e = uob.a * uob.b;
          uob.f = 0;
          int i = uob.d + 1;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), tj, uob, uob1, "3")) {
             uob.p = i;
             uob.o = false;
             uob.g = i;
             uob.i = uob.a(i);
             i = 1 << (i - 1);
             uob.q = i;
             uob.r = i + 1;
             uob.n = i + 2;
             uob.v = 0;
             i = uob.e();
             int i1 = 0;
             for (b m = uob.m; m < 0x10000; m = m * 2) {
                i1 = i1 + 1;
             }
             int i2 = i1 - 8;
             b m1 = uob.m;
             uob.c(m1);
             uob.f(uob.q, tj);
             int i3 = uob.e();
             while (i3 != -1) {
                int i4 = i3 << uob.h;
                i4 = i4 + i;
                int i5 = i3 << i2;
                i5 = i5 ^ i;
                b k = uob.k;
                if (k[i5] == i4) {
                   i = uob.l[i5];
                }else if(k[i5] >= 0){
                   int i6 = m1 - i5;
                   if (!i5) {
                      i6 = 1;
                   }
                   while (true) {
                      i5 = i5 - i6;
                      if (i5 < 0) {
                         i5 = i5 + m1;
                      }
                      b k1 = uob.k;
                      if (k1[i5] == i4) {
                         i = uob.l[i5];
                      }else {
                         if (k1[i5] >= 0) {
                            continue ;
                         }
                      }
                   }
                }
                uob.f(i, tj);
                b n = uob.n;
                if (n < uob.j) {
                   int i7 = n + 1;
                   uob.n = i7;
                   uob.l[i5] = n;
                   uob.k[i5] = i4;
                }else if(PatchProxy.applyVoidOneRefs(tj, uob, uob1, "2")){
                   uob.c(uob.m);
                   n = uob.q;
                   i4 = n + 2;
                   uob.n = i4;
                   uob.o = true;
                   uob.f(n, tj);
                }
                i = i3;
             }
             uob.f(i, tj);
             uob.f(uob.r, tj);
          }
          tj.write(0);
       }
       return;
    }
    public final void n(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "18")) {
          return;
       }
       this.j.write((p0 & 0x00ff));
       this.j.write(((p0 >> 8) & 0x00ff));
       return;
    }
    public final void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       for (int i = 0; i < p0.length(); i = i + 1) {
          this.j.write((byte)p0.charAt(i));
       }
       return;
    }
}
