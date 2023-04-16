package jg9.k0;
import erd.g;
import jg9.t0;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import usd.q;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.util.Objects;
import j8c.a;
import q87.c;
import jg9.v0;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jg9.v;

public final class k0 implements g	// class@002aa0
{
    public final t0 b;

    public void k0(t0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       MultiTakePictrueItem obj;
       int i2;
       MultiTakePictureController$c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
       }else {
          int i = q.u((p0.size() / 2), 5);
          a.o(p0, "items");
          p0 = p0.iterator();
          int i1 = 0;
          while (p0.hasNext()) {
             obj = p0.next();
             i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             a = obj.a;
             i1 = (i1 < i && obj.a() - 1)? true: false;
             a.c = i1;
             i1 = i2;
          }
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, t0.class, "14")) {
             Object[] objArray = new Object[0];
             a.D().w("MultiTakePictureListAda", "notifyItemRecommendChanged", objArray);
             Iterator iterator = p0.e.iterator();
             i1 = 0;
             i2 = -1;
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.d()) {
                   i2 = i1 + 1;
                   obj.h(i1);
                   i1 = i2;
                }else {
                   obj.h(i2);
                }
             }
             iterator = p0.e.iterator();
             t0 ot0 = null;
             while (iterator.hasNext()) {
                if (iterator.next().d()) {
                   i2 = ot0;
                   break ;
                }
                ot0 = ot0 + 1;
             }
             v0 ov0 = new v0(p0.j.getContext(), p0);
             ov0.p(q.n(i2, 0));
             RecyclerView$LayoutManager layoutManage = p0.j.getLayoutManager();
             if (layoutManage != null) {
                layoutManage.startSmoothScroll(ov0);
             }
             p0.p0(0, p0.e.size());
             p0 = p0.h;
             if (p0 != null) {
                p0.G0();
             }
          }
       }
       return;
    }
}
