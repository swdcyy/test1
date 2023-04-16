package com.loc.ey;
import javax.crypto.spec.IvParameterSpec;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.s;
import com.loc.x;
import com.loc.ef;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import javax.crypto.Cipher;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.StringBuffer;
import java.lang.Object;
import java.lang.System;

public final class ey	// class@001420
{
    public static final char[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final IvParameterSpec d;

    static {
       ey.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       ey.b = new byte[128]{'=','=','Q','A','A','E','w','A','C','0','J','P','s','t','6','K','h','L','z','a','X','c','5','G','1','z','D','F','O','h','q','q','A','a','L','6','A','B','W','5','g','U','T','q','G','D','E','L','P','R','j','3','B','K','K','E','b','7','T','l','s','z','3','j','L','7','X','z','F','y','I','K','4','2','+','e','F','y','8','i','s','i','Y','x','u','p','5','0','L','Q','F','V','l','n','I','A','B','J','A','S','w','A','w','S','D','A','Q','B','B','E','Q','A','N','c','v','h','I','Z','o','K','J','Y','Q','D','w','w','F','M'};
       byte[] uobyteArray = new byte[16]{0x00,0x01,0x01,0x02,0x03,0x05,0x08,0x0d,0x08,0x07,0x06,0x05,0x04,0x03,0x02,0x01};
       ey.c = uobyteArray;
       ey.d = new IvParameterSpec(uobyteArray);
    }
    public static String a(String p0){
       if (p0 == null || !p0.length()) {
          return null;
       }
       return ey.a("MD5", ey.a("SHA1", p0)+p0);
    }
    public static String a(String p0,String p1){
       if (p1 == null) {
          return null;
       }
       return ey.c(s.a(p1.getBytes("UTF-8"), p0));
    }
    public static byte[] a(){
       return x.c();
    }
    public static byte[] a(byte[] p0){
       Cipher instance = Cipher.getInstance(x.c("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
       instance.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(ef.a(((new String(ey.b)).reverse()).getBytes()))));
       return instance.doFinal(p0);
    }
    public static byte[] a(byte[] p0,String p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(1, ey.b(p1), new IvParameterSpec(ey.a()));
       return instance.doFinal(p0);
    }
    public static SecretKeySpec b(String p0){
       if (p0 == null) {
          p0 = "";
       }
       int i = 16;
       StringBuffer str = new StringBuffer(i);
       str = str+p0;
       while (str.length() < i) {
          p0 = "0";
       }
       if (str.length() > i) {
          str.setLength(i);
       }
       byte[] bytes = (str).getBytes("UTF-8");
       return new SecretKeySpec(bytes, "AES");
    }
    public static byte[] b(byte[] p0){
       byte[] uobyteArray = new byte[16];
       byte[] uobyteArray1 = new byte[(p0.length - 16)];
       System.arraycopy(p0, 0, uobyteArray, 0, 16);
       System.arraycopy(p0, 16, uobyteArray1, 0, (p0.length - 16));
       SecretKeySpec secretKeySpe = new SecretKeySpec(uobyteArray, "AES");
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(2, secretKeySpe, new IvParameterSpec(x.c()));
       return instance.doFinal(uobyteArray1);
    }
    public static byte[] b(byte[] p0,String p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(2, ey.b(p1), new IvParameterSpec(ey.a()));
       return instance.doFinal(p0);
    }
    public static String c(byte[] p0){
       int len = p0.length;
       StringBuilder str = new StringBuilder((len * 2));
       for (int i = 0; i < len; i = i + 1) {
          char[] a = ey.a;
          int i1 = p0[i] >> 4;
          i1 = i1 & 0x0f;
          i1 = p0[i] & 0x0f;
          str = str+a[i1]+a[i1];
       }
       return str;
    }
}
