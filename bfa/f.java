package bfa.f;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import hfa.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;

public final class f	// class@0003a8
{
    public static final z a;
    public static final f b;

    static {
       f.b = new f();
       z oz = b.b(c.f("organizer-cache"));
       a.o(oz, "Schedulers.from\(Async.ne¡­cutor\(\"organizer-cache\"\)\)");
       f.a = oz;
    }
    public void f(){
       super();
    }
    public final void a(c p0,long p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uof, "1")) {
          return;
       }
       a.p(p0, "task");
       if (p1 - null > 0) {
          f.a.e(p0, p1, TimeUnit.MILLISECONDS);
       }else {
          f.a.d(p0);
       }
       return;
    }
}
