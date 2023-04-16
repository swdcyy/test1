package dta.b;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import sn5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jr6.b;
import gr6.b;
import lr6.f;
import rsa.b;
import java.util.Objects;
import mrd.a;

public final class b implements u	// class@002525
{
    public final BottomActionBarPresenter a;

    public void b(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, str)) {
       }else {
          a.p(p0, "currScheme");
          b uob = BottomActionBarPresenter.P8(this.a).c();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, str)) {
             a.p(p0, "bottomBarScheme");
             uob.a.onNext(p0);
          }
       }
       return;
    }
}
