package bz7.d;
import java.util.UUID;
import java.lang.String;
import java.util.concurrent.ThreadPoolExecutor;
import f97.a;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import java.util.List;
import java.lang.reflect.Type;
import bz7.g;
import el.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rb7.c;
import bz7.e;
import brd.t;
import bz7.b;
import bz7.c;
import erd.g;
import crd.b;

public final class d	// class@0003a7
{
    public static final String a;
    public static final List b;
    public static final z c;
    public static final d d;

    static {
       List list;
       d uod = new d();
       d.d = uod;
       d.a = UUID.randomUUID().toString();
       z oz = b.b(a.e("webView-app-batch-logger-thread"));
       d.c = oz;
       a uoa = Azeroth2.B.q();
       if (uoa != null) {
          Type[] typeArray = new Type[]{g.class};
          a parameterize = a.getParameterized(List.class, typeArray);
          a.h(parameterize, "TypeToken.getParameteriz¡­chSampleRule::class.java\)");
          Type type = parameterize.getType();
          a.h(type, "TypeToken.getParameteriz¡­pleRule::class.java\).type");
          list = uoa.a(null, "yoda_app_batch_event_rate", type, new ArrayList());
       }else {
          list = null;
       }
       d.b = list;
       if (!PatchProxy.applyVoid(null, uod, d.class, "1")) {
          c.c.b(e.class).observeOn(oz).subscribe(b.b, c.b);
       }
    }
    public void d(){
       super();
    }
}
