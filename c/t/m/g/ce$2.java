package c.t.m.g.ce$2;
import java.lang.Runnable;
import c.t.m.g.ce;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;

public class ce$2 implements Runnable	// class@000c0a
{
    public final ce a;

    public void ce$2(ce p0){
       this.a = p0;
       super();
    }
    public void run(){
       this.a.k();
       ce.a(this.a).countDown();
    }
}
