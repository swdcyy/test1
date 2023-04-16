package com.yxcorp.gifshow.hot.stagger.pagelist.HomeHotCacheManager;
import com.yxcorp.gifshow.hot.stagger.pagelist.HomeHotCacheManager$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.hot.stagger.pagelist.HomeHotCacheManager$mCancelAutoRefresh$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.Objects;
import k2b.u1;
import qva.c;
import java.lang.StringBuilder;
import q87.c;

public final class HomeHotCacheManager	// class@0018a9
{
    public final p a;
    public static final HomeHotCacheManager$a b;

    static {
       HomeHotCacheManager.b = new HomeHotCacheManager$a(null);
    }
    public void HomeHotCacheManager(){
       super();
       this.a = s.c(HomeHotCacheManager$mCancelAutoRefresh$2.INSTANCE);
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, HomeHotCacheManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return HotExperimentManager.a();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, HomeHotCacheManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.booleanValue();
    }
    public final void c(boolean p0,boolean p1,int p2,boolean p3){
       if (PatchProxy.isSupport(HomeHotCacheManager.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, HomeHotCacheManager.class, "7")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.a("consume", Boolean.valueOf(p0));
       oi3.a("expired", Boolean.valueOf(p1));
       oi3.c("cacheCount", Integer.valueOf(p2));
       String str = oi3.toString();
       a.o(str, "JsonStringBuilder.newIns…eCount\)\n      .toString\(\)");
       HotExperimentManager l = HotExperimentManager.l;
       Objects.requireNonNull(l);
       Boolean uBoolean = PatchProxy.apply(null, l, HotExperimentManager.class, "11");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = HotExperimentManager.k.getValue();
       }
       if (uBoolean.booleanValue() && !p3) {
          u1.R("HOT_FIRST_SHOW_CACHE", str, 14);
       }
       Object[] objArray = new Object[0];
       c.C().w("HomeHotCacheManager", "是否使用了预取数据="+p3+"。本地缓存使用信息"+str, objArray);
       return;
    }
}
