package io.netty.buffer.f;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.buffer.f$a;
import io.netty.util.internal.PlatformDependent;
import java.lang.String;
import zqd.x;
import java.util.Locale;
import java.lang.Object;
import kqd.w;
import io.netty.buffer.j;
import java.lang.Integer;
import io.netty.buffer.d;
import java.lang.Math;
import java.nio.ByteOrder;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import io.netty.buffer.f$b;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Short;

public final class f	// class@001057
{
    public static final b a;
    public static final e b;
    public static final int c;
    public static final int d;
    public static final e e;

    static {
       w d;
       b uob = c.a(f.class);
       f.a = uob;
       f.b = new f$a();
       String str = "unpooled";
       String str1 = "pooled";
       String str2 = (PlatformDependent.r())? str: str1;
       str2 = ((x.b("io.netty.allocator.type", str2)).toLowerCase(Locale.US)).trim();
       if (str.equals(str2)) {
          d = w.d;
          uob.debug("-Dio.netty.allocator.type: {}", str2);
       }else if(str1.equals(str2)){
          d = j.v;
          uob.debug("-Dio.netty.allocator.type: {}", str2);
       }else {
          d = j.v;
          uob.debug("-Dio.netty.allocator.type: pooled \(unknown: {}\)", str2);
       }
       f.e = d;
       int i = x.d("io.netty.threadLocalDirectBufferSize", 0x10000);
       f.d = i;
       uob.debug("-Dio.netty.threadLocalDirectBufferSize: {}", Integer.valueOf(i));
       i = x.d("io.netty.maxThreadLocalCharBufferSize", 0x4000);
       f.c = i;
       uob.debug("-Dio.netty.maxThreadLocalCharBufferSize: {}", Integer.valueOf(i));
    }
    public void f(){
       super();
    }
    public static int a(d p0,d p1){
       int i = p0.L5();
       int i1 = p1.L5();
       int i2 = Math.min(i, i1);
       short i3 = i2 >> 2;
       i2 = i2 & 0x03;
       int i4 = p0.M5();
       int i5 = p1.M5();
       if (p0.f5() == p1.f5()) {
          while (true) {
             if (i3 > 0) {
                if ((v12 = p0.G4(i4) - p1.G4(i5)) > 0) {
                   break ;
                }else if(v12 < 0){
                   return -1;
                }else {
                   i4 = i4 + 4;
                   i5 = i5 + 4;
                   i3 = i3 - 1;
                }
             }
          }
          return 1;
       }else {
          while (true) {
             if (i3 > 0) {
                long l = (long)f.e(p1.getInt(i5)) & 0xffffffff;
                if ((v12 = p0.G4(i4) - l) > 0) {
                   return 1;
                }else if(v12 < 0){
                   break ;
                }else {
                   i4 = i4 + 4;
                   i5 = i5 + 4;
                   i3 = i3 - 1;
                }
             }
          }
          return -1;
       }
       if (i2 > 0) {
          i3 = p0.F4(i4);
          short s = p1.F4(i5);
          if (i3 > s) {
             return 1;
          }else if(i3 < s){
             return -1;
          }else {
             i4 = i4 + 1;
             i5 = i5 + 1;
             i2 = i2 - 1;
             goto label_0061 ;
          }
       }else {
          return (i - i1);
       }
    }
    public static void b(CharsetDecoder p0,ByteBuffer p1,CharBuffer p2){
       boolean b = true;
       try{
          CoderResult uCoderResult = p0.decode(p1, p2, b);
          if (!uCoderResult.isUnderflow()) {
             uCoderResult.throwException();
          }
          CoderResult uCoderResult1 = p0.flush(p2);
          if (!uCoderResult1.isUnderflow()) {
             uCoderResult1.throwException();
          }
          return;
       }catch(java.nio.charset.CharacterCodingException e1){
          throw new IllegalStateException(e1);
       }
    }
    public static boolean c(d p0,d p1){
       int i = p0.L5();
       boolean b = false;
       if (i != p1.L5()) {
          return b;
       }
       int i1 = p0.M5();
       int i2 = p1.M5();
       if (i1 < 0 || (i2 < 0 || i < 0)) {
          throw new IllegalArgumentException("All indexes and lengths must be non-negative");
       }
       if ((p0.U6() - i) >= i1 && (p1.U6() - i) >= i2) {
          int i3 = i >> 3;
          i = i & 0x07;
          if (p0.f5() == p1.f5()) {
             while (true) {
                if (i3 > 0) {
                   if (!p0.getLong(i1) - p1.getLong(i2)) {
                      i1 = i1 + 8;
                      i2 = i2 + 8;
                      i3 = i3 - 1;
                   }
                }
             }
          }else {
             while (true) {
                if (i3 > 0) {
                   if (!p0.getLong(i1) - f.f(p1.getLong(i2))) {
                      i1 = i1 + 8;
                      i2 = i2 + 8;
                      i3 = i3 - 1;
                   }
                }
             }
          }
          while (true) {
             if (i > 0) {
                if (p0.p4(i1) == p1.p4(i2)) {
                   i1 = i1 + 1;
                   i2 = i2 + 1;
                   i = i - 1;
                }
             }else {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public static String d(byte[] p0,int p1,int p2){
       String str;
       if (p2 < 0) {
          throw new IllegalArgumentException("length: "+p2);
       }
       if (!p2) {
          str = "";
       }else {
          int i = p1 + p2;
          char[] uocharArray = new char[(p2 << 1)];
          int i1 = 0;
          while (p1 < i) {
             int i2 = p0[p1] & 0x00ff;
             i2 = i2 << 1;
             System.arraycopy(f$b.b, i2, uocharArray, i1, 2);
             p1++;
             i1 = i1 + 2;
          }
          str = new String(uocharArray);
       }
       return str;
    }
    public static int e(int p0){
       return Integer.reverseBytes(p0);
    }
    public static long f(long p0){
       return Long.reverseBytes(p0);
    }
    public static int g(int p0){
       p0 = ((p0 >> 16) & 0x00ff) | (((p0 << 16) & 0xff0000) | (0xff00 & p0));
       if (Float.MIN_NORMAL & p0) {
          p0 = p0 | 0xff000000;
       }
       return p0;
    }
    public static short h(short p0){
       return Short.reverseBytes(p0);
    }
}
