package ya.b$a;
import java.lang.Runnable;
import ya.b;
import java.lang.Object;
import java.util.concurrent.BlockingQueue;
import java.lang.Class;
import java.lang.String;
import cb.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;

public class b$a implements Runnable	// class@002868
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       String str = "%s: worker finished; %d workers left";
       Runnable runnable = this.b.e.poll();
       if (runnable != null) {
          runnable.run();
       }else {
          a.n(b.i, "%s: Worker has nothing to run", this.b.b);
       }
       int i = this.b.g.decrementAndGet();
       if (!this.b.e.isEmpty()) {
          this.b.a();
       }else {
          a.o(b.i, str, this.b.b, Integer.valueOf(i));
       }
       return;
    }
}
