package com.alipay.mobilesecuritysdk.face.SecurityClientMobile;
import java.lang.Object;
import android.content.Context;
import java.util.Map;
import java.lang.String;
import java.util.HashMap;
import x6.a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener;
import com.alipay.apmobilesecuritysdk.a.a;

public class SecurityClientMobile	// class@000e85
{

    public void SecurityClientMobile(){
       super();
    }
    public static synchronized String GetApdid(Context p0,Map p1){
       _monitor_enter(SecurityClientMobile.class);
       HashMap hashMap = new HashMap();
       hashMap.put("utdid", a.b(p1, "utdid", ""));
       hashMap.put("tid", a.b(p1, "tid", ""));
       hashMap.put("userId", a.b(p1, "userId", ""));
       APSecuritySdk.getInstance(p0).initToken(0, hashMap, null);
       _monitor_exit(SecurityClientMobile.class);
       return a.a(p0);
    }
}
