package l3.j$a;
import java.lang.Runnable;
import l3.j;
import w3.a;
import java.lang.Object;
import k3.h;
import u3.r;
import java.lang.String;
import java.lang.Throwable;
import xk.d;
import androidx.work.ListenableWorker;

public class j$a implements Runnable	// class@002509
{
    public final a b;
    public final j c;

    public void j$a(j p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = new Object[]{this.c.f.c};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(j.u, String.format("Starting work for %s", objArray), throwableArr);
       j$a tc = this.c;
       tc.s = tc.g.startWork();
       this.b.L(this.c.s);
       return;
    }
}
