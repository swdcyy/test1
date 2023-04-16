package fn9.d;
import erd.g;
import fn9.e;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jb5.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class d implements g	// class@00233d
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "9")) {
       }else if(p0.a == null){
          tb.r.N1();
          tb.p.k2();
          tb.q.f(RefreshType.PROGRAM);
       }
       return;
    }
}
