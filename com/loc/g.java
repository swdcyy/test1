package com.loc.g;
import android.content.Context;
import android.os.Handler;
import java.lang.Object;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import java.lang.String;
import android.location.LocationManager;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.en;
import com.loc.eo;
import com.amap.api.location.AMapLocation;
import android.location.Location;
import java.util.List;
import android.os.Bundle;
import com.loc.fq;
import com.loc.fi;
import java.lang.System;
import com.loc.fk;
import com.loc.fo;
import android.location.LocationListener;
import com.loc.g$a;
import android.os.Message;
import java.lang.Boolean;
import com.loc.fm;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fp;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.Enum;
import com.amap.api.location.DPoint;
import com.loc.fl;
import android.os.Looper;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.content.SharedPreferences$Editor;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.SecurityException;

public final class g	// class@00143e
{
    public long c;
    public boolean d;
    public int e;
    public en f;
    public int g;
    public int h;
    public int i;
    public Handler j;
    public Context k;
    public long l;
    public int m;
    public LocationManager n;
    public AMapLocationClientOption o;
    public Object p;
    public boolean v;
    public AMapLocationClientOption$GeoLanguage w;
    public LocationListener x;
    public static AMapLocation a;
    public static String b;
    public static long q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;

    public void g(Context p0,Handler p1){
       super();
       this.c = 0;
       this.d = false;
       this.e = 0;
       this.f = null;
       this.g = 240;
       this.h = 80;
       this.i = 0;
       this.l = 0;
       this.m = 0;
       this.p = new Object();
       this.v = true;
       this.w = AMapLocationClientOption$GeoLanguage.DEFAULT;
       this.x = null;
       this.k = p0;
       this.j = p1;
       this.n = p0.getSystemService("location");
       this.f = new en();
       return;
    }
    public static eo a(int p0,String p1){
       eo uoeo = new eo("");
       uoeo.setErrorCode(p0);
       uoeo.setLocationDetail(p1);
       return uoeo;
    }
    public static void a(g p0){
       p0.g();
    }
    public static void a(g p0,int p1){
       p0.a(p1);
    }
    public static void a(g p0,Location p1){
       p0.a(p1);
    }
    public static boolean a(LocationManager p0){
       if (g.r) {
          return g.s;
       }
       List allProviders = p0.getAllProviders();
       g.s = (allProviders != null && allProviders.size() > 0)? allProviders.contains("gps"): false;
       g.r = true;
       return g.s;
    }
    public static int b(Location p0){
       Bundle extras = p0.getExtras();
       int intx = (extras != null)? extras.getInt("satellites"): 0;
       return intx;
    }
    public static boolean b(LocationManager p0){
       if (g.t) {
          return g.u;
       }
       boolean b = p0.isProviderEnabled("network");
       g.u = b;
       g.t = true;
       return b;
    }
    public static void g(AMapLocation p0){
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
    public final void a(){
       g tn = this.n;
       if (tn == null) {
          return;
       }
       g tx = this.x;
       if (tx != null) {
          tn.removeUpdates(tx);
          this.x.a();
          this.x = null;
       }
       tn = this.j;
       if (tn != null) {
          tn.removeMessages(100);
       }
       this.i = 0;
       this.c = 0;
       this.l = 0;
       this.e = 0;
       this.m = 0;
       this.f.a();
       return;
    }
    public final void a(int p0){
       if (!p0) {
          this.i = 0;
       }
       return;
    }
    public final void a(int p0,String p1,long p2){
       if (this.j != null) {
          Message message = Message.obtain();
          AMapLocation uAMapLocatio = new AMapLocation("");
          uAMapLocatio.setErrorCode(20);
          uAMapLocatio.setLocationDetail(p1);
          uAMapLocatio.setLocationType(11);
          message.obj = uAMapLocatio;
          message.what = p0;
          this.j.sendMessageDelayed(message, p2);
       }
       return;
    }
    public final void a(Location p0){
       String str;
       g tj = this.j;
       if (tj != null) {
          tj.removeMessages(100);
       }
       if (p0 == null) {
          return;
       }else {
          AMapLocation uAMapLocatio = new AMapLocation(p0);
          if (!fq.a(uAMapLocatio)) {
             return;
          }else if(("gps").equals(p0.getProvider())){
             str = "gps_coarse";
          }else {
             str = "network_coarse";
          }
          uAMapLocatio.setProvider(str);
          uAMapLocatio.setLocationType(11);
          boolean b = true;
          if (this.d == null && fq.a(uAMapLocatio)) {
             fo.b(this.k, (fq.b() - this.c), fj.a(uAMapLocatio.getLatitude(), uAMapLocatio.getLongitude()));
             this.d = b;
          }
          Object[] objArray = new Object[0];
          Boolean uBoolean = fm.a(p0, "isFromMockProvider", objArray);
          ("CoarseLocation | isFromMock=").concat(String.valueOf(uBoolean));
          if (uBoolean.booleanValue()) {
             uAMapLocatio.setMock(b);
             uAMapLocatio.setTrustedLevel(4);
             if (!this.o.isMockEnable()) {
                g tm = this.m;
                if (tm > 3) {
                   fo.a(null, 2152);
                   uAMapLocatio.setErrorCode(15);
                   uAMapLocatio.setLocationDetail("CoarseLocation has been mocked!#2007");
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
                   this.m = tm + b;
                   return;
                }
             }
          }else {
             this.m = 0;
          }
          int i = g.b(p0);
          this.i = i;
          uAMapLocatio.setSatellites(i);
          this.e(uAMapLocatio);
          g.g(uAMapLocatio);
          AMapLocation uAMapLocatio1 = this.f(uAMapLocatio);
          this.a(uAMapLocatio1);
          this.b(uAMapLocatio1);
          tj = this.p;
          _monitor_enter(tj);
          this.a(uAMapLocatio1, g.a);
          _monitor_exit(tj);
          this.c(uAMapLocatio1);
          return;
       }
    }
    public final void a(Bundle p0){
       if (p0 != null) {
          p0.setClassLoader(AMapLocation.class.getClassLoader());
          this.g = p0.getInt("I_MAX_GEO_DIS");
          this.h = p0.getInt("I_MIN_GEO_DIS");
          AMapLocation parcelable = p0.getParcelable("loc");
          if (!TextUtils.isEmpty(parcelable.getAdCode())) {
             g tp = this.p;
             _monitor_enter(tp);
             g.a = parcelable;
             _monitor_exit(tp);
             return;
          }
       }
       return;
    }
    public final void a(AMapLocation p0){
       if (!fq.a(p0)) {
          return;
       }
       this.e = this.e + 1;
       return;
    }
    public final void a(AMapLocation p0,AMapLocation p1){
       if (p1 != null && (this.o.isNeedAddress() && fq.a(p0, p1) - (float)this.g < 0)) {
          fj.a(p0, p1);
       }
    label_0018 :
       return;
    }
    public final void a(AMapLocationClientOption p0){
       this.o = p0;
       if (p0 == null) {
          this.o = new AMapLocationClientOption();
       }
       this.o.toString();
       if (!this.o.isOnceLocation()) {
          this.e();
          return;
       }else if(!this.c()){
          this.d();
          return;
       }else {
          g.q = fp.a(this.k, "pref", "lagt", g.q);
          this.f();
          return;
       }
    }
    public final int b(){
       g tn = this.n;
       int i = 1;
       if (tn == null) {
          return i;
       }
       if (!g.a(tn)) {
          return i;
       }
       int intx = Settings$Secure.getInt(this.k.getContentResolver(), "location_mode", 0);
       if (!intx) {
          return 2;
       }
       if (intx == 2) {
          return 3;
       }
       if (this.v == null) {
          return 4;
       }
       return 0;
    }
    public final void b(AMapLocation p0){
       g tj;
       if (!fq.a(p0)) {
          return;
       }
       if (this.j != null) {
          long l = fq.b();
          long l1 = 8000;
          if (this.o.getInterval() - l1 <= 0 || (l - this.l) - (this.o.getInterval() - l1) > 0) {
             Bundle uBundle = new Bundle();
             uBundle.putDouble("lat", p0.getLatitude());
             uBundle.putDouble("lon", p0.getLongitude());
             uBundle.putFloat("radius", p0.getAccuracy());
             uBundle.putLong("time", p0.getTime());
             Message message = Message.obtain();
             message.setData(uBundle);
             message.what = 102;
             g tp = this.p;
             _monitor_enter(tp);
             if (g.a == null) {
                tj = this.j;
             }else if(fq.a(p0, g.a) - (float)this.h > 0){
                tj = this.j;
             }else {
             label_007a :
                _monitor_exit(tp);
                return;
             }
             tj.sendMessage(message);
             goto label_007a ;
          }
       }
       return;
    }
    public final void b(AMapLocationClientOption p0){
       if (p0 == null) {
          p0 = new AMapLocationClientOption();
       }
       this.o = p0;
       p0.toString();
       this.j.removeMessages(100);
       if (this.w != this.o.getGeoLanguage()) {
          g tp = this.p;
          _monitor_enter(tp);
          g.a = null;
          _monitor_exit(tp);
       }
       this.w = this.o.getGeoLanguage();
       return;
    }
    public final void c(AMapLocation p0){
       if (this.o.getLocationMode().equals(AMapLocationClientOption$AMapLocationMode.Device_Sensors) && this.o.getDeviceModeDistanceFilter() > 0) {
          this.d(p0);
          return;
       }else if((fq.b() - this.l) - (this.o.getInterval() - 200) >= 0){
          this.l = fq.b();
          this.d(p0);
       }
       return;
    }
    public final boolean c(){
       boolean b = true;
       String str = 28;
       int i = 0;
       if (fq.c() >= str) {
          if (this.n == null) {
             this.n = this.k.getApplicationContext().getSystemService("location");
          }
          Object[] objArray = new Object[i];
          b = fm.a(this.n, "isLocationEnabled", objArray).booleanValue();
       }
       if (fq.c() < 24 || (fq.c() >= str || Settings$Secure.getInt(this.k.getContentResolver(), "location_mode", i))) {
          i = b;
       }
       return i;
    }
    public final void d(){
       this.c(g.a(12, "定位服务没有开启，请在设置中打开定位服务开关#1206"));
    }
    public final void d(AMapLocation p0){
       if (this.j != null) {
          Message message = Message.obtain();
          message.obj = p0;
          message.what = 101;
          this.j.sendMessage(message);
       }
       return;
    }
    public final void e(){
       this.c(g.a(20, "模糊权限下不支持连续定位#2006"));
    }
    public final void e(AMapLocation p0){
       if (fj.a(p0.getLatitude(), p0.getLongitude()) && this.o.isOffset()) {
          DPoint uDPoint = fl.a(this.k, new DPoint(p0.getLatitude(), p0.getLongitude()));
          p0.setLatitude(uDPoint.getLatitude());
          p0.setLongitude(uDPoint.getLongitude());
          p0.setOffset(this.o.isOffset());
          p0.setCoordType("GCJ02");
          return;
       }else {
          p0.setOffset(false);
          p0.setCoordType("WGS84");
          return;
       }
    }
    public final AMapLocation f(AMapLocation p0){
       if (!fq.a(p0)) {
          return p0;
       }
       if (this.e < 3) {
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
    public final void f(){
       if (this.n == null) {
          return;
       }
       boolean b = true;
       Bundle uBundle = null;
       try{
          this.v = b;
          Looper looper = Looper.myLooper();
          if (looper == null) {
             looper = this.k.getMainLooper();
          }
          this.c = fq.b();
          if (g.b(this.n)) {
             if (this.x == null) {
                this.x = new g$a(this);
             }
             LocationInterceptor.requestLocationUpdates(this.n, "network", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, looper);
          }
          if (g.a(this.n)) {
             if ((fq.a() - g.q) - 0xf731400 >= 0) {
                if (fq.c(this.k, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                   this.n.sendExtraCommand("gps", "force_xtra_injection", uBundle);
                   g.q = fq.a();
                   SharedPreferences$Editor uEditor = fp.a(this.k, "pref");
                   fp.a(uEditor, "lagt", g.q);
                   fp.a(uEditor);
                }else {
                   fj.a(new Exception("n_alec"), "OPENSDK_CL", "rlu_n_alec");
                }
             }
             if (this.x == null) {
                this.x = new g$a(this);
             }
             LocationInterceptor.requestLocationUpdates(this.n, "gps", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, looper);
          }
          if (g.s || g.u) {
             this.a(100, "系统返回定位结果超时#2002", this.o.getHttpTimeOut());
          }
          if (!g.s && !g.u) {
             this.a(100, "系统定位当前不可用#2003", 0);
          }
          return;
       }catch(java.lang.SecurityException e0){
          this.v = false;
          fo.a(uBundle, 2121);
          this.a(101, e0.getMessage()+"#2004", 0);
          return;
       }
    }
    public final void g(){
       this.i = 0;
    }
}
