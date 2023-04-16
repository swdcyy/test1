package com.hpplay.sdk.source.process.LelinkSdkService$4;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.Object;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.a.a;
import java.lang.Throwable;

public class LelinkSdkService$4 implements IBrowseListener	// class@000687
{
    public final LelinkSdkService a;

    public void LelinkSdkService$4(LelinkSdkService p0){
       this.a = p0;
       super();
    }
    public void onBrowse(int p0,List p1){
       StringBuilder str = "sdk service device callback -- >   "+p0+"  "+p1.size()+"  mBrowseResultListener is null ";
       boolean b = (LelinkSdkService.d(this.a) == null)? true: false;
       a.f("LelinkSdkService", str+b);
       if (LelinkSdkService.d(this.a) != null) {
          try{
             LelinkSdkService.d(this.a).onResult(p0, p1);
          }catch(java.lang.Exception e3){
             a.b("LelinkSdkService", e3);
          }
       }
    }
}
