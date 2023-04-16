package com.kwai.framework.config.heartbeat.g$b;
import java.util.TimerTask;
import com.kwai.framework.config.heartbeat.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g$b extends TimerTask	// class@001507
{
    public final RequestTiming b;
    public final g c;

    public void g$b(g p0,RequestTiming p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       this.c.a(this.b);
       return;
    }
}
