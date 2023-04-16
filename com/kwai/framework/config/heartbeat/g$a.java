package com.kwai.framework.config.heartbeat.g$a;
import java.util.TimerTask;
import com.kwai.framework.config.heartbeat.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;

public class g$a extends TimerTask	// class@001506
{
    public boolean b;
    public final RequestTiming c;
    public final g d;

    public void g$a(g p0,RequestTiming p1){
       this.d = p0;
       this.c = p1;
       super();
       this.b = true;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       try{
          g$a td = this.d;
          if (td.b != null) {
             g$a tc = (this.b != null)? this.c: RequestTiming.DEFAULT;
             td.a(tc);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.b = false;
       return;
    }
}
