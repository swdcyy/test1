package lq1.c$c;
import erd.g;
import gq1.l$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import s91.d;

public final class c$c implements g	// class@002ff9
{
    public final l$a b;

    public void c$c(l$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else {
          b.y(d.a, "endChatMode", p0);
          new d().a(p0);
          c$c tb = this.b;
          if (tb != null) {
             tb.a(p0);
          }
       }
       return;
    }
}
