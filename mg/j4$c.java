package mg.j4$c;
import java.lang.Object;
import android.os.SystemClock;
import og.l;
import java.lang.String;
import q87.c;

public class j4$c	// class@002616
{
    public final long a;
    public long b;

    public void j4$c(long p0){
       super();
       this.a = p0;
    }
    public boolean a(boolean p0){
       long l = SystemClock.elapsedRealtime();
       if ((l - this.b) - this.a < 0) {
          Object[] objArray = new Object[0];
          l.D().s("Bridge_Post", "点的太快了", objArray);
          if (p0) {
             this.b = l;
          }
          return true;
       }else {
          this.b = l;
          return 0;
       }
    }
}
