package com.amap.api.location.UmidtokenInfo$a;
import com.amap.api.location.AMapLocationListener;
import java.lang.Object;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.UmidtokenInfo;
import android.os.Handler;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;

public final class UmidtokenInfo$a implements AMapLocationListener	// class@000eda
{

    public void UmidtokenInfo$a(){
       super();
    }
    public final void onLocationChanged(AMapLocation p0){
       if (UmidtokenInfo.a() != null) {
          UmidtokenInfo.a.removeCallbacksAndMessages(null);
          UmidtokenInfo.a().onDestroy();
       }
       return;
    }
}
