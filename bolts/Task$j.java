package bolts.Task$j;
import java.lang.Runnable;
import y3.c;
import y3.g;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Exception;

public final class Task$j implements Runnable	// class@000b62
{
    public final c b;
    public final g c;
    public final Callable d;

    public void Task$j(c p0,g p1,Callable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void run(){
       Task$j tb = this.b;
       if (tb != null && tb.a()) {
          this.c.b();
          return;
       }else {
          try{
             this.c.d(this.d.call());
          }catch(java.util.concurrent.CancellationException e0){
             this.c.b();
          }catch(java.lang.Exception e0){
             this.c.c(e0);
          }
          return;
       }
    }
}
