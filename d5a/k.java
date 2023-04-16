package d5a.k;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gz9.a;

public final class k implements g	// class@001e84
{
    public final LandscapeEntranceVMPresenter b;

    public void k(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          p0 = this.b.s;
          if (p0 == null) {
             a.S("mPayCourseEventCombination");
          }
          p0.a();
       }
       return;
    }
}
