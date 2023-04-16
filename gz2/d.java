package gz2.d;
import java.lang.Runnable;
import gz2.h;
import java.lang.String;
import java.lang.Object;
import pz2.a;
import my2.a$a;

public final class d implements Runnable	// class@002bd7
{
    public final h b;
    public final long c;
    public final String d;

    public void d(h p0,long p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       if (tb.e != null) {
          h c = tb.c;
          if (c != null && !c.b() - tc) {
             tb.e.c(td);
          }
       }
       return;
    }
}
