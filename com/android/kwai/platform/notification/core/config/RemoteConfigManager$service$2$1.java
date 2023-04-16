package com.android.kwai.platform.notification.core.config.RemoteConfigManager$service$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import okhttp3.OkHttpClient;
import java.lang.String;

public final class RemoteConfigManager$service$2$1 extends AbsKwaiOkHttpClientFactory	// class@00040d
{
    public final OkHttpClient $client;

    public void RemoteConfigManager$service$2$1(OkHttpClient p0){
       this.$client = p0;
       super();
    }
    public OkHttpClient makeOkHttpClient(String p0){
       return this.$client;
    }
}
