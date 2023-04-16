package com.yxcorp.gifshow.retrofit.service.UploadServiceGetter;
import java.lang.Object;
import com.yxcorp.gifshow.retrofit.service.KwaiUploadService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.retrofit.service.UploadServiceGetter$UploadRetrofitConfig;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class UploadServiceGetter	// class@001b17
{
    public static KwaiUploadService mApiService;

    public void UploadServiceGetter(){
       super();
    }
    public static synchronized KwaiUploadService getApiService(){
       _monitor_enter(UploadServiceGetter.class);
       Object obj = PatchProxy.apply(null, null, UploadServiceGetter.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(UploadServiceGetter.class);
          return obj;
       }else if(UploadServiceGetter.mApiService == null){
          UploadServiceGetter.mApiService = e.b(new UploadServiceGetter$UploadRetrofitConfig(RouteType.UPLOAD, d.d), KwaiUploadService.class);
       }
       _monitor_exit(UploadServiceGetter.class);
       return UploadServiceGetter.mApiService;
    }
}
