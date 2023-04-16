package ftd.x1;
import ftd.a2;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ftd.z1;
import msd.l;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.StringBuilder;
import ftd.o0;

public final class x1 extends a2	// class@000ed9
{
    public int _invoked;
    public final l f;
    public static final AtomicIntegerFieldUpdater g;

    static {
       x1.g = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_invoked");
    }
    public void x1(z1 p0,l p1){
       super(p0);
       this.f = p1;
       this._invoked = 0;
    }
    public void b0(Throwable p0){
       if (x1.g.compareAndSet(this, 0, 1)) {
          this.f.invoke(p0);
       }
       return;
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "InvokeOnCancelling["+o0.a(this)+'@'+o0.b(this)+']';
    }
}
