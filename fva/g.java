package fva.g;
import erd.g;
import com.yxcorp.gifshow.hot.spot.presenter.a;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uh5.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class g implements g	// class@002a09
{
    public final a b;

    public void g(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "8")) {
       }else if(p0.b == null && !e.f()){
          tb.r.N1();
          tb.p.k2();
          tb.q.f(RefreshType.LOGIN_REFRESH);
       }
       return;
    }
}
