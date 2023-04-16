package dta.f;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import jr6.b;
import gr6.b;
import lr6.f;
import rsa.b;
import mrd.a;

public final class f implements u	// class@002530
{
    public final BottomActionBarPresenter a;

    public void f(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       boolean b = p0.booleanValue();
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uof, "1")) {
          BottomActionBarPresenter.P8(this.a).c().a().onNext(Boolean.valueOf(b));
       }
       return;
    }
}
