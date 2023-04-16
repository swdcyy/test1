package com.kuaishou.weapon.ks.g$c;
import com.kuaishou.weapon.ks.g$a;
import java.lang.AssertionError;

public class g$c extends g$a	// class@00120e
{
    public int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final byte[] k;
    public int l;
    public final byte[] m;
    public static final boolean h = true;
    public static final byte[] i;
    public static final byte[] j;

    static {
       g$c.i = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       g$c.j = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
    }
    public void g$c(int p0,byte[] p1){
       super();
       this.a = p1;
       boolean b = true;
       boolean b1 = (!(p0 & 0x01))? true: false;
       this.e = b1;
       b1 = (!(p0 & 0x02))? true: false;
       this.f = b1;
       if (!(p0 & 0x04)) {
          b = false;
       }
       this.g = b;
       byte[] i = (!(p0 & 0x08))? g$c.i: g$c.j;
       this.m = i;
       i = new byte[2];
       this.k = i;
       this.d = 0;
       i = (b1)? 19: -1;
       this.l = i;
       return;
    }
    public int a(int p0){
       return (((p0 * 8) / 5) + 10);
    }
    public boolean a(byte[] p0,int p1,int p2,boolean p3){
       int i4;
       int i5;
       int i7;
       int i8;
       int i10;
       int i11;
       g$c d1;
       g$c uoc = this;
       g$c m = uoc.m;
       g$a a = uoc.a;
       g$c l = uoc.l;
       int i = p2 + p1;
       g$c d = uoc.d;
       int i1 = -1;
       byte i2 = 0;
       int i3 = 2;
       if (d != 1) {
          if (d == i3) {
             i10 = p1 + 1;
             if (i10 <= i) {
                g$c k = uoc.k;
                i4 = k[i2] & 0x00ff;
                i4 = i4 << 16;
                i5 = k[1] & 0x00ff;
                i5 = i5 << 8;
                i5 = i5 | i4;
                i4 = p0[p1] & 0x00ff;
                i5 = i5 | i4;
                uoc.d = i2;
                i4 = i10;
             label_0053 :
                int i6 = 4;
                if (i5 != i1) {
                   i1 = i5 >> 18;
                   i1 = i1 & 0x3f;
                   a[i2] = m[i1];
                   i1 = i5 >> 12;
                   i1 = i1 & 0x3f;
                   a[1] = m[i1];
                   i1 = i5 >> 6;
                   i1 = i1 & 0x3f;
                   a[i3] = m[i1];
                   i1 = i5 & 0x3f;
                   a[3] = m[i1];
                   l = l - 1;
                   if (!l) {
                      if (uoc.g != null) {
                         i7 = 5;
                         a[i6] = 13;
                      }else {
                         i7 = 4;
                      }
                      i1 = i7 + 1;
                      a[i7] = 10;
                   label_008a :
                      i7 = 19;
                   }else {
                      i1 = 4;
                   }
                }else {
                   i1 = 0;
                }
                while (true) {
                   i5 = i4 + 3;
                   if (i5 <= i) {
                      i8 = p0[i4] & 0x00ff;
                      i8 = i8 << 16;
                      int i9 = i4 + 1;
                      i10 = p0[i9] & 0x00ff;
                      i10 = i10 << 8;
                      i10 = i10 | i8;
                      i4 = i4 + 2;
                      i4 = p0[i4] & 0x00ff;
                      i10 = i10 | i4;
                      i4 = i10 >> 18;
                      i4 = i4 & 0x3f;
                      a[i1] = m[i4];
                      i4 = i1 + 1;
                      i8 = i10 >> 12;
                      i8 = i8 & 0x3f;
                      a[i4] = m[i8];
                      i4 = i1 + 2;
                      i8 = i10 >> 6;
                      i8 = i8 & 0x3f;
                      a[i4] = m[i8];
                      i4 = i1 + 3;
                      i10 = i10 & 0x3f;
                      a[i4] = m[i10];
                      i1 = i1 + 4;
                      i7 = i7 - 1;
                      if (!i7) {
                         if (uoc.g != null) {
                            i7 = i1 + 1;
                            a[i1] = 13;
                            i1 = i7;
                         }
                         i7 = i1 + 1;
                         a[i1] = 10;
                         i1 = i7;
                         i4 = i5;
                         goto label_008a ;
                      }else {
                         i4 = i5;
                      }
                   }else if(p3){
                      d = uoc.d;
                      if ((i4 - d) == (i - 1)) {
                         if (d > null) {
                            i2 = uoc.k[i2];
                            i3 = 1;
                         }else {
                            i4 = i4 + 1;
                            i2 = p0[i4];
                            i3 = 0;
                         }
                         i2 = (i2 & 0x00ff) << i6;
                         uoc.d = d - i3;
                         i10 = i1 + 1;
                         a[i1] = m[((i2 >> 6) & 0x3f)];
                         i1 = i10 + 1;
                         a[i10] = m[(i2 & 0x3f)];
                         if (uoc.e != null) {
                            i11 = i1 + 1;
                            a[i1] = 61;
                            i1 = i11 + 1;
                            a[i11] = 61;
                         }
                         if (uoc.f != null) {
                            if (uoc.g != null) {
                               a[i1] = 13;
                               i1 = i1 + 1;
                            }
                            i11 = i1 + 1;
                            a[i1] = 10;
                         label_01b8 :
                            i1 = i11;
                         }
                      }else if((i4 - d) == (i - 2)){
                         if (d > 1) {
                            i2 = uoc.k[i2];
                            i5 = 1;
                         }else {
                            i2 = p0[i4];
                            i4 = i4 + 1;
                            i5 = 0;
                         }
                         i2 = (i2 & 0x00ff) << 10;
                         if (d > null) {
                            i8 = i5 + 1;
                            i5 = uoc.k[i5];
                         }else {
                            i8 = i5;
                            i5 = p0[i4];
                            i4 = i4 + 1;
                         }
                         i2 = i2 | ((i5 & 0x00ff) << 2);
                         uoc.d = d - i8;
                         i10 = i1 + 1;
                         a[i1] = m[((i2 >> 12) & 0x3f)];
                         i1 = i10 + 1;
                         a[i10] = m[((i2 >> 6) & 0x3f)];
                         i10 = i1 + 1;
                         a[i1] = m[(i2 & 0x3f)];
                         if (uoc.e != null) {
                            a[i10] = 61;
                            i10 = i10 + 1;
                         }
                         if (uoc.f != null) {
                            if (uoc.g != null) {
                               a[i10] = 13;
                               i10 = i10 + 1;
                            }
                            a[i10] = 10;
                            i10 = i10 + 1;
                         }
                         i1 = i10;
                      }else if(uoc.f != null && (i1 > 0 && i7 != 19)){
                         if (uoc.g != null) {
                            a[i1] = 13;
                            i1 = i1 + 1;
                         }
                         i11 = i1 + 1;
                         a[i1] = 10;
                         goto label_01b8 ;
                      }
                      i11 = g$c.h;
                      if (i11 || uoc.d == null) {
                         if (!i11 && i4 != i) {
                            throw new AssertionError();
                         }
                      }else {
                         throw new AssertionError();
                      }
                   }else if(i4 == (i - 1)){
                      d1 = uoc.d;
                      uoc.d = d1 + 1;
                      uoc.k[d1] = p0[i4];
                      break ;
                   }else if(i4 == (i - i3)){
                      m = uoc.k;
                      d1 = uoc.d;
                      i = d1 + 1;
                      uoc.d = i;
                      m[d1] = p0[i4];
                      uoc.d = i + 1;
                      m[i] = p0[(i4 + 1)];
                      break ;
                   }
                   break ;
                }
                uoc.b = i1;
                uoc.l = i7;
                return 1;
             }
          }
       }else {
          i10 = p1 + 2;
          if (i10 <= i) {
             i10 = uoc.k[i2] & 0x00ff;
             i10 = i10 << 16;
             i5 = p1 + 1;
             i4 = p0[p1] & 0x00ff;
             i4 = i4 << 8;
             i10 = i10 | i4;
             i4 = i5 + 1;
             i5 = p0[i5] & 0x00ff;
             i5 = i5 | i10;
             uoc.d = i2;
             goto label_0053 ;
          }
       }
       i4 = p1;
       i5 = -1;
       goto label_0053 ;
    }
}
