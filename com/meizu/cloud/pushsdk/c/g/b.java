package com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.d;
import java.lang.Cloneable;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.o;
import com.meizu.cloud.pushsdk.c.g.j;
import java.lang.Math;
import java.lang.System;
import com.meizu.cloud.pushsdk.c.g.k;
import com.meizu.cloud.pushsdk.c.g.m;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.meizu.cloud.pushsdk.c.g.e;
import java.lang.IllegalAccessError;
import java.nio.charset.Charset;
import java.io.EOFException;
import java.lang.Long;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.b$1;
import java.lang.IllegalStateException;
import java.lang.AssertionError;
import java.security.MessageDigest;

public final class b implements c, d, Cloneable	// class@0014eb
{
    public j a;
    public long b;
    public static final byte[] c;

    static {
       b.c = new byte[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public void b(){
       super();
    }
    public int a(byte[] p0,int p1,int p2){
       o.a((long)p0.length, (long)p1, (long)p2);
       b ta = this.a;
       if (ta == null) {
          return -1;
       }
       p2 = Math.min(p2, (ta.c - ta.b));
       System.arraycopy(ta.a, ta.b, p0, p1, p2);
       int i = ta.b + p2;
       ta.b = i;
       this.b = this.b - (long)p2;
       if (i == ta.c) {
          this.a = ta.a();
          k.a(ta);
       }
       return p2;
    }
    public long a(){
       return this.b;
    }
    public long a(m p0){
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       long l = 0;
       long l1 = p0.b(this, 2048);
       while (l1 - -1) {
          l = l + l1;
       }
       return l;
    }
    public b a(int p0){
       int i1;
       int i = 128;
       if (p0 >= i) {
          if (p0 < 2048) {
             i1 = (p0 >> 6) | 0x00c0;
          }else if(p0 < 0x10000){
             if (p0 < 0xd800 || p0 > 0xdfff) {
                i1 = (p0 >> 12) | 0x00e0;
             }else {
                throw new IllegalArgumentException("Unexpected code point: "+Integer.toHexString(p0));
             }
          }else if(p0 <= 0x10ffff){
             this.b(((p0 >> 18) | 0x00f0));
             i1 = ((p0 >> 12) & 0x3f) | i;
          }else {
             throw new IllegalArgumentException("Unexpected code point: "+Integer.toHexString(p0));
          }
          this.b(i1);
          i1 = ((p0 >> 6) & 0x3f) | i;
          this.b(i1);
          p0 = (p0 & 0x3f) | i;
       }
       this.b(p0);
       return this;
    }
    public b a(e p0){
       if (p0 == null) {
          throw new IllegalArgumentException("byteString == null");
       }
       p0.a(this);
       return this;
    }
    public b a(String p0){
       return this.a(p0, 0, p0.length());
    }
    public b a(String p0,int p1,int p2){
       int i;
       int i3;
       int i4;
       if (p0 == null) {
          throw new IllegalArgumentException("string == null");
       }
       if (p1 < 0) {
          throw new IllegalAccessError("beginIndex < 0: "+p1);
       }
       if (p2 < p1) {
          throw new IllegalArgumentException("endIndex < beginIndex: "+p2+" < "+p1);
       }
       if (p2 > p0.length()) {
       label_00c3 :
          throw new IllegalArgumentException("endIndex > string.length: "+p2+" > "+p0.length());
       }
       while (p1 < p2) {
          char c = p0.charAt(p1);
          if (c < 128) {
             j oj = this.c(1);
             j a = oj.a;
             i = oj.c - p1;
             int i1 = i - 2048;
             i1 = Math.min(p2, i1);
             p1 = p1 + i;
             a[p1] = (byte)c;
             for (int i2 = p1 + 1; i2 < i1; i2 = i3) {
                char c1 = p0.charAt(i2);
                if (c1 >= 128) {
                }
                i3 = i2 + 1;
                i2 = i2 + i;
                a[i2] = (byte)c1;
             }
             i = i + i2;
             j c2 = oj.c;
             i = i - c2;
             c2 = c2 + i;
             oj.c = c2;
             long l = this.b + (long)i;
             this.b = l;
             c2 = i2;
          }else if(c < 2048){
             i4 = c >> 6;
             i4 = i4 | 0x00c0;
          }else {
             int i5 = 63;
             if (c >= 0xd800) {
                i4 = 0xdfff;
                if (c <= i4) {
                   i = p1 + 1;
                   char c3 = (i < p2)? p0.charAt(i): 0;
                   if (c <= 0xdbff && (c3 < 0xdc00 || c3 > i4)) {
                      this.b(i5);
                      p1 = i;
                   }else {
                      i3 = c & -55297;
                      i3 = i3 << 10;
                      i = -56321 & c3;
                      i3 = i3 | i;
                      i3 = i3 + 0x10000;
                      i4 = i3 >> 18;
                      i4 = i4 | 0x00f0;
                      this.b(i4);
                      i4 = i3 >> 12;
                      i4 = i4 & i5;
                      i4 = i4 | 128;
                      this.b(i4);
                      i4 = i3 >> 6;
                      i4 = i4 & i5;
                      i4 = i4 | 128;
                      this.b(i4);
                      i3 = i3 & i5;
                      i3 = i3 | 128;
                      this.b(i3);
                      p1 = p1 + 2;
                   }
                }
             }
             i4 = c >> 12;
             i4 = i4 | 0x00e0;
             this.b(i4);
             i4 = c >> 6;
             i4 = i4 & i5;
             i4 = i4 | 128;
          }
          this.b(i4);
          i3 = c & 0x3f;
          i3 = i3 | 128;
          this.b(i3);
          p1++;
       }
       return this;
    }
    public String a(long p0,Charset p1){
       o.a(this.b, 0, p0);
       if (p1 == null) {
          throw new IllegalArgumentException("charset == null");
       }
       if (p0 - 0x7fffffff > 0) {
          throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: "+p0);
       }
       if (!p0 - null) {
          return "";
       }
       b ta = this.a;
       j b = ta.b;
       if (((long)b + p0) - (long)ta.c > 0) {
          return new String(this.a(p0), p1);
       }
       String str = new String(ta.a, b, (int)p0, p1);
       int i = (int)((long)ta.b + p0);
       ta.b = i;
       this.b = this.b - p0;
       if (i == ta.c) {
          this.a = ta.a();
          k.a(ta);
       }
       return str;
    }
    public void a(b p0,long p1){
       b a;
       j g;
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       if (p0 == this) {
          throw new IllegalArgumentException("source == this");
       }
       o.a(p0.b, 0, p1);
       while (true) {
          if (p1 - null <= 0) {
             return;
          }
          a = p0.a;
          int i = a.c - a.b;
          if (p1 - (long)i < 0) {
             b ta = this.a;
             g = (ta != null)? ta.g: null;
             if (g != null && g.e != null) {
                long l = (long)g.c + p1;
                int i1 = (g.d != null)? 0: g.b;
                l = l - (long)i1;
                if (l - 2048 <= 0) {
                   break ;
                }
             }
          label_004f :
             p0.a = a.a((int)p1);
          }
          a = p0.a;
          i = a.c - a.b;
          long l1 = (long)i;
          p0.a = a.a();
          b ta1 = this.a;
          if (ta1 == null) {
             this.a = a;
             a.g = a;
             a.f = a;
          }else {
             ta1.g.a(a).b();
          }
          long l2 = p0.b - l1;
          p0.b = l2;
          l2 = this.b + l1;
          this.b = l2;
          p1 = p1 - l1;
       }
       a.a(g, (int)p1);
       p0.b = p0.b - p1;
       this.b = this.b + p1;
       return;
    }
    public void a(byte[] p0){
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return;
          }
          int i1 = p0.length - i;
          i1 = this.a(p0, i, i1);
          if (i1 != -1) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public byte[] a(long p0){
       o.a(this.b, 0, p0);
       if (p0 - 0x7fffffff > 0) {
          throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: "+p0);
       }
       byte[] uobyteArray = new byte[(int)p0];
       this.a(uobyteArray);
       return uobyteArray;
    }
    public long b(b p0,long p1){
       b uob;
       if (p0 == null) {
          throw new IllegalArgumentException("sink == null");
       }
       StringBuilder str = null;
       if (p1 - str < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       b tb = this.b;
       if (!tb - str) {
          return -1;
       }
       if (p1 - tb > 0) {
          uob = tb;
       }
       p0.a(this, uob);
       return uob;
    }
    public b b(){
       return this;
    }
    public b b(int p0){
       j oj = this.c(1);
       j c = oj.c;
       oj.c = c + 1;
       oj.a[c] = (byte)p0;
       this.b = this.b + 1;
       return this;
    }
    public b b(byte[] p0){
       if (p0 != null) {
          return this.b(p0, 0, p0.length);
       }
       throw new IllegalArgumentException("source == null");
    }
    public b b(byte[] p0,int p1,int p2){
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       long l = (long)p2;
       o.a((long)p0.length, (long)p1, l);
       p2 = p2 + p1;
       while (p1 < p2) {
          j oj = this.c(1);
          int i = p2 - p1;
          int i1 = oj.c - 2048;
          i = Math.min(i, i1);
          System.arraycopy(p0, p1, oj.a, oj.c, i);
          p1 = p1 + i;
          i1 = oj.c + i;
          oj.c = i1;
       }
       this.b = this.b + l;
       return this;
    }
    public c b(e p0){
       return this.a(p0);
    }
    public c b(String p0){
       return this.a(p0);
    }
    public void b(long p0){
       while (true) {
          if (p0 - null <= 0) {
             return;
          }
          b ta = this.a;
          if (ta != null) {
             int i = ta.c - ta.b;
             i = (int)Math.min(p0, (long)i);
             long l = (long)i;
             long l1 = this.b - l;
             this.b = l1;
             p0 = p0 - l;
             ta = this.a;
             int i1 = ta.b + i;
             ta.b = i1;
             if (i1 == ta.c) {
                this.a = ta.a();
                k.a(ta);
             }
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public b c(long p0){
       long l = 0;
       if (!(v2 = p0 - l)) {
          return this.b(48);
       }
       int i = 0;
       int i1 = 1;
       if (v2 < 0) {
          p0 = - p0;
          if (p0 - l < 0) {
             return this.a("-9223372036854775808");
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
       j oj = this.c(i1);
       j a = oj.a;
       int i2 = oj.c + i1;
       while (p0 - l) {
          long l1 = p0 % 10;
          int i3 = (int)l1;
          i2 = i2 - 1;
          a[i2] = b.c[i3];
          p0 = p0 / 10;
       }
       if (i) {
          a[(i2 - 1)] = 45;
       }
       oj.c = oj.c + i1;
       this.b = this.b + (long)i1;
       return this;
    }
    public c c(byte[] p0){
       return this.b(p0);
    }
    public c c(byte[] p0,int p1,int p2){
       return this.b(p0, p1, p2);
    }
    public j c(int p0){
       if (p0 < 1 || p0 > 2048) {
          throw new IllegalArgumentException();
       }
       b ta = this.a;
       if (ta == null) {
          j oj = k.a();
          this.a = oj;
          oj.g = oj;
          oj.f = oj;
          return oj;
       }else {
          j g = ta.g;
          if ((g.c + p0) > 2048 || g.e == null) {
             g = g.a(k.a());
          }
          return g;
       }
    }
    public boolean c(){
       boolean b = (!this.b)? true: false;
       return b;
    }
    public Object clone(){
       return this.k();
    }
    public void close(){
    }
    public b d(long p0){
       if (!p0) {
          return this.b(48);
       }
       int i = (Long.numberOfTrailingZeros(Long.highestOneBit(p0)) / 4) + 1;
       j oj = this.c(i);
       j a = oj.a;
       j c = oj.c;
       for (int i1 = (c + i) - 1; i1 >= c; i1 = i1 - 1) {
          long l = 15 & p0;
          a[i1] = b.c[(int)l];
          p0 = p0 >> 4;
       }
       oj.c = oj.c + i;
       this.b = this.b + (long)i;
       return this;
    }
    public InputStream d(){
       return new b$1(this);
    }
    public long e(){
       b tb = this.b;
       long l = 0;
       if (!tb - l) {
          return l;
       }
       j g = this.a.g;
       j c = g.c;
       if (c < 2048 && g.e != null) {
          tb = tb - (long)(c - g.b);
       }
       return tb;
    }
    public c e(long p0){
       return this.c(p0);
    }
    public boolean equals(Object p0){
       j b;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof b) {
          return false;
       }
       b tb = this.b;
       if (tb - p0.b) {
          return false;
       }
       long l = 0;
       if (!tb - l) {
          return true;
       }
       b ta = this.a;
       p0 = p0.a;
       b = ta.b;
       j b1 = p0.b;
       while (true) {
          if (l - this.b >= 0) {
             return true;
          }
          int i = ta.c - b;
          int i1 = p0.c - b1;
          long l1 = (long)Math.min(i, i1);
          int i2 = 0;
          while (true) {
             if ((long)i2 - l1 < 0) {
                int i3 = b + 1;
                int i4 = b1 + 1;
                if (ta.a[b] != p0.a[b1]) {
                   break ;
                }else {
                   i2 = i2 + 1;
                   b = i3;
                   b1 = i4;
                }
             }else if(b == ta.c){
                ta = ta.f;
                b = ta.b;
             }
             if (b1 == p0.c) {
                p0 = p0.f;
                b1 = p0.b;
             }
             l = l + l1;
          }
          return false;
       }
    }
    public byte f(){
       b tb = this.b;
       if (!tb - null) {
          throw new IllegalStateException("size == 0");
       }
       b ta = this.a;
       j b = ta.b;
       int i = b + 1;
       byte b1 = ta.a[b];
       this.b = tb - 1;
       if (i == ta.c) {
          this.a = ta.a();
          k.a(ta);
       }else {
          ta.b = i;
       }
       return b1;
    }
    public void flush(){
    }
    public e g(){
       return new e(this.i());
    }
    public String h(){
       try{
          return this.a(this.b, o.a);
       }catch(java.io.EOFException e0){
          throw new AssertionError(e0);
       }
    }
    public int hashCode(){
       b ta = this.a;
       if (ta == null) {
          return 0;
       }
       int i = 1;
       do {
          j c = ta.c;
          for (j b = ta.b; b < c; b = b + 1) {
             i = i * 31;
             i = i + ta.a[b];
          }
          ta = ta.f;
       } while (ta == this.a);
       return i;
    }
    public byte[] i(){
       try{
          return this.a(this.b);
       }catch(java.io.EOFException e0){
          throw new AssertionError(e0);
       }
    }
    public void j(){
       try{
          this.b(this.b);
          return;
       }catch(java.io.EOFException e0){
          throw new AssertionError(e0);
       }
    }
    public b k(){
       b uob = new b();
       if (!this.b - null) {
          return uob;
       }
       j oj = new j(this.a);
       uob.a = oj;
       oj.g = oj;
       oj.f = oj;
       b ta = this.a;
       oj = ta.f;
       while (oj != this.a) {
          uob.a.g.a(new j(oj));
       }
       uob.b = this.b;
       return uob;
    }
    public String toString(){
       b tb = this.b;
       if (!tb) {
          return "Buffer[size=0]";
       }
       int i = 2;
       if (tb - 16 <= 0) {
          Object[] objArray = new Object[i];
          objArray[0] = Long.valueOf(this.b);
          objArray[1] = this.k().g().c();
          return String.format("Buffer[size=%s data=%s]", objArray);
       }else {
          try{
             MessageDigest instance = MessageDigest.getInstance("MD5");
             b ta = this.a;
             j b = ta.b;
             instance.update(ta.a, b, (ta.c - b));
             ta = this.a;
             j f = ta.f;
             while (f != this.a) {
                b = f.b;
                int i1 = f.c - b;
                instance.update(f.a, b, i1);
             }
             Object[] objArray1 = new Object[i];
             objArray1[0] = Long.valueOf(this.b);
             objArray1[1] = e.a(instance.digest()).c();
             return String.format("Buffer[size=%s md5=%s]", objArray1);
          }catch(java.security.NoSuchAlgorithmException e0){
             throw new AssertionError();
          }
       }
    }
}
