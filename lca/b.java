package lca.b;
import g9c.a;
import lca.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import lca.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import gca.b;
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;

public final class b extends a	// class@002da9
{
    public final a g;

    public void b(a p0){
       a.p(p0, "fineTuningActionListener");
       super();
       this.g = p0;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          a.p(p0, "holder");
          uob = this.N0(p1);
          if (uob != null) {
             Objects.requireNonNull(p0);
             d uod = d.class;
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(uob, Integer.valueOf(p1), p0, uod, "1")) {
                a.p(uob, "fineTuningItemUiData");
                p0.b = p1;
                p0.a = uob;
                p0.a(uob);
             }
          }else {
             i1.c(new RuntimeException("onBindViewHolder model is null"));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       d uod;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uod != PatchProxyResult.class) {
          label_0031 :
             return uod;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d0914);
       a.o(view, "KwaiLayoutInflater.infla¡­ut.list_item_fine_tuning\)");
       uod = new d(view, this.g);
       goto label_0031 ;
    }
}
