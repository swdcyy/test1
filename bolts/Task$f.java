package bolts.Task$f;
import java.lang.Runnable;
import y3.c;
import y3.g;
import bolts.a;
import bolts.Task;
import java.lang.Object;
import bolts.Task$f$a;
import java.lang.Exception;

public final class Task$f implements Runnable	// class@000b5e
{
    public final c b;
    public final g c;
    public final a d;
    public final Task e;

    public void Task$f(c p0,g p1,a p2,Task p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void run(){
       Task$f tb = this.b;
       if (tb != null && tb.a()) {
          this.c.b();
          return;
       }else {
          try{
             Task task = this.d.a(this.e);
             if (task == null) {
                this.c.d(null);
             }else {
                task.continueWith(new Task$f$a(this));
             }
          }catch(java.util.concurrent.CancellationException e0){
             this.c.b();
          }catch(java.lang.Exception e0){
             this.c.c(e0);
          }
          return;
       }
    }
}
