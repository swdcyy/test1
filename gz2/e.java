package gz2.e;
import java.lang.Runnable;
import gz2.h;
import pz2.c;
import java.lang.String;
import java.lang.Object;
import my2.a$a;

public final class e implements Runnable	// class@002bd8
{
    public final h b;
    public final c c;
    public final String d;

    public void e(h p0,c p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       h e = tb.e;
       if (e != null && tc == tb.c) {
          e.c(td);
       }
       return;
    }
}
