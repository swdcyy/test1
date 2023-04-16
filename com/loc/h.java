package com.loc.h;
import java.lang.Object;
import android.content.Context;
import android.os.Handler;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import java.lang.String;
import android.location.LocationManager;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.en;
import android.location.GpsStatus;
import android.location.GnssStatus;
import android.location.Location;
import java.util.List;
import com.amap.api.location.AMapLocation;
import com.loc.fq;
import com.loc.fi;
import java.lang.System;
import com.loc.fk;
import com.loc.fo;
import com.loc.x;
import java.lang.Class;
import com.loc.fm;
import java.lang.Boolean;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.location.LocationListener;
import com.loc.h$a;
import android.location.GpsStatus$Listener;
import android.location.GnssStatus$Callback;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import android.os.Message;
import android.os.Build$VERSION;
import android.os.Bundle;
import java.lang.ClassLoader;
import android.os.Parcelable;
import com.loc.fp;
import java.util.ArrayList;
import java.lang.Enum;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import com.amap.api.location.DPoint;
import com.loc.fl;
import android.os.Looper;
import android.content.SharedPreferences$Editor;
import java.lang.Exception;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import com.loc.h$1;
import com.loc.h$2;
import java.lang.StringBuilder;
import java.lang.SecurityException;
import java.lang.Iterable;
import java.util.Iterator;
import android.location.GpsSatellite;
import org.json.JSONObject;
import java.lang.Float;

public final class h	// class@001442
{
    public long A;
    public int B;
    public int C;
    public GpsStatus D;
    public GpsStatus$Listener E;
    public GnssStatus$Callback F;
    public String G;
    public boolean H;
    public int I;
    public boolean J;
    public Handler a;
    public LocationManager b;
    public AMapLocationClientOption c;
    public long d;
    public boolean e;
    public en f;
    public int g;
    public int h;
    public AMapLocation i;
    public long m;
    public float n;
    public Object o;
    public Object p;
    public AMapLocationClientOption$GeoLanguage r;
    public boolean s;
    public long v;
    public int w;
    public LocationListener x;
    public Context z;
    public static AMapLocation j;
    public static long k;
    public static Object l;
    public static long q;
    public static boolean t;
    public static boolean u;
    public static AMapLocation y;

    static {
       h.l = new Object();
    }
    public void h(Context p0,Handler p1){
       super();
       this.A = 0;
       this.d = 0;
       this.e = false;
       this.B = 0;
       this.f = null;
       this.g = 240;
       this.h = 80;
       this.i = null;
       this.m = 0;
       this.n = 0;
       this.o = new Object();
       this.p = new Object();
       this.C = 0;
       this.D = null;
       this.E = null;
       this.r = AMapLocationClientOption$GeoLanguage.DEFAULT;
       this.s = true;
       this.v = 0;
       this.w = 0;
       this.x = null;
       this.G = null;
       this.H = false;
       this.I = 0;
       this.J = false;
       this.z = p0;
       this.a = p1;
       this.b = p0.getSystemService("location");
       this.f = new en();
       return;
    }
    public static GpsStatus a(h p0,GpsStatus p1){
       p0.D = p1;
       return p1;
    }
    public static void a(h p0){
       p0.k();
    }
    public static void a(h p0,int p1){
       p0.a(p1);
    }
    public static void a(h p0,GnssStatus p1){
       p0.a(p1);
    }
    public static void a(h p0,Location p1){
       p0.a(p1);
    }
    public static void a(h p0,String p1){
       p0.a(p1);
    }
    public static boolean a(LocationManager p0){
       if (h.t) {
          return h.u;
       }
       List allProviders = p0.getAllProviders();
       h.u = (allProviders != null && allProviders.size() > 0)? allProviders.contains("gps"): false;
       h.t = true;
       return h.u;
    }
    public static GpsStatus b(h p0){
       return p0.D;
    }
    public static void c(h p0){
       p0.m();
    }
    public static void g(){
       h.j();
    }
    public static void h(){
       h.l();
    }
    public static void h(AMapLocation p0){
       if (!fq.a(p0)) {
          return;
       }
       if (fi.r()) {
          long time = p0.getTime();
          long l = System.currentTimeMillis();
          long l1 = fk.a(time, l, fi.s());
          if (l1 - time) {
             p0.setTime(l1);
             fo.a(time, l);
          }
       }
       return;
    }
    public static void j(){
    }
    public static void l(){
    }
    public static boolean o(){
       boolean b = fm.a(x.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), x.c("UaXNOYXZpU3RhcnRlZA=="), null, null).booleanValue();
       return b;
    }
    public final AMapLocation a(AMapLocation p0,String p1){
       long l;
       int i;
       AMapLocation uAMapLocatio1;
       h oh = this;
       String str = p1;
       if (oh.i == null) {
          return p0;
       }
       if (!oh.c.isMockEnable() && oh.i.isMock()) {
          return p0;
       }
       if (!fq.a(oh.i)) {
          return p0;
       }
       AMapLocation uAMapLocatio = this.p();
       if (uAMapLocatio != null && fq.a(uAMapLocatio)) {
          uAMapLocatio.setTrustedLevel(2);
          return uAMapLocatio;
       }else {
          float speed = oh.i.getSpeed();
          if (!speed) {
             h m = oh.m;
             if (m > 0 && m - 8 < 0) {
                h n = oh.n;
                if (n > 0) {
                   speed = n / (float)m;
                }
             }
          }
          if (p0 != null && fq.a(p0)) {
             l = 0x40a00000;
             if (p0.getAccuracy() - 0x43480000 < 0) {
                i = oh.I + 1;
                oh.I = i;
                if (oh.G == null && i >= 2) {
                   oh.H = true;
                }
                if (speed - l > 0) {
                   i = 0x2710;
                }else {
                   i = 0x3a98;
                }
             }else if(!TextUtils.isEmpty(oh.G)){
                oh.H = false;
                oh.I = 0;
             }
             if (speed - l > 0) {
                i = 0x4e20;
             }else {
             label_0098 :
                i = 0x7530;
             }
          }else {
             goto label_0098 ;
          }
          l = fq.b() - oh.d;
          if (l - 0x7530 > 0) {
             return p0;
          }else if(l - i >= 0){
             if (oh.H != null && oh.b(str)) {
                uAMapLocatio1 = oh.i.clone();
                uAMapLocatio1.setTrustedLevel(3);
                return uAMapLocatio1;
             }else {
                oh.G = null;
                oh.I = 0;
                h p = oh.p;
                _monitor_enter(p);
                oh.i = null;
                _monitor_exit(p);
                oh.m = 0;
                oh.n = 0;
                return p0;
             }
          }else if(oh.G == null && oh.I >= 2){
             oh.G = str;
          }
          uAMapLocatio1 = oh.i.clone();
          uAMapLocatio1.setTrustedLevel(2);
          return uAMapLocatio1;
       }
    }
    public final void a(){
       h tb = this.b;
       if (tb == null) {
          return;
       }
       h tx = this.x;
       if (tx != null) {
          tb.removeUpdates(tx);
          this.x.a();
          this.x = null;
       }
       tb = this.E;
       if (tb != null) {
          this.b.removeGpsStatusListener(tb);
       }
       tb = this.F;
       if (tb != null) {
          this.b.unregisterGnssStatusCallback(tb);
       }
       tb = this.a;
       if (tb != null) {
          tb.removeMessages(8);
       }
       this.C = 0;
       this.A = 0;
       this.v = 0;
       this.d = 0;
       this.B = 0;
       this.w = 0;
       this.f.a();
       this.i = null;
       this.m = 0;
       this.n = 0;
       this.G = null;
       this.J = false;
       return;
    }
    public final void a(int p0){
       if (!p0) {
          this.d = 0;
          this.C = 0;
       }
       return;
    }
    public final void a(int p0,int p1,String p2,long p3){
       if (this.a != null && this.c.getLocationMode() == AMapLocationClientOption$AMapLocationMode.Device_Sensors) {
          Message message = Message.obtain();
          AMapLocation uAMapLocatio = new AMapLocation("");
          uAMapLocatio.setProvider("gps");
          uAMapLocatio.setErrorCode(p1);
          uAMapLocatio.setLocationDetail(p2);
          uAMapLocatio.setLocationType(1);
          message.obj = uAMapLocatio;
          message.what = p0;
          this.a.sendMessageDelayed(message, p3);
       }
       return;
    }
    public final void a(GnssStatus p0){
       int i = 0;
       if (p0 != null && Build$VERSION.SDK_INT >= 24) {
          int satelliteCou = p0.getSatelliteCount();
          int i1 = 0;
          while (i < satelliteCou) {
             if (p0.usedInFix(i)) {
                i1 = i1 + 1;
             }
             i = i + 1;
          }
          i = i1;
       }
    label_0028 :
       this.C = i;
       return;
    }
    public final void a(Location p0){
       h tw;
       h ta = this.a;
       if (ta != null) {
          ta.removeMessages(8);
       }
       if (p0 == null) {
          return;
       }else {
          AMapLocation uAMapLocatio = new AMapLocation(p0);
          if (!fq.a(uAMapLocatio)) {
             return;
          }else {
             uAMapLocatio.setProvider("gps");
             int i = 1;
             uAMapLocatio.setLocationType(i);
             if (this.e == null && fq.a(uAMapLocatio)) {
                fo.a(this.z, (fq.b() - this.A), fj.a(uAMapLocatio.getLatitude(), uAMapLocatio.getLongitude()));
                this.e = i;
             }
             if (fq.a(uAMapLocatio, this.C)) {
                uAMapLocatio.setMock(i);
                uAMapLocatio.setTrustedLevel(4);
                if (!this.c.isMockEnable()) {
                   tw = this.w;
                   if (tw > 3) {
                      fo.a(null, 2152);
                      uAMapLocatio.setErrorCode(15);
                      uAMapLocatio.setLocationDetail("GpsLocation has been mocked!#1501");
                      uAMapLocatio.setLatitude(0);
                      uAMapLocatio.setLongitude(0);
                      uAMapLocatio.setAltitude(0);
                      uAMapLocatio.setSpeed(0);
                      uAMapLocatio.setAccuracy(0);
                      uAMapLocatio.setBearing(0);
                      uAMapLocatio.setExtras(null);
                      this.c(uAMapLocatio);
                      return;
                   }else {
                      this.w = tw + i;
                      return;
                   }
                }
             }else {
                this.w = 0;
             }
             uAMapLocatio.setSatellites(this.C);
             this.e(uAMapLocatio);
             this.f(uAMapLocatio);
             h.h(uAMapLocatio);
             uAMapLocatio = this.g(uAMapLocatio);
             this.a(uAMapLocatio);
             this.b(uAMapLocatio);
             h to = this.o;
             _monitor_enter(to);
             this.a(uAMapLocatio, h.y);
             _monitor_exit(to);
             if (fq.a(uAMapLocatio)) {
                if (this.i != null) {
                   this.m = p0.getTime() - this.i.getTime();
                   this.n = fq.a(this.i, uAMapLocatio);
                }
                tw = this.p;
                _monitor_enter(tw);
                this.i = uAMapLocatio.clone();
                _monitor_exit(tw);
                this.G = null;
                this.H = false;
                this.I = 0;
             }
             this.c(uAMapLocatio);
             return;
          }
       }
    }
    public final void a(Bundle p0){
       if (p0 != null) {
          p0.setClassLoader(AMapLocation.class.getClassLoader());
          this.g = p0.getInt("I_MAX_GEO_DIS");
          this.h = p0.getInt("I_MIN_GEO_DIS");
          AMapLocation parcelable = p0.getParcelable("loc");
          if (!TextUtils.isEmpty(parcelable.getAdCode())) {
             h to = this.o;
             _monitor_enter(to);
             h.y = parcelable;
             _monitor_exit(to);
             return;
          }
       }
       return;
    }
    public final void a(AMapLocation p0){
       if (!fq.a(p0)) {
          return;
       }
       this.d = fq.b();
       Object l = h.l;
       _monitor_enter(l);
       h.k = fq.b();
       h.j = p0.clone();
       _monitor_exit(l);
       this.B = this.B + 1;
       return;
    }
    public final void a(AMapLocation p0,AMapLocation p1){
       if (p1 != null && (this.c.isNeedAddress() && fq.a(p0, p1) - (float)this.g < 0)) {
          fj.a(p0, p1);
       }
    label_0018 :
       return;
    }
    public final void a(AMapLocationClientOption p0){
       this.c = p0;
       if (p0 == null) {
          this.c = new AMapLocationClientOption();
       }
       h.q = fp.a(this.z, "pref", "lagt", h.q);
       this.i();
       return;
    }
    public final void a(String p0){
       if (("gps").equalsIgnoreCase(p0)) {
          this.d = 0;
          this.C = 0;
       }
       return;
    }
    public final void b(AMapLocation p0){
       h ta;
       if (!fq.a(p0)) {
          return;
       }
       if (this.a != null) {
          long l = fq.b();
          long l1 = 8000;
          if (this.c.getInterval() - l1 <= 0 || (l - this.v) - (this.c.getInterval() - l1) > 0) {
             Bundle uBundle = new Bundle();
             uBundle.putDouble("lat", p0.getLatitude());
             uBundle.putDouble("lon", p0.getLongitude());
             uBundle.putFloat("radius", p0.getAccuracy());
             uBundle.putLong("time", p0.getTime());
             Message message = Message.obtain();
             message.setData(uBundle);
             message.what = 5;
             h to = this.o;
             _monitor_enter(to);
             if (h.y == null) {
                ta = this.a;
             }else if(fq.a(p0, h.y) - (float)this.h > 0){
                ta = this.a;
             }else {
             label_0079 :
                _monitor_exit(to);
                return;
             }
             ta.sendMessage(message);
             goto label_0079 ;
          }
       }
       return;
    }
    public final void b(AMapLocationClientOption p0){
       h ta;
       if (p0 == null) {
          p0 = new AMapLocationClientOption();
       }
       this.c = p0;
       if (p0.getLocationMode() != AMapLocationClientOption$AMapLocationMode.Device_Sensors) {
          ta = this.a;
          if (ta != null) {
             ta.removeMessages(8);
          }
       }
       if (this.r != this.c.getGeoLanguage()) {
          ta = this.o;
          _monitor_enter(ta);
          h.y = null;
          _monitor_exit(ta);
       }
       this.r = this.c.getGeoLanguage();
       return;
    }
    public final boolean b(){
       if ((fq.b() - this.d) - 2800 > 0) {
          return false;
       }
       return true;
    }
    public final boolean b(String p0){
       boolean b = false;
       ArrayList uArrayList = fq.b(this.G);
       if (fq.b(p0).size() >= 8 && uArrayList.size() >= 8) {
          b = fq.a(this.G, p0);
       }
       return b;
    }
    public final void c(){
       this.w = 0;
    }
    public final void c(AMapLocation p0){
       if (p0.getErrorCode() == 15 && !AMapLocationClientOption$AMapLocationMode.Device_Sensors.equals(this.c.getLocationMode())) {
          return;
       }
       if (this.c.getLocationMode().equals(AMapLocationClientOption$AMapLocationMode.Device_Sensors) && this.c.getDeviceModeDistanceFilter() > 0) {
          this.d(p0);
          return;
       }else if((fq.b() - this.v) - (this.c.getInterval() - 200) >= 0){
          this.v = fq.b();
          this.d(p0);
       }
       return;
    }
    public final int d(){
       h tb = this.b;
       int i = 1;
       if (tb == null) {
          return i;
       }
       if (!h.a(tb)) {
          return i;
       }
       int intx = Settings$Secure.getInt(this.z.getContentResolver(), "location_mode", 0);
       if (!intx) {
          return 2;
       }
       if (intx == 2) {
          return 3;
       }
       if (this.s == null) {
          return 4;
       }
       return 0;
    }
    public final void d(AMapLocation p0){
       if (this.a != null) {
          Message message = Message.obtain();
          message.obj = p0;
          message.what = 2;
          this.a.sendMessage(message);
       }
       return;
    }
    public final int e(){
       return this.C;
    }
    public final void e(AMapLocation p0){
       if (fj.a(p0.getLatitude(), p0.getLongitude()) && this.c.isOffset()) {
          DPoint uDPoint = fl.a(this.z, new DPoint(p0.getLatitude(), p0.getLongitude()));
          p0.setLatitude(uDPoint.getLatitude());
          p0.setLongitude(uDPoint.getLongitude());
          p0.setOffset(this.c.isOffset());
          p0.setCoordType("GCJ02");
          return;
       }else {
          p0.setOffset(false);
          p0.setCoordType("WGS84");
          return;
       }
    }
    public final void f(AMapLocation p0){
       h tC = this.C;
       if (tC >= 4) {
          p0.setGpsAccuracyStatus(1);
          return;
       }else if(tC == null){
          p0.setGpsAccuracyStatus(-1);
          return;
       }else {
          p0.setGpsAccuracyStatus(0);
          return;
       }
    }
    public final boolean f(){
       h tc = this.c;
       if (tc == null || (!tc.isOnceLocation() && (fq.b() - this.d) - 0x493e0 > 0)) {
          return true;
       }
       return false;
    }
    public final AMapLocation g(AMapLocation p0){
       if (!fq.a(p0)) {
          return p0;
       }
       if (this.B < 3) {
          return p0;
       }
       if (p0.getAccuracy() < 0 || !p0.getAccuracy() - Float.MAX_VALUE) {
          p0.setAccuracy(0);
       }
       if (p0.getSpeed() < 0 || !p0.getSpeed() - Float.MAX_VALUE) {
          p0.setSpeed(0);
       }
       return this.f.a(p0);
    }
    public final void i(){
       if (this.b == null) {
          return;
       }
       String str = null;
       try{
          this.n();
          this.s = true;
          Looper looper = Looper.myLooper();
          if (looper == null) {
             looper = this.z.getMainLooper();
          }
          Looper looper1 = looper;
          this.A = fq.b();
          if (h.a(this.b)) {
             if ((fq.a() - h.q) - 0xf731400 >= 0) {
                if (fq.c(this.z, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                   this.b.sendExtraCommand("gps", "force_xtra_injection", str);
                   h.q = fq.a();
                   SharedPreferences$Editor uEditor = fp.a(this.z, "pref");
                   fp.a(uEditor, "lagt", h.q);
                   fp.a(uEditor);
                }else {
                   fj.a(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                }
             }
             if (this.x == null) {
                this.x = new h$a(this);
             }
             LocationInterceptor.requestLocationUpdates(this.b, "gps", this.c.getInterval(), this.c.getDeviceModeDistanceFilter(), this.x, looper1);
             if (Build$VERSION.SDK_INT >= 24) {
                h$1 u1 = new h$1(this);
                this.F = u1;
                this.b.registerGnssStatusCallback(u1);
             }else {
                h$2 u2 = new h$2(this);
                this.E = u2;
                this.b.addGpsStatusListener(u2);
             }
             this.a(8, 14, "no enough satellites#1401", this.c.getHttpTimeOut());
             return;
          }else {
             this.a(8, 14, "no gps provider#1402", 0);
             return;
          }
       }catch(java.lang.SecurityException e1){
          this.s = false;
          fo.a(str, 2121);
          this.a(2, 12, e1.getMessage()+"#1201", 0);
          return;
       }
    }
    public final void k(){
       this.C = 0;
    }
    public final void m(){
       int i = 0;
       h tD = this.D;
       if (tD != null) {
          Iterable satellites = tD.getSatellites();
          if (satellites != null) {
             Iterator iterator = satellites.iterator();
             int maxSatellite = this.D.getMaxSatellites();
             while (iterator.hasNext() && i < maxSatellite) {
                if (iterator.next().usedInFix()) {
                   i = i + 1;
                }
             }
          }
       }
       this.C = i;
       return;
    }
    public final void n(){
       if ((fq.b() - h.k) - 5000 <= 0 && fq.a(h.j)) {
          if (!this.c.isMockEnable() && h.j.isMock()) {
             return;
          }else {
             this.d = fq.b();
             this.c(h.j);
          }
       }
       return;
    }
    public final AMapLocation p(){
       float f;
       float f1;
       if (!fq.a(this.i)) {
          return null;
       }
       if (!fi.j()) {
          return null;
       }
       if (h.o()) {
          JSONObject jSONObject = new JSONObject(fm.a(x.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), x.c("UZ2V0TmF2aUxvY2F0aW9u"), null, null));
          long l = jSONObject.optLong("time");
          if (this.J == null) {
             this.J = true;
             fo.a("useNaviLoc", "use NaviLoc");
          }
          if ((fq.a() - l) - -8308146668154592000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f <= 0) {
             double d = 0;
             double d1 = jSONObject.optDouble("lat", d);
             double d2 = jSONObject.optDouble("lng", d);
             try{
                int i = 0;
                f = Float.parseFloat(jSONObject.optString("accuracy", "0"));
             }catch(java.lang.NumberFormatException e0){
                f = 0;
             }
             d = jSONObject.optDouble("altitude", d);
             try{
                f1 = Float.parseFloat(jSONObject.optString("bearing", "0"));
             }catch(java.lang.NumberFormatException e0){
                f1 = 0;
             }
             try{
                float f2 = (Float.parseFloat(jSONObject.optString("speed", "0")) * 10.00f) / 36.00f;
                AMapLocation uAMapLocatio = new AMapLocation("lbs");
                uAMapLocatio.setLocationType(9);
                uAMapLocatio.setLatitude(d1);
                uAMapLocatio.setLongitude(d2);
                uAMapLocatio.setAccuracy(f);
                uAMapLocatio.setAltitude(d);
                uAMapLocatio.setBearing(f1);
                uAMapLocatio.setSpeed(f2);
                uAMapLocatio.setTime(l);
                uAMapLocatio.setCoordType("GCJ02");
                if (fq.a(uAMapLocatio, this.i) - 0x43960000 <= 0) {
                   h tp = this.p;
                   _monitor_enter(tp);
                   this.i.setLongitude(d2);
                   this.i.setLatitude(d1);
                   this.i.setAccuracy(f);
                   this.i.setBearing(f1);
                   this.i.setSpeed(f2);
                   this.i.setTime(l);
                   this.i.setCoordType("GCJ02");
                   _monitor_exit(tp);
                   return uAMapLocatio;
                }
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
    }
}
