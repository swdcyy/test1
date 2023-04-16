package com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import com.yxcorp.retrofit.c$b;
import java.util.List;
import java.util.Map;
import qv8.a;
import java.lang.String;
import android.content.Context;
import android.net.Uri;

public interface abstract PayRetrofitGlobalConfig	// class@00121d
{

    c$b createRetrofitConfigSignature();
    List getExtraCookieList();
    Map getExtraUrlParams();
    a getPayRetrofitConfig();
    String getTraceContext();
    String getUserAgent();
    boolean isKwaiUrl(String p0);
    void processGatewayPayUri(Context p0,Uri p1);
    void showToast(Context p0,String p1,int p2);
}
