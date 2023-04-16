package com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSDKObjectPool$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import nm5.l;
import java.lang.reflect.Type;

public final class DanmakuExperimentUtils$enableSDKObjectPool$2 extends Lambda implements a	// class@000e5f
{
    public static final DanmakuExperimentUtils$enableSDKObjectPool$2 INSTANCE;

    static {
       DanmakuExperimentUtils$enableSDKObjectPool$2.INSTANCE = new DanmakuExperimentUtils$enableSDKObjectPool$2();
    }
    public void DanmakuExperimentUtils$enableSDKObjectPool$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       l obj = PatchProxy.apply(null, this, DanmakuExperimentUtils$enableSDKObjectPool$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!d.r("KEY_ENABLE_DANMAKU_OBJECT_POOL")) {
          obj = a.t().getValue("danmakuSDKCachePoolOptimize", l.class, null);
          obj = (obj != null)? obj.a: null;
          if (obj == null) {
          label_0034 :
             return b;
          }
       }
       b = true;
       goto label_0034 ;
    }
}
