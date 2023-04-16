package ll8.b;
import bwd.d;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import bwd.c;
import bwd.b;
import com.yxcorp.plugin.payment.activity.PaymentLifecycleWatcher;
import bwd.e;
import m56.f;
import org.greenrobot.eventbus.ThreadMode;
import java.lang.String;
import bwd.a;
import java.util.Map;

public class b implements d	// class@001dae
{
    public static final Map a;
    public static final AtomicBoolean b;

    static {
       b.a = new HashMap();
       b.b = new AtomicBoolean(false);
    }
    public void b(){
       super();
    }
    public c a(Class p0){
       boolean b = true;
       if (!b.b.getAndSet(b)) {
          e[] uoeArray = new e[b];
          uoeArray[0] = new e("onBackground", f.class, ThreadMode.MAIN);
          b uob = new b(PaymentLifecycleWatcher.class, b, uoeArray);
          b.a.put(uob.a(), uob);
       }
       c uoc = b.a.get(p0);
       if (uoc != null) {
          return uoc;
       }else {
          return null;
       }
    }
}
