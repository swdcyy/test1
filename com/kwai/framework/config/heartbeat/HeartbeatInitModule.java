package com.kwai.framework.config.heartbeat.HeartbeatInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import com.kwai.framework.config.heartbeat.g;
import com.kwai.framework.model.user.QCurrentUser;
import a66.d;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public class HeartbeatInitModule extends a	// class@0014ff
{
    public boolean q;
    public static final int r;

    public void HeartbeatInitModule(){
       super();
       this.q = true;
    }
    public int f0(){
       return 21;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, HeartbeatInitModule.class, "2")) {
          return;
       }
       if (d.i) {
          g.b().d(false);
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, HeartbeatInitModule.class, "1")) {
          return;
       }
       if (d.i) {
          g.b().d(true);
          if (QCurrentUser.ME.isLogined()) {
             c.c(new d(this));
          }
       }
       return;
    }
    public void n(){
    }
}
