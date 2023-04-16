package b4d.t;
import erd.g;
import b4d.w;
import java.lang.Object;
import java.util.List;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import b4d.v;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class t implements g	// class@000391
{
    public final w b;

    public void t(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       if (p0 != null && tb.r.mForceNewEditorStyle != null) {
          Object obj = PatchProxy.applyOneRefs(p0, tb, w.class, "5");
          if (obj != PatchProxyResult.class) {
             p0 = obj;
          }else if(tb.x != null && p0.size() > 5){
             p0 = p0.subList(0, 5);
          }
       }
       tb.v.W0(p0);
       tb.v.k0();
       tb.t.post(new v(tb));
       return;
    }
}
