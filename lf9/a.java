package lf9.a;
import java.lang.Object;
import java.util.HashMap;
import lf9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import lf9.b;
import sa6.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class a	// class@002dcb
{
    public final HashMap a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       String str = "action";
       a.p(p0, str);
       b uob = this.a.get(Integer.valueOf(p0.a()));
       if (uob == null) {
          throw new IllegalArgumentException("not found action: "+p0.a());
       }
       a.o(uob, "delegateMap[action.type]бн action: ${action.type}\"\)");
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "1")) {
          a.p(p0, str);
          uob.c(p0);
       }
       return;
    }
    public final Object b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = this.a.get(Integer.valueOf(p0));
       if (!obj1 instanceof Object) {
          obj1 = null;
       }
       return obj1;
    }
    public final void c(int p0,b p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "delegate");
       this.a.put(Integer.valueOf(p0), p1);
       return;
    }
}
