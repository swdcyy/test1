package com.kwai.framework.krn.init.preload.e$a;
import java.util.TimerTask;
import com.kwai.framework.krn.init.preload.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$a extends TimerTask	// class@00160a
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
