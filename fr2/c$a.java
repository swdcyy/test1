package fr2.c$a;
import erd.g;
import fr2.c;
import java.lang.Object;
import kw1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import hr2.a;

public final class c$a implements g	// class@0029a2
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          a.p(p0, "livePkSkinStatusChangeEvent");
          c$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "3") && (p0.a != null && p0.b == 3)) {
             p0 = tb.k;
             if (p0 == null) {
                a.S("mStageViewService");
             }
             p0.S();
          }
       }
       return;
    }
}
