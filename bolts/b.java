package bolts.b;
import bolts.Task;
import java.lang.Object;
import bolts.Task$q;
import bolts.UnobservedTaskException;
import java.lang.Exception;
import java.lang.Throwable;

public class b	// class@000b6d
{
    public Task a;

    public void b(Task p0){
       super();
       this.a = p0;
    }
    public void finalize(){
       b ta = this.a;
       if (ta != null) {
          Task$q unobservedEx = Task.getUnobservedExceptionHandler();
          if (unobservedEx != null) {
             unobservedEx.a(ta, new UnobservedTaskException(ta.getError()));
          }
       }
       super.finalize();
       return;
    }
}
