package com.kwai.kxb.service.ExpConfig$mNetworkBundleMinVersionCheckConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;

public final class ExpConfig$mNetworkBundleMinVersionCheckConfig$2 extends Lambda implements a	// class@0007e8
{
    public static final ExpConfig$mNetworkBundleMinVersionCheckConfig$2 INSTANCE;

    static {
       ExpConfig$mNetworkBundleMinVersionCheckConfig$2.INSTANCE = new ExpConfig$mNetworkBundleMinVersionCheckConfig$2();
    }
    public void ExpConfig$mNetworkBundleMinVersionCheckConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, ExpConfig$mNetworkBundleMinVersionCheckConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExpConfig.f.b("kxb_min_bundle_version_not_fallback");
    }
}
