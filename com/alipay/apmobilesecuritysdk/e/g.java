package com.alipay.apmobilesecuritysdk.e.g;
import android.content.Context;
import java.lang.String;
import java.lang.StringBuilder;
import z6.e;
import x6.a;
import w6.c;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class g	// class@000e72
{

    public static synchronized String a(Context p0,String p1){
       _monitor_enter(g.class);
       String str = e.a(p0, "openapi_file_pri", "openApi"+p1, "");
       if (a.c(str)) {
          _monitor_exit(g.class);
          return "";
       }else {
          str = c.d(c.a(), str);
          if (a.c(str)) {
             _monitor_exit(g.class);
             return "";
          }else {
             _monitor_exit(g.class);
             return str;
          }
       }
    }
    public static synchronized void a(){
       _monitor_enter(g.class);
       _monitor_exit(g.class);
    }
    public static synchronized void a(Context p0){
       _monitor_enter(g.class);
       SharedPreferences$Editor uEditor = o.c(p0, "openapi_file_pri", 0).edit();
       if (uEditor != null) {
          uEditor.clear();
          g.b(uEditor);
       }
       _monitor_exit(g.class);
       return;
    }
    public static synchronized void a(Context p0,String p1,String p2){
       _monitor_enter(g.class);
       SharedPreferences$Editor uEditor = o.c(p0, "openapi_file_pri", 0).edit();
       if (uEditor != null) {
          uEditor.putString("openApi"+p1, c.b(c.a(), p2));
          g.b(uEditor);
       }
       _monitor_exit(g.class);
       return;
    }
}
