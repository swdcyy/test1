package vc.b;
import vc.f;
import java.lang.Object;
import vc.l;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

public class b implements f	// class@002685
{
    public final Executor a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;

    public void b(int p0){
       super();
       this.a = Executors.newFixedThreadPool(2, new l(10, "FrescoIoBoundExecutor", true));
       this.b = Executors.newFixedThreadPool(p0, new l(10, "FrescoDecodeExecutor", true));
       this.c = Executors.newFixedThreadPool(p0, new l(10, "FrescoBackgroundExecutor", true));
       this.e = Executors.newScheduledThreadPool(p0, new l(10, "FrescoBackgroundExecutor", true));
       this.d = Executors.newFixedThreadPool(true, new l(10, "FrescoLightWeightBackgroundExecutor", true));
    }
    public Executor a(){
       return this.c;
    }
    public Executor b(){
       return this.a;
    }
    public Executor c(){
       return this.a;
    }
    public ScheduledExecutorService d(){
       return this.e;
    }
    public Executor e(){
       return this.d;
    }
    public Executor g(){
       return this.a;
    }
    public Executor h(){
       return this.b;
    }
}
