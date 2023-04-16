package ln9.i;
import erd.o;
import ln9.l;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import tvc.e;
import nn9.d;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import jn9.d;
import java.util.Collection;
import java.util.Iterator;
import nn9.b;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import brd.t;

public final class i implements o	// class@002e25
{
    public final l b;

    public void i(l p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       List list;
       int i;
       t ot = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "list");
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             d uod = kSStore.b();
             if (uod != null) {
                list = uod.f();
                if (list != null) {
                   list = CollectionsKt___CollectionsKt.G5(list);
                label_0033 :
                   if (this.b.g.a()) {
                      i = 0;
                      if (list == null || list.isEmpty() != true) {
                         ArrayList uArrayList = new ArrayList();
                         p0 = p0.iterator();
                         while (p0.hasNext()) {
                            Object obj = p0.next();
                            int b = list.contains(obj);
                            if (b) {
                               i = i + 1;
                            }
                            b = b ^ 0x01;
                            if (b) {
                               uArrayList.add(obj);
                            }
                         }
                         if (i > 0) {
                            PostUtils.D("PostListComponentMiddleware", "loadMore merging found duplicated item, size="+i, new IllegalArgumentException());
                         }
                         p0 = new ArrayList(uArrayList);
                      }
                   }
                   ot = t.just(p0);
                }
             }
          }
          list = null;
          goto label_0033 ;
       }
       return ot;
    }
}
