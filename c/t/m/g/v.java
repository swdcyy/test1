package c.t.m.g.v;
import c.t.m.g.x$a;
import c.t.m.g.u;
import java.lang.Object;
import android.content.Context;
import c.t.m.g.be;
import java.lang.String;
import c.t.m.g.bt;
import c.t.m.g.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import c.t.m.g.v$1;
import c.t.m.g.v$2;
import java.lang.Runnable;
import java.lang.System;
import java.lang.Long;
import c.t.m.g.cb;
import java.lang.Math;
import c.t.m.g.bn;
import java.lang.StringBuilder;

public class v implements x$a	// class@000caf
{
    public Context a;
    public x b;
    public u c;
    public static String d = "";
    public static boolean e;

    public void v(u p0){
       super();
       this.a = be.a();
       this.c = p0;
       bt.a("OaidTool", "OaidTool in.");
       x ox = new x(this);
       this.b = ox;
       ox.a(this.a);
    }
    public static synchronized String a(){
       _monitor_enter(v.class);
       if (TextUtils.isEmpty(v.d)) {
          v.d = ca.b(ca.a(), "loc_id_oaid", "");
       }
       if (!v.e) {
          v.e = true;
          v$2 u2 = new v$2(new v$1());
          long l = System.currentTimeMillis();
          long l1 = ca.b(ca.a(), "loc_id_oaid_time", Long.valueOf(0)).longValue();
          if (!cb.a() && Math.abs((l - l1)) - 0x5265c00 >= 0) {
             bn.a("th_loc_oaid", u2);
          }
       }
       _monitor_exit(v.class);
       return cb.b(v.d);
    }
    public static String a(String p0){
       v.d = p0;
       return p0;
    }
    public static String b(){
       return v.d;
    }
    public void a(String p0,boolean p1){
       bt.a("OaidTool", "OnIdsAvalid====> "+p0);
       v tc = this.c;
       if (tc != null) {
          if (!p1) {
             p0 = null;
          }
          tc.a(p0);
       }else {
          bt.b("OaidTool", "OnIdsAvalid====> listener null");
       }
       return;
    }
}
