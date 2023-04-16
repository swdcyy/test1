package com.alipay.apmobilesecuritysdk.face.TMNTokenClient;
import android.content.Context;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.face.TMNTokenClient$InitResultListener;
import x6.a;
import java.util.HashMap;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.face.TMNTokenClient$1;
import java.util.Map;
import java.lang.Runnable;

public class TMNTokenClient	// class@000e7f
{
    public Context b;
    public static TMNTokenClient a;

    public void TMNTokenClient(Context p0){
       super();
       this.b = null;
       if (p0 == null) {
          throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
       }
       this.b = p0;
       return;
    }
    public static Context a(TMNTokenClient p0){
       return p0.b;
    }
    public static TMNTokenClient getInstance(Context p0){
       if (TMNTokenClient.a == null) {
          _monitor_enter(TMNTokenClient.class);
          if (TMNTokenClient.a == null) {
             TMNTokenClient.a = new TMNTokenClient(p0);
          }
          _monitor_exit(TMNTokenClient.class);
       }
       return TMNTokenClient.a;
    }
    public void intiToken(String p0,String p1,String p2,TMNTokenClient$InitResultListener p3){
       String str = "";
       if (a.c(p0) && p3 != null) {
          p3.onResult(str, 2);
       }
       if (a.c(p1) && p3 != null) {
          p3.onResult(str, 3);
       }
       HashMap hashMap = new HashMap();
       hashMap.put("utdid", UtdidWrapper.getUtdid(this.b));
       hashMap.put("tid", str);
       hashMap.put("userId", str);
       hashMap.put("appName", p0);
       hashMap.put("appKeyClient", p1);
       hashMap.put("appchannel", "openapi");
       hashMap.put("sessionId", p2);
       hashMap.put("rpcVersion", "8");
       b.a().a(new TMNTokenClient$1(this, hashMap, p3, p0));
       return;
    }
}
