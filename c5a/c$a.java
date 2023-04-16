package c5a.c$a;
import d6a.a;
import c5a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class c$a extends a	// class@000549
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("NasaBaseSpecialCameraButtonPresenter", "becomesAttachedOnPageSelected", objArray);
       if (this.b.q.Vg().a()) {
          c$a tb = this.b;
          c u = tb.u;
          if (u != null) {
             if (u.z() == 1) {
                i = true;
             }
             tb.S8(i);
          }
       }
       return;
    }
}
