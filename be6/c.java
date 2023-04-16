package be6.c;
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

public final class c implements Runnable	// class@000468
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       k ok = new k("create");
       u1.Q("plugin_warm_up_trig_event", d.a().q(ok));
       "plugin_warm_up_trig_event "+ok;
       return;
    }
}
