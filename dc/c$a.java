package dc.c$a;
import java.lang.Runnable;
import dc.c;
import java.lang.Object;
import hb.b;
import dc.c$b;

public class c$a implements Runnable	// class@001e33
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       c$a tb = this.b;
       _monitor_enter(tb);
       c$a tb1 = this.b;
       boolean b = false;
       tb1.g = b;
       if ((tb1.e.now() - tb1.h) - tb1.i > 0) {
          b = true;
       }
       if (b) {
          c k = this.b.k;
          if (k != null) {
             k.onInactive();
          }
       }else {
          this.b.c();
       }
       _monitor_exit(tb);
       return;
    }
}
