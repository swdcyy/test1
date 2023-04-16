package com.kuaishou.live.longconnection.connector.e$c;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.longconnection.connector.b;
import mf3.b;

public class e$c implements Runnable	// class@000c62
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.b.s(), "mPendingRunnables disconnect, liveStreamId: "+this.b.c.h(), objArray);
       this.b.c.c();
       return;
    }
}
