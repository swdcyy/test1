package com.tencent.open.log.d;
import android.os.Bundle;
import java.lang.String;
import java.lang.CharSequence;

public class d	// class@000f68
{

    public static boolean a(Bundle p0){
       boolean b = (!p0.containsKey("access_token") && (!p0.containsKey("pay_token") && (!p0.containsKey("pfkey") && (!p0.containsKey("expires_in") && (!p0.containsKey("openid") && (p0.containsKey("proxy_code") || p0.containsKey("proxy_expires_in")))))))? true: false;
       return b;
    }
    public static boolean a(String p0){
       boolean b = (!p0.contains("access_token") && (!p0.contains("pay_token") && (!p0.contains("pfkey") && (!p0.contains("expires_in") && (!p0.contains("openid") && (p0.contains("proxy_code") || p0.contains("proxy_expires_in")))))))? true: false;
       return b;
    }
    public static Bundle b(Bundle p0){
       if (!d.a(p0)) {
          return p0;
       }
       Bundle uBundle = new Bundle(p0);
       uBundle.remove("access_token");
       uBundle.remove("pay_token");
       uBundle.remove("pfkey");
       uBundle.remove("expires_in");
       uBundle.remove("openid");
       uBundle.remove("proxy_code");
       uBundle.remove("proxy_expires_in");
       return uBundle;
    }
}
