package com.amap.api.location.UmidtokenInfo;
import android.os.Handler;
import java.lang.Object;
import com.amap.api.location.AMapLocationClient;
import java.lang.String;
import android.content.Context;
import com.loc.o;
import com.amap.api.location.UmidtokenInfo$a;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.UmidtokenInfo$1;
import java.lang.Runnable;
import java.lang.Throwable;
import com.loc.fj;

public class UmidtokenInfo	// class@000edb
{
    public static Handler a;
    public static String b;
    public static boolean c;
    public static AMapLocationClient d;
    public static long e;

    static {
       UmidtokenInfo.a = new Handler();
       UmidtokenInfo.b = null;
       UmidtokenInfo.e = 0x7530;
       UmidtokenInfo.c = true;
    }
    public void UmidtokenInfo(){
       super();
    }
    public static AMapLocationClient a(){
       return UmidtokenInfo.d;
    }
    public static String getUmidtoken(){
       return UmidtokenInfo.b;
    }
    public static void setLocAble(boolean p0){
       UmidtokenInfo.c = p0;
    }
    public static synchronized void setUmidtoken(Context p0,String p1){
       _monitor_enter(UmidtokenInfo.class);
       UmidtokenInfo.b = p1;
       o.a(p1);
       if (UmidtokenInfo.d == null && UmidtokenInfo.c) {
          UmidtokenInfo.d = new AMapLocationClient(p0);
          AMapLocationClientOption uAMapLocatio = new AMapLocationClientOption();
          uAMapLocatio.setOnceLocation(true);
          uAMapLocatio.setNeedAddress(false);
          UmidtokenInfo.d.setLocationOption(uAMapLocatio);
          UmidtokenInfo.d.setLocationListener(new UmidtokenInfo$a());
          UmidtokenInfo.d.startLocation();
          UmidtokenInfo.a.postDelayed(new UmidtokenInfo$1(), 0x7530);
       }
       _monitor_exit(UmidtokenInfo.class);
       return;
    }
}
