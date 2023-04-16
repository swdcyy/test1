package com.kwai.kxb.service.ExpConfig$mMultiVersionBundleConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ru6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.service.ExpConfig;
import com.google.gson.JsonElement;
import com.kwai.kxb.Kxb;
import com.google.gson.Gson;
import com.kwai.kxb.Kxb$a;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.Throwable;

public final class ExpConfig$mMultiVersionBundleConfig$2 extends Lambda implements a	// class@0007e7
{
    public static final ExpConfig$mMultiVersionBundleConfig$2 INSTANCE;

    static {
       ExpConfig$mMultiVersionBundleConfig$2.INSTANCE = new ExpConfig$mMultiVersionBundleConfig$2();
    }
    public void ExpConfig$mMultiVersionBundleConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object[] objArray = null;
       JsonElement obj = PatchProxy.apply(objArray, this, ExpConfig$mMultiVersionBundleConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ExpConfig.f.a("kxb_cache_multi_version_config", objArray);
       if (obj != null) {
          objArray = Kxb.b.a().c(obj, c.class);
       }
       return objArray;
    }
}
