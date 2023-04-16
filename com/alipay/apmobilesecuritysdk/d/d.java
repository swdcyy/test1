package com.alipay.apmobilesecuritysdk.d.d;
import java.util.Map;
import java.util.HashMap;
import com.alipay.apmobilesecuritysdk.c.b;
import java.lang.Object;
import android.content.Context;
import java.lang.StringBuilder;
import y6.c;
import java.lang.String;
import android.os.Build;
import android.os.Build$VERSION;
import y6.a;

public final class d	// class@000e6a
{

    public static synchronized Map a(){
       _monitor_enter(d.class);
       HashMap hashMap = new HashMap();
       b uob = new b();
       hashMap.put("AE16", "");
       _monitor_exit(d.class);
       return hashMap;
    }
    public static synchronized Map a(Context p0){
       _monitor_enter(d.class);
       HashMap hashMap = new HashMap();
       hashMap.put("AE1", "android");
       String str = "AE2";
       StringBuilder str1 = "";
       String str2 = (c.b())? "1": "0";
       hashMap.put(str, str1+str2);
       str = "AE3";
       str1 = "";
       String str3 = (c.a(p0))? "1": "0";
       hashMap.put(str, str1+str3);
       hashMap.put("AE4", Build.BOARD);
       hashMap.put("AE5", Build.BRAND);
       hashMap.put("AE6", Build.DEVICE);
       hashMap.put("AE7", Build.DISPLAY);
       hashMap.put("AE8", Build$VERSION.INCREMENTAL);
       hashMap.put("AE9", Build.MANUFACTURER);
       hashMap.put("AE10", Build.MODEL);
       hashMap.put("AE11", Build.PRODUCT);
       hashMap.put("AE12", Build$VERSION.RELEASE);
       hashMap.put("AE13", Build$VERSION.SDK);
       hashMap.put("AE14", Build.TAGS);
       hashMap.put("AE15", c.c());
       hashMap.put("AE21", a.h());
       _monitor_exit(d.class);
       return hashMap;
    }
}
