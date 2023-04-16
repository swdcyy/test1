package com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.a.a;
import x6.a;
import java.util.HashMap;
import java.util.Map;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$TokenResult;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.b.a;
import com.alipay.apmobilesecuritysdk.e.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$1;
import java.lang.Runnable;

public class APSecuritySdk	// class@000e7b
{
    public Context b;
    public static APSecuritySdk a;
    public static Object c;

    static {
       APSecuritySdk.c = new Object();
    }
    public void APSecuritySdk(Context p0){
       this.b = p0;
    }
    public static Context a(APSecuritySdk p0){
       return p0.b;
    }
    public static APSecuritySdk getInstance(Context p0){
       if (APSecuritySdk.a == null) {
          Object c = APSecuritySdk.c;
          _monitor_enter(c);
          if (APSecuritySdk.a == null) {
             APSecuritySdk.a = new APSecuritySdk(p0);
          }
          _monitor_exit(c);
       }
       return APSecuritySdk.a;
    }
    public static String getUtdid(Context p0){
       return UtdidWrapper.getUtdid(p0);
    }
    public String getApdidToken(){
       String str = a.a(this.b, "");
       if (a.c(str)) {
          this.initToken(0, new HashMap(), null);
       }
       return str;
    }
    public String getSdkName(){
       return "APPSecuritySDK-ALIPAYSDK";
    }
    public String getSdkVersion(){
       return "3.4.0.202109291244";
    }
    public synchronized APSecuritySdk$TokenResult getTokenResult(){
       APSecuritySdk$TokenResult tokenResult = new APSecuritySdk$TokenResult(this);
       tokenResult.apdidToken = a.a(this.b, "");
       tokenResult.clientKey = h.f(this.b);
       tokenResult.apdid = a.a(this.b);
       tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.b);
       if (!a.c(tokenResult.apdid) && (a.c(tokenResult.apdidToken) || a.c(tokenResult.clientKey))) {
          this.initToken(0, new HashMap(), null);
       }
       return tokenResult;
    }
    public void initToken(int p0,Map p1,APSecuritySdk$InitResultListener p2){
       a.a().a(p0);
       String str = h.b(this.b);
       String str1 = a.a().c();
       if (a.e(str) && !a.d(str, str1)) {
          a.a(this.b);
          d.a(this.b);
          g.a(this.b);
          i.h();
       }
       if (!a.d(str, str1)) {
          h.c(this.b, str1);
       }
       str = "utdid";
       String str2 = a.b(p1, str, "");
       String str3 = a.b(p1, "tid", "");
       String str4 = a.b(p1, "userId", "");
       if (a.c(str2)) {
          str2 = UtdidWrapper.getUtdid(this.b);
       }
       HashMap hashMap = new HashMap();
       hashMap.put(str, str2);
       hashMap.put("tid", str3);
       hashMap.put("userId", str4);
       hashMap.put("appName", "");
       hashMap.put("appKeyClient", "");
       hashMap.put("appchannel", "");
       hashMap.put("rpcVersion", "8");
       b.a().a(new APSecuritySdk$1(this, hashMap, p2));
       return;
    }
}
