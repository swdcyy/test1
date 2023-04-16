package ftd.o;
import ftd.x;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import asd.c;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.lang.StringBuilder;
import java.lang.Object;

public final class o extends x	// class@000eb3
{
    public int _resumed;
    public static final AtomicIntegerFieldUpdater c;

    static {
       o.c = AtomicIntegerFieldUpdater.newUpdater(o.class, "_resumed");
    }
    public void o(c p0,Throwable p1,boolean p2){
       if (p1 != null) {
       }else {
          CancellationException uCancellatio = new CancellationException("Continuation "+p0+" was cancelled normally");
       }
       super(p1, p2);
       this._resumed = 0;
       return;
    }
    public final boolean c(){
       return o.c.compareAndSet(this, 0, 1);
    }
}
