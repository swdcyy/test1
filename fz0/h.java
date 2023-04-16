package fz0.h;
import lnc.c3$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.lang.Object;
import mk1.a0;
import java.util.Objects;
import fz0.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public final class h implements c3$a	// class@0023e3
{
    public final o a;

    public void h(o p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       g og = new g(ta);
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(og, p0, a0.class, "1")) {
       }else {
          p0.e.add(og);
       }
       return;
    }
}
