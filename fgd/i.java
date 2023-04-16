package fgd.i;
import erd.g;
import fgd.k;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.util.Objects;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.Button;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import v56.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import bgd.a;
import java.lang.Long;
import cgd.b;
import java.util.Map;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fgd.j;
import java.lang.Runnable;
import ekd.k1;

public final class i implements g	// class@000e28
{
    public final k b;
    public final WeakReference c;

    public void i(k p0,WeakReference p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b;
       i tc = this.c;
       Objects.requireNonNull(p0);
       AttrAnimProgressFragment uAttrAnimPro = tc.get();
       if (uAttrAnimPro != null) {
          boolean b = true;
          if (!p0.z.getAndSet(b)) {
             uAttrAnimPro.dismiss();
             tc.clear();
             p0.q.setEnabled(false);
             i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f10058c));
             g.f(((float)p0.P8(b) / 1024.00f));
             HashMap hashMap = new HashMap();
             HashMap hashMap1 = new HashMap();
             Iterator iterator = p0.y.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                hashMap.put(uoa.c(), Long.valueOf(uoa.d()));
                if (p0.u.L0(uoa.c())) {
                   hashMap1.put(uoa.c(), Long.valueOf(uoa.e()));
                }
             }
             g.e(hashMap);
             g.h(hashMap1);
             p0.x.clear();
             p0.x.addAll(p0.y);
             p0.u.O0(p0.x);
             p0.u.k0();
             p0.S8();
             k1.r(j.b, 1000);
          }
       }
       return;
    }
}
