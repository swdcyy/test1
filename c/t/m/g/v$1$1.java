package c.t.m.g.v$1$1;
import c.t.m.g.u;
import c.t.m.g.v$1;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.by;
import c.t.m.g.v;
import java.lang.System;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import java.lang.Long;

public class v$1$1 implements u	// class@000cac
{
    public final v$1 a;

    public void v$1$1(v$1 p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (by.a(p0)) {
          return;
       }
       if (!(v.b()).equals(p0)) {
          long l = System.currentTimeMillis();
          bt.c("LOG", "update oaid,"+v.b()+","+p0+","+l);
          ca.a(ca.a(), "loc_id_oaid", p0);
          ca.a(ca.a(), "loc_id_oaid_time", Long.valueOf(l));
          v.a(p0);
       }
       bt.a("OaidTool", "getOaid, "+v.b()+", "+p0);
       return;
    }
}
