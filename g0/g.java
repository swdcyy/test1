package g0.g;
import g0.f;
import aegon.chrome.base.task.e;
import g0.n;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;

public class g extends e implements f	// class@002026
{
    public AtomicInteger m;
    public boolean n;

    public void g(n p0){
       super(p0, "SequencedTaskRunnerImpl", 1);
       this.m = new AtomicInteger();
    }
    public void e(){
       this.n = true;
       if (!this.m.getAndIncrement()) {
          super.e();
       }
       return;
    }
    public void g(){
       super.g();
       if (this.m.decrementAndGet() > 0) {
          if (this.n == null) {
             super.h();
          }else {
             super.e();
          }
       }
       return;
    }
    public void h(){
       if (!this.m.getAndIncrement()) {
          super.h();
       }
       return;
    }
}
