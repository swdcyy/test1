package com.kwai.framework.krn.init.preload.e$c;
import java.util.TimerTask;
import com.kwai.framework.krn.init.preload.e;
import com.kwai.framework.krn.init.network.RequestConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.krn.init.preload.KrnPreRequestReportInfo;

public class e$c extends TimerTask	// class@00160c
{
    public final RequestConfig b;
    public final e c;

    public void e$c(e p0,RequestConfig p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       KrnPreRequestReportInfo krnPreReques = this.c.j.get(this.b);
       if (krnPreReques != null) {
          this.c.l(krnPreReques, this.b);
       }
       return;
    }
}
