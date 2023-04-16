package b9c.w;
import gka.c0;
import java.lang.Object;
import java.lang.Boolean;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class w implements c0	// class@0003f1
{
    public final a b;

    public void w(){
       super();
       a uoa = a.h(Boolean.TRUE);
       a.o(uoa, "BehaviorSubject.createDefault\(true\)");
       this.b = uoa;
    }
    public boolean K0(){
       Boolean obj = PatchProxy.apply(null, this, w.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.i();
       boolean b = (obj != null)? obj.booleanValue(): true;
       return b;
    }
    public t Z0(){
       t obj = PatchProxy.apply(null, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.hide().distinctUntilChanged();
       a.o(obj, "pageStateSubject.hide\(\).distinctUntilChanged\(\)");
       return obj;
    }
    public final void a(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "5")) {
          return;
       }
       this.b.onNext(Boolean.valueOf(p0));
       return;
    }
    public t n1(){
       t obj = PatchProxy.apply(null, this, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.hide().distinctUntilChanged().skip(1);
       a.o(obj, "pageStateSubject.hide\(\).¡­nctUntilChanged\(\).skip\(1\)");
       return obj;
    }
}
