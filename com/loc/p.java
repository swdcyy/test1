package com.loc.p;
import java.lang.String;
import com.loc.x;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.PublicKey;
import java.security.Key;
import java.lang.Object;
import java.lang.System;
import javax.crypto.Cipher;
import java.lang.Throwable;
import com.loc.ak;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.AlgorithmParameterSpec;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.lang.StringBuffer;

public final class p	// class@00145f
{
    public static final char[] a;
    public static final byte[] b;

    static {
       int i2;
       p.a = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       int i = 128;
       byte[] uobyteArray = new byte[i];
       p.b = uobyteArray;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p.b[i1] = -1;
       }
       for (i = 65; i <= 90; i = i + 1) {
          i2 = i - 65;
          p.b[i] = (byte)i2;
       }
       for (i = 97; i <= 122; i = i + 1) {
          i2 = i - 97;
          i2 = i2 + 26;
          p.b[i] = (byte)i2;
       }
       for (i = 48; i <= 57; i = i + 1) {
          i2 = i - 48;
          i2 = i2 + 52;
          p.b[i] = (byte)i2;
       }
       byte[] b = p.b;
       b[43] = 62;
       b[47] = 63;
    }
    public static String a(String p0){
       return x.a(p.b(p0));
    }
    public static byte[] a(byte[] p0){
       KeyGenerator instance = KeyGenerator.getInstance(x.c("EQUVT"));
       byte[] uobyteArray = null;
       if (instance == null) {
          return uobyteArray;
       }
       instance.init(256);
       byte[] encoded = instance.generateKey().getEncoded();
       PublicKey publicKey = x.d();
       if (publicKey == null) {
          return uobyteArray;
       }
       uobyteArray = p.a(encoded, publicKey);
       p0 = p.a(encoded, p0);
       encoded = new byte[(uobyteArray.length + p0.length)];
       System.arraycopy(uobyteArray, 0, encoded, 0, uobyteArray.length);
       System.arraycopy(p0, 0, encoded, uobyteArray.length, p0.length);
       return encoded;
    }
    public static byte[] a(byte[] p0,Key p1){
       Cipher instance = Cipher.getInstance(x.c("CUlNBL0VDQi9QS0NTMVBhZGRpbmc"));
       instance.init(1, p1);
       return instance.doFinal(p0);
    }
    public static byte[] a(byte[] p0,byte[] p1){
       return p.c(p0, p1, x.c());
    }
    public static byte[] a(byte[] p0,byte[] p1,byte[] p2){
       Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
       instance.init(2, new SecretKeySpec(p0, x.c("EQUVT")), new IvParameterSpec(p2));
       return instance.doFinal(p1);
    }
    public static String b(byte[] p0){
       return p.d(p0);
    }
    public static byte[] b(String p0){
       byte[] uobyteArray;
       int i = 0;
       if (p0 == null) {
          uobyteArray = new byte[i];
          return uobyteArray;
       }else {
          uobyteArray = x.a(p0);
          int len = uobyteArray.length;
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(len);
          for (; i < len; i = i1) {
             int i1 = i + 1;
             i = p.b[uobyteArray[i]];
             int i2 = -1;
             while (i1 < len && i == i2) {
                i = i1;
             }
             if (i != i2) {
                int i3 = i1 + 1;
                i1 = p.b[uobyteArray[i1]];
                while (i3 < len && i1 == i2) {
                   i1 = i3;
                }
                if (i1 != i2) {
                   i = i << 2;
                   byte i4 = i1 & 0x30;
                   i4 = i4 >> 4;
                   i = i | i4;
                   uByteArrayOu.write(i);
                   while (true) {
                      if (i3 == len) {
                         return uByteArrayOu.toByteArray();
                      }
                      i = i3 + 1;
                      i4 = uobyteArray[i3];
                      i3 = 61;
                      if (i4 == i3) {
                         return uByteArrayOu.toByteArray();
                      }
                      i4 = p.b[i4];
                      if (i >= len || i4 != i2) {
                         if (i4 != i2) {
                            i1 = i1 & 0x0f;
                            i1 = i1 << 4;
                            int i5 = i4 & 0x3c;
                            i5 = i5 >> 2;
                            i1 = i1 | i5;
                            uByteArrayOu.write(i1);
                            while (true) {
                               if (i == len) {
                                  return uByteArrayOu.toByteArray();
                               }
                               i1 = i + 1;
                               i = uobyteArray[i];
                               if (i == i3) {
                                  return uByteArrayOu.toByteArray();
                               }
                               i = p.b[i];
                               if (i1 >= len || i != i2) {
                                  if (i != i2) {
                                     i2 = i4 & 0x03;
                                     i2 = i2 << 6;
                                     i = i | i2;
                                     uByteArrayOu.write(i);
                                  }else {
                                     break ;
                                  }
                               }else {
                                  i = i1;
                               }
                            }
                         label_0096 :
                            return uByteArrayOu.toByteArray();
                         }else {
                            goto label_0096 ;
                         }
                      }else {
                         i3 = i;
                      }
                   }
                }else {
                   goto label_0096 ;
                }
             }else {
                goto label_0096 ;
             }
          }
       }
    }
    public static byte[] b(byte[] p0,byte[] p1,byte[] p2){
       return p.c(p0, p1, p2);
    }
    public static String c(byte[] p0){
       return p.d(p0);
    }
    public static byte[] c(byte[] p0,byte[] p1,byte[] p2){
       IvParameterSpec ivParameterS = new IvParameterSpec(p2);
       SecretKeySpec secretKeySpe = new SecretKeySpec(p0, x.c("EQUVT"));
       Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
       try{
          int i = 1;
          instance.init(i, secretKeySpe, ivParameterS);
       }catch(java.security.InvalidAlgorithmParameterException e4){
          e4.printStackTrace();
       }
       return instance.doFinal(p1);
    }
    public static String d(byte[] p0){
       char[] a;
       String str1;
       int i2;
       StringBuffer str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i3) {
          int i1 = i + 1;
          i = p0[i] & 0x00ff;
          if (i1 == len) {
             a = p.a;
             str = str+a[(i >> 2)]+a[((i & 0x03) << 4)];
             str1 = "==";
          }else {
             i2 = i1 + 1;
             i1 = p0[i1] & 0x00ff;
             if (i2 == len) {
                a = p.a;
                str = str+a[(i >> 2)]+a[(((i & 0x03) << 4) | ((i1 & 0x00f0) >> 4))]+a[((i1 & 0x0f) << 2)];
                str1 = "=";
             }
          }
          str = str+str1;
          break ;
          int i3 = i2 + 1;
          i2 = p0[i2] & 0x00ff;
          char[] a1 = p.a;
          int i4 = i >> 2;
          i = i & 0x03;
          i = i << 4;
          i4 = i1 & 0x00f0;
          i4 = i4 >> 4;
          i = i | i4;
          i = i1 & 0x0f;
          i = i << 2;
          i1 = i2 & 0x00c0;
          i1 = i1 >> 6;
          i = i | i1;
          i = i2 & 0x3f;
          str = str+a1[i4]+a1[i]+a1[i]+a1[i];
       }
       return str;
    }
}
