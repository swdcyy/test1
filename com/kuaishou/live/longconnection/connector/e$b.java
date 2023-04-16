package com.kuaishou.live.longconnection.connector.e$b;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.b;
import mf3.b;

public class e$b implements Runnable	// class@000c61
{
    public final int b;
    public final e c;

    public void e$b(e p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.c.s(), "mPendingRunnables pause, pauseType: "+this.b+", liveStreamId: "+this.c.c.h(), objArray);
       this.c.c.o(this.b);
       return;
    }
}
