package com.hpplay.sdk.source.process.LelinkSdkService$2;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.f;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class LelinkSdkService$2 implements IParceResultListener	// class@000685
{
    public final LelinkSdkService a;

    public void LelinkSdkService$2(LelinkSdkService p0){
       this.a = p0;
       super();
    }
    public void onParceResult(int p0,LelinkServiceInfo p1){
       if (LelinkSdkService.b(this.a) != null) {
          try{
             LelinkSdkService.b(this.a).onParceResult(p0, p1);
          }catch(java.lang.Exception e2){
             a.b("LelinkSdkService", e2);
          }
       }
    }
}
