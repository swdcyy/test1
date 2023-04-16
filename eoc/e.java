package eoc.e;
import brd.z;
import crd.b;
import crd.c;
import android.os.Handler;
import android.os.Looper;
import brd.z$c;
import eoc.e$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import ekd.k1;
import ird.a;
import eoc.e$b;
import android.os.Message;

public class e extends z	// class@001584
{
    public final Handler b;
    public static final z c;
    public static final b d;

    static {
       e.c = new e();
       b uob = c.b();
       e.d = uob;
       uob.dispose();
    }
    public void e(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public z$c b(){
       return new e$a(this.b);
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       Objects.requireNonNull(p0, "run == null");
       Objects.requireNonNull(p2, "unit == null");
       if (k1.g() && !p1 - null) {
          p0.run();
          return e.d;
       }else {
          e tb = this.b;
          e$b uob = new e$b(tb, a.m(p0));
          Message message = Message.obtain(tb, uob);
          this.b.sendMessageDelayed(message, p2.toMillis(p1));
          return uob;
       }
    }
}
