package com.xiaomi.push.service.j0;
import ws8.h6;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.xiaomi.push.service.k0;
import com.xiaomi.push.service.XMPushService$j;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;

public class j0 implements h6	// class@001178
{
    public final XMPushService a;

    public void j0(XMPushService p0){
       this.a = p0;
    }
    public static XMPushService b(j0 p0){
       return p0.a;
    }
    public static String c(j0 p0,String p1){
       return p0.d(p1);
    }
    public void a(List p0,String p1,String p2){
       k0 ok0 = new k0(this, 4, p1, p0, p2);
       this.a.a(v7);
    }
    public final String d(String p0){
       p0 = (("com.xiaomi.xmsf").equals(p0))? "1000271": o.c(this.a, "pref_registered_pkg_names", 0).getString(p0, null);
       return p0;
    }
}
