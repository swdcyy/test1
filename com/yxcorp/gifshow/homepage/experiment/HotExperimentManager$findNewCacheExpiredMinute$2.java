package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findNewCacheExpiredMinute$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class HotExperimentManager$findNewCacheExpiredMinute$2 extends Lambda implements a	// class@0016c6
{
    public static final HotExperimentManager$findNewCacheExpiredMinute$2 INSTANCE;

    static {
       HotExperimentManager$findNewCacheExpiredMinute$2.INSTANCE = new HotExperimentManager$findNewCacheExpiredMinute$2();
    }
    public void HotExperimentManager$findNewCacheExpiredMinute$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, HotExperimentManager$findNewCacheExpiredMinute$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("hotNewCacheExpiredMinute", 5);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
