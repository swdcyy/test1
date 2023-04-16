package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$g;
import java.lang.Runnable;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveFloatingWindowManager$g implements Runnable	// class@000b67
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$g(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager$g.class, "1")) {
          return;
       }
       this.b.u();
       return;
    }
}
