package jh9.a$e;
import erd.g;
import jh9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import crd.b;
import hb0.a;
import q87.c;
import brd.t;
import h26.a;
import jh9.b;
import jh9.c;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a$e implements g	// class@002ad0
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "17")) {
             a x = p0.x;
             if (x == null || x.isDisposed()) {
                x = p0.v;
                if (x != null) {
                   Object[] objArray = new Object[0];
                   a.D().w("PostToolBox", "refresh", objArray);
                   b uob = x.a().subscribe(new b(p0), new c(p0));
                   p0.x = uob;
                   a.m(uob);
                   p0.X7(uob);
                }
             }
          }
       }
       return;
    }
}
