package com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import x6.a;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.lang.CharSequence;
import z6.d;

public class UmidSdkWrapper	// class@000e80
{
    public static String cachedUmidToken = "";
    public static boolean initUmidFinished;

    public void UmidSdkWrapper(){
       super();
    }
    public static String compatUmidBug(Context p0,String p1){
       if (!a.c(p1) && !a.d(p1, "000000000000000000000000")) {
          return p1;
       }
       String utdid = UtdidWrapper.getUtdid(p0);
       p1 = "";
       if (utdid != null && utdid.contains("?")) {
          utdid = p1;
       }
       if (!a.c(utdid)) {
          p1 = utdid;
       }
       return p1;
    }
    public static synchronized String getSecurityToken(Context p0){
       _monitor_enter(UmidSdkWrapper.class);
       _monitor_exit(UmidSdkWrapper.class);
       return UmidSdkWrapper.cachedUmidToken;
    }
    public static String startUmidTaskSync(Context p0,int p1){
       return "";
    }
    public static synchronized void updateLocalUmidToken(Context p0,String p1){
       _monitor_enter(UmidSdkWrapper.class);
       if (a.e(p1)) {
          d.a(p0, "xxxwww_v2", "umidtk", p1);
          UmidSdkWrapper.cachedUmidToken = p1;
       }
       _monitor_exit(UmidSdkWrapper.class);
       return;
    }
}
