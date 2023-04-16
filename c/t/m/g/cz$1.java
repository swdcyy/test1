package c.t.m.g.cz$1;
import java.lang.Runnable;
import c.t.m.g.cz;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;

public class cz$1 implements Runnable	// class@000c32
{
    public final cz a;

    public void cz$1(cz p0){
       this.a = p0;
       super();
    }
    public void run(){
       cz.a(this.a).clear();
       cz.b(this.a);
    }
}
