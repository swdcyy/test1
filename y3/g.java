package y3.g;
import java.lang.Object;
import bolts.Task;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Exception;

public class g	// class@0030b2
{
    public final Task a;

    public void g(){
       super();
       this.a = new Task();
    }
    public Task a(){
       return this.a;
    }
    public void b(){
       if (this.e()) {
          return;
       }
       throw new IllegalStateException("Cannot cancel a completed task.");
    }
    public void c(Exception p0){
       if (this.a.trySetError(p0)) {
          return;
       }
       throw new IllegalStateException("Cannot set the error on a completed task.");
    }
    public void d(Object p0){
       if (this.f(p0)) {
          return;
       }
       throw new IllegalStateException("Cannot set the result of a completed task.");
    }
    public boolean e(){
       return this.a.trySetCancelled();
    }
    public boolean f(Object p0){
       return this.a.trySetResult(p0);
    }
}
