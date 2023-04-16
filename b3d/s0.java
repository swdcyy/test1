package b3d.s0;
import erd.o;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import com.yxcorp.login.http.response.SyncUserResponse;
import com.yxcorp.login.util.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import wkd.b;
import m1d.a;
import cjd.e;
import java.util.concurrent.TimeUnit;
import com.yxcorp.login.util.y;
import erd.g;
import t45.d;
import brd.z;

public final class s0 implements o	// class@000343
{
    public final RequestTiming b;

    public void s0(RequestTiming p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       s0 tb = this.b;
       p0 = PatchProxy.applyOneRefs(tb, null, b0.class, "2");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = b.a(0x5cfaafff).c(tb).map(new e());
          long l = (tb == RequestTiming.ON_HOME_PAGE_CREATED)? 4: 15;
          p0 = p0.timeout(l, TimeUnit.SECONDS).doOnNext(y.b).subscribeOn(d.c).observeOn(d.a);
       }
       return p0;
    }
}
