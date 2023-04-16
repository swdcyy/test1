package com.yxcorp.gifshow.retrofit.service.UploadServiceGetter$UploadRetrofitConfig;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.OkHttpClient$Builder;

public class UploadServiceGetter$UploadRetrofitConfig extends g	// class@001b16
{

    public void UploadServiceGetter$UploadRetrofitConfig(RouteType p0,z p1){
       super(p0, p1);
    }
    public OkHttpClient buildClient(){
       Object obj = PatchProxy.apply(null, this, UploadServiceGetter$UploadRetrofitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createOkHttpClientBuilder(60).build();
    }
}
