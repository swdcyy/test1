package com.ta.utdid2.a.a.b$c;
import com.ta.utdid2.a.a.b$a;
import java.lang.AssertionError;

public class b$c extends b$a	// class@000cbe
{
    public int b;
    public final boolean b;
    public final boolean c;
    public int count;
    public final boolean d;
    public final byte[] d;
    public final byte[] e;
    public static final boolean a = true;
    public static final byte[] b;
    public static final byte[] c;

    static {
       b$c.b = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       b$c.c = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
    }
    public void b$c(int p0,byte[] p1){
       super();
       this.a = p1;
       boolean b = true;
       boolean b1 = (!(p0 & 0x01))? true: false;
       this.b = b1;
       b1 = (!(p0 & 0x02))? true: false;
       this.c = b1;
       if (!(p0 & 0x04)) {
          b = false;
       }
       this.d = b;
       byte[] b2 = (!(p0 & 0x08))? b$c.b: b$c.c;
       this.e = b2;
       b2 = new byte[2];
       this.d = b2;
       this.b = 0;
       b2 = (b1)? 19: -1;
       this.count = b2;
       return;
    }
    public boolean a(byte[] p0,int p1,int p2,boolean p3){
       int i4;
       int i5;
       int i7;
       int i8;
       int i10;
       int i11;
       b$c b1;
       b$c uoc = this;
       b$c e = uoc.e;
       b$a a = uoc.a;
       b$c count = uoc.count;
       int i = p2 + p1;
       b$c b = uoc.b;
       int i1 = -1;
       byte i2 = 0;
       int i3 = 2;
       if (b != 1) {
          if (b == i3) {
             i10 = p1 + 1;
             if (i10 <= i) {
                b$c d = uoc.d;
                i4 = d[i2] & 0x00ff;
                i4 = i4 << 16;
                i5 = d[1] & 0x00ff;
                i5 = i5 << 8;
                i5 = i5 | i4;
                i4 = p0[p1] & 0x00ff;
                i5 = i5 | i4;
                uoc.b = i2;
                i4 = i10;
             label_0053 :
                int i6 = 4;
                if (i5 != i1) {
                   i1 = i5 >> 18;
                   i1 = i1 & 0x3f;
                   a[i2] = e[i1];
                   i1 = i5 >> 12;
                   i1 = i1 & 0x3f;
                   a[1] = e[i1];
                   i1 = i5 >> 6;
                   i1 = i1 & 0x3f;
                   a[i3] = e[i1];
                   i1 = i5 & 0x3f;
                   a[3] = e[i1];
                   count = count - 1;
                   if (!count) {
                      if (uoc.d != null) {
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
                      a[i1] = e[i4];
                      i4 = i1 + 1;
                      i8 = i10 >> 12;
                      i8 = i8 & 0x3f;
                      a[i4] = e[i8];
                      i4 = i1 + 2;
                      i8 = i10 >> 6;
                      i8 = i8 & 0x3f;
                      a[i4] = e[i8];
                      i4 = i1 + 3;
                      i10 = i10 & 0x3f;
                      a[i4] = e[i10];
                      i1 = i1 + 4;
                      i7 = i7 - 1;
                      if (!i7) {
                         if (uoc.d != null) {
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
                      b = uoc.b;
                      i5 = i4 - b;
                      if (i5 == (i - 1)) {
                         if (b > null) {
                            i2 = uoc.d[i2];
                            i3 = 1;
                         }else {
                            i4 = i4 + 1;
                            i2 = p0[i4];
                            i3 = 0;
                         }
                         i2 = (i2 & 0x00ff) << i6;
                         uoc.b = b - i3;
                         i10 = i1 + 1;
                         a[i1] = e[((i2 >> 6) & 0x3f)];
                         i1 = i10 + 1;
                         a[i10] = e[(i2 & 0x3f)];
                         if (uoc.b != null) {
                            i11 = i1 + 1;
                            a[i1] = 61;
                            i1 = i11 + 1;
                            a[i11] = 61;
                         }
                         if (uoc.c != null) {
                            if (uoc.d != null) {
                               a[i1] = 13;
                               i1 = i1 + 1;
                            }
                            i11 = i1 + 1;
                            a[i1] = 10;
                         label_01b6 :
                            i1 = i11;
                         }
                      }else if(i5 == (i - 2)){
                         if (b > 1) {
                            i2 = uoc.d[i2];
                            i5 = 1;
                         }else {
                            i2 = p0[i4];
                            i4 = i4 + 1;
                            i5 = 0;
                         }
                         i2 = (i2 & 0x00ff) << 10;
                         if (b > null) {
                            i8 = i5 + 1;
                            i5 = uoc.d[i5];
                         }else {
                            i8 = i5;
                            i5 = p0[i4];
                            i4 = i4 + 1;
                         }
                         i2 = i2 | ((i5 & 0x00ff) << 2);
                         uoc.b = b - i8;
                         i10 = i1 + 1;
                         a[i1] = e[((i2 >> 12) & 0x3f)];
                         i1 = i10 + 1;
                         a[i10] = e[((i2 >> 6) & 0x3f)];
                         i10 = i1 + 1;
                         a[i1] = e[(i2 & 0x3f)];
                         if (uoc.b != null) {
                            a[i10] = 61;
                            i10 = i10 + 1;
                         }
                         if (uoc.c != null) {
                            if (uoc.d != null) {
                               a[i10] = 13;
                               i10 = i10 + 1;
                            }
                            i11 = i10 + 1;
                            a[i10] = 10;
                            goto label_01b6 ;
                         }else {
                            i1 = i10;
                         }
                      }else if(uoc.c != null && (i1 > 0 && i7 != 19)){
                         if (uoc.d != null) {
                            a[i1] = 13;
                            i1 = i1 + 1;
                         }
                         i11 = i1 + 1;
                         a[i1] = 10;
                         goto label_01b6 ;
                      }
                      i11 = b$c.a;
                      if (i11 || uoc.b == null) {
                         if (!i11 && i4 != i) {
                            throw new AssertionError();
                         }
                      }else {
                         throw new AssertionError();
                      }
                   }else if(i4 == (i - 1)){
                      b1 = uoc.b;
                      uoc.b = b1 + 1;
                      uoc.d[b1] = p0[i4];
                      break ;
                   }else if(i4 == (i - i3)){
                      e = uoc.d;
                      b1 = uoc.b;
                      i = b1 + 1;
                      uoc.b = i;
                      e[b1] = p0[i4];
                      uoc.b = i + 1;
                      e[i] = p0[(i4 + 1)];
                      break ;
                   }
                   break ;
                }
                uoc.a = i1;
                uoc.count = i7;
                return 1;
             }
          }
       }else {
          i10 = p1 + 2;
          if (i10 <= i) {
             i10 = uoc.d[i2] & 0x00ff;
             i10 = i10 << 16;
             i5 = p1 + 1;
             i4 = p0[p1] & 0x00ff;
             i4 = i4 << 8;
             i10 = i10 | i4;
             i4 = i5 + 1;
             i5 = p0[i5] & 0x00ff;
             i5 = i5 | i10;
             uoc.b = i2;
             goto label_0053 ;
          }
       }
       i4 = p1;
       i5 = -1;
       goto label_0053 ;
    }
}
