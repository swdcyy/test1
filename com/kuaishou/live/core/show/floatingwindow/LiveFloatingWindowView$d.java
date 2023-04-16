package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$d;
import java.lang.Runnable;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveFloatingWindowView$d implements Runnable	// class@000b72
{
    public final LiveFloatingWindowView b;

    public void LiveFloatingWindowView$d(LiveFloatingWindowView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView$d.class, "1")) {
          return;
       }
       this.b.e();
       return;
    }
}
