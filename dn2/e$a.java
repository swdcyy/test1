package dn2.e$a;
import dn2.c$b;
import dn2.e;
import dn2.g;
import dn2.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import dn2.f;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import com.kuaishou.live.core.show.wishlight.download.base.a;

public class e$a extends c$b	// class@00255a
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void b(g p0,c$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, e.class, "6")) {
          ta.a.a(p0.b, new f(ta, p1, p0));
       }
       return;
    }
}
