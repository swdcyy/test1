package goa.f;
import erd.g;
import goa.d;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import wkd.b;
import joa.a;
import goa.g;
import java.lang.Runnable;
import yb7.p;
import cra.w;
import q87.c;

public final class f implements g	// class@002b42
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "10")) {
             p0 = QCurrentUser.ME;
             a.o(p0, "QCurrentUser.ME");
             if (p0.isLogined()) {
                p0 = b.a(-415247079);
                String str = p0.f();
                int i = p0.a();
                tb.a(str, i, p0.d());
                p.e(new g(tb), 100);
                Object[] objArray = new Object[0];
                w.C().t("GrowthModule", "onLoginFinished login success", objArray);
             }
          }
       }
       return;
    }
}
