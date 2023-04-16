package com.kwai.framework.krn.init.preload.d;
import java.util.TimerTask;
import com.kwai.framework.krn.init.preload.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends TimerTask	// class@001609
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
