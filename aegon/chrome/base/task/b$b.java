package aegon.chrome.base.task.b$b;
import java.util.concurrent.FutureTask;
import aegon.chrome.base.task.b;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.lang.String;
import java.lang.InterruptedException;
import a0.n;
import java.lang.Class;
import java.lang.StringBuilder;
import aegon.chrome.base.TraceEvent;

public class b$b extends FutureTask	// class@000175
{
    public final b b;

    public void b$b(b p0,Callable p1){
       this.b = p0;
       super(p1);
    }
    public void done(){
       try{
          this.b.d(this.get());
       }catch(java.lang.InterruptedException e0){
          Object[] objArray = new Object[0];
          n.h("AsyncTask", e0.toString(), objArray);
       }catch(java.util.concurrent.ExecutionException e0){
          throw new RuntimeException("An error occurred while executing doInBackground\(\)", e0.getCause());
       }catch(java.util.concurrent.CancellationException e0){
          this.b.d(null);
       }
       return;
    }
    public Class m(){
       return this.b.getClass();
    }
    public void run(){
       TraceEvent traceEvent = TraceEvent.d("AsyncTask.run: "+this.b.b.m());
       super.run();
       if (traceEvent != null) {
          traceEvent.close();
       }
       return;
    }
}
