package b9c.b0;
import gka.d0;
import java.lang.Object;
import java.lang.Boolean;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class b0 implements d0	// class@0003db
{
    public final a b;

    public void b0(){
       super();
       a uoa = a.h(Boolean.TRUE);
       a.o(uoa, "BehaviorSubject.createDefault\(true\)");
       this.b = uoa;
    }
    public boolean Ke(){
       Boolean obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.i();
       boolean b = (obj != null)? obj.booleanValue(): true;
       return b;
    }
    public final void a(boolean p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob0, "2")) {
          return;
       }
       this.b.onNext(Boolean.valueOf((p0 ^ 0x01)));
       return;
    }
    public t c7(){
       t obj = PatchProxy.apply(null, this, b0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.hide().distinctUntilChanged().skip(1);
       a.o(obj, "pageStateSubject.hide\(\).¡­nctUntilChanged\(\).skip\(1\)");
       return obj;
    }
    public t m5(){
       t obj = PatchProxy.apply(null, this, b0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.hide().distinctUntilChanged();
       a.o(obj, "pageStateSubject.hide\(\).distinctUntilChanged\(\)");
       return obj;
    }
}
