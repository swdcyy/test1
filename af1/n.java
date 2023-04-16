package af1.n;
import java.lang.Runnable;
import af1.x;
import java.lang.Object;
import java.util.LinkedList;
import te1.c$a;

public final class n implements Runnable	// class@000078
{
    public final x b;

    public void n(x p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       if (tb.d.size() > 0) {
          x m = tb.m;
          if (m != null) {
             m.a();
          }
       }
       return;
    }
}
