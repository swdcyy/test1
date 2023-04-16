package dta.i;
import hsa.b;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ra6.a;
import gr6.b;
import lr6.f;
import qsa.b;
import io.reactivex.subjects.PublishSubject;

public final class i implements b	// class@002536
{
    public final a a;

    public void i(a p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       i ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, uoa, "24") && a.e())) {
          b uob = ta.C.c();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(null, uob, b.class, "2")) {
             uob.b.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
