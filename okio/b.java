package okio.b;
import okio.d;
import okio.c;
import java.lang.Cloneable;
import java.nio.channels.ByteChannel;
import okio.b$a;
import nsd.u;
import zsd.d;
import java.nio.charset.Charset;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Long;
import cud.l;
import cud.c;
import okio.ByteString;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import kotlin.TypeCastException;
import java.lang.Integer;
import okio.n;
import java.io.EOFException;
import okio.m;
import cud.f;
import okio.b$b;
import java.lang.IllegalStateException;
import java.io.InputStream;
import okio.b$c;
import java.io.OutputStream;
import okio.b$d;
import cud.h;
import okio.l;
import okio.SegmentedByteString;
import java.util.Objects;
import java.lang.AssertionError;
import java.nio.ByteBuffer;
import cud.m;
import java.lang.System;
import java.lang.NumberFormatException;
import okio.o;
import cud.b;

public final class b implements d, c, Cloneable, ByteChannel	// class@0020f1
{
    public l b;
    public long c;
    public static final byte[] d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
       byte[] bytes = ("0123456789abcdef").getBytes(d.a);
       a.h(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       b.d = bytes;
    }
    public void b(){
       super();
    }
    public b A(long p0){
       if (!p0) {
          this.y(48);
          return this;
       }else {
          int i = (Long.numberOfTrailingZeros(Long.highestOneBit(p0)) / 4) + 1;
          l ol = this.s(i);
          l a = ol.a;
          l c = ol.c;
          for (int i1 = (c + i) - 1; i1 >= c; i1 = i1 - 1) {
             long l = 15 & p0;
             a[i1] = b.d[(int)l];
             p0 = p0 >> 4;
          }
          ol.c = ol.c + i;
          this.c = this.c + (long)i;
          return this;
       }
    }
    public b C(int p0){
       l ol = this.s(4);
       l a = ol.a;
       l c = ol.c;
       int i = c + 1;
       a[c] = (byte)((p0 >> 24) & 0x00ff);
       int i1 = i + 1;
       a[i] = (byte)((p0 >> 16) & 0x00ff);
       i = i1 + 1;
       a[i1] = (byte)((p0 >> 8) & 0x00ff);
       a[i] = (byte)(p0 & 0x00ff);
       ol.c = i + 1;
       this.c = this.c + 4;
       return this;
    }
    public b E(int p0){
       this.C(c.c(p0));
       return this;
    }
    public long H(ByteString p0,long p1){
       int b1;
       long l3;
       l a;
       long l4;
       long l5;
       long l6;
       byte i5;
       int i6;
       b uob = this;
       long l = p1;
       a.q(p0, "bytes");
       int i = 0;
       int i1 = 1;
       int i2 = (p0.size() > 0)? 1: 0;
       if (i2) {
          long l1 = 0;
          if (l - l1 < 0) {
             i1 = 0;
          }
          if (i1) {
             b b = uob.b;
             if (b != null) {
                long l2 = 1;
                if ((this.p() - l) - l < 0) {
                   l1 = this.p();
                   while (l1 - l > 0) {
                      b = b.g;
                      if (b == null) {
                         a.L();
                      }
                      i1 = b.c - b.b;
                      l1 = l1 - (long)i1;
                   }
                   byte[] uobyteArray = p0.internalArray$jvm();
                   b1 = uobyteArray[i];
                   int i3 = p0.size();
                   l3 = (uob.c - (long)i3) + l2;
                   l2 = l1;
                   b uob1 = b;
                   while (true) {
                      if (l2 - l3 >= 0) {
                         return -1;
                      }
                      a = uob1.a;
                      l4 = (long)uob1.b + l3;
                      l4 = l4 - l2;
                      l5 = l3;
                      int i4 = (int)Math.min((long)uob1.c, l4);
                      l6 = (long)uob1.b + l;
                      l6 = l6 - l2;
                      i5 = (int)l6;
                      while (true) {
                         if (i5 < i4) {
                            if (a[i5] == b1) {
                               i2 = i5 + 1;
                               if (this.h(uob1, i2, uobyteArray, 1, i3)) {
                                  break ;
                               }
                            }
                            i5 = i5 + 1;
                         }else {
                            i6 = uob1.c - uob1.b;
                            l2 = l2 + (long)i6;
                            uob1 = uob1.f;
                            if (uob1 == null) {
                               a.L();
                            }
                            l = l2;
                            l3 = l5;
                         }
                      }
                      return ((long)(i5 - uob1.b) + l2);
                   }
                }else {
                   i1 = b.c - b.b;
                   l3 = (long)i1 + l1;
                   while (l3 - l <= 0) {
                      b = b.f;
                      if (b == null) {
                         a.L();
                      }
                      uob = this;
                      l1 = l3;
                   }
                   byte[] uobyteArray1 = p0.internalArray$jvm();
                   i5 = uobyteArray1[i];
                   int i7 = p0.size();
                   long l7 = (uob.c - (long)i7) + l2;
                   uob = b;
                   while (true) {
                      if (l1 - l7 >= 0) {
                         return -1;
                      }
                      l a1 = uob.a;
                      l4 = (long)uob.b + l7;
                      l4 = l4 - l1;
                      l5 = l7;
                      b1 = (int)Math.min((long)uob.c, l4);
                      l6 = (long)uob.b + l;
                      l6 = l6 - l1;
                      int i8 = (int)l6;
                      while (true) {
                         if (i8 < b1) {
                            if (a1[i8] == i5) {
                               i2 = i8 + 1;
                               if (this.h(uob, i2, uobyteArray1, 1, i7)) {
                                  break ;
                               }
                            }
                            i8 = i8 + 1;
                         }else {
                            i6 = uob.c - uob.b;
                            l1 = l1 + (long)i6;
                            l f = uob.f;
                            if (f == null) {
                               a.L();
                            }
                            l = l1;
                            l7 = l5;
                         }
                      }
                      return ((long)(i8 - uob.b) + l1);
                   }
                }
             }else {
                return -1;
             }
          }else {
             throw new IllegalArgumentException("fromIndex < 0: "+l.toString());
          }
       }else {
          throw new IllegalArgumentException("bytes is empty".toString());
       }
    }
    public b I(long p0){
       l ol = this.s(8);
       l a = ol.a;
       l c = ol.c;
       int i = c + 1;
       a[c] = (byte)(int)((p0 >> 56) & 255);
       int i1 = i + 1;
       a[i] = (byte)(int)((p0 >> 48) & 255);
       i = i1 + 1;
       a[i1] = (byte)(int)((p0 >> 40) & 255);
       i1 = i + 1;
       a[i] = (byte)(int)((p0 >> 32) & 255);
       i = i1 + 1;
       a[i1] = (byte)(int)((p0 >> 24) & 255);
       i1 = i + 1;
       a[i] = (byte)(int)((p0 >> 16) & 255);
       i = i1 + 1;
       a[i1] = (byte)(int)((p0 >> 8) & 255);
       a[i] = (byte)(int)(p0 & 255);
       ol.c = i + 1;
       this.c = this.c + 8;
       return this;
    }
    public b J(long p0){
       this.I(c.d(p0));
       return this;
    }
    public b K(int p0){
       l ol = this.s(2);
       l a = ol.a;
       l c = ol.c;
       int i = c + 1;
       a[c] = (byte)((p0 >> 8) & 0x00ff);
       a[i] = (byte)(p0 & 0x00ff);
       ol.c = i + 1;
       this.c = this.c + 2;
       return this;
    }
    public b L(int p0){
       this.K(c.e((short)p0));
       return this;
    }
    public long L2(ByteString p0,long p1){
       l g;
       byte i3;
       byte bytex;
       l a;
       long l1;
       int i4;
       l c;
       l b;
       byte[] uobyteArray;
       int len;
       a.q(p0, "targetBytes");
       long l = 0;
       byte i = 0;
       int i1 = 1;
       b uob = (p1 - l >= 0)? 1: null;
       if (uob) {
          uob = this.b;
          if (uob != null) {
             int i2 = 2;
             if ((this.p() - p1) - p1 < 0) {
                l = this.p();
                while (l - p1 > 0) {
                   g = uob.g;
                   if (g == null) {
                      a.L();
                   }
                   i3 = g.c - g.b;
                   l = l - (long)i3;
                }
                if (p0.size() == i2) {
                   i = p0.getByte(i);
                   bytex = p0.getByte(i1);
                   while (true) {
                      if (l - this.c < 0) {
                         a = uob.a;
                         l1 = (long)uob.b + p1;
                         l1 = l1 - l;
                         i4 = (int)l1;
                         c = uob.c;
                         while (true) {
                            if (i4 < c) {
                               i3 = a[i4];
                               if (i3 == i || i3 == bytex) {
                               label_0063 :
                                  b = uob.b;
                                  break ;
                               }else {
                                  i4++;
                               }
                            }else {
                               i4 = uob.c - uob.b;
                               l = l + (long)i4;
                               g = uob.f;
                               if (g == null) {
                                  a.L();
                               }
                               i4 = l;
                            }
                         }
                         return ((long)(i4 - b) + l);
                      }
                   }
                }else {
                   uobyteArray = p0.internalArray$jvm();
                   while (l - this.c < 0) {
                      a = uob.a;
                      l1 = (long)uob.b + p1;
                      l1 = l1 - l;
                      i4 = (int)l1;
                      c = uob.c;
                      while (true) {
                         if (i4 < c) {
                            i3 = a[i4];
                            len = uobyteArray.length;
                            i2 = 0;
                            while (true) {
                               if (i2 < len) {
                                  if (i3 != uobyteArray[i2]) {
                                     i2 = i2 + 1;
                                  }
                               }else {
                                  i4++;
                               }
                            }
                         }else {
                            i4 = uob.c - uob.b;
                            l = l + (long)i4;
                            g = uob.f;
                            if (g == null) {
                               a.L();
                            }
                            i4 = l;
                         }
                      }
                   }
                }
                return -1;
             }else {
                i3 = uob.c - uob.b;
                l1 = (long)i3 + l;
                while (l1 - p1 <= 0) {
                   g = uob.f;
                   if (g == null) {
                      a.L();
                   }
                   l = l1;
                }
                if (p0.size() == i2) {
                   i = p0.getByte(i);
                   bytex = p0.getByte(i1);
                   while (true) {
                      if (l - this.c < 0) {
                         a = uob.a;
                         l1 = (long)uob.b + p1;
                         l1 = l1 - l;
                         i4 = (int)l1;
                         c = uob.c;
                         while (true) {
                            if (i4 < c) {
                               i3 = a[i4];
                               if (i3 == i || i3 == bytex) {
                                  goto label_0063 ;
                               }else {
                                  i4++;
                               }
                            }else {
                               i4 = uob.c - uob.b;
                               l = l + (long)i4;
                               g = uob.f;
                               if (g == null) {
                                  a.L();
                               }
                               i4 = l;
                            }
                         }
                      }
                   }
                }else {
                   uobyteArray = p0.internalArray$jvm();
                   while (l - this.c < 0) {
                      a = uob.a;
                      l1 = (long)uob.b + p1;
                      l1 = l1 - l;
                      i4 = (int)l1;
                      c = uob.c;
                      while (true) {
                         if (i4 < c) {
                            i3 = a[i4];
                            len = uobyteArray.length;
                            i2 = 0;
                            while (true) {
                               if (i2 < len) {
                                  if (i3 != uobyteArray[i2]) {
                                     i2 = i2 + 1;
                                  }
                               }else {
                                  i4++;
                               }
                            }
                         }else {
                            i4 = uob.c - uob.b;
                            l = l + (long)i4;
                            g = uob.f;
                            if (g == null) {
                               a.L();
                            }
                            i4 = l;
                         }
                      }
                   }
                }
                return -1;
             }
             b = uob.b;
             goto label_0065 ;
          }else {
             return -1;
          }
       }else {
          throw new IllegalArgumentException("fromIndex < 0: "+p1.toString());
       }
    }
    public b M(String p0,int p1,int p2,Charset p3){
       a.q(p0, "string");
       a.q(p3, "charset");
       Charset uCharset = 1;
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          i = (p2 >= p1)? 1: 0;
          if (i) {
             if (p2 > p0.length()) {
                uCharset = null;
             }
             if (uCharset) {
                if (a.g(p3, d.a)) {
                   this.Q(p0, p1, p2);
                   return this;
                }else {
                   p0 = p0.substring(p1, p2);
                   a.h(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                   if (p0 != null) {
                      byte[] bytes = p0.getBytes(p3);
                      a.h(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                      this.x(bytes, 0, bytes.length);
                      return this;
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                   }
                }
             }else {
                throw new IllegalArgumentException("endIndex > string.length: "+p2+" > "+p0.length().toString());
             }
          }else {
             throw new IllegalArgumentException("endIndex < beginIndex: "+p2+" < "+p1.toString());
          }
       }else {
          throw new IllegalArgumentException("beginIndex < 0: "+p1.toString());
       }
    }
    public long N(ByteString p0){
       a.q(p0, "targetBytes");
       return this.L2(p0, 0);
    }
    public b O(String p0,Charset p1){
       a.q(p0, "string");
       a.q(p1, "charset");
       return this.M(p0, 0, p0.length(), p1);
    }
    public b P(String p0){
       a.q(p0, "string");
       this.Q(p0, 0, p0.length());
       return this;
    }
    public b Q(String p0,int p1,int p2){
       l ol;
       l a;
       int i1;
       int i2;
       int i3;
       long l;
       l a1;
       l c3;
       l c4;
       int i5;
       int i6;
       a.q(p0, "string");
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          i = (p2 >= p1)? 1: 0;
          if (i) {
             char c = (p2 <= p0.length())? 1: 0;
             if (c) {
                while (p1 < p2) {
                   c = p0.charAt(p1);
                   if (c < 128) {
                      ol = this.s(1);
                      a = ol.a;
                      i1 = ol.c - p1;
                      i2 = i1 - 8192;
                      i2 = Math.min(p2, i2);
                      p1 = p1 + i1;
                      a[p1] = (byte)c;
                      for (i3 = p1 + 1; i3 < i2; i3 = i) {
                         char c1 = p0.charAt(i3);
                         if (c1 >= 128) {
                         }
                         i = i3 + 1;
                         i3 = i3 + i1;
                         a[i3] = (byte)c1;
                      }
                      i1 = i1 + i3;
                      l c2 = ol.c;
                      i1 = i1 - c2;
                      c2 = c2 + i1;
                      ol.c = c2;
                      l = this.c + (long)i1;
                      this.c = l;
                      c2 = i3;
                   }else if(c < 2048){
                      a = this.s(2);
                      a1 = a.a;
                      c3 = a.c;
                      i3 = c >> 6;
                      i3 = i3 | 0x00c0;
                      a1[c3] = (byte)i3;
                      i3 = c3 + 1;
                      i = c & 0x3f;
                      i = i | 128;
                      a1[i3] = (byte)i;
                      i2 = c3 + 2;
                      a.c = i2;
                      l = this.c + 2;
                      this.c = l;
                   }else {
                      int i4 = 63;
                      if (c >= 0xd800) {
                         ol = 0xdfff;
                         if (c <= ol) {
                            i1 = p1 + 1;
                            char c5 = (i1 < p2)? p0.charAt(i1): 0;
                            if (c <= 0xdbff && (0xdc00 > c5 || ol < c5)) {
                               this.y(i4);
                               p1 = i1;
                            }else {
                               i = c & 0x03ff;
                               i = i << 10;
                               i1 = c5 & 0x03ff;
                               i = i | i1;
                               i = i + 0x10000;
                               a1 = this.s(4);
                               c3 = a1.a;
                               c4 = a1.c;
                               i5 = i >> 18;
                               i5 = i5 | 0x00f0;
                               c3[c4] = (byte)i5;
                               i5 = c4 + 1;
                               i6 = i >> 12;
                               i6 = i6 & i4;
                               i6 = i6 | 128;
                               c3[i5] = (byte)i6;
                               i5 = c4 + 2;
                               i6 = i >> 6;
                               i6 = i6 & i4;
                               i6 = i6 | 128;
                               c3[i5] = (byte)i6;
                               i5 = c4 + 3;
                               i = i & i4;
                               i = i | 128;
                               c3[i5] = (byte)i;
                               i3 = c4 + 4;
                               a1.c = i3;
                               l = this.c + 4;
                               this.c = l;
                               p1 = p1 + 2;
                            }
                         }
                      }
                      a1 = this.s(3);
                      c3 = a1.a;
                      c4 = a1.c;
                      i5 = c >> 12;
                      i5 = i5 | 0x00e0;
                      c3[c4] = (byte)i5;
                      i5 = c4 + 1;
                      i6 = c >> 6;
                      i4 = i4 & i6;
                      i4 = i4 | 128;
                      c3[i5] = (byte)i4;
                      i4 = c4 + 2;
                      i = c & 0x3f;
                      i = i | 128;
                      c3[i4] = (byte)i;
                      i3 = c4 + 3;
                      a1.c = i3;
                      l = this.c + 3;
                      this.c = l;
                   }
                   p1++;
                }
                return this;
             }else {
                throw new IllegalArgumentException("endIndex > string.length: "+p2+" > "+p0.length().toString());
             }
          }else {
             throw new IllegalArgumentException("endIndex < beginIndex: "+p2+" < "+p1.toString());
          }
       }else {
          throw new IllegalArgumentException("beginIndex < 0: "+p1.toString());
       }
    }
    public b R(int p0){
       l ol;
       l a;
       l c;
       int i = 128;
       if (p0 < i) {
          this.y(p0);
       }else {
          int i1 = 63;
          if (p0 < 2048) {
             ol = this.s(2);
             a = ol.a;
             c = ol.c;
             a[c] = (byte)((p0 >> 6) | 0x00c0);
             a[(c + 1)] = (byte)((p0 & i1) | i);
             ol.c = c + 2;
             this.c = this.c + 2;
          }else {
             int i2 = 0xdfff;
             if (0xd800 <= p0 && i2 >= p0) {
                this.y(i1);
             }else if(p0 < 0x10000){
                ol = this.s(3);
                a = ol.a;
                c = ol.c;
                a[c] = (byte)((p0 >> 12) | 0x00e0);
                a[(c + 1)] = (byte)(((p0 >> 6) & i1) | i);
                a[(c + 2)] = (byte)((p0 & i1) | i);
                ol.c = c + 3;
                this.c = this.c + 3;
             }else if(p0 <= 0x10ffff){
                ol = this.s(4);
                a = ol.a;
                c = ol.c;
                a[c] = (byte)((p0 >> 18) | 0x00f0);
                a[(c + 1)] = (byte)(((p0 >> 12) & i1) | i);
                a[(c + 2)] = (byte)(((p0 >> 6) & i1) | i);
                a[(c + 3)] = (byte)((p0 & i1) | i);
                ol.c = c + 4;
                this.c = this.c + 4;
             }else {
                throw new IllegalArgumentException("Unexpected code point: "+Integer.toHexString(p0));
             }
          }
       }
       return this;
    }
    public c R0(n p0,long p1){
       a.q(p0, "source");
       while (true) {
          if (p1 <= 0) {
             return this;
          }
          long l = p0.read(this, p1);
          if (l - -1) {
             p1 = p1 - l;
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public c Y0(ByteString p0){
       this.u(p0);
       return this;
    }
    public final void a(){
       this.skip(this.c);
    }
    public boolean a0(long p0,ByteString p1){
       a.q(p1, "bytes");
       return this.q3(p0, p1, 0, p1.size());
    }
    public b buffer(){
       return this;
    }
    public b c(){
       b uob = new b();
       if (!this.c - null) {
          return uob;
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l ol = tb.c();
       uob.b = ol;
       b b = uob.b;
       ol.g = b;
       if (b == null) {
          a.L();
       }
       tb = uob.b;
       if (tb == null) {
          a.L();
       }
       b.f = tb.g;
       tb = this.b;
       if (tb == null) {
          a.L();
       }
       ol = tb.f;
       while (ol != this.b) {
          b = uob.b;
          if (b == null) {
             a.L();
          }
          l g = b.g;
          if (g == null) {
             a.L();
          }
          if (ol == null) {
             a.L();
          }
          g.b(ol.c());
          ol = ol.f;
       }
       uob.c = this.c;
       return uob;
    }
    public long c1(m p0){
       a.q(p0, "sink");
       b tc = this.c;
       if (tc > 0) {
          p0.write(this, tc);
       }
       return tc;
    }
    public Object clone(){
       return this.c();
    }
    public void close(){
    }
    public int d0(f p0){
       a.q(p0, "options");
       int i = this.l(p0, false);
       int i1 = -1;
       if (i == i1) {
          return i1;
       }
       this.skip((long)p0.b()[i].size());
       return i;
    }
    public final long e(){
       b tc = this.c;
       long l = 0;
       if (!tc - l) {
          return l;
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l g = tb.g;
       if (g == null) {
          a.L();
       }
       l c = g.c;
       if (c < 8192 && g.e != null) {
          tc = tc - (long)(c - g.b);
       }
       return tc;
    }
    public c emit(){
       return this;
    }
    public c emitCompleteSegments(){
       return this;
    }
    public boolean equals(Object p0){
       b b;
       b uob = this;
       b uob1 = p0;
       if (uob == uob1) {
          return true;
       }
       if (!uob1 instanceof b) {
          return false;
       }
       b c = uob.c;
       if (c - uob1.c) {
          return false;
       }
       if (!c) {
          return true;
       }
       b = uob.b;
       if (b == null) {
          a.L();
       }
       uob1 = uob1.b;
       if (uob1 == null) {
          a.L();
       }
       l b1 = b.b;
       l b2 = uob1.b;
       long l = 0;
       while (true) {
          if (l - uob.c >= 0) {
             return true;
          }
          int i = b.c - b1;
          int i1 = uob1.c - b2;
          long l1 = (long)Math.min(i, i1);
          long l2 = 0;
          while (true) {
             if (l2 - l1 < 0) {
                int i2 = b1 + 1;
                int i3 = b2 + 1;
                if (b.a[b1] != uob1.a[b2]) {
                   break ;
                }else {
                   l2 = l2 + 1;
                   b1 = i2;
                   b2 = i3;
                }
             }else if(b1 == b.c){
                b = b.f;
                if (b == null) {
                   a.L();
                }
                b1 = b.b;
             }
             if (b2 == uob1.c) {
                l f = uob1.f;
                if (f == null) {
                   a.L();
                }
                b2 = f.b;
             }
             l = l + l1;
          }
          return false;
       }
    }
    public boolean exhausted(){
       boolean b = (!this.c)? true: false;
       return b;
    }
    public final b f(b p0,long p1,long p2){
       l c;
       l b;
       a.q(p0, "out");
       c.b(this.c, p1, p2);
       if (!p2) {
          return this;
       }
       p0.c = p0.c + p2;
       b tb = this.b;
       while (tb == null) {
          a.L();
          break ;
          int i1 = c - b;
          p1 = p1 - (long)i1;
          tb = tb.f;
       }
       c = tb.c;
       b = tb.b;
       int i = c - b;
       if (p1 - (long)i >= 0) {
          goto label_002a ;
       }else {
          while (p2 > 0) {
             if (tb == null) {
                a.L();
             }
             c = tb.c();
             int i2 = c.b + (int)p1;
             c.b = i2;
             i2 = i2 + (int)p2;
             c.c = Math.min(i2, c.c);
             b b1 = p0.b;
             if (b1 == null) {
                c.g = c;
                c.f = c;
                p0.b = c;
             }else if(b1 == null){
                a.L();
             }
             l g = b1.g;
             if (g == null) {
                a.L();
             }
             g.b(c);
             int i3 = c.c - c.b;
             p2 = p2 - (long)i3;
             tb = tb.f;
             i3 = 0;
          }
          return this;
       }
    }
    public void flush(){
    }
    public final byte g(long p0){
       long l;
       int i;
       c.b(this.c, p0, 1);
       b tb = this.b;
       if (tb != null) {
          if ((this.p() - p0) - p0 < 0) {
             l = this.p();
             while (l - p0 > 0) {
                tb = tb.g;
                if (tb == null) {
                   a.L();
                }
                i = tb.c - tb.b;
                l = l - (long)i;
             }
             return tb.a[(int)(((long)tb.b + p0) - l)];
          }else {
             l = 0;
             l b = tb.b;
             i = tb.c - b;
             long l1 = (long)i + l;
             while (l1 - p0 <= 0) {
                tb = tb.f;
                if (tb == null) {
                   a.L();
                }
                l = l1;
             }
             return tb.a[(int)(((long)b + p0) - l)];
          }
       }else {
          a.L();
          throw 0;
       }
    }
    public final boolean h(l p0,int p1,byte[] p2,int p3,int p4){
       l ol;
       l c = p0.c;
       l a = p0.a;
       while (true) {
          if (p3 >= p4) {
             return true;
          }
          if (p1 == c) {
             p0 = p0.f;
             if (p0 == null) {
                a.L();
             }
             a = p0.a;
             ol = p0.b;
             c = p0.c;
          }
          if (a[ol] != p2[p3]) {
             break ;
          }else {
             ol++;
             p3++;
          }
       }
       return false;
    }
    public int hashCode(){
       b tb = this.b;
       if (tb == null) {
          return 0;
       }
       int i = 1;
       do {
          l c = tb.c;
          for (l b = tb.b; b < c; b = b + 1) {
             i = i * 31;
             i = i + tb.a[b];
          }
          tb = tb.f;
          if (tb == null) {
             a.L();
          }
       } while (tb == this.b);
       return i;
    }
    public final b$b i(b$b p0){
       a.q(p0, "unsafeCursor");
       String str = (p0.b == null)? 1: null;
       if (str) {
          p0.b = this;
          p0.c = true;
          return p0;
       }else {
          throw new IllegalStateException("already attached to a buffer".toString());
       }
    }
    public long indexOf(byte p0){
       return this.indexOf(p0, 0, Long.MAX_VALUE);
    }
    public long indexOf(byte p0,long p1){
       return this.indexOf(p0, p1, Long.MAX_VALUE);
    }
    public long indexOf(byte p0,long p1,long p2){
       b uob;
       b uob1;
       int i;
       l a;
       long l1;
       int i1;
       int i2;
       long l = 0;
       if (l - p1 > 0) {
       }else if(p2 - p1 >= 0){
          uob = 1;
       label_000e :
          if (uob) {
             uob = this.c;
             if (p2 - uob > 0) {
                uob1 = uob;
             }
             if (!p1 - uob1) {
                return -1;
             }else {
                b tb = this.b;
                if (tb != null) {
                   if ((this.p() - p1) - p1 < 0) {
                      l = this.p();
                      while (l - p1 > 0) {
                         tb = tb.g;
                         if (tb == null) {
                            a.L();
                         }
                         i = tb.c - tb.b;
                         l = l - (long)i;
                      }
                      while (true) {
                         if (l - uob1 >= 0) {
                            return -1;
                         }
                         a = tb.a;
                         l1 = (long)tb.b + uob1;
                         l1 = l1 - l;
                         i1 = (int)Math.min((long)tb.c, l1);
                         l1 = (long)tb.b + p1;
                         l1 = l1 - l;
                         i2 = (int)l1;
                         while (true) {
                            if (i2 < i1) {
                               if (a[i2] != p0) {
                                  i2++;
                               }
                            }else {
                               i2 = tb.c - tb.b;
                               l = l + (long)i2;
                               tb = tb.f;
                               if (tb == null) {
                                  a.L();
                               }
                               i2 = l;
                            }
                         }
                      }
                   }else {
                      i = tb.c - tb.b;
                      long l2 = (long)i + l;
                      while (l2 - p1 <= 0) {
                         tb = tb.f;
                         if (tb == null) {
                            a.L();
                         }
                         l = l2;
                      }
                      while (true) {
                         if (l - uob1 >= 0) {
                            return -1;
                         }
                         a = tb.a;
                         l1 = (long)tb.b + uob1;
                         l1 = l1 - l;
                         i1 = (int)Math.min((long)tb.c, l1);
                         l1 = (long)tb.b + p1;
                         l1 = l1 - l;
                         i2 = (int)l1;
                         while (true) {
                            if (i2 < i1) {
                               if (a[i2] != p0) {
                                  i2++;
                               }
                            }else {
                               i2 = tb.c - tb.b;
                               l = l + (long)i2;
                               tb = tb.f;
                               if (tb == null) {
                                  a.L();
                               }
                               i2 = l;
                            }
                         }
                      }
                   }
                   return ((long)(i2 - tb.b) + l);
                }else {
                   return -1;
                }
             }
          }else {
             throw new IllegalArgumentException("size="+this.c+" fromIndex="+p1+" toIndex="+p2.toString());
          }
       }
       uob = null;
       goto label_000e ;
    }
    public InputStream inputStream(){
       return new b$c(this);
    }
    public boolean isOpen(){
       return true;
    }
    public final b j(InputStream p0){
       a.q(p0, "input");
       long l = Long.MAX_VALUE;
       l ol = this.s(1);
       int i = ol.c - 8192;
       i = p0.read(ol.a, ol.c, (int)Math.min(l, (long)i));
       while (i != -1) {
          int i1 = ol.c + i;
          ol.c = i1;
          long l1 = (long)i;
          long l2 = this.c + l1;
          this.c = l2;
          l = l - l1;
       }
       return this;
    }
    public final String k(long p0){
       String str;
       long l = 1;
       if (p0 > 0) {
          long l1 = p0 - l;
          if (this.g(l1) == (byte)13) {
             str = this.readUtf8(l1);
             this.skip(2);
          label_0024 :
             return str;
          }
       }
       str = this.readUtf8(p0);
       this.skip(l);
       goto label_0024 ;
    }
    public final int l(f p0,boolean p1){
       l a;
       int i5;
       int i6;
       int i7;
       l c1;
       l ol;
       f obj = p0;
       a.q(obj, "options");
       b b = this.b;
       int i = -2;
       if (b != null) {
          a = b.a;
          l b1 = b.b;
          l c = b.c;
          obj = obj.c;
          b uob = b;
          int i1 = 0;
          int i2 = -1;
          int i3 = i1 + 1;
          i1 = obj[i1];
          int i4 = i3 + 1;
          i3 = obj[i3];
          while (i3 != -1) {
             i2 = i3;
             i1 = - i6;
             b1 = ol;
             i = -2;
          }
          if (uob) {
             i3 = 0;
             if (i1 < 0) {
                i1 = i1 * -1;
                i5 = i4 + i1;
                while (true) {
                   i1 = b1 + 1;
                   i6 = a[b1] & 0x00ff;
                   i7 = i4 + 1;
                   if (i6 != obj[i4]) {
                      return i2;
                   }
                   i6 = (i7 == i5)? 1: 0;
                   if (i1 == c) {
                      if (!uob) {
                         a.L();
                      }
                      a = uob.f;
                      if (a == null) {
                         a.L();
                      }
                      c = a.b;
                      l a1 = a.a;
                      c1 = a.c;
                      if (a == b) {
                         if (i6) {
                            a = a1;
                            i1 = i3;
                         }
                      }else {
                         a1 = a;
                         a = a1;
                      }
                   }else {
                      c1 = c;
                      int i8 = i1;
                      b uob1 = uob;
                   }
                   if (i6) {
                      i6 = obj[i7];
                      ol = c;
                      c = c1;
                      c1 = i1;
                   }else {
                      b1 = c;
                      c = c1;
                      i4 = i7;
                      c1 = i1;
                   }
                }
                return i2;
             }else {
                i5 = b1 + 1;
                i6 = a[b1] & 0x00ff;
                i7 = i4 + i1;
                while (i4 != i7) {
                   if (i6 == obj[i4]) {
                      i4 = i4 + i1;
                      i6 = obj[i4];
                      if (i5 == c) {
                         c1 = uob.f;
                         if (c1 == null) {
                            a.L();
                         }
                         ol = c1.b;
                         a = c1.a;
                         c = c1.c;
                         if (c1 == b) {
                            uob = i3;
                         }
                      }else {
                         ol = i5;
                      }
                   }
                   i4 = i4 + 1;
                   i = -2;
                }
             }
             if (i6 >= 0) {
                return i6;
             }else {
                goto label_00a3 ;
             }
          }
          if (p1) {
             return i;
          }else {
             return i2;
          }
       }else if(p1){
          i = -2;
       }else {
          i = -1;
       }
       return i;
    }
    public void l3(b p0,long p1){
       a.q(p0, "sink");
       b tc = this.c;
       if (tc - p1 >= 0) {
          p0.write(this, p1);
          return;
       }else {
          p0.write(this, tc);
          throw new EOFException();
       }
    }
    public b m(){
       return this;
    }
    public final void o(long p0){
       this.c = p0;
    }
    public OutputStream outputStream(){
       return new b$d(this);
    }
    public final long p(){
       return this.c;
    }
    public d peek(){
       return l.d(new h(this));
    }
    public boolean q3(long p0,ByteString p1,int p2,int p3){
       a.q(p1, "bytes");
       if (p0 - null >= 0 && (p2 >= 0 && (p3 >= 0 && ((this.c - p0) - (long)p3 < 0 || (p1.size() - p2) < p3)))) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p3) {
             return true;
          }
          long l = (long)i + p0;
          int i1 = p2 + i;
          if (this.g(l) != p1.getByte(i1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final ByteString r(){
       ByteString eMPTY;
       l c;
       int i4;
       b tc = this.c;
       int i = 0;
       int i1 = (tc - (long)Integer.MAX_VALUE <= 0)? 1: 0;
       if (i1) {
          int i2 = (int)tc;
          if (!i2) {
             eMPTY = ByteString.EMPTY;
          }else {
             Objects.requireNonNull(SegmentedByteString.Companion);
             a.q(this, "buffer");
             c.b(this.p(), 0, (long)i2);
             tc = this.b;
             i1 = 0;
             int i3 = 0;
             while (true) {
                if (i1 < i2) {
                   if (tc == null) {
                      a.L();
                   }
                   c = tc.c;
                   l b = tc.b;
                   if (c != b) {
                      i4 = c - b;
                      i1 = i1 + i4;
                      i3 = i3 + 1;
                      l f = tc.f;
                   }else {
                      throw new AssertionError("s.limit == s.pos");
                   }
                }else {
                   byte[][] uobyteArray = new byte[][i3];
                   int[] ointArray = new int[(i3 * 2)];
                   b uob = this.b;
                   i4 = 0;
                   while (i < i2) {
                      if (uob == null) {
                         a.L();
                      }
                      uobyteArray[i4] = uob.a;
                      int i5 = uob.c - uob.b;
                      i = i + i5;
                      ointArray[i4] = Math.min(i, i2);
                      i5 = i4 + i3;
                      ointArray[i5] = uob.b;
                      uob.d = true;
                      i4 = i4 + true;
                      uob = uob.f;
                   }
                   eMPTY = new SegmentedByteString(uobyteArray, ointArray, null);
                }
             }
          }
          return eMPTY;
       }else {
          throw new IllegalStateException("size > Integer.MAX_VALUE: "+this.c.toString());
       }
    }
    public int read(ByteBuffer p0){
       a.q(p0, "sink");
       b tb = this.b;
       if (tb == null) {
          return -1;
       }
       int i = Math.min(p0.remaining(), (tb.c - tb.b));
       p0.put(tb.a, tb.b, i);
       int i1 = tb.b + i;
       tb.b = i1;
       this.c = this.c - (long)i;
       if (i1 == tb.c) {
          this.b = tb.a();
          m.a(tb);
       }
       return i;
    }
    public int read(byte[] p0){
       a.q(p0, "sink");
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       a.q(p0, "sink");
       c.b((long)p0.length, (long)p1, (long)p2);
       b tb = this.b;
       if (tb == null) {
          return -1;
       }
       p2 = Math.min(p2, (tb.c - tb.b));
       System.arraycopy(tb.a, tb.b, p0, p1, p2);
       int i = tb.b + p2;
       tb.b = i;
       this.c = this.c - (long)p2;
       if (i == tb.c) {
          this.b = tb.a();
          m.a(tb);
       }
       return p2;
    }
    public long read(b p0,long p1){
       b uob1;
       a.q(p0, "sink");
       String str = null;
       b uob = (p1 - str >= 0)? 1: null;
       if (uob) {
          uob = this.c;
          if (!uob - str) {
             return -1;
          }else if(p1 - uob > 0){
             uob1 = uob;
          }
          p0.write(this, uob1);
          return uob1;
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
    public byte readByte(){
       if (!this.c - null) {
          throw new EOFException();
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l b = tb.b;
       int i = b + 1;
       byte b1 = tb.a[b];
       this.c = this.c - 1;
       if (i == tb.c) {
          this.b = tb.a();
          m.a(tb);
       }else {
          tb.b = i;
       }
       return b1;
    }
    public byte[] readByteArray(){
       return this.readByteArray(this.c);
    }
    public byte[] readByteArray(long p0){
       b uob = (p0 >= 0 && p0 - (long)Integer.MAX_VALUE <= 0)? 1: null;
       if (uob) {
          if (this.c - p0 >= 0) {
             byte[] uobyteArray = new byte[(int)p0];
             this.readFully(uobyteArray);
             return uobyteArray;
          }else {
             throw new EOFException();
          }
       }else {
          throw new IllegalArgumentException("byteCount: "+p0.toString());
       }
    }
    public ByteString readByteString(){
       return new ByteString(this.readByteArray());
    }
    public ByteString readByteString(long p0){
       return new ByteString(this.readByteArray(p0));
    }
    public long readDecimalLong(){
       l a;
       b uob = this;
       long l = 0;
       if (!uob.c - l) {
          throw new EOFException();
       }
       long l1 = -7;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          b b = uob.b;
          if (b == null) {
             a.L();
          }
          a = b.a;
          l b1 = b.b;
          l c = b.c;
          while (true) {
             if (b1 < c) {
                byte b2 = a[b1];
                int b3 = (byte)48;
                if (b2 >= b3 && b2 <= (byte)57) {
                   b3 = b3 - b2;
                   if ((v16 = l - 0xf333333333333334) < 0 || (!v16 && (long)b3 - l1 < 0)) {
                      b uob1 = new b().z(l);
                      uob1.y(b2);
                      if (!i1) {
                         uob1.readByte();
                      }
                      throw new NumberFormatException("Number too large: "+uob1.readUtf8());
                   }else {
                      l = l * 10;
                      l = l + (long)b3;
                   }
                }else if(b2 == (byte)45 && !i){
                   l1 = l1 - 1;
                   i1 = 1;
                }else if(i){
                   i2 = 1;
                label_009e :
                   if (b1 == c) {
                      uob.b = b.a();
                      m.a(b);
                   }else {
                      b.b = b1;
                   }
                   if (i2 || uob.b == null) {
                      uob.c = uob.c - (long)i;
                      if (!i1) {
                         l = - l;
                         break ;
                      }
                      break ;
                   }else {
                      continue ;
                   }
                }else {
                   throw new NumberFormatException("Expected leading [0-9] or \'-\' character but was 0x"+Integer.toHexString(b2));
                }
                b1 = b1 + 1;
                i = i + 1;
             }else {
                goto label_009e ;
             }
          }
          return l;
       }
    }
    public void readFully(byte[] p0){
       a.q(p0, "sink");
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return;
          }
          int i1 = p0.length - i;
          i1 = this.read(p0, i, i1);
          if (i1 != -1) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public long readHexadecimalUnsignedLong(){
       l a;
       byte b1;
       StringBuilder str = null;
       if (!this.c - str) {
          throw new EOFException();
       }
       int i = 0;
       long l = str;
       NumberFormatException numberFormat = null;
       while (true) {
          b tb = this.b;
          if (tb == null) {
             a.L();
          }
          a = tb.a;
          l b = tb.b;
          l c = tb.c;
          while (true) {
             if (b < c) {
                b1 = a[b];
                byte b2 = (byte)48;
                if (b1 >= b2 && b1 <= (byte)57) {
                   b2 = b1 - b2;
                }else {
                   b2 = (byte)97;
                   if (b1 < b2 || b1 > (byte)102) {
                      b2 = (byte)65;
                      if (b1 < b2 || b1 > (byte)70) {
                         if (i) {
                            numberFormat = 1;
                         label_0099 :
                            if (b == c) {
                               this.b = tb.a();
                               m.a(tb);
                            }else {
                               tb.b = b;
                            }
                            if (numberFormat != null || this.b == null) {
                               this.c = this.c - (long)i;
                               return l;
                            }else {
                               continue ;
                            }
                         }else {
                            break ;
                         }
                      }
                   }
                   b2 = b1 - b2;
                   b2 = b2 + 10;
                }
                long l1 = 0xf000000000000000 & l;
                if (!l1 - str) {
                   l = l << 4;
                   l = l | (long)b2;
                   b = b + 1;
                   i = i + 1;
                }else {
                   b uob = new b().A(l);
                   uob.y(b1);
                   throw new NumberFormatException("Number too large: "+uob.readUtf8());
                }
             }else {
                goto label_0099 ;
             }
          }
          throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x"+Integer.toHexString(b1));
       }
    }
    public int readInt(){
       l a;
       long l = 4;
       if (this.c - l < 0) {
          throw new EOFException();
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l b = tb.b;
       l c = tb.c;
       if ((long)(c - b) - l < 0) {
          return (((((this.readByte() & 0x00ff) << 24) | ((this.readByte() & 0x00ff) << 16)) | ((this.readByte() & 0x00ff) << 8)) | (this.readByte() & 0x00ff));
       }else {
          a = tb.a;
          int i = b + 1;
          int i1 = i + 1;
          i = i1 + 1;
          i1 = i + 1;
          int i2 = ((((a[b] & 0x00ff) << 24) | ((a[i] & 0x00ff) << 16)) | ((a[i1] & 0x00ff) << 8)) | (a[i] & 0x00ff);
          this.c = this.c - l;
          if (i1 == c) {
             this.b = tb.a();
             m.a(tb);
          }else {
             tb.b = i1;
          }
          return i2;
       }
    }
    public int readIntLe(){
       return c.c(this.readInt());
    }
    public long readLong(){
       l a;
       long l = 8;
       if (this.c - l < 0) {
          throw new EOFException();
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l b = tb.b;
       l c = tb.c;
       long l1 = 32;
       if ((long)(c - b) - l < 0) {
          return ((((long)this.readInt() & 0xffffffff) << l1) | (0xffffffff & (long)this.readInt()));
       }else {
          a = tb.a;
          int i = b + 1;
          int i1 = i + 1;
          i = i1 + 1;
          i1 = i + 1;
          int i2 = i1 + 1;
          i1 = i2 + 1;
          i2 = i1 + 1;
          i1 = i2 + 1;
          long l2 = (((((((long)a[i] & 255) << l1) | (((((long)a[b] & 255) << 56) | (((long)a[i] & 255) << 48)) | (((long)a[i1] & 255) << 40))) | (((long)a[i1] & 255) << 24)) | (((long)a[i2] & 255) << 16)) | (((long)a[i1] & 255) << 8)) | ((long)a[i2] & 255);
          this.c = this.c - l;
          if (i1 == c) {
             this.b = tb.a();
             m.a(tb);
          }else {
             tb.b = i1;
          }
          return l2;
       }
    }
    public long readLongLe(){
       return c.d(this.readLong());
    }
    public short readShort(){
       l a;
       long l = 2;
       if (this.c - l < 0) {
          throw new EOFException();
       }
       b tb = this.b;
       if (tb == null) {
          a.L();
       }
       l b = tb.b;
       l c = tb.c;
       if ((c - b) < 2) {
          return (short)(((this.readByte() & 0x00ff) << 8) | (this.readByte() & 0x00ff));
       }else {
          a = tb.a;
          int i = b + 1;
          int i1 = i + 1;
          int i2 = ((a[b] & 0x00ff) << 8) | (a[i] & 0x00ff);
          this.c = this.c - l;
          if (i1 == c) {
             this.b = tb.a();
             m.a(tb);
          }else {
             tb.b = i1;
          }
          return (short)i2;
       }
    }
    public short readShortLe(){
       return c.e(this.readShort());
    }
    public String readString(long p0,Charset p1){
       a.q(p1, "charset");
       b uob = ((v2 = p0) >= 0 && p0 - (long)Integer.MAX_VALUE <= 0)? 1: null;
       if (uob) {
          if (this.c - p0 >= 0) {
             if (!v2) {
                return "";
             }else {
                uob = this.b;
                if (uob == null) {
                   a.L();
                }
                l b = uob.b;
                if (((long)b + p0) - (long)uob.c > 0) {
                   return new String(this.readByteArray(p0), p1);
                }else {
                   int i = (int)p0;
                   String str = new String(uob.a, b, i, p1);
                   int i1 = uob.b + i;
                   uob.b = i1;
                   this.c = this.c - p0;
                   if (i1 == uob.c) {
                      this.b = uob.a();
                      m.a(uob);
                   }
                   return str;
                }
             }
          }else {
             throw new EOFException();
          }
       }else {
          throw new IllegalArgumentException("byteCount: "+p0.toString());
       }
    }
    public String readString(Charset p0){
       a.q(p0, "charset");
       return this.readString(this.c, p0);
    }
    public String readUtf8(){
       return this.readString(this.c, d.a);
    }
    public String readUtf8(long p0){
       return this.readString(p0, d.a);
    }
    public int readUtf8CodePoint(){
       int i2;
       int i3;
       int i5;
       long l = 0;
       if (!this.c - l) {
          throw new EOFException();
       }
       int b = this.g(l);
       int i = 1;
       String str = 128;
       int i1 = 0xfffd;
       if (!(b & 0x0080)) {
          i2 = b & 0x7f;
          i3 = 0;
       }else if((b & 0x00e0) == 192){
          i2 = b & 0x1f;
          i5 = 2;
          i3 = 128;
       }else if((b & 0x00f0) == 224){
          i2 = b & 0x0f;
          i5 = 3;
          i3 = 2048;
       }else if((b & 0x00f8) == 240){
          i2 = b & 0x07;
          i5 = 4;
          i3 = 0x10000;
       }else {
          this.skip(1);
          return i1;
       }
       long l1 = (long)1;
       if (this.c - l1 >= 0) {
          while (true) {
             if (i < 1) {
                long l2 = (long)i;
                b = this.g(l2);
                int i4 = b & 0x00c0;
                if (i4 == str) {
                   i2 = i2 << 6;
                   b = b & 0x3f;
                   i2 = i2 | b;
                   i = i + 1;
                }else {
                   this.skip(l2);
                   return i1;
                }
             }else {
                this.skip(l1);
                if (i2 <= 0x10ffff && (0xd800 > i2 || (0xdfff < i2 && i2 >= i3))) {
                   i1 = i2;
                   break ;
                }
                break ;
             }
          }
          return i1;
       }else {
          throw new EOFException("size < "+1+": "+this.c+" \(to read code point prefixed 0x"+Integer.toHexString(b)+"\)");
       }
    }
    public String readUtf8Line(){
       String str;
       long l = this.indexOf((byte)10);
       if (l - -1) {
          str = this.k(l);
       }else {
          b tc = this.c;
          str = (tc)? this.readUtf8(tc): null;
       }
       return str;
    }
    public String readUtf8LineStrict(){
       return this.readUtf8LineStrict(Long.MAX_VALUE);
    }
    public String readUtf8LineStrict(long p0){
       StringBuilder str = (p0 >= 0)? 1: null;
       if (str) {
          long l = 1;
          long l1 = Long.MAX_VALUE;
          if (p0 - l1) {
             l1 = p0 + l;
          }
          byte b = (byte)10;
          long this = this.indexOf(b, 0, l1);
          if (this - -1) {
             return this.k(this);
          }else if(l1 - this.c < 0 && (this.g((l1 - l)) == (byte)13 && this.g(l1) == b)){
             return this.k(l1);
          }else {
             b uob = new b();
             this.f(uob, 0, Math.min((long)32, this.c));
             throw super("\\n not found: limit="+Math.min(this.c, p0)+" content="+uob.readByteString().hex()+8230);
          }
       }else {
          throw new IllegalArgumentException("limit < 0: "+p0.toString());
       }
    }
    public boolean request(long p0){
       boolean b = (this.c - p0 >= 0)? true: false;
       return b;
    }
    public void require(long p0){
       if (this.c - p0 >= 0) {
          return;
       }
       throw new EOFException();
    }
    public final l s(int p0){
       l ol;
       int i = 8192;
       int i1 = 1;
       if (p0 < i1 || p0 > i) {
          i1 = 0;
       }
       if (i1) {
          b tb = this.b;
          if (tb == null) {
             ol = m.b();
             this.b = ol;
             ol.g = ol;
             ol.f = ol;
             return ol;
          }else if(tb == null){
             a.L();
          }
          l g = tb.g;
          if (g == null) {
             a.L();
          }
          if ((g.c + p0) > i || g.e == null) {
             ol = m.b();
             g.b(ol);
             g = ol;
          }
          return g;
       }else {
          throw new IllegalArgumentException("unexpected capacity".toString());
       }
    }
    public void skip(long p0){
       while (true) {
          if (p0 - null <= 0) {
             return;
          }
          b tb = this.b;
          if (tb != null) {
             int i = tb.c - tb.b;
             int i1 = (int)Math.min(p0, (long)i);
             long l = (long)i1;
             long l1 = this.c - l;
             this.c = l1;
             p0 = p0 - l;
             i = tb.b + i1;
             tb.b = i;
             if (i == tb.c) {
                this.b = tb.a();
                m.a(tb);
             }
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public o timeout(){
       return o.NONE;
    }
    public String toString(){
       return this.r().toString();
    }
    public b u(ByteString p0){
       a.q(p0, "byteString");
       p0.write$jvm(this);
       return this;
    }
    public long u2(ByteString p0){
       a.q(p0, "bytes");
       return this.H(p0, 0);
    }
    public b v(byte[] p0){
       a.q(p0, "source");
       this.x(p0, 0, p0.length);
       return this;
    }
    public int write(ByteBuffer p0){
       a.q(p0, "source");
       int i = p0.remaining();
       int i1 = i;
       while (i1 > 0) {
          l ol = this.s(1);
          int i2 = ol.c - 8192;
          i2 = Math.min(i1, i2);
          p0.get(ol.a, ol.c, i2);
          i1 = i1 - i2;
          int i3 = ol.c + i2;
          ol.c = i3;
       }
       this.c = this.c + (long)i;
       return i;
    }
    public c write(byte[] p0){
       this.v(p0);
       return this;
    }
    public c write(byte[] p0,int p1,int p2){
       this.x(p0, p1, p2);
       return this;
    }
    public void write(b p0,long p1){
       l c;
       long l;
       int i3;
       b b2;
       l ol;
       int i6;
       a.q(p0, "source");
       int i = 0;
       int i1 = (p0 != this)? 1: 0;
       if (i1) {
          c.b(p0.c, 0, p1);
          while (true) {
             if (p1 - null <= 0) {
                return;
             }
             b b = p0.b;
             if (b == null) {
                a.L();
             }
             c = b.c;
             b b1 = p0.b;
             if (b1 == null) {
                a.L();
             }
             i1 = c - b1.b;
             int i2 = 8192;
             if (p1 - (long)i1 < 0) {
                b = this.b;
                if (b != null) {
                   if (b == null) {
                      a.L();
                   }
                   c = b.g;
                }else {
                   c = null;
                }
                if (c != null && c.e != null) {
                   l = (long)c.c + p1;
                   i3 = (c.d != null)? 0: c.b;
                   l = l - (long)i3;
                   if (l - (long)i2 <= 0) {
                      b2 = p0.b;
                      if (b2 == null) {
                         a.L();
                         break ;
                      }
                      break ;
                   }
                }
             label_0072 :
                b = p0.b;
                if (b == null) {
                   a.L();
                }
                i3 = (int)p1;
                Objects.requireNonNull(b);
                if (i3 > 0) {
                   int i4 = b.c - b.b;
                   if (i3 <= i4) {
                      i4 = 1;
                   label_0089 :
                      if (i4) {
                         if (i3 >= 1024) {
                            ol = b.c();
                         }else {
                            ol = m.b();
                            b.a(b.a, b.b, ol.a, i, i3);
                         }
                         int i5 = ol.b + i3;
                         ol.c = i5;
                         i5 = b.b + i3;
                         b.b = i5;
                         c = b.g;
                         if (c == null) {
                            a.L();
                         }
                         c.b(ol);
                         p0.b = ol;
                      }else {
                         throw new IllegalArgumentException("byteCount out of range".toString());
                      }
                   }
                }
                ol = 0;
                goto label_0089 ;
             }
             b = p0.b;
             if (b == null) {
                a.L();
             }
             i3 = b.c - b.b;
             l = (long)i3;
             p0.b = b.a();
             b1 = this.b;
             if (b1 == null) {
                this.b = b;
                b.g = b;
                b.f = b;
             }else if(b1 == null){
                a.L();
             }
             l g = b1.g;
             if (g == null) {
                a.L();
             }
             g.b(b);
             g = b.g;
             long l2 = (g != b)? 1: 0;
             if (l2) {
                if (g == null) {
                   a.L();
                }
                if (g.e != null) {
                   i3 = b.c - b.b;
                   l g1 = b.g;
                   if (g1 == null) {
                      a.L();
                   }
                   i2 = i2 - g1.c;
                   g1 = b.g;
                   if (g1 == null) {
                      a.L();
                   }
                   if (g1.d != null) {
                      i6 = 0;
                   }else {
                      g1 = b.g;
                      if (g1 == null) {
                         a.L();
                      }
                      i6 = g1.b;
                   }
                   i2 = i2 + i6;
                   if (i3 <= i2) {
                      l g2 = b.g;
                      if (g2 == null) {
                         a.L();
                      }
                      b.d(g2, i3);
                      b.a();
                      m.a(b);
                   }
                }
             }else {
                throw new IllegalStateException("cannot compact".toString());
             }
             long l1 = p0.c - l;
             p0.c = l1;
             l1 = this.c + l;
             this.c = l1;
             p1 = p1 - l;
          }
          b2.d(c, (int)p1);
          p0.c = p0.c - p1;
          this.c = this.c + p1;
          return;
       }else {
          throw new IllegalArgumentException("source == this".toString());
       }
    }
    public c writeByte(int p0){
       this.y(p0);
       return this;
    }
    public c writeDecimalLong(long p0){
       return this.z(p0);
    }
    public c writeHexadecimalUnsignedLong(long p0){
       return this.A(p0);
    }
    public c writeInt(int p0){
       this.C(p0);
       return this;
    }
    public c writeIntLe(int p0){
       this.E(p0);
       return this;
    }
    public c writeLong(long p0){
       this.I(p0);
       return this;
    }
    public c writeLongLe(long p0){
       this.J(p0);
       return this;
    }
    public c writeShort(int p0){
       this.K(p0);
       return this;
    }
    public c writeShortLe(int p0){
       this.L(p0);
       return this;
    }
    public c writeString(String p0,int p1,int p2,Charset p3){
       return this.M(p0, p1, p2, p3);
    }
    public c writeString(String p0,Charset p1){
       return this.O(p0, p1);
    }
    public c writeUtf8(String p0){
       this.P(p0);
       return this;
    }
    public c writeUtf8(String p0,int p1,int p2){
       this.Q(p0, p1, p2);
       return this;
    }
    public c writeUtf8CodePoint(int p0){
       this.R(p0);
       return this;
    }
    public b x(byte[] p0,int p1,int p2){
       a.q(p0, "source");
       long l = (long)p2;
       c.b((long)p0.length, (long)p1, l);
       p2 = p2 + p1;
       while (p1 < p2) {
          l ol = this.s(1);
          int i = p2 - p1;
          int i1 = ol.c - 8192;
          i = Math.min(i, i1);
          System.arraycopy(p0, p1, ol.a, ol.c, i);
          p1 = p1 + i;
          i1 = ol.c + i;
          ol.c = i1;
       }
       this.c = this.c + l;
       return this;
    }
    public long x1(n p0){
       a.q(p0, "source");
       long l = 0;
       long l1 = p0.read(this, (long)8192);
       while (l1 - -1) {
          l = l + l1;
       }
       return l;
    }
    public b y(int p0){
       l ol = this.s(1);
       l c = ol.c;
       ol.c = c + 1;
       ol.a[c] = (byte)p0;
       this.c = this.c + 1;
       return this;
    }
    public b z(long p0){
       long l = 0;
       if (!(v2 = p0 - l)) {
          this.y(48);
          return this;
       }else {
          int i = 0;
          int i1 = 1;
          if (v2 < 0) {
             p0 = - p0;
             if (p0 - l < 0) {
                this.P("-9223372036854775808");
                return this;
             }else {
                i = 1;
             }
          }
          if (p0 - 0x5f5e100 < 0) {
             if (p0 - 0x2710 < 0) {
                if (p0 - 100 < 0) {
                   if (p0 - 10 >= 0) {
                      i1 = 2;
                   }
                }else if(p0 - 1000 < 0){
                   i1 = 3;
                }else {
                   i1 = 4;
                }
             }else if(p0 - 0xf4240 < 0){
                i1 = (p0 - 0x186a0 < 0)? 5: 6;
             }else if(p0 - 0x989680 < 0){
                i1 = 7;
             }else {
                i1 = 8;
             }
          }else if(p0 - 0xe8d4a51000 < 0){
             if (p0 - 0x2540be400 < 0) {
                i1 = (p0 - 0x3b9aca00 < 0)? 9: 10;
             }else if(p0 - 0x174876e800 < 0){
                i1 = 11;
             }else {
                i1 = 12;
             }
          }else if(p0 - 0x38d7ea4c68000 < 0){
             if (p0 - 0x9184e72a000 < 0) {
                i1 = 13;
             }else if(p0 - 0x5af3107a4000 < 0){
                i1 = 14;
             }else {
                i1 = 15;
             }
          }else if(p0 - 0x16345785d8a0000 < 0){
             i1 = (p0 - 0x2386f26fc10000 < 0)? 16: 17;
          }else if(p0 - 0xde0b6b3a7640000 < 0){
             i1 = 18;
          }else {
             i1 = 19;
          }
          if (i) {
             i1 = i1 + 1;
          }
          l ol = this.s(i1);
          l a = ol.a;
          int i2 = ol.c + i1;
          while (p0 - l) {
             long l1 = (long)10;
             long l2 = p0 % l1;
             int i3 = (int)l2;
             i2 = i2 - 1;
             a[i2] = b.d[i3];
             p0 = p0 / l1;
          }
          if (i) {
             a[(i2 - 1)] = (byte)45;
          }
          ol.c = ol.c + i1;
          this.c = this.c + (long)i1;
          return this;
       }
    }
}
