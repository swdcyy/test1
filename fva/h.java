package fva.h;
import erd.g;
import com.yxcorp.gifshow.hot.spot.presenter.a;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uh5.e;
import tkd.b;
import tkd.d;
import ayb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class h implements g	// class@002a0a
{
    public final a b;

    public void h(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "9")) {
       }else if(p0.a == null && (!e.f() && d.a(0x4f878389).op())){
          tb.r.N1();
          tb.p.k2();
          tb.q.f(RefreshType.PROGRAM);
       }
       return;
    }
}
