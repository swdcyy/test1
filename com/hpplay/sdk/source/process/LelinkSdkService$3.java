package com.hpplay.sdk.source.process.LelinkSdkService$3;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.c;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class LelinkSdkService$3 implements IConnectListener	// class@000686
{
    public final LelinkSdkService a;

    public void LelinkSdkService$3(LelinkSdkService p0){
       this.a = p0;
       super();
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       if (LelinkSdkService.c(this.a) != null) {
          try{
             LelinkSdkService.c(this.a).onConnect(p0, p1);
          }catch(java.lang.Exception e2){
             a.b("LelinkSdkService", e2);
          }
       }
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       if (LelinkSdkService.c(this.a) != null) {
          try{
             LelinkSdkService.c(this.a).onDisconnect(p0, p1, p2);
          }catch(java.lang.Exception e2){
             a.b("LelinkSdkService", e2);
          }
       }
    }
}
