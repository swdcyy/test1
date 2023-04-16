package id.m0;
import id.b0;
import java.util.concurrent.Executor;
import java.lang.Object;
import ab.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import id.i;
import id.c0;
import id.e0;
import java.lang.String;
import java.util.Map;
import id.m0$b;
import id.m0$a;
import android.util.Pair;

public class m0 implements b0	// class@0021bb
{
    public final b0 a;
    public final int b;
    public int c;
    public final ConcurrentLinkedQueue d;
    public final Executor e;

    public void m0(int p0,Executor p1,b0 p2){
       super();
       this.b = p0;
       e.d(p1);
       this.e = p1;
       e.d(p2);
       this.a = p2;
       this.d = new ConcurrentLinkedQueue();
       this.c = 0;
    }
    public void b(i p0,c0 p1){
       p1.l().onProducerFinishWithSuccess(p1, "ThrottlingProducer", null);
       this.a.produceResults(new m0$b(this, p0, null), p1);
    }
    public void produceResults(i p0,c0 p1){
       p1.l().onProducerStart(p1, "ThrottlingProducer");
       _monitor_enter(this);
       m0 tc = this.c;
       int i = 1;
       if (tc >= this.b) {
          this.d.add(Pair.create(p0, p1));
       }else {
          this.c = tc + i;
          i = 0;
       }
       _monitor_exit(this);
       if (!i) {
          this.b(p0, p1);
       }
       return;
    }
}
