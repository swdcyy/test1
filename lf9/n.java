package lf9.n;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lf9.c;
import sa6.b;
import kf9.f;
import java.util.List;
import java.util.HashMap;

public final class n extends b	// class@002dda
{
    public final q b;

    public void n(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          a.p(p0, "action");
          this.b.v0(new c(4));
          b uob = this.a().j();
          int i = (p0.b().isEmpty())? 0: this.b.l;
          uob.g().clear();
          this.a().h(f.a(uob, null, 0, i, p0.b(), false, true, 3, null));
       }
       return;
    }
}
