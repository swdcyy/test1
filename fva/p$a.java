package fva.p$a;
import erd.g;
import fva.p;
import java.lang.Object;
import dva.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import uua.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import bva.a;
import bva.b;
import java.lang.Integer;
import brd.t;
import t45.d;
import brd.z;
import fva.o;
import crd.b;

public final class p$a implements g	// class@002a17
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
       }else {
          p p = this.b.p;
          p0 = p0.a;
          Objects.requireNonNull(p);
          if (!PatchProxy.applyVoidOneRefs(p0, p, InterestCardWrapperAdapter.class, "2")) {
             a.p(p0, "hotSpotItem");
             int i = p.h.L0().indexOf(p0);
             if (i >= 0) {
                p.h.L0().remove(p0);
                p.h.t0(i);
                p.h.p0(i, (p.getItemCount() - i));
             }
          }
          p0 = this.b.q.L0();
          p0 = (p0 == null || p0.isEmpty())? 1: null;
          if (!p0 && this.b.q.L0().size() <= 7) {
             a.a.a().d(Integer.valueOf(3)).subscribeOn(d.c).observeOn(d.a).subscribe(new o(this));
          }
       }
       return;
    }
}
