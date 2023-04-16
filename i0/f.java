package i0.f;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;

public abstract class f	// class@002151
{
    public final Executor a;

    public void f(Executor p0){
       super();
       if (p0 == null) {
          throw new IllegalStateException("Executor must not be null");
       }
       this.a = p0;
       return;
    }
    public Executor a(){
       return this.a;
    }
    public abstract void b(int p0,long p1,int p2);
}
