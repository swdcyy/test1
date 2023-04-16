package com.facebook.imageutils.c;
import java.lang.String;
import java.io.InputStream;
import android.util.Pair;
import java.lang.Integer;
import java.lang.Object;

public class c	// class@001156
{

    public static boolean a(byte[] p0,String p1){
       if (p0.length != p1.length()) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          if (p1.charAt(i) != p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static int b(InputStream p0){
       return ((((byte)p0.read() << 8) & 0xff00) | ((byte)p0.read() & 0x00ff));
    }
    public static byte c(InputStream p0){
       return (byte)(p0.read() & 0x00ff);
    }
    public static int d(InputStream p0){
       return ((((((byte)p0.read() << 24) & 0xff000000) | (((byte)p0.read() << 16) & 0xff0000)) | (((byte)p0.read() << 8) & 0xff00)) | ((byte)p0.read() & 0x00ff));
    }
    public static short e(InputStream p0){
       return (short)(p0.read() & 0x00ff);
    }
    public static Pair f(InputStream p0){
       p0.skip(7);
       short s = c.e(p0);
       short s1 = c.e(p0);
       if (c.e(p0) == 157 && (s != 1 || s1 != 42)) {
          return null;
       }
       return new Pair(Integer.valueOf(c.b(p0)), Integer.valueOf(c.b(p0)));
    }
    public static Pair g(InputStream p0){
       c.d(p0);
       if (c.c(p0) != 47) {
          return null;
       }
       int i = (byte)p0.read() & 0x00ff;
       return new Pair(Integer.valueOf(((((byte)p0.read() & 0x00ff) | ((i & 0x3f) << 8)) + 1)), Integer.valueOf((((((((byte)p0.read() & 0x00ff) & 0x0f) << 10) | (((byte)p0.read() & 0x00ff) << 2)) | ((i & 0x00c0) >> 6)) + 1)));
    }
    public static int h(InputStream p0){
       return ((((c.c(p0) << 16) & 0xff0000) | ((c.c(p0) << 8) & 0xff00)) | (c.c(p0) & 0x00ff));
    }
}
