package com.facebook.react.modules.core.b$b;
import java.lang.Runnable;
import com.facebook.react.modules.core.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vd.h;
import je.b;

public class b$b implements Runnable	// class@00129c
{
    public boolean b;
    public final long c;
    public final b d;

    public void b$b(b p0,long p1){
       this.d = p0;
       super();
       this.b = false;
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       long l = h.b() - (this.c / 0xf4240);
       long l1 = h.a() - l;
       if ((16.67f - (float)l) - 0x3f800000 < 0) {
          return;
       }
       b f = this.d.f;
       _monitor_enter(f);
       b$b td = this.d;
       _monitor_exit(f);
       if (td.p != null) {
          td.b.callIdleCallbacks((double)l1);
       }
       this.d.m = null;
       return;
    }
}
