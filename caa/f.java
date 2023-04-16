package caa.f;
import caa.g;
import java.lang.Object;
import android.content.Context;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import wkd.b;
import aaa.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import caa.f$a;
import erd.o;
import caa.f$b;
import erd.g;
import caa.f$c;
import caa.f$d;
import t45.d;
import brd.z;
import caa.f$e;

public final class f implements g	// class@000593
{
    public static Map a;
    public static boolean b;
    public static final f c;

    static {
       f.c = new f();
    }
    public void f(){
       super();
    }
    public t a(Context p0){
       t ot;
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "app");
       if (f.b) {
          ot = t.just(l1.a);
          a.o(ot, "Observable.just\(Unit\)");
       }else {
          ot = b.a(-828662326).b(RequestTiming.DEFAULT).map(f$a.b).doOnNext(f$b.b).flatMapIterable(f$c.b).flatMap(new f$d(p0)).takeLast(1).subscribeOn(d.c).observeOn(d.a).doOnNext(f$e.b);
          a.o(ot, "Singleton.get\(EasterEggA¡­OnNext { isReady = true }");
       }
       return ot;
    }
    public boolean isReady(){
       return f.b;
    }
}
