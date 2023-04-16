package knd.p;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;

public final class p implements g	// class@0017f7
{
    public final v b;

    public void p(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          a.p(p0, "throwable");
          this.b.onError(p0);
       }
       return;
    }
}
