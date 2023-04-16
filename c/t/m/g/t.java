package c.t.m.g.t;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.bb;
import c.t.m.g.bl;
import java.lang.System;
import java.lang.Math;
import java.util.Timer;
import c.t.m.g.t$1;
import java.util.TimerTask;

public class t	// class@000caa
{
    public static boolean a = true;

    public static void a(){
       SharedPreferences sharedPrefer = ca.a();
       long l = 0;
       long l1 = ca.b(sharedPrefer, "loc_comm_rsa_key_update_time", Long.valueOf(l)).longValue();
       if (l1 - l) {
          String str = "";
          bl.a(bb.a(ca.b(sharedPrefer, "loc_comm_rsa_pub_key_64", str)), ca.b(sharedPrefer, "loc_comm_rsa_pub_key_ver", str));
       }
       if (Math.abs((System.currentTimeMillis() - l1)) - 0xf731400 < 0) {
          return;
       }else {
          Timer timer = new Timer();
          timer.schedule(new t$1(timer), 5000);
          return;
       }
    }
    public static boolean b(){
       return t.a;
    }
}
