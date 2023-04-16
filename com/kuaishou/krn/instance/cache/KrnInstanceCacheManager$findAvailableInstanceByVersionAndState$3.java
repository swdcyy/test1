package com.kuaishou.krn.instance.cache.KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import sj0.b;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.instance.KrnReactInstanceState;

public final class KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3 extends Lambda implements l	// class@0008cf
{
    public static final KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3 INSTANCE;

    static {
       KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3.INSTANCE = new KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3();
    }
    public void KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3(){
       super(1);
    }
    public final Comparable invoke(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnInstanceCacheManager$findAvailableInstanceByVersionAndState$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.j();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
