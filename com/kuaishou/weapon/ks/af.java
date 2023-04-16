package com.kuaishou.weapon.ks.af;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.ag;
import com.kuaishou.weapon.ks.ae;
import java.lang.String;

public class af	// class@0011c1
{
    public ag a;
    public d b;
    public ae c;
    public static af d;

    public void af(Context p0){
       super();
       d uod = d.a(p0);
       this.b = uod;
       this.a = new ag(uod);
       this.c = new ae(this.b);
    }
    public static af a(Context p0){
       if (af.d == null) {
          _monitor_enter(af.class);
          if (af.d == null) {
             af.d = new af(p0);
          }
          _monitor_exit(af.class);
       }
       return af.d;
    }
    public String a(String p0,String p1){
       return this.c.a(p0, p1);
    }
    public boolean a(int p0){
       return this.a.a(p0);
    }
    public boolean b(String p0,String p1){
       return this.c.b(p0, p1);
    }
}
