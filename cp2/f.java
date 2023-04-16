package cp2.f;
import cp2.d;
import jp2.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import pp2.a;
import pp2.a$a;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import kotlin.jvm.internal.a;
import pp.c;
import hp2.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;

public final class f extends s implements d	// class@0023c0
{

    public void f(){
       super();
    }
    public void S1(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (a.d.a()) {
          String str = new Throwable().getStackTrace()[0].toString();
          a.o(str, "Throwable\(\).stackTrace[0].toString\(\)");
          b.Z(b.a(), "dispatch callback "+str);
       }
       Iterator iterator = this.k0().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!obj instanceof d) {
             obj = null;
          }
          if (obj != null) {
             obj.S1(p0);
          }
       }
       return;
    }
}
