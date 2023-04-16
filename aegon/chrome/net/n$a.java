package aegon.chrome.net.n$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import aegon.chrome.net.n;

public abstract class n$a	// class@0000d8
{
    public final Executor a;

    public void n$a(Executor p0){
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
    public abstract void b(n p0);
}
