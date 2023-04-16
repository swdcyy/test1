package kka.p;
import erd.g;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import java.lang.Object;
import zca.p;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import crd.b;

public final class p implements g	// class@001c1a
{
    public final FreeTrafficManager b;

    public void p(FreeTrafficManager p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, FreeTrafficManager.class, "33")) {
       }else {
          tb.g(RequestTiming.DEFAULT).subscribe();
       }
       return;
    }
}
