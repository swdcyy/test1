package bh4.b;
import hh4.d;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import ah4.a;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jh4.j;
import com.kwai.robust.PatchProxyResult;
import rk0.b;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.Collection;
import ekd.q;

public class b extends d	// class@0003d1
{

    public void b(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.E8();
       if (!this.u.g.equals(this.z.Q0())) {
          this.z.W0(this.u.g);
          this.z.k0();
       }
       return;
    }
    public j W8(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this.R8());
    }
    public void Y8(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (this.u.j(p0) && (this.z != null && !q.f(this.u.g))) {
          this.z.W0(this.u.g);
          this.z.k0();
       }
    label_0035 :
       return;
    }
}
