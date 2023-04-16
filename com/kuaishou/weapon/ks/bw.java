package com.kuaishou.weapon.ks.bw;
import java.lang.Object;
import java.util.Timer;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bw$1;
import java.util.TimerTask;

public class bw	// class@0011f9
{
    public static Timer a;
    public static TimerTask b;

    public void bw(){
       super();
    }
    public static void a(){
       Timer a = bw.a;
       if (a != null) {
          a.cancel();
       }
       bw.a = null;
       if (bw.b != null) {
          bw.b = null;
       }
       return;
    }
    public static void a(Context p0,long p1){
       if (!d.a(p0).b("plc001_pd_l_t", 0)) {
          return;
       }
       bw.a();
       bw.a = new Timer();
       bw$1 u1 = new bw$1();
       bw.b = u1;
       bw.a.schedule(u1, 5000, (long)(d.a(p0).b("plc001_pd_l_i", 600) * 1000));
       return;
    }
}
