package com.yxcorp.gifshow.push.init.interceptor.api.CalendarAckApi$calendarApiService$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import okhttp3.OkHttpClient;
import java.lang.String;

public final class CalendarAckApi$calendarApiService$2$1 extends AbsKwaiOkHttpClientFactory	// class@001656
{
    public final OkHttpClient $client;

    public void CalendarAckApi$calendarApiService$2$1(OkHttpClient p0){
       this.$client = p0;
       super();
    }
    public OkHttpClient makeOkHttpClient(String p0){
       return this.$client;
    }
}
