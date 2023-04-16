package tb.b;
import tb.a;
import java.lang.Object;
import tb.b$a;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import tb.a$a;
import java.lang.Thread;
import java.lang.Runnable;

public class b extends a	// class@0024a2
{
    public final Object b;
    public final Handler c;
    public ArrayList d;
    public ArrayList e;
    public final Runnable f;

    public void b(){
       super();
       this.b = new Object();
       this.f = new b$a(this);
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.c = new Handler(Looper.getMainLooper());
    }
    public void a(a$a p0){
       b tb = this.b;
       _monitor_enter(tb);
       this.d.remove(p0);
       _monitor_exit(tb);
    }
    public void c(a$a p0){
       int i = 0;
       b uob = (Looper.getMainLooper().getThread() == Thread.currentThread())? 1: null;
       if (!uob) {
          p0.release();
          return;
       }else {
          uob = this.b;
          _monitor_enter(uob);
          if (this.d.contains(p0)) {
             _monitor_exit(uob);
             return;
          }else {
             this.d.add(p0);
             if (this.d.size() == 1) {
                i = 1;
             }
             _monitor_exit(uob);
             if (i) {
                this.c.post(this.f);
             }
             return;
          }
       }
    }
}
