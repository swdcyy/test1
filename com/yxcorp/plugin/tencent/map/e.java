package com.yxcorp.plugin.tencent.map.e;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.os.SystemClock;
import java.lang.String;
import com.yxcorp.plugin.tencent.map.e$b;
import sid.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import sid.s;
import com.yxcorp.plugin.tencent.map.e$d;
import sid.b0;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Iterable;
import sid.e;
import com.yxcorp.utility.TextUtils;
import com.tencent.map.geolocation.TencentLocationUtils;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Double;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import sid.u;
import com.yxcorp.plugin.tencent.map.b;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.plugin.tencent.map.c;
import com.yxcorp.plugin.tencent.map.d;

public class e	// class@000950
{
    public g a;
    public long b;
    public final Map c;
    public u d;
    public static final String e = "e";

    public void e(){
       super();
       this.c = new ConcurrentHashMap();
       this.b = SystemClock.elapsedRealtime();
    }
    public final void a(String p0,String p1,e$b p2,boolean p3,int p4,int p5,g p6){
       Iterator iterator1;
       String district;
       String street;
       String streetNo;
       long l1;
       e$d uod;
       e$d uod1;
       s os;
       String str6;
       int i;
       String str8;
       e uoe = this;
       g og = p6;
       Iterator iterator = new HashMap(uoe.c).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry != null) {
             s key = uEntry.getKey();
             p2.a(key);
             e$d value = uEntry.getValue();
             if (value.d != null) {
                e$d a = value.a;
                e$d b = value.b;
                long l = SystemClock.elapsedRealtime() - b;
                e$d e = value.e;
                if (uoe.d != null) {
                   String str = "NULL";
                   String str1 = "NULL";
                   String str2 = b0.c(0, 0);
                   String str3 = "";
                   iterator1 = iterator;
                   if (p4 == 1 && og) {
                      str2 = p6.getProvider();
                      str = "NULL";
                      str1 = p6.getNation();
                      String province = p6.getProvince();
                      String city = p6.getCity();
                      district = p6.getDistrict();
                      String town = p6.getTown();
                      street = p6.getStreet();
                      streetNo = p6.getStreetNo();
                      ArrayList uArrayList = new ArrayList();
                      String str4 = (TextUtils.isEmpty(str1))? str: str1;
                      uArrayList.add(str4);
                      str4 = (TextUtils.isEmpty(province))? str: province;
                      uArrayList.add(str4);
                      str4 = (TextUtils.isEmpty(city))? str: city;
                      uArrayList.add(str4);
                      str4 = (TextUtils.isEmpty(district))? str: district;
                      uArrayList.add(str4);
                      str4 = (TextUtils.isEmpty(town))? str: town;
                      uArrayList.add(str4);
                      str4 = (TextUtils.isEmpty(street))? str: street;
                      uArrayList.add(str4);
                      if (!TextUtils.isEmpty(streetNo)) {
                         str = streetNo;
                      }
                      uArrayList.add(str);
                      str = str2;
                      str4 = str3;
                      l1 = l;
                      str2 = b0.c(p6.getLatitude(), p6.getLongitude());
                      boolean b1 = p6.isEmpty();
                      boolean b2 = TextUtils.x(p6.getProvince());
                      boolean b3 = TextUtils.x(p6.getCity());
                      int b4 = TextUtils.x(p6.getDistrict());
                      boolean b5 = TextUtils.x(p6.getTown());
                      boolean b6 = TextUtils.x(p6.getStreet());
                      boolean b7 = TextUtils.x(p6.getStreetNo());
                      String str5 = TextUtils.join("|", uArrayList);
                      e uoe1 = 4;
                      if (TextUtils.x(p6.getAddress()) && (b2 && (b3 && (b4 && (b5 && (b6 && b7)))))) {
                         str3 = (b1)? 4: 3;
                      }else {
                         str3 = 1;
                      }
                      if (str3 != uoe1) {
                         _monitor_enter(this);
                         uoe1 = uoe.a;
                         _monitor_exit(this);
                         str4 = "";
                         l = SystemClock.elapsedRealtime();
                         str1 = str2;
                         b4 = str3;
                         long l2 = l - uoe.b;
                         if (uoe1 != null) {
                            i3 oi3 = i3.f();
                            streetNo = str;
                            uod = b;
                            uod1 = value;
                            oi3.d("lastLocation", b0.c(uoe1.getLatitude(), uoe1.getLongitude()));
                            os = key;
                            oi3.d("curLocation", b0.c(p6.getLatitude(), p6.getLongitude()));
                            oi3.c("dTime", Long.valueOf(l2));
                            oi3.c("dDistance", Double.valueOf(TencentLocationUtils.distanceBetween(p6.getLatitude(), p6.getLongitude(), uoe1.getLatitude(), uoe1.getLongitude())));
                            str3 = oi3.e();
                         }else {
                            uod1 = value;
                            os = key;
                            streetNo = str;
                            uod = b;
                            str3 = str4;
                         }
                         _monitor_enter(this);
                         uoe.a = og;
                         _monitor_exit(this);
                         uoe.b = l;
                         Log.g(e.e, "monitorLocJump: "+str3);
                      }else {
                         uod1 = value;
                         os = key;
                         str1 = str2;
                         b4 = str3;
                         streetNo = str;
                         uod = b;
                         str3 = str4;
                      }
                      street = str3;
                      str6 = str1;
                      i = b4;
                      district = str5;
                   }else {
                      uod1 = value;
                      os = key;
                      l1 = l;
                      uod = b;
                      street = str3;
                      str6 = str2;
                      streetNo = str;
                      district = str1;
                      str8 = 2;
                   }
                   long l3 = l1;
                   uoe.d.b(p0, p1, a, i, p5, l3, uod, streetNo, district, str6, street, e);
                   StringBuilder str7 = p0+" - LocationNotifier - 定位";
                   str8 = (i == 2)? "失败": " 成功";
                   Log.g(e.e, str7+str8+" | errorCode:"+p5+" | cost: "+l3+" | latLng:"+str6);
                label_026d :
                   if (p3 && uod1.c != null) {
                      uoe.c.remove(os);
                   }
                }
             }
             iterator1 = iterator;
             uod1 = value;
             os = key;
             i = p5;
             goto label_026d ;
          }else {
             iterator1 = iterator;
          }
          iterator = iterator1;
       }
       return;
    }
    public void b(String p0,String p1,int p2,String p3){
       b uob = new b(this, p0, p1, p2, p3);
       k1.o(v6);
    }
    public void c(String p0,String p1,int p2,String p3){
       c uoc = new c(this, p0, p1, p2, p3);
       k1.o(v6);
    }
    public void d(String p0,String p1,g p2){
       k1.o(new d(this, p0, p1, p2));
    }
}
