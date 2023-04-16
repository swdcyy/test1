package ftd.x;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Throwable;
import java.lang.Object;
import nsd.u;
import java.lang.StringBuilder;
import ftd.o0;

public class x	// class@001687
{
    public int _handled;
    public final Throwable a;
    public static final AtomicIntegerFieldUpdater b;

    static {
       x.b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_handled");
    }
    public void x(Throwable p0,boolean p1){
       super();
       this.a = p0;
       this._handled = p1;
    }
    public void x(Throwable p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean a(){
       return this._handled;
    }
    public final boolean b(){
       return x.b.compareAndSet(this, 0, 1);
    }
    public String toString(){
       return o0.a(this)+'['+this.a+']';
    }
}
