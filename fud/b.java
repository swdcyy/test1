package fud.b;
import fud.c;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import fud.e;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import fud.c$a;
import java.lang.IllegalStateException;

public class b extends c	// class@000ee6
{
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;
    public final int j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;

    static {
       b.k = new byte[2]{0x0d,0x0a};
       b.l = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       b.m = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
       b.n = new byte[123]{0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,0xff,'>',0xff,'>',0xff,'?','4','5','6','7','8','9',':',';','<','=',0xff,0xff,0xff,0xff,0xff,0xff,0xff,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0xff,0xff,0xff,0xff,'?',0xff,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20,'!','"','#','$','%','&',0x27,'(',')','*','+',',','-','.','/','0','1','2','3'};
    }
    public void b(){
       super(0);
    }
    public void b(int p0){
       super(p0, b.k, false);
    }
    public void b(int p0,byte[] p1,boolean p2){
       byte[] uobyteArray;
       int i = 0;
       int i1 = (p1 == null)? 0: p1.length;
       super(3, 4, p0, i1);
       this.g = b.n;
       i1 = 0;
       if (p1 != null) {
          if (!this.a(p1)) {
             if (p0 > 0) {
                this.j = p1.length + 4;
                uobyteArray = new byte[p1.length];
                this.h = uobyteArray;
                System.arraycopy(p1, i, uobyteArray, i, p1.length);
             }else {
                this.j = 4;
                this.h = i1;
             }
          }else {
             throw new IllegalArgumentException("lineSeparator must not contain base64 characters: ["+e.b(p1)+"]");
          }
       }else {
          this.j = 4;
          this.h = i1;
       }
       this.i = this.j - 1;
       uobyteArray = (p2)? b.m: b.l;
       this.f = uobyteArray;
       return;
    }
    public void b(boolean p0){
       super(76, b.k, p0);
    }
    public static byte[] i(String p0){
       return new b(0).c(p0);
    }
    public void b(byte[] p0,int p1,int p2,c$a p3){
       c$a h;
       c$a d;
       if (p3.f != null) {
          return;
       }
       int b = true;
       if (p2 < 0) {
          p3.f = b;
       }
       int i = 0;
       while (i < p2) {
          byte[] uobyteArray = this.f(this.i, p3);
          int i1 = p1 + 1;
          byte b1 = p0[p1];
          if (b1 == 61) {
             p3.f = b;
             break ;
          }else if(b1 >= 0){
             byte[] n = b.n;
             if (b1 < n.length) {
                b1 = n[b1];
                if (b1 >= 0) {
                   int i2 = p3.h + b;
                   i2 = i2 % 4;
                   p3.h = i2;
                   int i3 = p3.a << 6;
                   i3 = i3 + b1;
                   p3.a = i3;
                   if (!i2) {
                      h = p3.d;
                      i2 = h + 1;
                      p3.d = i2;
                      int i4 = i3 >> 16;
                      i4 = i4 & 0x00ff;
                      uobyteArray[h] = (byte)i4;
                      h = i2 + 1;
                      p3.d = h;
                      i4 = i3 >> 8;
                      i4 = i4 & 0x00ff;
                      uobyteArray[i2] = (byte)i4;
                      i2 = h + 1;
                      p3.d = i2;
                      i2 = i3 & 0x00ff;
                      uobyteArray[h] = (byte)i2;
                   }
                }
             }
          }
          i = i + 1;
          h = i1;
       }
       if (p3.f != null && p3.h != null) {
          p0 = this.f(this.i, p3);
          h = p3.h;
          if (h != b) {
             p2 = 2;
             if (h != p2) {
                if (h == 3) {
                   h = p3.a >> p2;
                   p3.a = h;
                   d = p3.d;
                   b = d + 1;
                   p3.d = b;
                   p0[d] = (byte)((h >> 8) & 0x00ff);
                   p3.d = b + 1;
                   p0[b] = (byte)(h & 0x00ff);
                }else {
                   throw new IllegalStateException("Impossible modulus "+p3.h);
                }
             }else {
                h = p3.a >> 4;
                p3.a = h;
                d = p3.d;
                p3.d = d + 1;
                p0[d] = (byte)(h & 0x00ff);
             }
          }
       }
       return;
    }
    public void d(byte[] p0,int p1,int p2,c$a p3){
       c$a d;
       int i;
       int i1;
       if (p3.f != null) {
          return;
       }
       boolean b = true;
       if (p2 < 0) {
          p3.f = b;
          if (p3.h == null && this.d == null) {
             return;
          }else {
             p0 = this.f(this.j, p3);
             d = p3.d;
             c$a h = p3.h;
             if (h != null) {
                if (h != b) {
                   if (h == 2) {
                      h = d + 1;
                      p3.d = h;
                      b tf = this.f;
                      c$a a = p3.a;
                      p0[d] = tf[((a >> 10) & 0x3f)];
                      i = h + 1;
                      p3.d = i;
                      p0[h] = tf[((a >> 4) & 0x3f)];
                      h = i + 1;
                      p3.d = h;
                      p0[i] = tf[((a << 2) & 0x3f)];
                      if (tf == b.l) {
                         p3.d = h + 1;
                         p0[h] = 61;
                      }
                   }else {
                      throw new IllegalStateException("Impossible modulus "+p3.h);
                   }
                }else {
                   h = d + 1;
                   p3.d = h;
                   b tf1 = this.f;
                   c$a a1 = p3.a;
                   p0[d] = tf1[((a1 >> 2) & 0x3f)];
                   i1 = h + 1;
                   p3.d = i1;
                   p0[h] = tf1[((a1 << 4) & 0x3f)];
                   if (tf1 == b.l) {
                      h = i1 + 1;
                      p3.d = h;
                      p0[i1] = 61;
                      p3.d = h + 1;
                      p0[h] = 61;
                   }
                }
             }
             c$a d1 = p3.d;
             h = p3.g + (d1 - d);
             p3.g = h;
             if (this.d > null && h > 0) {
                b th = this.h;
                System.arraycopy(th, 0, p0, d1, th.length);
                p3.d = p3.d + this.h.length;
             }
          }
       }else {
          int i2 = 0;
          while (i2 < p2) {
             byte[] uobyteArray = this.f(this.j, p3);
             i1 = p3.h + b;
             i1 = i1 % 3;
             p3.h = i1;
             i = p1 + 1;
             byte b1 = p0[p1];
             if (b1 < 0) {
                b1 = b1 + 256;
             }
             int i3 = p3.a << 8;
             i3 = i3 + b1;
             p3.a = i3;
             if (!i1) {
                d = p3.d;
                i1 = d + 1;
                p3.d = i1;
                b tf2 = this.f;
                int i4 = i3 >> 18;
                i4 = i4 & 0x3f;
                uobyteArray[d] = tf2[i4];
                d = i1 + 1;
                p3.d = d;
                i4 = i3 >> 12;
                i4 = i4 & 0x3f;
                uobyteArray[i1] = tf2[i4];
                i1 = d + 1;
                p3.d = i1;
                i4 = i3 >> 6;
                i4 = i4 & 0x3f;
                uobyteArray[d] = tf2[i4];
                d = i1 + 1;
                p3.d = d;
                i3 = i3 & 0x3f;
                uobyteArray[i1] = tf2[i3];
                i1 = p3.g + 4;
                p3.g = i1;
                c td = this.d;
                if (td > null && td <= i1) {
                   b th1 = this.h;
                   System.arraycopy(th1, 0, uobyteArray, d, th1.length);
                   d = p3.d + this.h.length;
                   p3.d = d;
                   p3.g = 0;
                }
             }
             i2 = i2 + 1;
             d = i;
          }
       }
       return;
    }
    public boolean g(byte p0){
       boolean b;
       if (p0 >= 0) {
          b tg = this.g;
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
