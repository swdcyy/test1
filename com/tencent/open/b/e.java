package com.tencent.open.b.e;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.HashMap;
import android.os.Build$VERSION;
import android.content.Context;
import com.tencent.open.utils.f;
import com.tencent.open.b.a;
import android.os.Build;
import com.tencent.open.utils.k;
import java.lang.Long;
import android.os.SystemClock;
import java.lang.StringBuffer;
import com.tencent.open.utils.HttpUtils;
import java.net.URLEncoder;
import com.tencent.open.b.h;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.os.Bundle;

public class e	// class@000f48
{
    public static e a;

    public void e(){
       super();
    }
    public static synchronized e a(){
       _monitor_enter(e.class);
       if (e.a == null) {
          e.a = new e();
       }
       _monitor_exit(e.class);
       return e.a;
    }
    public static Map a(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8){
       HashMap hashMap = new HashMap();
       hashMap.put("platform", "1");
       hashMap.put("result", p0);
       hashMap.put("code", p1);
       hashMap.put("tmcost", p2);
       hashMap.put("rate", p3);
       hashMap.put("cmd", p4);
       hashMap.put("uin", p5);
       hashMap.put("appid", p6);
       hashMap.put("share_type", p7);
       hashMap.put("detail", p8);
       hashMap.put("os_ver", Build$VERSION.RELEASE);
       hashMap.put("network", a.a(f.a()));
       hashMap.put("apn", a.b(f.a()));
       hashMap.put("model_name", Build.MODEL);
       hashMap.put("sdk_ver", "3.5.4.lite");
       hashMap.put("packagename", f.b());
       hashMap.put("app_ver", k.d(f.a(), f.b()));
       return hashMap;
    }
    public void a(int p0,String p1,String p2,String p3,String p4,Long p5,int p6,int p7,String p8){
       long l = SystemClock.elapsedRealtime() - p5.longValue();
       String str = null;
       if (!p5.longValue() - str || l - str < 0) {
          l = str;
       }
       StringBuffer str1 = "https://huatuocode.huatuo.qq.com"+"?domain=mobile.opensdk.com&cgi=opensdk&type="+p0+"&code="+p6+"&time="+l+"&rate="+p7+"&uin="+p2;
       Map map = e.a(String.valueOf(p0), String.valueOf(p6), String.valueOf(l), String.valueOf(p7), p1, p2, p3, p4, p8);
       try{
          h.a().a(str1+"&data"+"="+URLEncoder.encode(HttpUtils.encodeUrl(map), "UTF-8"), null);
       }catch(java.io.UnsupportedEncodingException e0){
          SLog.e("openSDK_LOG.OpenSdkStatic", "reportHaboCgi exception.", e0);
       }
       return;
    }
    public void a(String p0,String p1,String p2,String p3,String p4,String p5){
       h.a().a(k.a(p0, p2, p3, p4, p1, p5), p1, true);
    }
    public void a(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       h.a().a(k.a(p0, p3, p4, p2, p1, p5, "", p6, p7, "", "", ""), p1, false);
    }
    public void a(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9){
       h.a().a(k.a(p0, p3, p4, p2, p1, p5, p6, "", "", p7, p8, p9), p1, false);
    }
}
