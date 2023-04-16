package jca.a$d;
import androidx.lifecycle.Observer;
import jca.a;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import q87.c;
import jca.d;
import java.lang.Enum;
import g9c.a;
import java.util.List;
import java.util.Collection;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import jca.b;
import java.lang.Runnable;
import android.view.ViewGroup;
import gca.b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import lca.d;

public final class a$d implements Observer	// class@002a4a
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       ListHolder$UpdateType updateType;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          int i = p0.b();
          Object[] objArray = new Object[0];
          a.D().w("FineTuningPanelViewBinder", "mFineTuningItemUiDataList index:"+i+", updateType:"+p0.e()+", payload:"+p0.d(), objArray);
          updateType = p0.e();
          if (updateType != null) {
             int i1 = d.a[updateType.ordinal()];
             int i2 = 1;
             if (i1 != i2) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 == 4) {
                         this.b.h.M0();
                         this.b.h.L0(p0.c());
                         this.b.E(p0.c().size());
                      }
                   }else {
                      this.b.h.J0(i, p0.c().get(i));
                      this.b.E(p0.c().size());
                      if (a.g(p0.d(), Integer.valueOf(3))) {
                         this.b.c.postDelayed(new b(this), 400);
                      }
                   }
                }else {
                   this.b.h.S0(i);
                   this.b.E(p0.c().size());
                }
             }else {
                b uob = p0.c().get(i);
                d uod = this.b.c.findViewHolderForLayoutPosition(i);
                if (a.g(p0.d(), Integer.valueOf(i2)) || uod == null) {
                   this.b.h.V0(i, uob);
                }else {
                   this.b.h.Q0().set(i, uob);
                   uod.a(uob);
                }
             }
          }
       }
       return;
    }
}
