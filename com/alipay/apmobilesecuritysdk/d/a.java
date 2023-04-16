package com.alipay.apmobilesecuritysdk.d.a;
import android.content.Context;
import java.util.Map;
import java.lang.String;
import x6.a;
import java.util.HashMap;
import java.lang.Object;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public final class a	// class@000e67
{

    public static synchronized Map a(Context p0,Map p1){
       PackageInfo versionName;
       _monitor_enter(a.class);
       String str = a.b(p1, "appchannel", "");
       HashMap hashMap = new HashMap();
       String packageName = p0.getPackageName();
       String str1 = "AA1";
       try{
          hashMap.put(str1, packageName);
          versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 16).versionName;
       }catch(java.lang.Exception e0){
          versionName = "0.0.0";
       }
       hashMap.put("AA2", versionName);
       hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
       hashMap.put("AA4", "3.4.0.202109291244");
       hashMap.put("AA6", str);
       _monitor_exit(e0);
       return hashMap;
    }
}
