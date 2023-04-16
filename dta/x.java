package dta.x;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import gsa.e0;
import gr6.b;
import lr6.f;
import qsa.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrd.a;
import lr6.a;

public final class x implements u	// class@002558
{
    public final a a;

    public void x(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       x ta = this.a;
       b uob = ta.C.c();
       Objects.requireNonNull(uob);
       if (PatchProxy.applyVoidOneRefs(p0, uob, b.class, "1")) {
       }else {
          a.p(p0, "info");
          uob.a.onNext(p0);
       }
       ta.C.f();
       return;
    }
}
