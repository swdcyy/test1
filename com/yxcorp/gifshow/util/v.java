package com.yxcorp.gifshow.util.v;
import java.lang.String;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.io.InputStream;
import ekd.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.lang.System;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.IndexOutOfBoundsException;

public class v	// class@001fb5
{
    public static final char[] a;
    public static final char[] b;
    public static final char[] c;
    public static final char[] d;

    static {
       v.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       v.b = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       char[] uocharArray = new char[256];
       v.c = uocharArray;
       uocharArray = new char[256];
       v.d = uocharArray;
       for (int i = 0; i < 256; i = i + 1) {
          char[] b = v.b;
          int i1 = i >> 4;
          i1 = i1 & 0x0f;
          v.c[i] = b[i1];
          i1 = i & 0x0f;
          v.d[i] = b[i1];
       }
    }
    public static String a(byte[] p0,boolean p1){
       char[] uocharArray = new char[(p0.length * 2)];
       int i1 = 0;
       for (int i = 0; i < p0.length; i = i + 1) {
          int i2 = p0[i] & 0x00ff;
          if (!i2 && p1) {
             break ;
          }else {
             int i3 = i1 + 1;
             uocharArray[i1] = v.c[i2];
             i1 = i3 + 1;
             uocharArray[i3] = v.d[i2];
          }
       }
       return new String(uocharArray, 0, i1);
    }
    public static String b(File p0){
       String str = null;
       try{
          byte[] uobyteArray = v.c(p0);
          if (uobyteArray == null || !uobyteArray.length) {
             return e0;
          }
          return v.a(uobyteArray, true);
       }catch(java.security.NoSuchAlgorithmException e0){
       }catch(java.io.IOException e0){
       }
    }
    public static byte[] c(File p0){
       FileInputStream uFileInputSt;
       if (p0 == null) {
          return null;
       }
       try{
          uFileInputSt = new FileInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          byte[] uobyteArray = new byte[4096];
          int i = uFileInputSt.read(uobyteArray);
          while (i != -1) {
             instance.update(uobyteArray, 0, i);
          }
          p.c(uFileInputSt);
          return instance.digest();
       }catch(java.lang.Exception e0){
          p.c(uFileInputSt);
          return e0;
       }
    }
    public static byte[] d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return v.c(new File(p0));
    }
    public static String e(File p0){
       FileInputStream uFileInputSt = new FileInputStream(p0);
       long l = p0.length();
       int i = 128;
       byte[] uobyteArray = new byte[i];
       byte[] uobyteArray1 = new byte[8];
       byte[] uobyteArray2 = new byte[136];
       for (int i1 = 0; i1 < 8; i1 = i1 + 1) {
          int i2 = i1 * 8;
          i2 = i2 - 56;
          long l1 = l >> i2;
          l1 = l1 & 255;
          uobyteArray1[i1] = (byte)(int)l1;
       }
       uFileInputSt.read(uobyteArray);
       System.arraycopy(uobyteArray, 0, uobyteArray2, 0, i);
       System.arraycopy(uobyteArray1, 0, uobyteArray2, i, 8);
       uFileInputSt.close();
       return v.g(uobyteArray2);
    }
    public static String f(String p0){
       try{
          p0 = v.g(p0.getBytes());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p0 = null;
       }
       return p0;
    }
    public static String g(byte[] p0){
       String str;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0);
          p0 = instance.digest();
          char[] uocharArray = new char[32];
          int i1 = 0;
          for (int i = 0; i < 16; i = i + 1) {
             int b = p0[i];
             int i2 = i1 + 1;
             char[] a = v.a;
             int i3 = b >> 4;
             i3 = i3 & 0x0f;
             uocharArray[i1] = a[i3];
             i1 = i2 + 1;
             b = b & 0x0f;
             uocharArray[i2] = a[b];
          }
          str = new String(uocharArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          str = null;
       }
       return str;
    }
    public static String h(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0.getBytes());
          byte[] uobyteArray = instance.digest();
          StringBuilder str = "";
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             byte b = uobyteArray[i];
             if (b < 0) {
                b = b + 256;
             }
             if (b < 16) {
                str = str+"0";
             }
             str = str+Integer.toHexString(b);
          }
          return str;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String i(byte[] p0,int p1,int p2){
       if (p1 < 0 || (p1 + p2) > p0.length) {
          throw new IndexOutOfBoundsException();
       }
       int i = p2 * 2;
       char[] uocharArray = new char[i];
       int i2 = 0;
       for (int i1 = 0; i1 < p2; i1 = i1 + 1) {
          int i3 = i1 + p1;
          i3 = p0[i3] & 0x00ff;
          int i4 = i2 + 1;
          char[] a = v.a;
          int i5 = i3 >> 4;
          uocharArray[i2] = a[i5];
          i2 = i4 + 1;
          i3 = i3 & 0x0f;
          uocharArray[i4] = a[i3];
       }
       return new String(uocharArray, 0, i);
    }
}
