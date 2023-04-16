package id.m0$b;
import id.k;
import id.m0;
import id.i;
import id.m0$a;
import java.lang.Throwable;
import java.lang.Object;
import id.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.util.Pair;
import id.m0$b$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class m0$b extends k	// class@0021ba
{
    public final m0 c;

    public void m0$b(m0 p0,i p1,m0$a p2){
       this.c = p0;
       super(p1);
    }
    public void g(){
       this.n().b();
       this.o();
    }
    public void h(Throwable p0){
       this.n().onFailure(p0);
       this.o();
    }
    public void i(Object p0,int p1){
       this.n().d(p0, p1);
       if (b.e(p1)) {
          this.o();
       }
       return;
    }
    public final void o(){
       m0$b tc = this.c;
       _monitor_enter(tc);
       Pair pair = this.c.d.poll();
       if (pair == null) {
          m0$b tc1 = this.c;
          tc1.c = tc1.c - 1;
       }
       _monitor_exit(tc);
       if (pair != null) {
          this.c.e.execute(new m0$b$a(this, pair));
       }
       return;
    }
}
