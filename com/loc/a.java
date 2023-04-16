package com.loc.a;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.loc.a$1;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;
import com.amap.api.location.AMapLocation;
import java.util.List;
import com.amap.api.location.DPoint;
import java.util.Iterator;
import com.amap.api.fence.GeoFence;
import com.loc.fq;
import java.lang.Math;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.PendingIntent;
import android.content.Intent;
import com.loc.l;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import com.loc.c;
import com.loc.fo;
import android.os.Message;
import android.os.Handler;
import com.amap.api.fence.GeoFenceListener;
import java.util.Collection;
import com.loc.b;
import java.lang.Float;
import com.amap.api.location.AMapLocationClient;
import android.os.HandlerThread;
import com.amap.api.location.AMapLocationClientOption;
import android.os.Looper;
import com.loc.a$c;
import com.loc.a$b;
import com.loc.a$a;
import com.amap.api.location.AMapLocationListener;
import org.json.JSONObject;

public final class a	// class@00135e
{
    public fo a;
    public Context b;
    public PendingIntent c;
    public String d;
    public GeoFenceListener e;
    public int f;
    public ArrayList g;
    public a$c h;
    public Object i;
    public Object j;
    public a$a k;
    public a$b l;
    public boolean m;
    public boolean n;
    public boolean o;
    public b p;
    public c q;
    public AMapLocationClient r;
    public AMapLocation s;
    public long t;
    public AMapLocationClientOption u;
    public int v;
    public AMapLocationListener w;
    public final int x;
    public boolean y;
    public Object z;
    public static boolean A;

    public void a(Context p0){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.z = new Object();
       this.f = 1;
       this.g = new ArrayList();
       this.h = null;
       this.i = new Object();
       this.j = new Object();
       this.k = null;
       this.l = null;
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = null;
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = 0;
       this.u = null;
       this.v = 0;
       this.w = new a$1(this);
       this.x = 3;
       this.y = false;
       this.b = p0.getApplicationContext();
       this.j();
    }
    public static float a(AMapLocation p0,List p1){
       float f = Float.MAX_VALUE;
       if (p0 != null && (!p0.getErrorCode() && (p1 != null && !p1.isEmpty()))) {
          DPoint uDPoint = new DPoint(p0.getLatitude(), p0.getLongitude());
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             GeoFence geoFence = iterator.next();
             if (geoFence.isAble()) {
                float f1 = fq.a(uDPoint, geoFence.getCenter());
                if (f1 - geoFence.getMinDis2Center() > 0 && f1 - geoFence.getMaxDis2Center() < 0) {
                   return 0;
                }else if(f1 - geoFence.getMaxDis2Center() > 0){
                   float f2 = f1 - geoFence.getMaxDis2Center();
                   f = Math.min(f, f2);
                }
                if (f1 - geoFence.getMinDis2Center() < 0) {
                   float f3 = geoFence.getMinDis2Center() - f1;
                   f = Math.min(f, f3);
                }
             }
          }
       }
       return f;
    }
    public static float a(DPoint p0,List p1){
       float f = Float.MAX_VALUE;
       if (p0 != null && (p1 != null && !p1.isEmpty())) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             f = Math.min(f, fq.a(p0, iterator.next()));
          }
       }
       return f;
    }
    public static Bundle a(GeoFence p0,String p1,String p2,int p3,int p4){
       Bundle uBundle = new Bundle();
       if (p1 == null) {
          p1 = "";
       }
       uBundle.putString("fenceid", p1);
       uBundle.putString("customId", p2);
       uBundle.putInt("event", p3);
       uBundle.putInt("location_errorcode", p4);
       uBundle.putParcelable("fence", p0);
       return uBundle;
    }
    public static void a(String p0,int p1,String p2,String[] p3){
       "              "+p0+"                ";
       ("errorCode:").concat(String.valueOf(p1));
       ("错误信息:").concat(String.valueOf(p2));
       if (p3.length > 0) {
          int len = p3.length;
          for (p1 = 0; p1 < len; p1++) {
          }
       }
       return;
    }
    public static boolean a(int p0,String p1,String p2,DPoint p3){
       boolean b = false;
       if (TextUtils.isEmpty(p1)) {
          return b;
       }
       if (p0 != 1) {
          if (p0 != 2) {
          label_0073 :
             b = true;
          }else if(p3 == null){
             if (p3.getLatitude() - 0x4056800000000000 <= 0 && (p3.getLatitude() - 0xc056800000000000 >= 0 && (p3.getLongitude() - 0x4066800000000000 > 0 || p3.getLongitude() - 0xc066800000000000 < 0))) {
                String[] stringArray = new String[b];
                a.a("添加围栏失败", b, "经纬度错误，传入的纬度："+p3.getLatitude()+"传入的经度:"+p3.getLongitude(), stringArray);
             }else {
                goto label_0073 ;
             }
          }
       }else if(TextUtils.isEmpty(p2)){
       }
       return b;
    }
    public static boolean a(GeoFence p0,int p1){
       int i = 1;
       boolean i1 = 0;
       if ((p1 & 0x01) == i && p0.getStatus() == i) {
          i1 = 1;
       }
       if ((p1 & 0x02) == 2 && p0.getStatus() == 2) {
          i1 = 1;
       }
       if ((p1 & 4) != 4 || p0.getStatus() != 3) {
          i = i1;
       }
       i1 = i;
       return i1;
    }
    public static boolean a(AMapLocation p0,GeoFence p1){
       Iterator iterator;
       boolean b = true;
       int i = 0;
       if (fq.a(p0) && (p1 != null && (p1.getPointList() != null && !p1.getPointList().isEmpty()))) {
          int type = p1.getType();
          if (type) {
             if (type != b) {
                if (type != 2) {
                   if (type == 3) {
                   }
                }
             }else {
             }
          }
          if (a.a(p0, p1.getCenter(), p1.getRadius())) {
          label_0064 :
             return b;
          }
       }
    label_0059 :
       b = false;
       goto label_0064 ;
    }
    public static boolean a(AMapLocation p0,DPoint p1,float p2){
       double[] uodoubleArra = new double[]{p1.getLatitude(),p1.getLongitude(),p0.getLatitude(),p0.getLongitude()};
       int i = 0;
       if (fq.a(uodoubleArra) - p2 <= 0) {
          i = true;
       }
       return i;
    }
    public static float b(DPoint p0,List p1){
       float f = Float.MIN_VALUE;
       if (p0 != null && (p1 != null && !p1.isEmpty())) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             f = Math.max(f, fq.a(p0, iterator.next()));
          }
       }
       return f;
    }
    public static DPoint b(List p0){
       DPoint uDPoint = new DPoint();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          double d = 0;
          double d1 = d;
          while (iterator.hasNext()) {
             DPoint uDPoint1 = iterator.next();
             d = d + uDPoint1.getLatitude();
             d1 = d1 + uDPoint1.getLongitude();
          }
          uDPoint = new DPoint(fq.b((d / (double)p0.size())), fq.b((d1 / (double)p0.size())));
       }
       return uDPoint;
    }
    public static boolean b(AMapLocation p0,GeoFence p1){
       int i = 1;
       long l = -1;
       if (a.a(p0, p1)) {
          if (!p1.getEnterTime() - l) {
             if (p1.getStatus() != i) {
                p1.setEnterTime(fq.b());
                p1.setStatus(i);
             }else {
             label_004e :
                i = false;
             }
          }else if(p1.getStatus() != 3 && (fq.b() - p1.getEnterTime()) - 0x927c0 > 0){
             p1.setStatus(3);
          }else {
             goto label_004e ;
          }
       }else if(p1.getStatus() != 2){
          p1.setStatus(2);
          p1.setEnterTime(l);
       }else {
          goto label_004e ;
       }
       return i;
    }
    public static boolean b(AMapLocation p0,List p1){
       if (p1.size() < -8556379771757640500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
          return false;
       }
       return fj.a(new DPoint(p0.getLatitude(), p0.getLongitude()), p1);
    }
    public static int d(int p0){
       int i = 0;
       int i1 = 4;
       int i2 = 7;
       if (p0 != 1 && (p0 != i2 && (p0 != i1 && (p0 != 5 && (p0 != 16 && p0 != 17))))) {
          switch (p0){
              case 0x2710:
                p0 = 0;
                break;
              case 0x2711:
              case 0x2717:
              case 0x2718:
              case 0x2719:
              case 0x271c:
              case 0x271d:
              case 0x2712:
                p0 = 7;
                break;
              case 0x2713:
              case 0x2715:
              case 0x2716:
              case 0x271a:
              case 0x271b:
              case 0x271e:
              case 0x271f:
              case 0x2720:
              case 0x2721:
              case 0x2714:
                p0 = 4;
                break;
              default:
                switch (p0){
                    case 0x4e20:
                    case 0x4e22:
                    case 0x4e21:
                      break;
                    default:
                   label_001d :
                      p0 = 8;
                }
                p0 = 1;
          }
       }
    label_0027 :
       if (p0) {
          String[] stringArray = new String[i];
          a.a("添加围栏失败", p0, ("searchErrCode is ").concat(String.valueOf(p0)), stringArray);
       }
       return p0;
    }
    public final int a(List p0){
       if (this.g == null) {
          this.g = new ArrayList();
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       int i = 0;
       return i;
    }
    public final PendingIntent a(String p0){
       a tz = this.z;
       _monitor_enter(tz);
       Intent intent = new Intent(p0);
       intent.setPackage(l.c(this.b));
       int i = 31;
       PendingIntent broadcast = (Build$VERSION.SDK_INT >= i && this.b.getApplicationInfo().targetSdkVersion >= i)? PendingIntent.getBroadcast(this.b, 0, intent, 0x2000000): PendingIntent.getBroadcast(this.b, 0, intent, 0);
       this.c = broadcast;
       this.d = p0;
       a tg = this.g;
       if (tg != null && !tg.isEmpty()) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             GeoFence geoFence = iterator.next();
             geoFence.setPendingIntent(this.c);
             geoFence.setPendingIntentAction(this.d);
          }
       }
       _monitor_exit(tz);
       return this.c;
    }
    public final GeoFence a(Bundle p0,boolean p1){
       GeoFence geoFence = new GeoFence();
       ArrayList uArrayList = new ArrayList();
       DPoint uDPoint = new DPoint();
       if (p1) {
          geoFence.setType(1);
          uArrayList = p0.getParcelableArrayList("pointList");
          if (uArrayList != null) {
             uDPoint = a.b(uArrayList);
          }
          geoFence.setMaxDis2Center(a.b(uDPoint, uArrayList));
          geoFence.setMinDis2Center(a.a(uDPoint, uArrayList));
       }else {
          geoFence.setType(0);
          uDPoint = p0.getParcelable("centerPoint");
          if (uDPoint != null) {
             uArrayList.add(uDPoint);
          }
          float f = 1000.00f;
          float floatx = p0.getFloat("fenceRadius", f);
          if (floatx > 0) {
             f = floatx;
          }
          geoFence.setRadius(f);
          geoFence.setMinDis2Center(f);
          geoFence.setMaxDis2Center(f);
       }
       geoFence.setActivatesAction(this.f);
       geoFence.setCustomId(p0.getString("customId"));
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.add(uArrayList);
       geoFence.setPointList(uArrayList1);
       geoFence.setCenter(uDPoint);
       geoFence.setPendingIntentAction(this.d);
       geoFence.setExpiration(-1);
       geoFence.setPendingIntent(this.c);
       geoFence.setFenceId(c.a());
       a ta = this.a;
       if (ta != null) {
          ta.a(this.b, 2);
       }
       return geoFence;
    }
    public final void a(){
       this.o = false;
       this.a(10, null, 0);
    }
    public final void a(int p0){
       this.j();
       if (p0 > 7 || p0 <= 0) {
          p0 = 1;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("activatesAction", p0);
       this.a(9, uBundle, 0);
       return;
    }
    public final void a(int p0,Bundle p1){
       a tj = this.j;
       _monitor_enter(tj);
       a th = this.h;
       if (th != null) {
          Message message = th.obtainMessage();
          message.what = p0;
          message.setData(p1);
          this.h.sendMessage(message);
       }
       _monitor_exit(tj);
       return;
    }
    public final void a(int p0,Bundle p1,long p2){
       a ti = this.i;
       _monitor_enter(ti);
       a tk = this.k;
       if (tk != null) {
          Message message = tk.obtainMessage();
          message.what = p0;
          message.setData(p1);
          this.k.sendMessageDelayed(message, p2);
       }
       _monitor_exit(ti);
       return;
    }
    public final void a(Bundle p0){
       int i = 1;
       if (p0 != null) {
          i = p0.getInt("activatesAction", i);
       }
       if (this.f != i) {
          a tg = this.g;
          if (tg != null && !tg.isEmpty()) {
             Iterator iterator = this.g.iterator();
             while (iterator.hasNext()) {
                GeoFence geoFence = iterator.next();
                geoFence.setStatus(0);
                geoFence.setEnterTime(-1);
             }
          }
          this.n();
       }
       this.f = i;
       return;
    }
    public final void a(GeoFenceListener p0){
       this.e = p0;
    }
    public final void a(AMapLocation p0){
       if (this.y != null) {
          return;
       }
       a tg = this.g;
       if (tg == null || (!tg.isEmpty() && (p0 != null && !p0.getErrorCode()))) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             GeoFence geoFence = iterator.next();
             if (geoFence.isAble() && (a.b(p0, geoFence) && a.a(geoFence, this.f))) {
                geoFence.setCurrentLocation(p0);
                this.d(geoFence);
             }
          }
       }
       return;
    }
    public final void a(DPoint p0,float p1,String p2){
       this.j();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("centerPoint", p0);
       uBundle.putFloat("fenceRadius", p1);
       uBundle.putString("customId", p2);
       this.a(0, uBundle, 0);
    }
    public final void a(String p0,String p1){
       this.j();
       Bundle uBundle = new Bundle();
       uBundle.putString("keyWords", p0);
       uBundle.putString("customId", p1);
       this.a(4, uBundle, 0);
    }
    public final void a(String p0,String p1,DPoint p2,float p3,int p4,String p5){
       this.j();
       if (p3 <= 0 || p3 - 0x47435000 > 0) {
          p3 = 3000.00f;
       }
       if (p4 <= 0) {
          p4 = 10;
       }
       if (p4 > 25) {
          p4 = 25;
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("keyWords", p0);
       uBundle.putString("poiType", p1);
       uBundle.putParcelable("centerPoint", p2);
       uBundle.putFloat("aroundRadius", p3);
       uBundle.putInt("searchSize", p4);
       uBundle.putString("customId", p5);
       this.a(3, uBundle, 0);
       return;
    }
    public final void a(String p0,String p1,String p2,int p3,String p4){
       this.j();
       if (p3 <= 0) {
          p3 = 10;
       }
       if (p3 > 25) {
          p3 = 25;
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("keyWords", p0);
       uBundle.putString("poiType", p1);
       uBundle.putString("city", p2);
       uBundle.putInt("searchSize", p3);
       uBundle.putString("customId", p4);
       this.a(2, uBundle, 0);
       return;
    }
    public final void a(String p0,boolean p1){
       this.j();
       Bundle uBundle = new Bundle();
       uBundle.putString("fid", p0);
       uBundle.putBoolean("ab", p1);
       this.a(12, uBundle, 0);
    }
    public final void a(List p0,String p1){
       this.j();
       Bundle uBundle = new Bundle();
       uBundle.putParcelableArrayList("pointList", new ArrayList(p0));
       uBundle.putString("customId", p1);
       this.a(1, uBundle, 0);
    }
    public final boolean a(GeoFence p0){
       a tg = this.g;
       if (tg == null || tg.isEmpty()) {
          this.o = false;
          this.a(10, null, 0);
          return true;
       }else if(this.g.contains(p0)){
          if (this.g.size() == 1) {
             this.o = false;
          }
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("fc", p0);
          this.a(11, uBundle, 0);
          return true;
       }else {
          return false;
       }
    }
    public final List b(){
       if (this.g == null) {
          this.g = new ArrayList();
       }
       return this.g.clone();
    }
    public final void b(int p0){
       a ti = this.i;
       _monitor_enter(ti);
       a tk = this.k;
       if (tk != null) {
          tk.removeMessages(p0);
       }
       _monitor_exit(ti);
       return;
    }
    public final void b(int p0,Bundle p1){
       String str6;
       String str7;
       int i1;
       String str8;
       a uoa = this;
       int i = p0;
       Bundle uBundle = p1;
       String str = "customId";
       String str1 = "errorCode";
       Bundle uBundle1 = new Bundle();
       ArrayList uArrayList = new ArrayList();
       if (uBundle && !p1.isEmpty()) {
          ArrayList uArrayList1 = new ArrayList();
          String str2 = uBundle.getString(str);
          String str3 = uBundle.getString("keyWords");
          String str4 = uBundle.getString("city");
          String str5 = uBundle.getString("poiType");
          DPoint parcelable = uBundle.getParcelable("centerPoint");
          int intx = uBundle.getInt("searchSize", 10);
          float floatx = uBundle.getFloat("aroundRadius", 3000.00f);
          if (a.a(i, str3, str5, parcelable)) {
             Bundle uBundle2 = new Bundle();
             uBundle2.putString(str, str2);
             uBundle2.putString("pendingIntentAction", uoa.d);
             str6 = str;
             str7 = str1;
             uBundle2.putLong("expiration", -1);
             uBundle2.putInt("activatesAction", uoa.f);
             str = "fenceRadius";
             i1 = 2;
             if (i != 1) {
                if (i != i1) {
                   str8 = (i != 3)? null: uoa.p.a(uoa.b, "http://restsdk.amap.com/v3/config/district?", str3);
                }else {
                   uBundle2.putFloat(str, 200.00f);
                   str8 = uoa.p.a(uoa.b, "http://restsdk.amap.com/v3/place/around?", str3, str5, String.valueOf(intx), String.valueOf(fq.b(parcelable.getLatitude())), String.valueOf(fq.b(parcelable.getLongitude())), String.valueOf(Float.valueOf(floatx).intValue()));
                }
             }else {
                uBundle2.putFloat(str, 1000.00f);
                str8 = uoa.p.a(uoa.b, "http://restsdk.amap.com/v3/place/text?", str3, str5, str4, String.valueOf(intx));
             }
             if (str8 != null) {
                int i2 = (1 == i)? c.a(str8, uArrayList1, uBundle2): 0;
                if (i1 == i) {
                   i2 = c.b(str8, uArrayList1, uBundle2);
                }
                if (3 == i) {
                   i2 = uoa.q.c(str8, uArrayList1, uBundle2);
                }
                if (i2 == 0x2710) {
                   if (uArrayList1.isEmpty()) {
                      intx = 16;
                   }else {
                      intx = uoa.a(uArrayList1);
                      if (!intx) {
                         uArrayList.addAll(uArrayList1);
                      }
                   }
                }else {
                   intx = a.d(i2);
                }
             }else {
                intx = 4;
             }
          }else {
             str6 = str;
             str7 = str1;
             intx = 1;
          }
          uBundle1.putString(str6, str2);
          uBundle1.putParcelableArrayList("resultList", uArrayList);
          i1 = intx;
          str8 = str7;
       }else {
          str8 = str1;
          i1 = 1;
       }
       uBundle1.putInt(str8, i1);
       uoa.a(1000, uBundle1);
       return;
    }
    public final void b(Bundle p0){
       String str1;
       ArrayList uArrayList = new ArrayList();
       String str = "";
       int i = 1;
       if (p0 != null && !p0.isEmpty()) {
          DPoint parcelable = p0.getParcelable("centerPoint");
          str1 = p0.getString("customId");
          if (parcelable != null) {
             if (parcelable.getLatitude() - 0x4056800000000000 <= 0 && (parcelable.getLatitude() - 0xc056800000000000 >= 0 && (parcelable.getLongitude() - 0x4066800000000000 > 0 || parcelable.getLongitude() - 0xc066800000000000 < 0))) {
                String[] stringArray = new String[0];
                a.a("添加围栏失败", i, "经纬度错误，传入的纬度："+parcelable.getLatitude()+"传入的经度:"+parcelable.getLongitude(), stringArray);
             }else {
                GeoFence geoFence = this.a(p0, 0);
                i = this.c(geoFence);
                if (!i) {
                   uArrayList.add(geoFence);
                }
             }
          }else {
             str = str1;
          label_008b :
             str1 = str;
          }
       }else {
          goto label_008b ;
       }
       p0 = new Bundle();
       p0.putInt("errorCode", i);
       p0.putParcelableArrayList("resultList", uArrayList);
       p0.putString("customId", str1);
       this.a(1000, p0);
       return;
    }
    public final void b(GeoFence p0){
       PendingIntent pendingInten;
       a tz = this.z;
       _monitor_enter(tz);
       if (this.b != null) {
          if (this.c == null && p0.getPendingIntent() == null) {
             _monitor_exit(tz);
             return;
          }else {
             Intent intent = new Intent();
             intent.putExtras(a.a(p0, p0.getFenceId(), p0.getCustomId(), p0.getStatus(), 0));
             a td = this.d;
             if (td != null) {
                intent.setAction(td);
             }
             intent.setPackage(l.c(this.b));
             if (p0.getPendingIntent() != null) {
                pendingInten = p0.getPendingIntent();
                td = this.b;
             }else {
                pendingInten = this.c;
                td = this.b;
             }
             pendingInten.send(td, 0, intent);
          }
       }
       _monitor_exit(tz);
       return;
    }
    public final int c(GeoFence p0){
       int i;
       if (this.g == null) {
          this.g = new ArrayList();
       }
       if (!this.g.contains(p0)) {
          this.g.add(p0);
          i = 0;
       }else {
          i = 17;
       }
       return i;
    }
    public final void c(){
       if (this.n == null) {
          return;
       }
       a tg = this.g;
       ArrayList uArrayList = null;
       if (tg != null) {
          tg.clear();
          this.g = uArrayList;
       }
       if (this.o != null) {
          return;
       }else {
          this.m();
          tg = this.r;
          if (tg != null) {
             tg.stopLocation();
             this.r.onDestroy();
          }
          this.r = uArrayList;
          tg = this.l;
          if (tg != null) {
             tg.quitSafely();
          }
          this.l = uArrayList;
          this.p = uArrayList;
          tg = this.z;
          _monitor_enter(tg);
          a tc = this.c;
          if (tc != null) {
             tc.cancel();
          }
          this.c = uArrayList;
          _monitor_exit(tg);
          this.l();
          tg = this.a;
          if (tg != null) {
             tg.b(this.b);
          }
          this.m = false;
          this.n = false;
          return;
       }
    }
    public final void c(int p0){
       if (this.b == null) {
          return;
       }
       a tz = this.z;
       _monitor_enter(tz);
       if (this.c == null) {
          _monitor_exit(tz);
          return;
       }else {
          Intent intent = new Intent();
          intent.putExtras(a.a(null, null, null, 4, p0));
          this.c.send(this.b, 0, intent);
          _monitor_exit(tz);
          return;
       }
    }
    public final void c(Bundle p0){
       ArrayList uArrayList = new ArrayList();
       String str = "";
       int i = 1;
       if (p0 != null && !p0.isEmpty()) {
          ArrayList parcelableAr = p0.getParcelableArrayList("pointList");
          String str1 = p0.getString("customId");
          if (parcelableAr != null && parcelableAr.size() > 2) {
             GeoFence geoFence = this.a(p0, i);
             i = this.c(geoFence);
             if (!i) {
                uArrayList.add(geoFence);
             }
          }
          str = str1;
       }
       p0 = new Bundle();
       p0.putString("customId", str);
       p0.putInt("errorCode", i);
       p0.putParcelableArrayList("resultList", uArrayList);
       this.a(1000, p0);
       return;
    }
    public final void d(){
       if (this.r != null) {
          this.o();
          this.u.setOnceLocation(true);
          this.r.setLocationOption(this.u);
          this.r.startLocation();
       }
       return;
    }
    public final void d(Bundle p0){
       this.b(2, p0);
    }
    public final void d(GeoFence p0){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("geoFence", p0);
       this.a(1001, uBundle);
    }
    public final void e(){
       if (this.y != null) {
          return;
       }
       if (!fq.a(this.s)) {
          return;
       }
       float f = a.a(this.s, this.g);
       if (!f - Float.MAX_VALUE) {
          return;
       }
       String str = 0x447a0000;
       int i = 7;
       if (f - str < 0) {
          this.b(i);
          Bundle uBundle = new Bundle();
          uBundle.putLong("interval", 2000);
          this.a(8, uBundle, 500);
          return;
       }else if(f - 0x459c4000 < 0){
          this.o();
          this.b(i);
          this.a(i, null, 0x2710);
          return;
       }else {
          this.o();
          this.b(i);
          this.a(i, null, (long)(((f - 4000.00f) / 100.00f) * str));
          return;
       }
    }
    public final void e(Bundle p0){
       this.b(1, p0);
    }
    public final void f(){
       this.j();
       this.y = true;
       this.a(13, null, 0);
    }
    public final void f(Bundle p0){
       this.b(3, p0);
    }
    public final void g(){
       this.b(7);
       this.b(8);
       a tr = this.r;
       if (tr != null) {
          tr.stopLocation();
       }
       this.m = false;
       return;
    }
    public final void g(Bundle p0){
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       String str = p0.getString("fid");
       if (TextUtils.isEmpty(str)) {
          return;
       }
       boolean booleanx = p0.getBoolean("ab", true);
       a tg = this.g;
       if (tg != null && !tg.isEmpty()) {
          Iterator iterator = this.g.iterator();
          while (true) {
             if (iterator.hasNext()) {
                GeoFence geoFence = iterator.next();
                if ((geoFence.getFenceId()).equals(str)) {
                   geoFence.setAble(booleanx);
                }
             }
          }
       }
       if (!booleanx) {
          if (this.k()) {
             this.g();
             return;
          }
       }else {
          this.n();
       }
       return;
    }
    public final void h(){
       this.j();
       if (this.y != null) {
          this.y = false;
          this.n();
       }
       return;
    }
    public final void h(Bundle p0){
       if (this.g != null) {
          GeoFence parcelable = p0.getParcelable("fc");
          if (this.g.contains(parcelable)) {
             this.g.remove(parcelable);
          }
          if (this.g.size() <= 0) {
             this.c();
             return;
          }else {
             this.n();
          }
       }
       return;
    }
    public final void i(Bundle p0){
       if (p0 != null && !p0.isEmpty()) {
          int intx = p0.getInt("errorCode");
          ArrayList parcelableAr = p0.getParcelableArrayList("resultList");
          if (parcelableAr == null) {
             parcelableAr = new ArrayList();
          }
          String str = p0.getString("customId");
          if (str == null) {
             str = "";
          }
          a te = this.e;
          if (te != null) {
             te.onGeoFenceCreateFinished(parcelableAr.clone(), intx, str);
          }
          if (!intx) {
             this.n();
          }
       }
    label_0040 :
       return;
    }
    public final boolean i(){
       return this.y;
    }
    public final void j(){
       a$c uoc;
       boolean b = true;
       if (this.o == null) {
          this.o = b;
       }
       if (this.n != null) {
          return;
       }else if(Looper.myLooper() == null){
          uoc = new a$c(this, this.b.getMainLooper());
       }else {
          uoc = new a$c(this);
       }
       this.h = uoc;
       a$b uob = new a$b("fenceActionThread");
       this.l = uob;
       uob.setPriority(5);
       this.l.start();
       this.k = new a$a(this, this.l.getLooper());
       this.p = new b(this.b);
       this.q = new c();
       this.u = new AMapLocationClientOption();
       this.r = new AMapLocationClient(this.b);
       this.u.setLocationCacheEnable(b);
       this.u.setNeedAddress(false);
       this.r.setLocationListener(this.w);
       if (this.a == null) {
          this.a = new fo();
       }
       this.n = b;
       a td = this.d;
       if (td != null && this.c == null) {
          this.a(td);
       }
    label_00ac :
       if (!a.A) {
          a.A = b;
          fo.a(this.b, "O020", null);
       }
       return;
    }
    public final void j(Bundle p0){
       if (this.r != null) {
          long l = 2000;
          if (p0 != null && !p0.isEmpty()) {
             l = p0.getLong("interval", l);
          }
          this.u.setOnceLocation(false);
          this.u.setInterval(l);
          this.r.setLocationOption(this.u);
          if (this.m == null) {
             this.r.stopLocation();
             this.r.startLocation();
             this.m = true;
          }
       }
       return;
    }
    public final boolean k(){
       a tg = this.g;
       boolean b = true;
       if (tg != null && !tg.isEmpty()) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isAble()) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final void l(){
       a tj = this.j;
       _monitor_enter(tj);
       a th = this.h;
       if (th != null) {
          th.removeCallbacksAndMessages(null);
       }
       this.h = null;
       _monitor_exit(tj);
       return;
    }
    public final void m(){
       a ti = this.i;
       _monitor_enter(ti);
       a tk = this.k;
       if (tk != null) {
          tk.removeCallbacksAndMessages(null);
       }
       this.k = null;
       _monitor_exit(ti);
       return;
    }
    public final void n(){
       if (this.y != null) {
          return;
       }
       if (this.k != null) {
          if (this.p()) {
             this.a(6, null, 0);
             this.a(5, null, 0);
             return;
          }else {
             this.b(7);
             this.a(7, null, 0);
          }
       }
       return;
    }
    public final void o(){
       if (this.m != null) {
          this.b(8);
       }
       a tr = this.r;
       if (tr != null) {
          tr.stopLocation();
       }
       this.m = false;
       return;
    }
    public final boolean p(){
       boolean b = (this.s != null && (fq.a(this.s) && (fq.b() - this.t) - 0x2710 < 0))? true: false;
       return b;
    }
}
