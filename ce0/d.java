package ce0.d;
import io.reactivex.subjects.ReplaySubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import kotlin.Result;
import ke0.a;
import ke0.b;
import nsd.u;
import qrd.l1;
import qrd.j0;

public final class d	// class@0004a1
{
    public static ReplaySubject a;
    public static final d b;

    static {
       d.b = new d();
       ReplaySubject replaySubjec = ReplaySubject.i(100);
       a.o(replaySubjec, "ReplaySubject.createWithSize<ConsoleData>\(100\)");
       d.a = replaySubjec;
    }
    public void d(){
       super();
    }
    public static final void a(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       if (PendantCoreConfig.i.d()) {
          a uoa = new a(p0, p1, null, p2, 4, null);
          d.a.onNext(v8);
          Result.constructor-impl(l1.a);
       }
       return;
    }
}
