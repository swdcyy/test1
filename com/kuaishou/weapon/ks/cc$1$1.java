package com.kuaishou.weapon.ks.cc$1$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.cc$1;
import java.lang.Object;
import com.kuaishou.weapon.ks.cc;
import com.kuaishou.weapon.ks.d;
import java.lang.System;
import java.lang.String;
import com.kuaishou.weapon.ks.l;

public class cc$1$1 implements Runnable	// class@001206
{
    public final cc$1 a;

    public void cc$1$1(cc$1 p0){
       this.a = p0;
       super();
    }
    public void run(){
       long l = System.currentTimeMillis();
       if ((l - cc.a(this.a.a).g()) - (long)(cc.a(this.a.a).a("plc001_pd_pt_pi", 10) * 1000) >= 0) {
          cc.b(this.a.a);
          cc.c(this.a.a);
          cc.a(this.a.a).b(l);
          cc.a(this.a.a).a("w_t", cc.d(this.a.a), false);
          cc.a(this.a.a).a("w_t_r", cc.e(this.a.a), true);
          cc$1 a = this.a.a;
          cc.a(a, cc.f(a).b("l_t_i_s", true));
       }
       return;
    }
}
