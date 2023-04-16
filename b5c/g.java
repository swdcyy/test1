package b5c.g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.util.b;
import z5c.w2;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import rvb.k$a;
import rvb.c$a;
import svb.d;
import z5c.v2;
import java.lang.Runnable;
import androidx.lifecycle.LifecycleOwner;
import rvb.b;
import rvb.n;
import rvb.g$b;
import rvb.f;
import rvb.c;

public final class g implements g	// class@0003aa
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
       }else {
          b = true;
          tb.v = b;
          b u = tb.u;
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoid(null, u, b.class, "14") && u.f == null) {
             u.f = b;
             u = u.c;
             if (!PatchProxy.applyVoidOneRefs(u, null, w2.class, "8")) {
                a.p(u, "user");
                b = new c$a[b];
                b[0] = new d(new v2(u));
                n.d(w2.a.a(u), null, b).f(g$b.c);
             }
          }
       }
       return;
    }
}
