package com.kuaishou.live.longconnection.connector.RunnablePipeline$a;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.RunnablePipeline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$Status;
import java.util.Queue;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.Iterator;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$b;
import android.os.SystemClock;

public class RunnablePipeline$a implements Runnable	// class@000c57
{
    public final RunnablePipeline b;

    public void RunnablePipeline$a(RunnablePipeline p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RunnablePipeline$a.class, "1")) {
          return;
       }
       if (this.b.c == RunnablePipeline$Status.WAIT) {
          this.b.c = RunnablePipeline$Status.RUNNING;
       }
       while (this.b.c == RunnablePipeline$Status.RUNNING && this.b.d == null) {
          Runnable runnable = this.b.a.poll();
          if (runnable == null) {
             long l = 10;
             try{
                Thread.sleep(l);
             }catch(java.lang.InterruptedException e0){
                e0.printStackTrace();
                return;
             }
          }else {
             runnable.run();
          }
          RunnablePipeline b = this.b.b;
          _monitor_enter(b);
          Iterator iterator = this.b.b.iterator();
          while (iterator.hasNext()) {
             RunnablePipeline$b uob = iterator.next();
             if (SystemClock.elapsedRealtime() - uob.b >= 0) {
                iterator.remove();
                uob.run();
             }
          }
          _monitor_exit(b);
       }
       this.b.c = RunnablePipeline$Status.IDLE;
       return;
    }
}
