package c.t.m.g.v$2;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.lang.String;
import c.t.m.g.bt;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;

public final class v$2 implements Runnable	// class@000cae
{
    public final Runnable a;

    public void v$2(Runnable p0){
       this.a = p0;
       super();
    }
    public void run(){
       ExecutorService uExecutorSer = Executors.newSingleThreadExecutor();
       Future uFuture = uExecutorSer.submit(this.a);
       bt.a("OaidTool", "run submit.");
       uExecutorSer.shutdown();
       if (uExecutorSer.awaitTermination(15, TimeUnit.SECONDS)) {
          bt.a("OaidTool", "run finished.");
       }else {
          bt.c("LOG", "get oaid terminated.");
          if (!uFuture.isDone()) {
             uFuture.cancel(true);
          }
       }
       bt.a("OaidTool", "run submit finish.");
       return;
    }
}
