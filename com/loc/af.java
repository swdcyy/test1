package com.loc.af;
import java.lang.String;
import java.security.SecureRandom;
import com.loc.x;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import com.loc.aa;
import java.lang.StringBuilder;
import com.loc.s;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.Exception;
import com.loc.p;

public final class af	// class@001365
{
    public static byte[] a;
    public static String[] b;
    public static int[] c;

    static {
       String[] stringArray = new String[]{"kp6SsA","cHE4dQ","JKekrA","XBxOHQ","CSnpKw","VwcThw","wkp6Sg","1cHE4Q"};
       af.b = stringArray;
       af.c = null;
    }
    public static int a(int p0,int p1){
       int i1 = 0;
       for (int i = 0; i < p1; i = i + 1) {
          i1 = i1 >> 1;
          i1 = i1 | Integer.MIN_VALUE;
       }
       return ((p0 << p1) | ((p0 & i1) >> (p1 - 32)));
    }
    public static String a(){
       KeyGenerator instance = KeyGenerator.getInstance(x.c("EQUVT"));
       instance.init(128, new SecureRandom());
       return aa.a(instance.generateKey().getEncoded());
    }
    public static String a(int p0){
       char[] uocharArray = new char[4];
       int i = 0;
       while (i < 4) {
          int i1 = i - 4;
          i1 = i1 - 1;
          int i2 = i * 8;
          i2 = p0 >> i2;
          i2 = i2 & 0x00ff;
          uocharArray[i1] = (char)i2;
          char c = uocharArray[i1];
          String str = " ";
          for (int i3 = 0; i3 < 32; i3 = i3 + 1) {
             int i4 = Integer.MIN_VALUE >> i3;
             i4 = i4 & c;
             int i5 = i3 - 31;
             i4 = i4 >> i5;
             str = str+i4;
          }
          i = i + 1;
       }
       return new String(uocharArray);
    }
    public static String a(String p0){
       return s.a(p0);
    }
    public static String a(int[] p0){
       StringBuilder str = "";
       if (p0 != null) {
          for (int i = 0; i < p0.length; i = i + 1) {
             str = str+af.a(af.a(af.b(p0[i]), i));
          }
       }
       return str;
    }
    public static byte[] a(byte[] p0){
       try{
          if (af.a == null) {
             af.a = (x.c("YAAAAAAAAAAAAAAAAAAAAAA")).getBytes();
          }
          Cipher instance = Cipher.getInstance(x.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
          instance.init(1, new SecretKeySpec((af.a(af.b())).getBytes("UTF-8"), x.c("EQUVT")), new IvParameterSpec(af.a));
          return instance.doFinal(p0);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return null;
       }
    }
    public static int b(int p0){
       int i1 = 1;
       for (int i = 0; i < 15; i = i + 1) {
          i1 = i1 << 2;
          i1 = i1 | 1;
       }
       return (((p0 & i1) << 1) | (((i1 << 1) & p0) >> 1));
    }
    public static String b(String p0){
       return aa.a(af.a(p0.getBytes("UTF-8")));
    }
    public static int[] b(){
       int[] c = af.c;
       if (c != null) {
          return c;
       }
       int[] ointArray = new int[8];
       int i = 0;
       String[] b = af.b;
       while (i < b.length) {
          byte[] uobyteArray = p.b(b[i]);
          int i1 = uobyteArray[3] & 0x00ff;
          int i2 = uobyteArray[2] & 0x00ff;
          i2 = i2 << 8;
          i1 = i1 | i2;
          i2 = uobyteArray[1] & 0x00ff;
          i2 = i2 << 16;
          i1 = i1 | i2;
          int i3 = uobyteArray[0] & 0x00ff;
          i3 = i3 << 24;
          i3 = i3 | i1;
          ointArray[i] = i3;
          i = i + 1;
       }
       return ointArray;
    }
}
