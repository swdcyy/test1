package ya.h;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Exception;

public abstract class h implements Runnable	// class@003105
{
    public final AtomicInteger b;

    public void h(){
       super();
       this.b = new AtomicInteger(0);
    }
    public void a(){
       if (this.b.compareAndSet(0, 2)) {
          this.d();
       }
       return;
    }
    public void b(Object p0){
    }
    public abstract Object c();
    public void d(){
    }
    public void e(Exception p0){
    }
    public void f(Object p0){
    }
    public final void run(){
       if (!this.b.compareAndSet(0, 1)) {
          return;
       }
       try{
          Object obj = this.c();
          this.b.set(3);
          this.f(obj);
          this.b(obj);
          return;
       }catch(java.lang.Exception e0){
          this.b.set(4);
          this.e(e0);
          return;
       }
    }
}
