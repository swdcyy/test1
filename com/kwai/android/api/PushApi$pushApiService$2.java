package com.kwai.android.api.PushApi$pushApiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.android.api.IPushApiService;
import com.kwai.android.common.config.PushConfigManager;
import gv6.c;
import okhttp3.OkHttpClient;
import java.lang.String;
import com.android.kwai.foundation.network.IRpcService$Builder;
import n7.a;
import com.kwai.android.api.PushApi$pushApiService$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import com.android.kwai.foundation.network.IRpcService$Builder$OpHost;
import com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;
import java.lang.Class;
import com.android.kwai.foundation.network.IRpcService$Builder$OpFinal;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.Object;
import java.util.Objects;

public final class PushApi$pushApiService$2 extends Lambda implements a	// class@000973
{
    public static final PushApi$pushApiService$2 INSTANCE;

    static {
       PushApi$pushApiService$2.INSTANCE = new PushApi$pushApiService$2();
    }
    public void PushApi$pushApiService$2(){
       super(0);
    }
    public final IPushApiService invoke(){
       PushConfigManager iNSTANCE = PushConfigManager.INSTANCE;
       IRpcService iRpcService = a.a().setOkHttpClientFactory(new PushApi$pushApiService$2$1(iNSTANCE.getApiBuilder().getApiOkhttpClient())).with().host(iNSTANCE.getApiBuilder().getApiHost()).rpcService(IPushApiService.class).build();
       Objects.requireNonNull(iRpcService, "null cannot be cast to non-null type com.kwai.android.api.IPushApiService");
       return iRpcService;
    }
    public Object invoke(){
       return this.invoke();
    }
}
