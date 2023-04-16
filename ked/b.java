package ked.b;
import ok.h;
import ked.h;
import java.util.List;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchSkyFallInfo;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import nfd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import mrd.a;
import java.lang.Iterable;
import com.yxcorp.plugin.search.utils.q;
import erd.o;
import t45.d;
import brd.z;
import nfd.d1;
import erd.a;
import nfd.g1;
import nfd.f1;
import erd.g;
import crd.b;
import ot3.d;
import ked.d;
import ked.f;

public final class b implements h	// class@00176a
{
    public final h b;
    public final List c;
    public final SearchSkyFallInfo d;

    public void b(h p0,List p1,SearchSkyFallInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       SearchSkyFallInfo mCouponId = this.d.mCouponId;
       if (PatchProxy.isSupport(k1.class)) {
          p0 = PatchProxy.applyThreeRefs(tc, Long.valueOf(5000), mCouponId, null, k1.class, "5");
          if (p0 != PatchProxyResult.class) {
          label_0078 :
             return p0.subscribe(new d(tb), new f(tb));
          }
       }
       p0 = a.g();
       z c = d.c;
       b uob = t.fromIterable(tc).concatMap(new q(5000)).observeOn(c).subscribeOn(c).doFinally(new d1(p0)).subscribe(new g1(p0), new f1(p0));
       Objects.requireNonNull(uob);
       p0 = p0.doOnDispose(new d(uob)).hide().subscribeOn(c).observeOn(d.a);
       goto label_0078 ;
    }
}
