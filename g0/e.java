package g0.e;
import g0.k;
import java.lang.Object;
import java.util.HashMap;
import g0.n;
import java.lang.Runnable;
import g0.l;
import java.util.Map;
import g0.i;
import g0.c;
import g0.j;
import android.os.Handler;
import aegon.chrome.base.task.e;
import g0.f;
import g0.g;
import aegon.chrome.base.task.d;
import java.util.concurrent.Callable;
import aegon.chrome.base.ThreadUtils;

public class e implements k	// class@002024
{
    public final Map a;

    public void e(){
       super();
       this.a = new HashMap();
    }
    public synchronized void a(n p0,Runnable p1,long p2){
       if (p0.a()) {
          this.c(p0).c(p1, p2);
       }else {
          l ol = this.a.get(p0);
          if (ol == null) {
             ol = this.c(p0);
             this.a.put(p0, ol);
          }
          ol.c(p1, p2);
       }
       return;
    }
    public i b(n p0){
       if (p0.f != null) {
          return this.f();
       }
       return new j(null, p0);
    }
    public l c(n p0){
       if (p0.f != null) {
          return this.f();
       }
       return new e(p0);
    }
    public boolean d(n p0){
       return false;
    }
    public f e(n p0){
       if (p0.f != null) {
          return this.f();
       }
       return new g(p0);
    }
    public synchronized final c f(){
       return ThreadUtils.e(d.b);
    }
}
