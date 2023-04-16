package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.d;
import lnc.c3$a;
import java.lang.Object;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import crd.b;
import lnc.b9;
import com.kuaishou.krn.event.a;
import oj0.a;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleRegistry;

public final class d implements c3$a	// class@000b31
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void apply(Object p0){
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, p0, n.class, str)) {
       }else {
          n b = p0.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, m.class, str)) {
             b9.a(b.a);
             if (!PatchProxy.applyVoid(objArray, b, m.class, "14")) {
                a.b().c("sync_lucky_bag_pendant_info", b.n);
             }
             b.e = 0;
             b.j = false;
             b.k = -1;
             b.h();
          }
          p0.c.setCurrentState(Lifecycle$State.DESTROYED);
       }
       return;
    }
}
