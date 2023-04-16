package fgd.o;
import io.reactivex.g;
import fgd.l;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.cache.a;
import java.lang.System;
import java.lang.Boolean;
import brd.g;

public final class o implements g	// class@000e30
{
    public final l b;

    public void o(l p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.R8("CACHE");
       a.f().s(true);
       a.f().o();
       a.f().l(0);
       a.f().l(true);
       a.f().n("MANUAL_CLEAR_COST", (System.currentTimeMillis() - System.currentTimeMillis()));
       a.f().s(0);
       p0.onNext(Boolean.TRUE);
       p0.onComplete();
       return;
    }
}
