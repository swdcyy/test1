package com.heytap.mcssdk.a.a;
import com.heytap.mcssdk.a.b;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import org.apache.commons.codec.binary.StringUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.math.BigInteger;
import java.util.Objects;

public class a extends b	// class@000520
{
    public final byte[] t;
    public final byte[] u;
    public final byte[] v;
    public final int w;
    public final int x;
    public int y;
    public static final byte[] a;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;

    static {
       a.a = new byte[2]{0x0d,0x0a};
       a.p = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       a.q = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
       a.r = new byte[123]{0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,'>',0xff,'>',0xff,'?','4','5','6','7','8','9',':',';','<','=',0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0xff,0xff,0xff,0xff,'?',0xff,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20,'!','"','#','$','%','&',0x27,'(',')','*','+',',','-','.','/','0','1','2','3'};
    }
    public void a(){
       super(0);
    }
    public void a(int p0){
       super(p0, a.a);
    }
    public void a(int p0,byte[] p1){
       super(p0, p1, false);
    }
    public void a(int p0,byte[] p1,boolean p2){
       int i = 0;
       int i1 = (p1 == null)? 0: p1.length;
       super(3, 4, p0, i1);
       this.u = a.r;
       i1 = 0;
       if (p1 != null) {
          if (!this.l(p1)) {
             if (p0 > 0) {
                this.x = p1.length + 4;
                byte[] uobyteArray = new byte[p1.length];
                this.v = uobyteArray;
                System.arraycopy(p1, i, uobyteArray, i, p1.length);
             label_004c :
                this.w = this.x - 1;
                uobyteArray = (p2)? a.q: a.p;
                this.t = uobyteArray;
                return;
             }
          }else {
             throw new IllegalArgumentException("lineSeparator must not contain base64 characters: ["+StringUtils.newStringUtf8(p1)+"]");
          }
       }
       this.x = 4;
       this.v = i1;
       goto label_004c ;
    }
    public void a(boolean p0){
       super(76, a.a, p0);
    }
    public static boolean a(byte p0){
       if (p0 != 61) {
          if (p0 >= 0) {
             byte[] r = a.r;
             if (p0 >= r.length || r[p0] == -1) {
             }
          }else {
          }
       }
       boolean b = true;
    label_0014 :
       return b;
    }
    public static boolean a(String p0){
       return a.b(StringUtils.getBytesUtf8(p0));
    }
    public static boolean a(byte[] p0){
       return a.b(p0);
    }
    public static byte[] a(BigInteger p0){
       Objects.requireNonNull(p0, "encodeInteger called with null parameter");
       return a.a(a.b(p0), false);
    }
    public static byte[] a(byte[] p0,boolean p1){
       return a.a(p0, p1, false);
    }
    public static byte[] a(byte[] p0,boolean p1,boolean p2){
       return a.a(p0, p1, p2, Integer.MAX_VALUE);
    }
    public static byte[] a(byte[] p0,boolean p1,boolean p2,int p3){
       if (p0 == null || !p0.length) {
          return p0;
       }
       a uoa = (p1)? new a(p2): new a(0, a.a, p2);
       long l = uoa.m(p0);
       if (l - (long)p3 <= 0) {
          return uoa.encode(p0);
       }else {
          throw new IllegalArgumentException("Input array too big, the output array would be bigger \("+l+"\) than the specified maximum size of "+p3);
       }
    }
    public static boolean b(byte[] p0){
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          if (!a.a(p0[i]) && !b.c(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static byte[] b(String p0){
       return new a().c(p0);
    }
    public static byte[] b(BigInteger p0){
       int i = ((p0.bitLength() + 7) >> 3) << 3;
       byte[] uobyteArray = p0.toByteArray();
       int i1 = 1;
       if ((p0.bitLength() % 8) && ((p0.bitLength() / 8) + i1) == (i / 8)) {
          return uobyteArray;
       }
       int len = uobyteArray.length;
       if (!(p0.bitLength() % 8)) {
          len = len - 1;
       }else {
          i1 = 0;
       }
       i = i / 8;
       int i2 = i - len;
       byte[] uobyteArray1 = new byte[i];
       System.arraycopy(uobyteArray, i1, uobyteArray1, i2, len);
       return uobyteArray1;
    }
    public static byte[] c(byte[] p0){
       return a.a(p0, false);
    }
    public static String d(byte[] p0){
       return StringUtils.newStringUtf8(a.a(p0, false));
    }
    public static byte[] e(byte[] p0){
       return a.a(p0, false, true);
    }
    public static String f(byte[] p0){
       return StringUtils.newStringUtf8(a.a(p0, false, true));
    }
    public static byte[] g(byte[] p0){
       return a.a(p0, true);
    }
    public static byte[] h(byte[] p0){
       return new a().decode(p0);
    }
    public static BigInteger i(byte[] p0){
       return new BigInteger(1, a.h(p0));
    }
    public void a(byte[] p0,int p1,int p2){
       b tl;
       int i;
       a tt;
       int i1;
       int i2;
       if (this.j != null) {
          return;
       }
       int b = true;
       if (p2 < 0) {
          this.j = b;
          if (this.l == null && this.g == null) {
             return;
          }else {
             this.a(this.x);
             b ti = this.i;
             tl = this.l;
             b uob = 61;
             if (tl != b) {
                if (tl == 2) {
                   tl = this.h;
                   i = ti + 1;
                   this.i = i;
                   tt = this.t;
                   a ty = this.y;
                   tl[ti] = tt[((ty >> 10) & 0x3f)];
                   i1 = i + 1;
                   this.i = i1;
                   tl[i] = tt[((ty >> 4) & 0x3f)];
                   i = i1 + 1;
                   this.i = i;
                   tl[i1] = tt[((ty << 2) & 0x3f)];
                   if (tt == a.p) {
                      this.i = i + 1;
                      tl[i] = uob;
                   }
                }
             }else {
                tl = this.h;
                b = ti + 1;
                this.i = b;
                a tt1 = this.t;
                tt = this.y;
                tl[ti] = tt1[((tt >> 2) & 0x3f)];
                i2 = b + 1;
                this.i = i2;
                tl[b] = tt1[((tt << 4) & 0x3f)];
                if (tt1 == a.p) {
                   b = i2 + 1;
                   this.i = b;
                   tl[i2] = uob;
                   this.i = b + 1;
                   tl[b] = uob;
                }
             }
             uob = this.i;
             tl = this.k + (uob - ti);
             this.k = tl;
             if (this.g > null && tl > 0) {
                a tv = this.v;
                System.arraycopy(tv, 0, this.h, uob, tv.length);
                this.i = this.i + this.v.length;
             }
          }
       }else {
          i = 0;
          while (i < p2) {
             this.a(this.x);
             int i3 = this.l + b;
             i3 = i3 % 3;
             this.l = i3;
             i2 = p1 + 1;
             byte b1 = p0[p1];
             if (b1 < 0) {
                b1 = b1 + 256;
             }
             i1 = this.y << 8;
             i1 = i1 + b1;
             this.y = i1;
             if (!i3) {
                tl = this.h;
                b ti1 = this.i;
                int i4 = ti1 + 1;
                this.i = i4;
                a tt2 = this.t;
                int i5 = i1 >> 18;
                i5 = i5 & 0x3f;
                tl[ti1] = tt2[i5];
                i3 = i4 + 1;
                this.i = i3;
                i5 = i1 >> 12;
                i5 = i5 & 0x3f;
                tl[i4] = tt2[i5];
                i4 = i3 + 1;
                this.i = i4;
                i5 = i1 >> 6;
                i5 = i5 & 0x3f;
                tl[i3] = tt2[i5];
                i3 = i4 + 1;
                this.i = i3;
                i1 = i1 & 0x3f;
                tl[i4] = tt2[i1];
                i1 = this.k + 4;
                this.k = i1;
                b tg = this.g;
                if (tg > null && tg <= i1) {
                   a tv1 = this.v;
                   System.arraycopy(tv1, 0, tl, i3, tv1.length);
                   tl = this.i + this.v.length;
                   this.i = tl;
                   this.k = 0;
                }
             }
             i = i + 1;
             tl = i2;
          }
       }
       return;
    }
    public boolean a(){
       boolean b = (this.t == a.q)? true: false;
       return b;
    }
    public void b(byte[] p0,int p1,int p2){
       byte b1;
       int i2;
       b th;
       b ti;
       if (this.j != null) {
          return;
       }
       int b = true;
       if (p2 < 0) {
          this.j = b;
       }
       int i = 0;
       while (i < p2) {
          this.a(this.w);
          int i1 = p1 + 1;
          b1 = p0[p1];
          if (b1 == 61) {
             this.j = b;
             break ;
          }else if(b1 >= 0){
             byte[] r = a.r;
             if (b1 < r.length) {
                b1 = r[b1];
                if (b1 >= 0) {
                   int i3 = this.l + b;
                   i3 = i3 % 4;
                   this.l = i3;
                   int i4 = this.y << 6;
                   i4 = i4 + b1;
                   this.y = i4;
                   if (!i3) {
                      th = this.h;
                      b ti1 = this.i;
                      int i5 = ti1 + 1;
                      this.i = i5;
                      int i6 = i4 >> 16;
                      i6 = i6 & 0x00ff;
                      th[ti1] = (byte)i6;
                      i3 = i5 + 1;
                      this.i = i3;
                      i6 = i4 >> 8;
                      i6 = i6 & 0x00ff;
                      th[i5] = (byte)i6;
                      i5 = i3 + 1;
                      this.i = i5;
                      i4 = i4 & 0x00ff;
                      th[i3] = (byte)i4;
                   }
                }
             }
          }
          i = i + 1;
          th = i1;
       }
       if (this.j != null && this.l != null) {
          this.a(this.w);
          b tl = this.l;
          b1 = 2;
          if (tl != b1) {
             if (tl == 3) {
                i2 = this.y >> b1;
                this.y = i2;
                th = this.h;
                ti = this.i;
                b = ti + 1;
                this.i = b;
                th[ti] = (byte)((i2 >> 8) & 0x00ff);
                this.i = b + 1;
                th[b] = (byte)(i2 & 0x00ff);
             }
          }else {
             i2 = this.y >> 4;
             this.y = i2;
             ti = this.i;
             this.i = ti + 1;
             b1[ti] = (byte)(i2 & 0x00ff);
          }
       }
       return;
    }
    public boolean b(byte p0){
       boolean b;
       if (p0 >= 0) {
          a tu = this.u;
          if (p0 < tu.length && tu[p0] != -1) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
}
