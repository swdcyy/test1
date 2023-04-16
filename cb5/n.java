package cb5.n;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import zca.o;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.component.homepage_interface.homeitemfragment.ui.MaskFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import oe6.e;
import androidx.recyclerview.widget.RecyclerView;

public final class n implements g	// class@000451
{
    public final e b;

    public void n(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "13")) {
       }else if(tb.q.f() == p0.a && new MaskFragment().Dh(tb.q.getFragmentManager(), "MaskFragment", 0, 0)){
          e.c0(true);
          tb.q.h0().scrollToPosition(p0.b);
       }
       return;
    }
}
