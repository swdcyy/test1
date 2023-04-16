package com.unionpay.utils.a;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Character;

public final class a	// class@001009
{

    public static String a(byte[] p0){
       StringBuilder str = new StringBuilder((p0.length * 2));
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          int i2 = i1 >> 4;
          i1 = i1 & 0x0f;
          str = str+("0123456789abcdef").charAt(i2)+("0123456789abcdef").charAt(i1);
       }
       return str;
    }
    public static byte[] a(String p0){
       char[] uocharArray = p0.toCharArray();
       int i = uocharArray.length / 2;
       byte[] uobyteArray = new byte[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = i1 * 2;
          i2 = i2 + 1;
          int i3 = Character.digit(uocharArray[i2], 16) << 4;
          i2 = Character.digit(uocharArray[i2], 16) | i3;
          if (i2 > 127) {
             i2 = i2 - 256;
          }
          uobyteArray[i1] = (byte)i2;
       }
       return uobyteArray;
    }
}
