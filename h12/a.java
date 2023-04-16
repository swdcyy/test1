package h12.a;
import com.kuaishou.live.core.voiceparty.b;
import com.kuaishou.live.core.voiceparty.h;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import je3.o;
import mrd.a;
import kotlin.jvm.internal.a;
import h12.a$c;
import h12.a$a;
import erd.g;
import h12.a$b;
import erd.a;

public final class a	// class@002be9
{

    public static final t a(b p0,h p1){
       a$c obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       if (p1 == null || p1.e() != b) {
          b = false;
       }
       a uoa = a.h(new o(b));
       a.o(uoa, "BehaviorSubject.createDefault\(RtcStatus\(isOnMic\)\)");
       obj = new a$c(uoa);
       t ot = uoa.doOnSubscribe(new a$a(p0, obj)).doOnDispose(new a$b(p0, obj));
       a.o(ot, "subject.doOnSubscribe {\n¡­oveObserver\(observer\)\n  }");
       return ot;
    }
}
