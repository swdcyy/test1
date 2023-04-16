package gx7.j;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public class j	// class@002048
{
    public Object a;
    public final l b;

    public void j(l p0){
       a.p(p0, "creator");
       super();
       this.b = p0;
    }
    public final Object a(Object p0){
       j ta = this.a;
       if (ta != null) {
       }else {
          _monitor_enter(this);
          ta = this.a;
          if (ta == null) {
             p0 = this.b.invoke(p0);
             this.a = p0;
             ta = p0;
          }
          _monitor_exit(this);
       }
       return ta;
    }
}
