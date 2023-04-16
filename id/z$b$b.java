package id.z$b$b;
import java.lang.Runnable;
import id.z$b;
import java.lang.Object;
import com.facebook.common.references.a;

public class z$b$b implements Runnable	// class@0021d6
{
    public final z$b b;

    public void z$b$b(z$b p0){
       this.b = p0;
       super();
    }
    public void run(){
       z$b$b tb = this.b;
       _monitor_enter(tb);
       z$b$b tb1 = this.b;
       z$b g = tb1.g;
       z$b h = tb1.h;
       tb1.g = null;
       tb1.i = false;
       _monitor_exit(tb);
       if (a.l(g)) {
          this.b.p(g, h);
          a.f(g);
       }
       tb1 = this.b;
       _monitor_enter(tb1);
       tb1.j = false;
       _monitor_exit(tb1);
       if (tb1.v()) {
          tb1.w();
       }
       return;
    }
}
