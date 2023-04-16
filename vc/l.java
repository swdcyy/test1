package vc.l;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import vc.l$a;
import java.lang.StringBuilder;

public class l implements ThreadFactory	// class@002696
{
    public final int b;
    public final String c;
    public final boolean d;
    public final AtomicInteger e;

    public void l(int p0){
       super(p0, "PriorityThreadFactory", true);
    }
    public void l(int p0,String p1,boolean p2){
       super();
       this.e = new AtomicInteger(1);
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public Thread newThread(Runnable p0){
       l$a uoa = new l$a(this, p0);
       String str = (this.d != null)? this.c+"-"+this.e.getAndIncrement(): this.c;
       return new Thread(uoa, str);
    }
}
