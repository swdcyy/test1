package okio.h;
import okio.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;

public class h extends o	// class@0020f5
{
    public o a;

    public void h(o p0){
       a.q(p0, "delegate");
       super();
       this.a = p0;
    }
    public o clearDeadline(){
       return this.a.clearDeadline();
    }
    public o clearTimeout(){
       return this.a.clearTimeout();
    }
    public long deadlineNanoTime(){
       return this.a.deadlineNanoTime();
    }
    public o deadlineNanoTime(long p0){
       return this.a.deadlineNanoTime(p0);
    }
    public boolean hasDeadline(){
       return this.a.hasDeadline();
    }
    public void throwIfReached(){
       this.a.throwIfReached();
    }
    public o timeout(long p0,TimeUnit p1){
       a.q(p1, "unit");
       return this.a.timeout(p0, p1);
    }
    public long timeoutNanos(){
       return this.a.timeoutNanos();
    }
}
