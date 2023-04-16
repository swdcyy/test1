package com.android.kwai.platform.notification.core.config.RemoteConfigManager$service$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.android.kwai.platform.notification.core.config.IRemoteService;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import gv6.c;
import okhttp3.OkHttpClient;
import java.lang.String;
import com.android.kwai.foundation.network.IRpcService$Builder;
import n7.a;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager$service$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import com.android.kwai.foundation.network.IRpcService$Builder$OpHost;
import com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;
import java.lang.Class;
import com.android.kwai.foundation.network.IRpcService$Builder$OpFinal;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.Object;
import java.util.Objects;

public final class RemoteConfigManager$service$2 extends Lambda implements a	// class@00040e
{
    public static final RemoteConfigManager$service$2 INSTANCE;

    static {
       RemoteConfigManager$service$2.INSTANCE = new RemoteConfigManager$service$2();
    }
    public void RemoteConfigManager$service$2(){
       super(0);
    }
    public final IRemoteService invoke(){
       RemoteConfigManager j = RemoteConfigManager.j;
       IRpcService iRpcService = a.a().setOkHttpClientFactory(new RemoteConfigManager$service$2$1(j.k().getApiOkhttpClient())).with().host(j.k().getApiHost()).rpcService(IRemoteService.class).build();
       Objects.requireNonNull(iRpcService, "null cannot be cast to non-null type com.android.kwai.platform.notification.core.config.IRemoteService");
       return iRpcService;
    }
    public Object invoke(){
       return this.invoke();
    }
}
