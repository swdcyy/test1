package com.yxcorp.gifshow.push.init.interceptor.api.CalendarAckApi$calendarApiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.interceptor.api.CalendarApiService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p6c.a;
import okhttp3.OkHttpClient;
import com.android.kwai.foundation.network.IRpcService$Builder;
import n7.a;
import com.yxcorp.gifshow.push.init.interceptor.api.CalendarAckApi$calendarApiService$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import com.android.kwai.foundation.network.IRpcService$Builder$OpHost;
import com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;
import com.android.kwai.foundation.network.IRpcService$Builder$OpFinal;
import com.android.kwai.foundation.network.IRpcService;
import java.util.Objects;

public final class CalendarAckApi$calendarApiService$2 extends Lambda implements a	// class@001657
{
    public static final CalendarAckApi$calendarApiService$2 INSTANCE;

    static {
       CalendarAckApi$calendarApiService$2.INSTANCE = new CalendarAckApi$calendarApiService$2();
    }
    public void CalendarAckApi$calendarApiService$2(){
       super(0);
    }
    public final CalendarApiService invoke(){
       a obj = PatchProxy.apply(null, this, CalendarAckApi$calendarApiService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       OkHttpClient apiOkhttpCli = obj.getApiOkhttpClient();
       IRpcService iRpcService = a.a().setOkHttpClientFactory(new CalendarAckApi$calendarApiService$2$1(apiOkhttpCli)).with().host(obj.getApiHost()).rpcService(CalendarApiService.class).build();
       Objects.requireNonNull(iRpcService, "null cannot be cast to non-null type com.yxcorp.gifshow.push.init.interceptor.api.CalendarApiService");
       return iRpcService;
    }
    public Object invoke(){
       return this.invoke();
    }
}
