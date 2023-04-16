package cb5.e;
import cb5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hka.m;
import java.util.Objects;
import eb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;

public class e extends a	// class@000448
{
    public final BaseFragment s;

    public void e(BaseFragment p0){
       a.p(p0, "mFragment");
       super(p0.Vg());
       this.s = p0;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e ts = this.s;
       if (ts instanceof m) {
          Objects.requireNonNull(ts, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.component.Scrollable");
          ts.N1();
       }
       ts = this.s;
       if (ts instanceof d) {
          Objects.requireNonNull(ts, "null cannot be cast to non-null type com.kwai.component.homepage_interface.interfaces.HomeItemRefreshable");
          ts.J3(RefreshType.FOREGROUND2);
       }
       return;
    }
}
