package com.alipay.android.app.helper.TidHelper;
import c7.b;
import android.content.Context;
import java.lang.String;
import com.alipay.android.app.helper.Tid;
import c7.a;

public class TidHelper extends b	// class@000e36
{

    public void TidHelper(){
       super();
    }
    public static void clearTID(Context p0){
       b.clearTID(p0);
    }
    public static String getIMEI(Context p0){
       return b.getIMEI(p0);
    }
    public static String getIMSI(Context p0){
       return b.getIMSI(p0);
    }
    public static synchronized String getTIDValue(Context p0){
       _monitor_enter(TidHelper.class);
       _monitor_exit(TidHelper.class);
       return b.getTIDValue(p0);
    }
    public static String getVirtualImei(Context p0){
       return b.getVirtualImei(p0);
    }
    public static String getVirtualImsi(Context p0){
       return b.getVirtualImsi(p0);
    }
    public static Tid loadLocalTid(Context p0){
       return Tid.fromRealTidModel(b.loadLocalTid(p0));
    }
    public static synchronized Tid loadOrCreateTID(Context p0){
       _monitor_enter(TidHelper.class);
       _monitor_exit(TidHelper.class);
       return Tid.fromRealTidModel(b.loadOrCreateTID(p0));
    }
    public static Tid loadTID(Context p0){
       return Tid.fromRealTidModel(b.loadTID(p0));
    }
    public static boolean resetTID(Context p0){
       return b.resetTID(p0);
    }
}
