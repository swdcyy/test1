package nf0.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig$a;
import java.lang.reflect.Type;
import nf0.b$a;
import ekd.k1;

public final class b implements Runnable	// class@0032fd
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       k1.o(new b$a(a.t().getValue("disablePendantReportCustomEventConfig", PendantCustomEventConfig.class, PendantCustomEventConfig.Companion.a())));
       return;
    }
}
