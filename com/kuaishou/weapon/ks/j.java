package com.kuaishou.weapon.ks.j;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.io.File;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuffer;

public final class j	// class@001212
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
       j.a = stringArray;
    }
    public void j(){
       super();
    }
    public static String a(byte p0){
       int i;
       if (p0 < 0) {
          i = p0 + 256;
       }
       String[] a = j.a;
       return a[(i / 16)]+a[(i % 16)];
    }
    public static String a(File p0){
       if (p0 == null || !p0.exists()) {
          return null;
       }
       MessageDigest instance = MessageDigest.getInstance("MD5");
       FileInputStream uFileInputSt = new FileInputStream(p0);
       byte[] uobyteArray = new byte[8192];
       int i = uFileInputSt.read(uobyteArray);
       while (i != -1) {
          instance.update(uobyteArray, 0, i);
       }
       uFileInputSt.close();
       return j.c(instance.digest());
    }
    public static String a(String p0){
       String str = null;
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       p0 = j.a(MessageDigest.getInstance("MD5").digest((p0).getBytes()));
       return p0;
    }
    public static String a(byte[] p0){
       StringBuffer str = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          str = str+j.a(p0[i]);
       }
       return str;
    }
    public static String b(byte[] p0){
       String str = null;
       if (p0 != null && p0.length > 0) {
          str = j.a(MessageDigest.getInstance("MD5").digest(p0));
       }
       return str;
    }
    public static String c(byte[] p0){
       char[] uocharArray = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       char[] uocharArray1 = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int b = p0[i];
          int i1 = i * 2;
          int i2 = b >> 4;
          i2 = i2 & 0x0f;
          uocharArray1[i1] = uocharArray[i2];
          i1 = i1 + 1;
          b = b & 0x0f;
          uocharArray1[i1] = uocharArray[b];
       }
       return new String(uocharArray1);
    }
    public static byte[] d(byte[] p0){
       byte[] uobyteArray = null;
       if (p0 != null && p0.length > 0) {
          uobyteArray = MessageDigest.getInstance("MD5").digest(p0);
       }
       return uobyteArray;
    }
}
