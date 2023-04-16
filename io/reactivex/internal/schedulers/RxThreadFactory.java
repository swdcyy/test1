package io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import io.reactivex.internal.schedulers.RxThreadFactory$a;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory	// class@001930
{
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;
    public static final long serialVersionUID = 0x93e53ce57e82575c;

    public void RxThreadFactory(String p0){
       super(p0, 5, false);
    }
    public void RxThreadFactory(String p0,int p1){
       super(p0, p1, false);
    }
    public void RxThreadFactory(String p0,int p1,boolean p2){
       super();
       this.prefix = p0;
       this.priority = p1;
       this.nonBlocking = p2;
    }
    public Thread newThread(Runnable p0){
       String str = this.prefix+'-'+this.incrementAndGet();
       RxThreadFactory$a uoa = (this.nonBlocking != null)? new RxThreadFactory$a(p0, str): new Thread(p0, str);
       uoa.setPriority(this.priority);
       uoa.setDaemon(true);
       return uoa;
    }
    public String toString(){
       return "RxThreadFactory["+this.prefix+"]";
    }
}
