package awd.b;
import java.lang.Runnable;
import org.greenrobot.eventbus.a;
import java.lang.Object;
import awd.g;
import awd.f;
import java.lang.Thread;
import java.lang.String;

public final class b implements Runnable	// class@000291
{
    public final g b;
    public final a c;
    public boolean d;

    public void b(a p0){
       super();
       this.c = p0;
       this.b = new g();
    }
    public void run(){
       while (true) {
          boolean b = false;
          break ;
       }
       try{
          b tb = this.b;
          int i = 1000;
          _monitor_enter(tb);
          if (tb.a == null) {
             tb.wait((long)i);
          }
          f uof = tb.b();
          _monitor_exit(tb);
          if (uof == null) {
             _monitor_enter(this);
             uof = this.b.b();
             if (uof == null) {
                this.d = b;
                _monitor_exit(this);
                this.d = b;
                return;
             }else {
                _monitor_exit(this);
             }
          }
          this.c.g(uof);
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().getName();
          this.d = e0;
          return;
       }
    }
}
