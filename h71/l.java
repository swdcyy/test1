package h71.l;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import ad5.b;
import ad5.a;
import brd.t;
import h71.l$b;
import h71.l$c;
import erd.g;
import crd.b;
import csd.b;
import dsd.e;

public final class l extends AbstractLiveJsCommand	// class@00263d
{

    public void l(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       b uob = d.a(0x630bc993);
       a.o(uob, "PluginManager.get\(PaymentPlugin::class.java\)");
       a uoa = uob.d1();
       a.o(uoa, "PluginManager.get\(Paymen¡­lass.java\).paymentManager");
       uob = uoa.a().subscribe(new l$b(p0), new l$c(p0));
       a.o(uob, "disposable");
       p1.a5(uob);
       p0 = p0.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
