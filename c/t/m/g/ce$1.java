package c.t.m.g.ce$1;
import java.util.concurrent.ThreadFactory;
import c.t.m.g.ce;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.String;

public class ce$1 implements ThreadFactory	// class@000c09
{
    public final ce a;

    public void ce$1(ce p0){
       this.a = p0;
       super();
    }
    public Thread newThread(Runnable p0){
       return new Thread(p0, "network_request_pool");
    }
}
