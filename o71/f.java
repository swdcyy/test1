package o71.f;
import com.kuaishou.live.core.show.pk.pkinvite.g$b;
import asd.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import kotlin.Result;
import o63.m;
import o63.m$a;
import com.kuaishou.live.core.show.pk.model.LivePkInviteResponse;

public final class f implements g$b	// class@0034a3
{
    public final c a;

    public void f(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "2")) {
          return;
       }
       a.p(p0, "error");
       this.a.resumeWith(Result.constructor-impl(m.g.a(p1, p0)));
       return;
    }
    public void b(LivePkInviteResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "response");
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, null, false, 3, null)));
       return;
    }
}
