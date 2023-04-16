package gsd.a;
import fsd.k;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.n;

public class a extends k	// class@000f62
{

    public void a(){
       super();
    }
    public void a(Throwable p0,Throwable p1){
       a.p(p0, "cause");
       a.p(p1, "exception");
       p0.addSuppressed(p1);
    }
    public List d(Throwable p0){
       a.p(p0, "exception");
       Throwable[] suppressed = p0.getSuppressed();
       a.o(suppressed, "exception.suppressed");
       return n.t(suppressed);
    }
}
