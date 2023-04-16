package am8.a;
import java.util.concurrent.AbstractExecutorService;
import java.lang.String;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import am8.b;
import java.lang.RuntimeException;
import java.util.List;

public abstract class a extends AbstractExecutorService	// class@0000f3
{
    public int b;
    public String c;

    public void a(String p0){
       super();
       this.b = 3;
       this.c = p0;
    }
    public void a(String p0,int p1){
       super();
       this.b = 3;
       this.b = p1;
       this.c = p0;
    }
    public abstract void a(Runnable p0,String p1);
    public boolean awaitTermination(long p0,TimeUnit p1){
       if (!b.b) {
          return false;
       }
       throw new RuntimeException("you can\'t terminate elastic-executor!");
    }
    public abstract void b(Runnable p0,String p1,int p2);
    public abstract void execute(Runnable p0);
    public boolean isShutdown(){
       return false;
    }
    public boolean isTerminated(){
       return false;
    }
    public void shutdown(){
       if (!b.b) {
          return;
       }
       throw new RuntimeException("you can\'t shutdown elastic-executor!");
    }
    public List shutdownNow(){
       if (!b.b) {
          return null;
       }
       throw new RuntimeException("you can\'t shutdown elastic-executor!");
    }
}
