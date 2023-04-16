package com.kuaishou.krn.instance.KrnShareEngineUtils$getShareEngineBundleConfigs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.instance.KrnShareEngineUtils$getShareEngineBundleConfigs$2$a;
import java.lang.reflect.Type;
import el.a;
import trd.t0;

public final class KrnShareEngineUtils$getShareEngineBundleConfigs$2 extends Lambda implements a	// class@0008cc
{
    public static final KrnShareEngineUtils$getShareEngineBundleConfigs$2 INSTANCE;

    static {
       KrnShareEngineUtils$getShareEngineBundleConfigs$2.INSTANCE = new KrnShareEngineUtils$getShareEngineBundleConfigs$2();
    }
    public void KrnShareEngineUtils$getShareEngineBundleConfigs$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Map value;
       d obj = PatchProxy.apply(null, this, KrnShareEngineUtils$getShareEngineBundleConfigs$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("krn_share_engine_bundle_config", new KrnShareEngineUtils$getShareEngineBundleConfigs$2$a().getType(), t0.z());
          if (value != null) {
          label_0038 :
             return value;
          }
       }
       value = t0.z();
       goto label_0038 ;
    }
}
