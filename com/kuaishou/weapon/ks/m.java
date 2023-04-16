package com.kuaishou.weapon.ks.m;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Byte;
import java.lang.StringBuffer;
import java.lang.Integer;

public class m	// class@001215
{

    public void m(){
       super();
    }
    public static byte a(byte p0,byte p1){
       byte[] uobyteArray = new byte[]{p0};
       byte[] uobyteArray1 = new byte[]{p1};
       return (byte)((char)((char)Byte.decode("0x"+new String(uobyteArray)).byteValue() << 4) ^ (char)Byte.decode("0x"+new String(uobyteArray1)).byteValue());
    }
    public static String a(String p0,String p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       return new String(m.c(m.c(p0), p1));
    }
    public static String a(byte[] p0){
       StringBuffer str = new StringBuffer(p0.length);
       for (int i = 0; i < p0.length; i = i + 1) {
          str = str+(char)p0[i];
       }
       return str;
    }
    public static byte[] a(String p0){
       byte[] bytes = p0.getBytes();
       byte[] uobyteArray = new byte[256];
       int i = 0;
       for (int i1 = 0; i1 < 256; i1 = i1 + 1) {
          uobyteArray[i1] = (byte)i1;
       }
       if (bytes == null || !bytes.length) {
          return null;
       }
       i1 = 0;
       int i2 = 0;
       for (; i < 256; i = i + 1) {
          byte i3 = bytes[i1] & 0x00ff;
          int i4 = uobyteArray[i] & 0x00ff;
          i3 = i3 + i4;
          i3 = i3 + i2;
          i2 = i3 & 0x00ff;
          i3 = uobyteArray[i];
          uobyteArray[i] = uobyteArray[i2];
          uobyteArray[i2] = i3;
          i1 = i1 + 1;
          i1 = i1 % bytes.length;
       }
       return uobyteArray;
    }
    public static byte[] a(byte[] p0,String p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       return m.c(p0, p1);
    }
    public static String b(String p0){
       String str = "";
       for (int i = 0; i < p0.length(); i = i + 1) {
          int i1 = p0.charAt(i) & 0x00ff;
          String str1 = Integer.toHexString(i1);
          if (str1.length() == 1) {
             str1 = '0'+str1;
          }
          str = str+str1;
       }
       return str;
    }
    public static byte[] b(String p0,String p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       return m.c(p0.getBytes(), p1);
    }
    public static byte[] b(byte[] p0,String p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       return m.c(p0, p1);
    }
    public static byte[] c(String p0){
       int i = p0.length() / 2;
       byte[] uobyteArray = new byte[i];
       byte[] bytes = p0.getBytes();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = i1 * 2;
          i2 = i2 + 1;
          uobyteArray[i1] = m.a(bytes[i2], bytes[i2]);
       }
       return uobyteArray;
    }
    public static byte[] c(byte[] p0,String p1){
       byte[] uobyteArray = m.a(p1);
       byte[] uobyteArray1 = new byte[p0.length];
       int i1 = 0;
       int i2 = 0;
       for (int i = 0; i < p0.length; i = i + 1) {
          i1 = i1 + 1;
          i1 = i1 & 0x00ff;
          int i3 = uobyteArray[i1] & 0x00ff;
          i3 = i3 + i2;
          i2 = i3 & 0x00ff;
          i3 = uobyteArray[i1];
          uobyteArray[i1] = uobyteArray[i2];
          uobyteArray[i2] = i3;
          i3 = uobyteArray[i1] & 0x00ff;
          int i4 = uobyteArray[i2] & 0x00ff;
          i3 = i3 + i4;
          i3 = i3 & 0x00ff;
          i3 = uobyteArray[i3] ^ p0[i];
          uobyteArray1[i] = (byte)i3;
       }
       return uobyteArray1;
    }
}
