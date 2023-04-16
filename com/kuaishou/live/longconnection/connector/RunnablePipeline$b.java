package com.kuaishou.live.longconnection.connector.RunnablePipeline$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RunnablePipeline$b implements Runnable	// class@000c58
{
    public long b;
    public Runnable c;

    public void RunnablePipeline$b(Runnable p0,long p1){
       super();
       this.b = p1;
       this.c = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RunnablePipeline$b.class, "1")) {
          return;
       }
       this.c.run();
       return;
    }
}
