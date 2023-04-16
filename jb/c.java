package jb.c;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import jb.b;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.lang.Object;
import java.lang.Class;

public class c	// class@0023d3
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static b d;
    public static boolean e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;

    static {
       c.a = false;
       c.b = true;
       c.c = true;
       c.d = null;
       c.e = false;
       c.f = c.a("RIFF");
       c.g = c.a("WEBP");
       c.h = c.a("VP8 ");
       c.i = c.a("VP8L");
       c.j = c.a("VP8X");
    }
    public static byte[] a(String p0){
       try{
          return p0.getBytes("ASCII");
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException("ASCII not found!", e2);
       }
    }
    public static boolean b(byte[] p0,int p1,int p2){
       boolean b = (p2 >= 20 && (c.d(p0, p1, c.f) && c.d(p0, (p1 + 8), c.g)))? true: false;
       return b;
    }
    public static b c(){
       if (c.e) {
          return c.d;
       }
       c.e = true;
       return WebpBitmapFactoryImpl.class.newInstance();
    }
    public static boolean d(byte[] p0,int p1,byte[] p2){
       if (p2 == null || p0 == null) {
          return false;
       }
       if ((p2.length + p1) > p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p2.length) {
             return true;
          }
          int i1 = i + p1;
          if (p0[i1] != p2[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
}
