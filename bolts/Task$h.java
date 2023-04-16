package bolts.Task$h;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import y3.g;
import java.lang.Object;

public final class Task$h implements Runnable	// class@000b60
{
    public final ScheduledFuture b;
    public final g c;

    public void Task$h(ScheduledFuture p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       this.b.cancel(true);
       this.c.e();
    }
}
