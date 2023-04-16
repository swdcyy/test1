package com.amap.api.location.UmidtokenInfo$1;
import java.lang.Runnable;
import java.lang.Object;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.UmidtokenInfo;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;

public final class UmidtokenInfo$1 implements Runnable	// class@000ed9
{

    public void UmidtokenInfo$1(){
       super();
    }
    public final void run(){
       if (UmidtokenInfo.a() != null) {
          UmidtokenInfo.a().onDestroy();
       }
       return;
    }
}
