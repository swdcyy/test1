package id.r;
import id.k0;
import java.util.concurrent.Executor;
import java.lang.Object;
import ab.e;
import java.lang.Runnable;
import java.lang.UnsupportedOperationException;

public class r implements k0	// class@0021c9
{
    public final Executor a;

    public void r(Executor p0){
       super();
       e.d(p0);
       this.a = p0;
    }
    public void a(Runnable p0){
    }
    public void b(){
       throw new UnsupportedOperationException();
    }
    public void c(Runnable p0){
       this.a.execute(p0);
    }
    public void d(){
       throw new UnsupportedOperationException();
    }
    public boolean e(){
       return false;
    }
}
