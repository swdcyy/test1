package com.loc.ag;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.p;
import java.lang.System;

public final class ag	// class@001366
{
    public static String a = "9aj&#k81";
    public static String b = "IaHR0cDovL2xvZ3MuYW1hcC5jb20vd3MvbG9nL3VwbG9hZD9wcm9kdWN0PSVzJnR5cGU9JXMmcGxhdGZvcm09JXMmY2hhbm5lbD0lcyZzaWduPSVz";
    public static byte[] c;
    public static boolean d;
    public static boolean e;
    public static final Integer f;
    public static final Integer g;
    public static final Integer h;
    public static final Integer i;
    public static final Integer j;
    public static String k;
    public static ConcurrentHashMap l;

    static {
       ag.l = new ConcurrentHashMap(8);
       ag.f = Integer.valueOf(1);
       ag.g = Integer.valueOf(2);
       ag.h = Integer.valueOf(3);
       ag.i = Integer.valueOf(4);
       ag.j = Integer.valueOf(5);
    }
    public static String a(String p0){
       String str = "";
       ConcurrentHashMap l = ag.l;
       _monitor_enter(l);
       if (ag.l != null && ag.l.containsKey(p0)) {
          str = ag.l.get(p0);
       }
       _monitor_exit(l);
       return str;
    }
    public static void a(String p0,String p1){
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          return;
       }
       ConcurrentHashMap l = ag.l;
       _monitor_enter(l);
       if (ag.l == null) {
          ag.l = new ConcurrentHashMap(8);
       }
       if (!ag.l.containsKey(p0)) {
          ag.l.put(p0, p1);
       }
       _monitor_exit(l);
       return;
    }
    public static byte[] a(int p0){
       if (ag.c == null) {
          ag.c = p.b(ag.k);
       }
       byte[] uobyteArray = new byte[4];
       System.arraycopy(ag.c, (p0 * 4), uobyteArray, 0, 4);
       int i = ((uobyteArray[2] & 0x00ff) * 256) + (uobyteArray[3] & 0x00ff);
       uobyteArray = new byte[i];
       System.arraycopy(ag.c, (((uobyteArray[0] & 0x00ff) * 256) + (uobyteArray[1] & 0x00ff)), uobyteArray, 0, i);
       return uobyteArray;
    }
}
