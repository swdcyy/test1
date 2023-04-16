package com.kwai.kxb.service.ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;

public final class ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2 extends Lambda implements a	// class@0007e6
{
    public static final ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2 INSTANCE;

    static {
       ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2.INSTANCE = new ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2();
    }
    public void ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExpConfig.f.b("kxb_request_not_fallback_config");
    }
}
