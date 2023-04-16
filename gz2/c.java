package gz2.c;
import java.lang.Runnable;
import gz2.h;
import java.lang.Object;
import gz2.h$d;
import my2.a$a;

public final class c implements Runnable	// class@002bd6
{
    public final h b;

    public void c(h p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       h e = tb.e;
       if (e != null) {
          h n = tb.n;
          e.i(n.b, n.c, n.d, n.e);
       }
       return;
    }
}
