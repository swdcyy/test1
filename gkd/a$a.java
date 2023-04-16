package gkd.a$a;
import java.util.concurrent.Callable;
import gkd.a;
import java.lang.Object;

public class a$a implements Callable	// class@000f44
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       a$a tb = this.b;
       _monitor_enter(tb);
       a$a tb1 = this.b;
       if (tb1.j == null) {
          _monitor_exit(tb);
       }else {
          tb1.y();
          if (this.b.k()) {
             this.b.s();
             this.b.l = 0;
          }
          _monitor_exit(tb);
       }
       return null;
    }
}
