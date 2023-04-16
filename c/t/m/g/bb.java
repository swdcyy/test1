package c.t.m.g.bb;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.lang.System;
import java.io.IOException;
import java.io.PrintStream;

public class bb	// class@000bdf
{
    public static final char[] a;

    static {
       bb.a = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").toCharArray();
    }
    public static int a(char p0){
       int i;
       char c = 'A';
       if (p0 >= c && p0 <= 'Z') {
          return (p0 - c);
       }
       c = 'a';
       if (p0 >= c && p0 <= 'z') {
          i = p0 - c;
       }else {
          c = '0';
          if (p0 >= c && p0 <= '9') {
             i = (p0 - c) + 26;
          }else if(p0 != '+'){
             if (p0 != '/') {
                if (p0 == '=') {
                   return 0;
                }else {
                   throw new RuntimeException("unexpected code: "+p0);
                }
             }else {
                return 63;
             }
          }else {
             return 62;
          }
       }
       return (i + 26);
    }
    public static String a(byte[] p0){
       int i7;
       char[] a1;
       int len = p0.length;
       StringBuffer str = new StringBuffer(((p0.length * 3) / 2));
       int i = len - 3;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          int i3 = 0;
          while (true) {
             if (i2 <= i) {
                int i4 = p0[i2] & 0x00ff;
                i4 = i4 << 16;
                int i5 = i2 + 1;
                i5 = p0[i5] & 0x00ff;
                i5 = i5 << 8;
                i4 = i4 | i5;
                i5 = i2 + 2;
                i5 = p0[i5] & 0x00ff;
                i4 = i4 | i5;
                char[] a = bb.a;
                int i6 = i4 >> 18;
                i6 = i6 & 0x3f;
                i6 = i4 >> 12;
                i6 = i6 & 0x3f;
                i6 = i4 >> 6;
                i6 = i6 & 0x3f;
                i4 = i4 & 0x3f;
                str = str+a[i6]+a[i6]+a[i6]+a[i4];
                i2 = i2 + 3;
                i4 = i3 + 1;
                if (i3 >= 14) {
                   continue ;
                }else {
                   i3 = i4;
                }
             }else {
                i1 = i1 + len;
                if (i2 == (i1 - 2)) {
                   i7 = ((p0[(i2 + 1)] & 0x00ff) << 8) | ((p0[i2] & 0x00ff) << 16);
                   a1 = bb.a;
                   str = str+a1[((i7 >> 18) & 0x3f)]+a1[((i7 >> 12) & 0x3f)]+a1[((i7 >> 6) & 0x3f)]+"=";
                   break ;
                }else if(i2 == (i1 - 1)){
                   i7 = (p0[i2] & 0x00ff) << 16;
                   a1 = bb.a;
                   str = str+a1[((i7 >> 18) & 0x3f)]+a1[((i7 >> 12) & 0x3f)]+"==";
                   break ;
                }
                break ;
             }
          }
          return str;
       }
    }
    public static void a(String p0,OutputStream p1){
       int i = p0.length();
       int i1 = 0;
       while (i1 < i && p0.charAt(i1) <= ' ') {
          i1 = i1 + 1;
       }
       if (i1 != i) {
          int i2 = bb.a(p0.charAt(i1)) << 18;
          int i3 = i1 + 1;
          i3 = bb.a(p0.charAt(i3)) << 12;
          i2 = i2 + i3;
          i3 = i1 + 2;
          int i4 = bb.a(p0.charAt(i3)) << 6;
          i2 = i2 + i4;
          i4 = i1 + 3;
          i2 = i2 + bb.a(p0.charAt(i4));
          int i5 = i2 >> 16;
          i5 = i5 & 0x00ff;
          p1.write(i5);
          if (p0.charAt(i3) != '=') {
             i3 = i2 >> 8;
             i3 = i3 & 0x00ff;
             p1.write(i3);
             if (p0.charAt(i4) != '=') {
                i2 = i2 & 0x00ff;
                p1.write(i2);
                i1 = i1 + 4;
                goto label_0005 ;
             }
          }
       }
       return;
    }
    public static byte[] a(String p0){
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          bb.a(p0, uByteArrayOu);
          byte[] uobyteArray = uByteArrayOu.toByteArray();
          try{
             uByteArrayOu.close();
          }catch(java.io.IOException e0){
             System.err.println("Error while decoding BASE64: "+e0.toString());
          }
          return uobyteArray;
       }catch(java.io.IOException e0){
          throw new RuntimeException();
       }
    }
}
