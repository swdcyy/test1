package ftd.h;
import ftd.f2;
import ftd.z1;
import java.util.concurrent.Future;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class h extends f2	// class@000e93
{
    public final Future f;

    public void h(z1 p0,Future p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       this.f.cancel(false);
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "CancelFutureOnCompletion["+this.f+']';
    }
}