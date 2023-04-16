package cta.g$b;
import erd.g;
import cta.g;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import kotlin.jvm.internal.a;
import java.util.List;

public final class g$b implements g	// class@0023b7
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
       }else if(p0.getFirst() == null || p0.getSecond() == null){
          Object[] objArray = new Object[0];
          b.C().w("KCubeDynamicTabUpdatePresenter", "onConfigUpdated", objArray);
          a uoa = a.o0(this.b.getActivity());
          a.o(uoa, "HomeDataViewModel.get\(ac\x20\x02ity as FragmentActivity?\)\x00");
          int i = uoa.p0();
          if (i != 4 && i != 5) {
             this.b.q = p0.getFirst();
             this.b.r = p0.getSecond();
             p0 = this.b;
             p0.s = true;
             p0.a();
          }
       }
       return;
    }
}
