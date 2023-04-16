package ftd.b1;
import ftd.c1;
import java.util.concurrent.Future;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class b1 implements c1	// class@000e71
{
    public final Future b;

    public void b1(Future p0){
       super();
       this.b = p0;
    }
    public void dispose(){
       this.b.cancel(false);
    }
    public String toString(){
       return "DisposableFutureHandle["+this.b+']';
    }
}
