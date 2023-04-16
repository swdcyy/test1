package androidx.work.impl.workers.ConstraintTrackingWorker$b;
import java.lang.Runnable;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import xk.d;
import java.lang.Object;
import w3.a;

public class ConstraintTrackingWorker$b implements Runnable	// class@000aa2
{
    public final d b;
    public final ConstraintTrackingWorker c;

    public void ConstraintTrackingWorker$b(ConstraintTrackingWorker p0,d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       ConstraintTrackingWorker c = this.c.c;
       _monitor_enter(c);
       if (this.c.d != null) {
          this.c.d();
       }else {
          this.c.e.L(this.b);
       }
       _monitor_exit(c);
       return;
    }
}
