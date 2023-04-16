package com.loc.cs;
import java.lang.Object;
import com.loc.dx;
import com.loc.cr;
import com.loc.ct;
import com.loc.co;
import com.loc.cs$a;
import com.loc.cu;
import java.lang.System;
import android.os.SystemClock;
import com.loc.dw;
import java.lang.String;
import java.util.List;
import com.loc.cr$a;
import com.loc.dp;

public final class cs	// class@0013ca
{
    public cr a;
    public ct b;
    public long c;
    public dx d;
    public co e;
    public dx f;
    public static cs g;
    public static Object h;

    static {
       cs.h = new Object();
    }
    public void cs(){
       super();
       this.f = new dx();
       this.a = new cr();
       this.b = new ct();
       this.e = new co();
    }
    public static cs a(){
       if (cs.g == null) {
          Object h = cs.h;
          _monitor_enter(h);
          if (cs.g == null) {
             cs.g = new cs();
          }
          _monitor_exit(h);
       }
       return cs.g;
    }
    public final cu a(cs$a p0){
       cs uocs = this;
       cs$a uoa = p0;
       cu uocu = null;
       if (!uoa) {
          return uocu;
       }
       long l = System.currentTimeMillis();
       long l1 = SystemClock.elapsedRealtime();
       cs d = uocs.d;
       if (d == null || uoa.a.a(d) - 0x4024000000000000 >= 0) {
          cr$a uoa1 = uocs.a.a(uoa.a, uoa.j, uoa.g, uoa.h, uoa.i);
          List list = uocs.b.a(uoa.a, uoa.b, uoa.e, uoa.d, l);
          if (uoa1 != null || list != null) {
             dp.a(uocs.f, uoa.a, uoa.f, l);
             uocu = new cu(0, uocs.e.a(uocs.f, uoa1, uoa.c, list));
          }
          uocs.d = uoa.a;
          uocs.c = l1;
       }
       return uocu;
    }
}
