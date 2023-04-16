package c5b.e$c;
import erd.o;
import c5b.e;
import java.lang.Object;
import c5b.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import j8c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import c5b.b;
import java.lang.Long;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import brd.t;
import java.util.List;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import c5b.f;
import t45.d;
import brd.z;

public final class e$c implements o	// class@0004b9
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, e$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          b.d("MagicSearchProvider", "searchMagicFace getMagicFacesId success");
          ArrayList uArrayList = new ArrayList();
          p0 = p0.searchResult;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Long longx = iterator.next().a();
             if (longx != null) {
                uArrayList.add(String.valueOf(longx.longValue()));
             }
          }
          ot = (q.f(uArrayList))? t.just(new ArrayList()): l.w(uArrayList, this.b.b).map(new f(p0)).observeOn(d.a);
       }
       return ot;
    }
}
