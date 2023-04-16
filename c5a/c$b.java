package c5a.c$b;
import androidx.viewpager.widget.ViewPager$l;
import c5a.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c$b extends ViewPager$l	// class@00054a
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("NasaBaseSpecialCameraButtonPresenter", "onPageSelected", objArray);
       if (this.b.q.Vg().a()) {
          uob = this.b;
          if (uob.s > p0) {
             i = true;
          }
          uob.S8(i);
       }
       this.b.s = p0;
       return;
    }
}
