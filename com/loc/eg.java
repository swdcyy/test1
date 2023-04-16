package com.loc.eg;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class eg	// class@001402
{
    public static SimpleDateFormat a;
    public static String b;

    public static String a(byte[] p0,String p1){
       StringBuilder str = "";
       if (p0 == null || p0.length <= 0) {
          return null;
       }
       int i = 0;
       while (i < p0.length) {
          int i1 = p0[i] & 0x00ff;
          String str1 = Integer.toHexString(i1);
          if (str1.length() < 2) {
             str = str+"0";
          }
          str = str+str1;
          if (p1.length() > 0) {
             i1 = p0.length - 1;
             if (i < i1) {
                str = str+p1;
             }
          }
          i = i + 1;
       }
       return str;
    }
    public static byte[] a(long p0){
       byte[] uobyteArray = new byte[6];
       for (int i = 0; i < 6; i = i + 1) {
          int i1 = i - 6;
          i1 = i1 - 1;
          i1 = i1 * 8;
          long l = p0 >> i1;
          l = l & 255;
          uobyteArray[i] = (byte)(int)l;
       }
       return uobyteArray;
    }
}
