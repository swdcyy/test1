package a5.d;
import java.util.HashSet;
import java.lang.String;
import java.lang.System;
import w1.k;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.Set;

public class d	// class@0000d4
{
    public static boolean a;
    public static final Set b;
    public static boolean c;
    public static String[] d;
    public static long[] e;
    public static int f;
    public static int g;

    static {
       d.b = new HashSet();
       d.c = false;
       d.f = 0;
       d.g = 0;
    }
    public static void a(String p0){
       if (!d.c) {
          return;
       }
       int f = d.f;
       if (f == 20) {
          d.g = d.g + 1;
          return;
       }else {
          d.d[f] = p0;
          d.e[f] = System.nanoTime();
          k.a(p0);
          d.f = d.f + 1;
          return;
       }
    }
    public static float b(String p0){
       int g = d.g;
       float f = 0;
       if (g > 0) {
          d.g = g - 1;
          return f;
       }else if(!d.c){
          return f;
       }else {
          g = d.f - 1;
          d.f = g;
          if (g == -1) {
             throw new IllegalStateException("Can\'t end trace section. There are none.");
          }
          if (!p0.equals(d.d[g])) {
             throw new IllegalStateException("Unbalanced trace call "+p0+". Expected "+d.d[d.f]+".");
          }
          k.b();
          return ((float)(System.nanoTime() - d.e[d.f]) / 1000000.00f);
       }
    }
    public static void c(String p0){
       Set b = d.b;
       if (b.contains(p0)) {
          return;
       }
       b.add(p0);
       return;
    }
}
