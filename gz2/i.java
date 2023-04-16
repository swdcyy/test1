package gz2.i;
import java.lang.Runnable;
import gz2.h$c;
import pz2.c;
import java.lang.Object;
import gz2.h;
import hz2.c;
import java.lang.String;
import cz2.d;

public final class i implements Runnable	// class@002be0
{
    public final h$c b;
    public final c c;

    public void i(h$c p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       h$c a = tb.a;
       if (a.d != null && tc != null) {
          a.l.a();
          h$c a1 = tb.a;
          a1.d.g(tc, true, null, a1.l);
       }
       return;
    }
}
