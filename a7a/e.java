package a7a.e;
import erd.g;
import a7a.g;
import java.lang.Object;
import eda.b0;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public final class e implements g	// class@000052
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       if (!tb.s.Vg().e() && (p0.b()).equals(tb.r.getPhotoId())) {
          int i = p0.a();
          if (!PatchProxy.isSupport2(g.class, "5") || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(i), tb, g.class, "5")) {
             tb.p.S(i);
             PatchProxy.onMethodExit(g.class, "5");
          }
       }
       return;
    }
}
