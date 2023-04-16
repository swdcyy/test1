package ak0.a;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import fk0.a;
import java.lang.Runnable;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ak0.a$b;
import java.util.concurrent.Callable;
import lk0.j;
import lk0.i;
import brd.f0;
import java.lang.StringBuilder;

public final class a	// class@0000b7
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final a0 b(ReactContext p0,a p1,Runnable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "bundleMeta");
       a0 uoa0 = a0.y(new a$b(p0, p1, p2));
       a.o(uoa0, "Single.fromCallable {\n\n \x20\x02?.run\(\)\n\n      true\n    }\x00");
       a0 uoa01 = PatchProxy.applyOneRefs(uoa0, null, j.class, "1");
       if (uoa01 != PatchProxyResult.class) {
       }else {
          a.p(uoa0, "$this$subscribeOnWorkThread");
          uoa01 = uoa0.g(i.b);
          a.o(uoa01, "compose { upstream ->\n  бн\n      upstream\n    }\n  }");
       }
       return uoa01;
    }
    public final String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+'_'+p1;
    }
}
