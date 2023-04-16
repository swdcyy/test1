package lwd.b$a;
import java.lang.Thread;
import lwd.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.StringBuilder;
import java.lang.String;
import lwd.b$a$a;
import java.lang.Thread$UncaughtExceptionHandler;
import fwd.d;
import java.nio.ByteBuffer;
import java.lang.Throwable;
import exd.c;
import java.lang.Object;
import java.util.concurrent.BlockingQueue;
import fwd.b;
import java.lang.Exception;

public class b$a extends Thread	// class@001cef
{
    public BlockingQueue b;
    public final b c;
    public static final boolean d;

    static {
    }
    public void b$a(b p0){
       this.c = p0;
       super();
       this.b = new LinkedBlockingQueue();
       this.setName("WebSocketWorker-"+this.getId());
       this.setUncaughtExceptionHandler(new b$a$a(this, p0));
    }
    public final void a(d p0,ByteBuffer p1){
       try{
          p0.f(p1);
       }catch(java.lang.Exception e3){
          b.o.error("Error while reading from remote connection", e3);
       }
       this.c.n(p1);
       return;
    }
    public void run(){
       Thread thread;
       d uod;
       Exception uException;
       while (true) {
          thread = null;
          break ;
       }
       try{
          uod = this.b.take();
          try{
             this.a(uod, uod.c.poll());
          }catch(java.lang.RuntimeException e0){
          }
          this.c.g(uod, uException);
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
       }catch(java.lang.RuntimeException e1){
          uod = thread;
          uException = e1;
          goto label_001b ;
       }
    }
}
