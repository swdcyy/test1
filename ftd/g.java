package ftd.g;
import ftd.i;
import java.util.concurrent.Future;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class g extends i	// class@000e8b
{
    public final Future b;

    public void g(Future p0){
       super();
       this.b = p0;
    }
    public void a(Throwable p0){
       this.b.cancel(false);
    }
    public Object invoke(Object p0){
       this.a(p0);
       return l1.a;
    }
    public String toString(){
       return "CancelFutureOnCancel["+this.b+']';
    }
}
