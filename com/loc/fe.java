package com.loc.fe;
import android.content.Context;
import java.lang.Object;
import com.loc.fj;
import com.loc.q;
import com.loc.bg;
import com.loc.ff;
import com.loc.bm;
import com.loc.bl$c;
import com.loc.bl;
import java.lang.String;
import java.util.HashMap;
import com.loc.w;
import com.loc.l;
import com.loc.n;
import java.lang.StringBuilder;
import java.lang.Double;
import java.util.Map;
import java.util.Locale;
import java.lang.Integer;
import com.loc.fq;
import java.net.Proxy;
import com.loc.v;
import com.loc.x;
import java.lang.Throwable;
import java.lang.Long;

public final class fe	// class@001429
{
    public bg a;
    public Context c;
    public int d;
    public boolean e;
    public int f;
    public static fe b;

    public void fe(Context p0){
       super();
       this.a = null;
       this.c = null;
       this.d = fj.i;
       this.e = false;
       this.f = 0;
       q.a().a(p0);
       this.c = p0;
       this.a = bg.a();
    }
    public static fe a(Context p0){
       if (fe.b == null) {
          fe.b = new fe(p0);
       }
       return fe.b;
    }
    public final bm a(ff p0){
       if (this.e != null) {
          p0.a(bl$c.b);
       }
       return bg.a(p0);
    }
    public final ff a(Context p0,byte[] p1,String p2,String p3,boolean p4){
       String str3;
       String str = "1";
       HashMap hashMap = new HashMap(16);
       ff uoff = new ff(p0, fj.c());
       hashMap.put("Content-Type", "application/octet-stream");
       hashMap.put("Accept-Encoding", "gzip");
       hashMap.put("gzipped", str);
       hashMap.put("Connection", "Keep-Alive");
       hashMap.put("User-Agent", "AMAP_Location_SDK_Android 6.1.0");
       hashMap.put("KEY", l.f(p0));
       hashMap.put("enginever", fj.a);
       String str1 = n.a();
       String str2 = n.a(p0, str1, "key="+l.f(p0));
       hashMap.put("ts", str1);
       hashMap.put("scode", str2);
       if (Double.valueOf(fj.a).doubleValue() - 0x4015333333333333 >= 0) {
          hashMap.put("aps_s_src", "openapi");
       }
       hashMap.put("encr", str);
       uoff.b(hashMap);
       str = "loc";
       if (!p4) {
          str = "locf";
       }
       uoff.c(true);
       Object[] objArray = new Object[]{"6.1.0",str,Integer.valueOf(3)};
       uoff.b(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", objArray));
       uoff.b(p4);
       uoff.c(p2);
       uoff.d(p3);
       uoff.c(fq.a(p1));
       uoff.a(v.a(p0));
       HashMap hashMap1 = new HashMap(16);
       hashMap1.put("output", "bin");
       hashMap1.put("policy", "3103");
       fe tf = this.f;
       if (tf != null) {
          if (tf != true) {
             if (tf == 2) {
                str3 = "language:en";
             }
          }else {
             str3 = "language:cn";
          }
          hashMap1.put("custom", str3);
       label_00f0 :
          uoff.a(hashMap1);
          uoff.a(this.d);
          uoff.b(this.d);
          if (this.e != null) {
             uoff.a(bl$c.b);
          }
          return uoff;
       }
       hashMap1.remove("custom");
       goto label_00f0 ;
    }
    public final String a(Context p0,double p1,double p2){
       String str1;
       HashMap hashMap = new HashMap(16);
       ff uoff = new ff(p0, fj.c());
       hashMap.clear();
       hashMap.put("Content-Type", "application/x-www-form-urlencoded");
       hashMap.put("Connection", "Keep-Alive");
       hashMap.put("User-Agent", "AMAP_Location_SDK_Android 6.1.0");
       HashMap hashMap1 = new HashMap(16);
       hashMap1.put("custom", "26260A1F00020002");
       hashMap1.put("key", l.f(p0));
       fe tf = this.f;
       String str = "language";
       if (tf != null) {
          if (tf != true) {
             if (tf == 2) {
                str1 = "en";
             }
          }else {
             str1 = "zh-CN";
          }
          hashMap1.put(str, str1);
       label_0056 :
          str1 = "curLocationType";
          str = (fq.m(this.c))? "coarseLoc": "fineLoc";
          hashMap1.put(str1, str);
          str1 = n.a();
          str = n.a(p0, str1, x.b(hashMap1));
          hashMap1.put("ts", str1);
          hashMap1.put("scode", str);
          uoff.b(("output=json&radius=1000&extensions=all&location="+p2+","+p1).getBytes("UTF-8"));
          uoff.c(false);
          uoff.b(true);
          Object[] objArray = new Object[]{"6.1.0","loc",Integer.valueOf(3)};
          uoff.b(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", objArray));
          uoff.a(hashMap1);
          uoff.b(hashMap);
          uoff.a(v.a(p0));
          uoff.a(fj.i);
          uoff.b(fj.i);
          uoff.d("http://dualstack-arestapi.amap.com/v3/geocode/regeo");
          uoff.c("http://restsdk.amap.com/v3/geocode/regeo");
          if (this.e != null) {
             uoff.a(bl$c.b);
          }
          String str2 = new String(bg.a(uoff).a, "utf-8");
          return str2;
       }
       hashMap1.remove(str);
       goto label_0056 ;
    }
    public final void a(long p0,boolean p1,int p2){
       this.e = p1;
       this.d = Long.valueOf(p0).intValue();
       this.f = p2;
    }
}
