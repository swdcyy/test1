package be6.d$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import be6.k;
import com.google.gson.Gson;
import be6.d;
import k2b.u1;
import java.lang.StringBuilder;

public final class d$c implements Runnable	// class@00046b
{
    public static final d$c b;

    static {
       d$c.b = new d$c();
    }
    public void d$c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       k ok = new k("start");
       u1.Q("plugin_warm_up_trig_event", d.a().q(ok));
       "plugin_warm_up_trig_event "+ok;
       return;
    }
}
