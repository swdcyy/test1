package a51.a;
import brd.x;
import a51.c;
import a51.c$a;
import java.lang.Object;
import brd.t;
import brd.w;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a51.b;
import erd.r;

public final class a implements x	// class@000044
{
    public final c b;
    public final c$a c;

    public void a(c p0,c$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final w apply(t p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyOneRefs(tc, tb, c.class, "7");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = tb.q.filter(new b(tc));
       }
       return p0.takeUntil(ot);
    }
}
