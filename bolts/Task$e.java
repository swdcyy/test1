package bolts.Task$e;
import java.lang.Runnable;
import y3.c;
import y3.g;
import bolts.a;
import bolts.Task;
import java.lang.Object;
import java.lang.Exception;

public final class Task$e implements Runnable	// class@000b5c
{
    public final c b;
    public final g c;
    public final a d;
    public final Task e;

    public void Task$e(c p0,g p1,a p2,Task p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void run(){
       Task$e tb = this.b;
       if (tb != null && tb.a()) {
          this.c.b();
          return;
       }else {
          try{
             this.c.d(this.d.a(this.e));
          }catch(java.util.concurrent.CancellationException e0){
             this.c.b();
          }catch(java.lang.Exception e0){
             this.c.c(e0);
          }
          return;
       }
    }
}
