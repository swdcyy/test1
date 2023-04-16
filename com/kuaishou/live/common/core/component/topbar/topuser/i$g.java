package com.kuaishou.live.common.core.component.topbar.topuser.i$g;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$g implements Runnable	// class@00178d
{
    public final i b;

    public void i$g(i p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i$g.class, "1")) {
          return;
       }
       this.b.o9("loop");
       this.b.n9("loop");
       return;
    }
}
