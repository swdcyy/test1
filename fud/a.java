package fud.a;
import fud.c;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import fud.e;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import fud.c$a;
import java.lang.IllegalStateException;

public class a extends c	// class@000ee5
{
    public final int f;
    public final byte[] g;
    public final int h;
    public final byte[] i;
    public final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;

    static {
       a.k = new byte[2]{0x0d,0x0a};
       a.l = new byte[91]{0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19};
       a.m = new byte[32]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','2','3','4','5','6','7'};
       a.n = new byte[88]{0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20};
       a.o = new byte[32]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V'};
    }
    public void a(){
       super(false);
    }
    public void a(int p0){
       super(p0, a.k, false);
    }
    public void a(int p0,byte[] p1,boolean p2){
       int i = 0;
       int i1 = (p1 == null)? 0: p1.length;
       super(5, 8, p0, i1);
       if (p2) {
          this.i = a.o;
          this.g = a.n;
       }else {
          this.i = a.m;
          this.g = a.l;
       }
       if (p0 > 0) {
          if (p1 != null) {
             if (!this.a(p1)) {
                this.h = p1.length + 8;
                byte[] uobyteArray = new byte[p1.length];
                this.j = uobyteArray;
                System.arraycopy(p1, i, uobyteArray, i, p1.length);
             }else {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: ["+e.b(p1)+"]");
             }
          }else {
             throw new IllegalArgumentException("lineLength "+p0+" > 0, but lineSeparator is null");
          }
       }else {
          this.h = 8;
          this.j = null;
       }
       this.f = this.h - 1;
       return;
    }
    public void a(boolean p0){
       super(0, null, p0);
    }
    public void b(byte[] p0,int p1,int p2,c$a p3){
       c$a d1;
       c$a d2;
       a uoa = this;
       int i = p2;
       c$a uoa1 = p3;
       if (uoa1.f != null) {
          return;
       }
       int b = true;
       if (i < 0) {
          uoa1.f = b;
       }
       int i1 = p1;
       int i2 = 0;
       int i3 = 24;
       int i4 = 8;
       while (i2 < i) {
          int i5 = i1 + 1;
          i1 = p0[i1];
          if (i1 == 61) {
             uoa1.f = b;
             break ;
          }else {
             byte[] uobyteArray1 = uoa.f(uoa.f, uoa1);
             if (i1 >= 0) {
                a g = uoa.g;
                if (i1 < g.length) {
                   i1 = g[i1];
                   if (i1 >= 0) {
                      int i7 = uoa1.h + b;
                      i7 = i7 % i4;
                      uoa1.h = i7;
                      long l1 = uoa1.b << 5;
                      l1 = l1 + (long)i1;
                      uoa1.b = l1;
                      if (!i7) {
                         d1 = uoa1.d;
                         i1 = d1 + 1;
                         uoa1.d = i1;
                         long l2 = l1 >> 32;
                         long l3 = l2 & 255;
                         uobyteArray1[d1] = (byte)(int)l3;
                         b = i1 + 1;
                         uoa1.d = b;
                         long l4 = l1 >> i3;
                         l4 = l4 & 255;
                         uobyteArray1[i1] = (byte)(int)l4;
                         i1 = b + 1;
                         uoa1.d = i1;
                         l4 = l1 >> 16;
                         l4 = l4 & 255;
                         uobyteArray1[b] = (byte)(int)l4;
                         b = i1 + 1;
                         uoa1.d = b;
                         l4 = l1 >> 8;
                         l4 = l4 & 255;
                         uobyteArray1[i1] = (byte)(int)l4;
                         i1 = b + 1;
                         uoa1.d = i1;
                         l4 = l1 & 255;
                         uobyteArray1[b] = (byte)(int)l4;
                      }
                   }
                }
             }
             i2 = i2 + 1;
             i1 = i5;
             b = true;
          }
       }
       if (uoa1.f != null) {
          long l = 2;
          if (uoa1.h >= l) {
             byte[] uobyteArray = uoa.f(uoa.f, uoa1);
             switch (uoa1.h){
                 case 2:
                   c$a d = uoa1.d;
                   uoa1.d = d + 1;
                   uobyteArray[d] = (byte)(int)((uoa1.b >> l) & 255);
                   break;
                 case 3:
                   d1 = uoa1.d;
                   uoa1.d = d1 + 1;
                   uobyteArray[d1] = (byte)(int)((uoa1.b >> 7) & 255);
                   break;
                 case 4:
                   l = uoa1.b >> 4;
                   uoa1.b = l;
                   d2 = uoa1.d;
                   i3 = d2 + 1;
                   uoa1.d = i3;
                   uobyteArray[d2] = (byte)(int)((l >> 8) & 255);
                   uoa1.d = i3 + 1;
                   uobyteArray[i3] = (byte)(int)(l & 255);
                   break;
                 case 5:
                   l = uoa1.b >> 1;
                   uoa1.b = l;
                   d2 = uoa1.d;
                   i3 = d2 + 1;
                   uoa1.d = i3;
                   uobyteArray[d2] = (byte)(int)((l >> 16) & 255);
                   i2 = i3 + 1;
                   uoa1.d = i2;
                   uobyteArray[i3] = (byte)(int)((l >> 8) & 255);
                   uoa1.d = i2 + 1;
                   uobyteArray[i2] = (byte)(int)(l & 255);
                   break;
                 case 6:
                   l = uoa1.b >> 6;
                   uoa1.b = l;
                   d2 = uoa1.d;
                   i3 = d2 + 1;
                   uoa1.d = i3;
                   uobyteArray[d2] = (byte)(int)((l >> 16) & 255);
                   i2 = i3 + 1;
                   uoa1.d = i2;
                   uobyteArray[i3] = (byte)(int)((l >> 8) & 255);
                   uoa1.d = i2 + 1;
                   uobyteArray[i2] = (byte)(int)(l & 255);
                   break;
                 case 7:
                   l = uoa1.b >> 3;
                   uoa1.b = l;
                   d2 = uoa1.d;
                   int i6 = d2 + 1;
                   uoa1.d = i6;
                   uobyteArray[d2] = (byte)(int)((l >> i3) & 255);
                   i2 = i6 + 1;
                   uoa1.d = i2;
                   uobyteArray[i6] = (byte)(int)((l >> 16) & 255);
                   i3 = i2 + 1;
                   uoa1.d = i3;
                   uobyteArray[i2] = (byte)(int)((l >> 8) & 255);
                   uoa1.d = i3 + 1;
                   uobyteArray[i3] = (byte)(int)(l & 255);
                   break;
                 default:
                   throw new IllegalStateException("Impossible modulus "+uoa1.h);
             }
          }
       }
       return;
    }
    public void d(byte[] p0,int p1,int p2,c$a p3){
       c$a d;
       c$a uoa1;
       a i2;
       a j;
       int i4;
       a i5;
       c$a b1;
       int i6;
       int i11;
       c uoc = this;
       int i = p2;
       c$a uoa = p3;
       if (uoa.f != null) {
          return;
       }
       int i1 = 0;
       int b = true;
       if (i < 0) {
          uoa.f = b;
          if (uoa.h == null && uoc.d == null) {
             return;
          }else {
             byte[] uobyteArray = uoc.f(uoc.h, uoa);
             d = uoa.d;
             c$a h = uoa.h;
             if (h != null) {
                long l = 3;
                long l1 = 2;
                if (h != b) {
                   uoa1 = 4;
                   if (h != l1) {
                      if (h != l) {
                         if (h == uoa1) {
                            b = d + 1;
                            uoa.d = b;
                            i2 = uoc.i;
                            uoa1 = uoa.b;
                            uobyteArray[d] = i2[((int)(uoa1 >> 27) & 0x1f)];
                            int i3 = b + 1;
                            uoa.d = i3;
                            uobyteArray[b] = i2[((int)(uoa1 >> 22) & 0x1f)];
                            b = i3 + 1;
                            uoa.d = b;
                            uobyteArray[i3] = i2[((int)(uoa1 >> 17) & 0x1f)];
                            i3 = b + 1;
                            uoa.d = i3;
                            uobyteArray[b] = i2[((int)(uoa1 >> 12) & 0x1f)];
                            b = i3 + 1;
                            uoa.d = b;
                            uobyteArray[i3] = i2[((int)(uoa1 >> 7) & 0x1f)];
                            i3 = b + 1;
                            uoa.d = i3;
                            uobyteArray[b] = i2[((int)(uoa1 >> l1) & 0x1f)];
                            b = i3 + 1;
                            uoa.d = b;
                            uobyteArray[i3] = i2[((int)(uoa1 << l) & 0x1f)];
                            uoa.d = b + 1;
                            uobyteArray[b] = 61;
                         }else {
                            throw new IllegalStateException("Impossible modulus "+uoa.h);
                         }
                      }else {
                         i4 = d + 1;
                         uoa.d = i4;
                         i5 = uoc.i;
                         b1 = uoa.b;
                         uobyteArray[d] = i5[((int)(b1 >> 19) & 0x1f)];
                         i6 = i4 + 1;
                         uoa.d = i6;
                         uobyteArray[i4] = i5[((int)(b1 >> 14) & 0x1f)];
                         i4 = i6 + 1;
                         uoa.d = i4;
                         uobyteArray[i6] = i5[((int)(b1 >> 9) & 0x1f)];
                         i6 = i4 + 1;
                         uoa.d = i6;
                         uobyteArray[i4] = i5[((int)(b1 >> uoa1) & 0x1f)];
                         i4 = i6 + 1;
                         uoa.d = i4;
                         uobyteArray[i6] = i5[((int)(b1 << b) & 0x1f)];
                         b = i4 + 1;
                         uoa.d = b;
                         uobyteArray[i4] = 61;
                         i4 = b + 1;
                         uoa.d = i4;
                         uobyteArray[b] = 61;
                         uoa.d = i4 + 1;
                         uobyteArray[i4] = 61;
                      }
                   }else {
                      i4 = d + 1;
                      uoa.d = i4;
                      i5 = uoc.i;
                      b1 = uoa.b;
                      uobyteArray[d] = i5[((int)(b1 >> 11) & 0x1f)];
                      i6 = i4 + 1;
                      uoa.d = i6;
                      uobyteArray[i4] = i5[((int)(b1 >> 6) & 0x1f)];
                      i4 = i6 + 1;
                      uoa.d = i4;
                      uobyteArray[i6] = i5[((int)(b1 >> b) & 0x1f)];
                      b = i4 + 1;
                      uoa.d = b;
                      uobyteArray[i4] = i5[((int)(b1 << uoa1) & 0x1f)];
                      i4 = b + 1;
                      uoa.d = i4;
                      uobyteArray[b] = 61;
                      b = i4 + 1;
                      uoa.d = b;
                      uobyteArray[i4] = 61;
                      i4 = b + 1;
                      uoa.d = i4;
                      uobyteArray[b] = 61;
                      uoa.d = i4 + 1;
                      uobyteArray[i4] = 61;
                   }
                }else {
                   b = d + 1;
                   uoa.d = b;
                   i2 = uoc.i;
                   uoa1 = uoa.b;
                   uobyteArray[d] = i2[((int)(uoa1 >> l) & 0x1f)];
                   int i7 = b + 1;
                   uoa.d = i7;
                   uobyteArray[b] = i2[((int)(uoa1 << l1) & 0x1f)];
                   b = i7 + 1;
                   uoa.d = b;
                   uobyteArray[i7] = 61;
                   i4 = b + 1;
                   uoa.d = i4;
                   uobyteArray[b] = 61;
                   b = i4 + 1;
                   uoa.d = b;
                   uobyteArray[i4] = 61;
                   i4 = b + 1;
                   uoa.d = i4;
                   uobyteArray[b] = 61;
                   b = i4 + 1;
                   uoa.d = b;
                   uobyteArray[i4] = 61;
                   uoa.d = b + 1;
                   uobyteArray[b] = 61;
                }
             }
             h = uoa.d;
             b = uoa.g + (h - d);
             uoa.g = b;
             if (uoc.d > null && b > 0) {
                j = uoc.j;
                System.arraycopy(j, i1, uobyteArray, h, j.length);
                uoa.d = uoa.d + uoc.j.length;
             }
          }
       }else {
          int i8 = p1;
          i4 = 0;
          while (i4 < i) {
             byte[] uobyteArray1 = uoc.f(uoc.h, uoa);
             i6 = uoa.h + b;
             i6 = i6 % 5;
             uoa.h = i6;
             int i9 = i8 + 1;
             i8 = p0[i8];
             if (i8 < 0) {
                i8 = i8 + 256;
             }
             long l2 = uoa.b << 8;
             l2 = l2 + (long)i8;
             uoa.b = l2;
             if (!i6) {
                d = uoa.d;
                i6 = d + 1;
                uoa.d = i6;
                a i10 = uoc.i;
                long l3 = l2 >> 35;
                i1 = (int)l3 & 0x1f;
                uobyteArray1[d] = i10[i1];
                i1 = i6 + 1;
                uoa.d = i1;
                long l4 = l2 >> 30;
                b = (int)l4 & 0x1f;
                uobyteArray1[i6] = i10[b];
                b = i1 + 1;
                uoa.d = b;
                i6 = i9;
                long l5 = l2 >> 25;
                i8 = (int)l5 & 0x1f;
                uobyteArray1[i1] = i10[i8];
                i1 = b + 1;
                uoa.d = i1;
                l5 = l2 >> 20;
                i8 = (int)l5 & 0x1f;
                uobyteArray1[b] = i10[i8];
                b = i1 + 1;
                uoa.d = b;
                l5 = l2 >> 15;
                i8 = (int)l5 & 0x1f;
                uobyteArray1[i1] = i10[i8];
                i1 = b + 1;
                uoa.d = i1;
                l5 = l2 >> 10;
                i8 = (int)l5 & 0x1f;
                uobyteArray1[b] = i10[i8];
                b = i1 + 1;
                uoa.d = b;
                l5 = l2 >> 5;
                i8 = (int)l5 & 0x1f;
                uobyteArray1[i1] = i10[i8];
                i1 = b + 1;
                uoa.d = i1;
                i8 = (int)l2 & 0x1f;
                uobyteArray1[b] = i10[i8];
                b = uoa.g + 8;
                uoa.g = b;
                c d1 = uoc.d;
                if (d1 > null && d1 <= b) {
                   j = uoc.j;
                   i11 = 0;
                   System.arraycopy(j, i11, uobyteArray1, i1, j.length);
                   i1 = uoa.d + uoc.j.length;
                   uoa.d = i1;
                   uoa.g = i11;
                label_028b :
                   i4 = i4 + 1;
                   i8 = i6;
                   b = 1;
                }
             }else {
                i6 = i9;
             }
             i11 = 0;
             goto label_028b ;
          }
       }
       return;
    }
    public boolean g(byte p0){
       boolean b;
       if (p0 >= 0) {
          a tg = this.g;
          if (p0 < tg.length && tg[p0] != -1) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
}
