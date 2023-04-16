package c.t.m.g.dh;
import c.t.m.g.dj;
import c.t.m.g.df;
import c.t.m.g.dg;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import c.t.m.g.em;
import java.util.Comparator;
import java.util.Collections;
import java.lang.String;
import c.t.m.g.ce;
import c.t.m.g.q;
import c.t.m.g.ed;
import java.lang.Throwable;
import c.t.m.g.ej;
import c.t.m.g.de;
import c.t.m.g.cf;
import c.t.m.g.ec;
import android.content.Context;
import org.json.JSONObject;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Math;
import c.t.m.g.eh;
import android.text.TextUtils;
import android.net.wifi.ScanResult;
import android.os.SystemClock;
import com.tencent.map.geolocation.util.SoUtils;

public class dh	// class@000c44
{
    public final dj b;
    public final df c;
    public final dg d;
    public final List e;
    public static long a;

    public void dh(dj p0,df p1,dg p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public dj a(){
       return this.b;
    }
    public final dj a(dj p0){
       ArrayList uArrayList = new ArrayList(p0.c());
       Collections.sort(uArrayList, em.c);
       return new dj(uArrayList, p0.a(), p0.b());
    }
    public String a(int p0,int p1,String p2,ce p3,boolean p4,boolean p5,boolean p6){
       dj uodj;
       dh uodh = this;
       int i = p1;
       ce uoce = p3;
       String str = "TxHybridInfo";
       String str1 = null;
       if (!uoce) {
          return str1;
       }
       dh c = uodh.c;
       boolean b = true;
       if (c != null) {
          df f = c.f;
          if (!dh.a - f) {
             b = false;
          }
          dh.a = f;
       }
       boolean b1 = q.a().d("enable_wifi_native_sort");
       c = uodh.b;
       if (c != null) {
          try{
             uodj = (b1)? uodh.b(c): uodh.a(c);
          label_0043 :
             if (uodj == null) {
                uodj = uodh.b;
             }
             String str2 = ej.a(uodj, b1);
             String str3 = ej.a(uodh.c, b);
             String str4 = ej.a(uodh.d);
             String str5 = de.a(uodh.e);
             String str6 = "{}";
             String str7 = (p5)? str6: str4;
             cf uocf = p3.h();
             if (uocf == null) {
                return str1;
             }else {
                String str8 = uocf.o();
                String str9 = uocf.p();
                str1 = uocf.b();
                int i1 = ec.a().a(uoce.a);
                String str10 = em.c(p3);
                if (str2.equals("[]") && !str10.equals(str6)) {
                   JSONObject jSONObject = new JSONObject(str10);
                   if (b1) {
                      jSONObject.put("ts", 0);
                   }
                   jSONObject.remove("ssid");
                   str2 = "["+jSONObject.toString()+"]";
                }
             label_00ce :
                str4 = uocf.j();
                if (str4 != null) {
                   str4 = str4.replace("\"", "");
                }
                if (str4 != null) {
                   str4 = str4.replace("|", "");
                }
                str4 = str4+"_"+uocf.i();
                int i2 = 203;
                if (p6 && str1 != null) {
                   i2 = (Math.abs(str1.hashCode()) % 1000) + 1001;
                }
                String str11 = str5;
                str4 = "{\"version\":\"7.3.7.0.official_1\",\"address\":"+p0+",\"source\":"+i2+",\"access_token\":\""+str9+"\",\"lID\":\""+eh.a("limei_prefs", "limei", "")+"\",\"device_id\":\""+str1+"\",\"app_name\":\""+p2+"\",\"app_label\":\""+str4+"\",\"bearing\":1";
                if (i >= 0) {
                   str4 = str4+",\"control\":"+i;
                }
                if (!TextUtils.isEmpty(uocf.g())) {
                   str4 = str4+",\"smallappname\":\""+uocf.g()+"\"";
                }
                str4 = (p4)? str4+",\"detectgps\":1": str4+",\"detectgps\":0";
                return str4+",\"pstat\":"+i1+",\"wlan\":"+str10+",\"attribute\":"+str8+",\"location\":"+str7+",\"cells\":"+str3+",\"wifis\":"+str2+",\"bles\":"+str11+"}";
             }
          }catch(java.lang.Exception e0){
             if (ed.a) {
                ed.a(str, "wifi sort err", e0);
             }
          }
       label_0042 :
          uodj = str1;
          goto label_0043 ;
       }else {
          goto label_0042 ;
       }
    }
    public String a(int p0,String p1,ce p2,boolean p3,boolean p4,boolean p5){
       return this.a(p0, 0, p1, p2, p3, p4, p5);
    }
    public final dj b(dj p0){
       if (ed.a) {
          ed.b("TxHybridInfo", "wifiSortNative start");
       }
       dj uodj = null;
       if (p0 == null) {
          return uodj;
       }else {
          List list = p0.c();
          if (list != null && list.size()) {
             int[] ointArray = new int[list.size()];
             int[] ointArray1 = new int[list.size()];
             int i = 0;
             for (int i1 = 0; i1 < list.size(); i1 = i1 + 1) {
                ointArray[i1] = list.get(i1).level;
                long l = SystemClock.elapsedRealtime() / 1000;
                long l1 = list.get(i1).timestamp / 1000;
                l1 = l1 / 1000;
                l = l - l1;
                ointArray1[i1] = (int)l;
             }
             ointArray = SoUtils.fun_s(ointArray, ointArray1, list.size(), true);
             ArrayList uArrayList = new ArrayList();
             i1 = ointArray.length;
             for (; i < i1; i = i + 1) {
                uArrayList.add(list.get(ointArray[i]));
             }
             uodj = new dj(uArrayList, p0.a(), p0.b());
          }
          return uodj;
       }
    }
    public boolean b(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
}
