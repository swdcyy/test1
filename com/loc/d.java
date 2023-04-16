package com.loc.d;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.lang.Object;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import com.loc.d$2;
import com.loc.cj;
import com.loc.d$1;
import com.loc.ck;
import com.loc.cl;
import android.os.Bundle;
import android.os.Message;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.loc.ej;
import com.loc.ei;
import com.loc.eo;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;
import com.loc.g;
import com.loc.d$a;
import android.os.Handler;
import android.app.Notification;
import android.os.Parcelable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Messenger;
import java.lang.IllegalStateException;
import android.os.RemoteException;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.reflect.Method;
import android.content.ComponentName;
import java.lang.ClassLoader;
import com.loc.h;
import com.loc.j;
import com.loc.fo;
import com.loc.fq;
import java.util.Iterator;
import com.amap.api.location.AMapLocationQualityReport;
import com.loc.fn;
import com.kuaishou.webkit.WebView;
import com.loc.i;
import com.loc.m;
import com.amap.api.location.UmidtokenInfo;
import com.loc.o;
import com.loc.fi;
import android.location.Location;
import com.loc.d$c;
import com.loc.d$b;
import android.os.HandlerThread;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.loc.fa;
import com.loc.e;
import com.loc.fm;
import java.lang.Thread;
import com.loc.d$3;
import java.lang.Enum;
import com.amap.api.location.APSService;
import com.loc.l;
import android.app.Application;

public final class d	// class@0013d9
{
    public String A;
    public boolean B;
    public Context C;
    public g D;
    public boolean E;
    public boolean F;
    public boolean H;
    public AMapLocationClientOption K;
    public i L;
    public ServiceConnection M;
    public boolean N;
    public eo a;
    public AMapLocationClientOption b;
    public d$c c;
    public h d;
    public ArrayList e;
    public boolean f;
    public boolean h;
    public boolean i;
    public j j;
    public Messenger k;
    public Messenger l;
    public Intent m;
    public int n;
    public d$b o;
    public boolean p;
    public AMapLocationClientOption$AMapLocationMode q;
    public Object r;
    public fo s;
    public boolean t;
    public e u;
    public String v;
    public AMapLocationQualityReport w;
    public boolean x;
    public boolean y;
    public d$a z;
    public static boolean G = true;
    public static boolean I;
    public static AtomicBoolean J;
    public static boolean g;

    static {
       d.J = new AtomicBoolean(false);
    }
    public void d(Context p0,Intent p1,Looper p2){
       super();
       this.b = new AMapLocationClientOption();
       this.d = null;
       this.E = false;
       this.F = false;
       this.e = new ArrayList();
       this.f = false;
       this.h = true;
       this.i = true;
       this.k = null;
       this.l = null;
       this.m = null;
       this.n = 0;
       this.H = true;
       this.o = null;
       this.p = false;
       this.q = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
       this.r = new Object();
       this.s = null;
       this.t = false;
       this.u = null;
       this.K = new AMapLocationClientOption();
       this.L = null;
       this.v = null;
       this.M = new d$2(this);
       this.w = null;
       this.x = false;
       this.y = false;
       this.N = false;
       this.z = null;
       this.A = null;
       this.B = false;
       this.C = p0;
       this.m = p1;
       this.b(p2);
    }
    public static AMapLocationClientOption a(d p0){
       return p0.K;
    }
    public static void a(Context p0){
       if (d.J.compareAndSet(false, true)) {
          cj.a().b(new d$1(p0));
       }
       return;
    }
    public static void a(d p0,int p1,long p2){
       p0.a(p1, null, p2);
    }
    public static void a(d p0,int p1,Bundle p2){
       p0.a(p1, p2);
    }
    public static void a(d p0,Bundle p1){
       p0.a(p1);
    }
    public static void a(d p0,Message p1){
       p0.b(p1);
    }
    public static void a(d p0,AMapLocation p1){
       p0.a(p1);
    }
    public static void a(d p0,AMapLocationListener p1){
       p0.c(p1);
    }
    public static void a(ej p0){
       p0.d();
       p0.a(new AMapLocationClientOption().setNeedAddress(false));
       p0.a(true, new ei());
    }
    public static void a(ej p0,eo p1){
       if (p1 != null && !p1.getErrorCode()) {
          p0.b(p1);
       }
    label_0014 :
       return;
    }
    public static boolean a(d p0,boolean p1){
       p0.E = p1;
       return p1;
    }
    public static g b(d p0){
       return p0.D;
    }
    public static void b(d p0,Message p1){
       p0.a(p1);
    }
    public static void b(d p0,AMapLocation p1){
       p0.f(p1);
    }
    public static void b(d p0,AMapLocationListener p1){
       p0.d(p1);
    }
    public static boolean b(d p0,boolean p1){
       p0.H = p1;
       return p1;
    }
    public static boolean b(boolean p0){
       d.I = p0;
       return p0;
    }
    public static Context c(d p0){
       return p0.C;
    }
    public static void c(d p0,Message p1){
       p0.c(p1);
    }
    public static void d(d p0){
       p0.p();
    }
    public static void d(d p0,Message p1){
       p0.d(p1);
    }
    public static void e(d p0){
       p0.j();
    }
    public static void f(d p0){
       p0.l();
    }
    public static void g(d p0){
       p0.r();
    }
    public static void h(d p0){
       p0.n();
    }
    public static void i(d p0){
       p0.a(1025);
    }
    public static void j(d p0){
       p0.s();
    }
    public final d$a a(Looper p0){
       d tr = this.r;
       _monitor_enter(tr);
       d$a uoa = new d$a(this, p0);
       this.z = uoa;
       _monitor_exit(tr);
       return uoa;
    }
    public final eo a(ej p0,boolean p1){
       if (this.b.isLocationCacheEnable()) {
          return p0.a(p1);
       }
       return null;
    }
    public final void a(int p0){
       d tr = this.r;
       _monitor_enter(tr);
       d tz = this.z;
       if (tz != null) {
          tz.removeMessages(p0);
       }
       _monitor_exit(tr);
       return;
    }
    public final void a(int p0,Notification p1){
       if (!p0 || p1 == null) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("i", p0);
       uBundle.putParcelable("h", p1);
       this.a(1023, uBundle, 0);
       return;
    }
    public final void a(int p0,Bundle p1){
       if (p1 == null) {
          p1 = new Bundle();
       }
       if (TextUtils.isEmpty(this.v)) {
          this.v = fj.b(this.C);
       }
       p1.putString("c", this.v);
       Message message = Message.obtain();
       message.what = p0;
       message.setData(p1);
       message.replyTo = this.l;
       d tk = this.k;
       if (tk != null) {
          tk.send(message);
       }
       return;
    }
    public final void a(int p0,Object p1,long p2){
       d tr = this.r;
       _monitor_enter(tr);
       if (this.z != null) {
          Message message = Message.obtain();
          message.what = p0;
          if (p1 instanceof Bundle) {
             message.setData(p1);
          }else {
             message.obj = p1;
          }
          this.z.sendMessageDelayed(message, p2);
       }
       _monitor_exit(tr);
       return;
    }
    public final void a(Intent p0){
       a.a(this.C, p0, this.M, 1);
    }
    public final void a(Intent p0,boolean p1){
       d tC = this.C;
       if (tC != null) {
          if (Build$VERSION.SDK_INT >= 26 && p1) {
             if (!this.t()) {
                return;
             }else {
                Class[] uClassArray = new Class[]{Intent.class};
                Object[] objArray = new Object[]{p0};
                this.C.getClass().getMethod("startForegroundService", uClassArray).invoke(this.C, objArray);
             }
          }else {
             a.e(tC, p0);
          }
          this.B = true;
       }
       return;
    }
    public final void a(Bundle p0){
       AMapLocation parcelable;
       ei parcelable1;
       d td;
       AMapLocation uAMapLocatio = null;
       if (p0 != null) {
          p0.setClassLoader(AMapLocation.class.getClassLoader());
          parcelable = p0.getParcelable("loc");
          this.A = p0.getString("nb");
          parcelable1 = p0.getParcelable("statics");
          if (parcelable != null && !parcelable.getErrorCode()) {
             td = this.d;
             if (td != null) {
                td.c();
                if (!TextUtils.isEmpty(parcelable.getAdCode())) {
                   h.y = parcelable;
                }
             }
          }
       }else {
          parcelable1 = uAMapLocatio;
          parcelable = parcelable1;
       }
       td = this.d;
       uAMapLocatio = (td != null)? td.a(parcelable, this.A): parcelable;
    label_005a :
       this.a(uAMapLocatio, parcelable1);
       return;
    }
    public final void a(Message p0){
       Bundle data = p0.getData();
       AMapLocation parcelable = data.getParcelable("loc");
       this.e(parcelable);
       if (this.j.a(parcelable, data.getString("lastLocNb"))) {
          this.j.d();
       }
       return;
    }
    public final void a(AMapLocation p0){
       int i = 0;
       if (p0.getErrorCode()) {
          p0.setLocationType(i);
       }
       if (!p0.getErrorCode()) {
          double latitude = p0.getLatitude();
          double longitude = p0.getLongitude();
          int i1 = 0;
          if (latitude - i1 || (longitude - i1 && (latitude - 0xc056800000000000 >= 0 && (latitude - 0x4056800000000000 <= 0 && (longitude - 0xc066800000000000 < 0 || longitude - 0x4066800000000000 > 0))))) {
             fo.a("errorLatLng", p0.toStr());
             p0.setLocationType(i);
             p0.setErrorCode(8);
             p0.setLocationDetail("LatLng is error#0802");
          }
       }
       if (("gps").equalsIgnoreCase(p0.getProvider()) || !this.d.b()) {
          p0.setAltitude(fq.c(p0.getAltitude()));
          p0.setBearing(fq.a(p0.getBearing()));
          p0.setSpeed(fq.a(p0.getSpeed()));
          this.b(p0);
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().onLocationChanged(p0);
          }
       }
       return;
    }
    public synchronized final void a(AMapLocation p0,ei p1){
       if (p0 == null) {
          p0 = new AMapLocation("");
          p0.setErrorCode(8);
          p0.setLocationDetail("amapLocation is null#0801");
       }
       if (!("gps").equalsIgnoreCase(p0.getProvider())) {
          p0.setProvider("lbs");
       }
       if (this.w == null) {
          this.w = new AMapLocationQualityReport();
       }
       this.w.setLocationMode(this.b.getLocationMode());
       d td = this.d;
       if (td != null) {
          this.w.setGPSSatellites(td.e());
          this.w.setGpsStatus(this.d.d());
       }
       this.w.setWifiAble(fq.g(this.C));
       this.w.setNetworkType(fq.h(this.C));
       if (p0.getLocationType() == 1 || ("gps").equalsIgnoreCase(p0.getProvider())) {
          this.w.setNetUseTime(0);
       }
       if (p1 != null) {
          this.w.setNetUseTime(p1.a());
       }
       this.w.setInstallHighDangerMockApp(d.I);
       p0.setLocationQualityReport(this.w);
       if (this.F != null) {
          this.a(p0, this.A);
          if (p1 != null) {
             p1.d(fq.b());
          }
          fo.a(this.C, p0, p1);
          fo.a(this.C, p0);
          this.c(p0.clone());
          fn.a(this.C).a(p0);
          fn.a(this.C).b();
       }
       if (this.p != null) {
          return;
       }else if(this.b.isOnceLocation()){
          this.l();
          this.a(14, null);
       }
       return;
    }
    public final void a(AMapLocation p0,String p1){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("loc", p0);
       uBundle.putString("lastLocNb", p1);
       this.a(1014, uBundle, 0);
    }
    public final void a(AMapLocationClientOption p0){
       this.K = p0.clone();
       this.a(1018, p0.clone(), 0);
    }
    public final void a(AMapLocationListener p0){
       this.a(1002, p0, 0);
    }
    public final void a(WebView p0){
       if (this.L == null) {
          this.L = new i(this.C, p0);
       }
       this.L.a();
       return;
    }
    public final void a(ej p0,ei p1){
       p0.a(this.C);
       p0.a(this.b);
       p0.b(p1);
    }
    public final void a(boolean p0){
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("j", p0);
       this.a(1024, uBundle, 0);
    }
    public final boolean a(){
       return this.E;
    }
    public final eo b(ej p0){
       eo uoeo1;
       eo uoeo2;
       int i;
       String str;
       eo uoeo = null;
       this.a = uoeo;
       ei uoei = new ei();
       uoei.c(fq.b());
       String aPIKEY = AMapLocationClientOption.getAPIKEY();
       if (!TextUtils.isEmpty(aPIKEY)) {
          m.a(this.C, aPIKEY);
       }
       aPIKEY = UmidtokenInfo.getUmidtoken();
       if (!TextUtils.isEmpty(aPIKEY)) {
          o.a(aPIKEY);
       }
       this.a(p0, uoei);
       boolean b = fi.l();
       boolean b1 = false;
       if (this.K.getCacheCallBack()) {
          uoeo1 = this.a(p0, this.K.getCacheCallBack());
          if (uoeo1 != null) {
             if (!fi.a(uoeo1.getTime())) {
                if (this.K.getCacheCallBack()) {
                   int cacheTimeOut = this.K.getCacheTimeOut();
                   long l = fq.a() - uoeo1.getTime();
                   if (l > 0 && l - (long)cacheTimeOut < 0) {
                      this.a = uoeo1;
                      uoeo1.setLocationType(10);
                   }
                }
             }
          }
          uoeo1 = uoeo;
       }else {
          uoeo1 = this.a(p0, b1);
       }
       if (uoeo1 == null) {
          boolean b2 = (!b)? true: false;
          uoeo1 = p0.a(b2, uoei);
          if (uoeo1 != null && !uoeo1.getErrorCode()) {
             b1 = 1;
          }
          uoeo2 = uoeo1;
          i = b1;
          b1 = 1;
       }else {
          uoeo2 = uoeo1;
          i = 0;
       }
       if (uoeo2 != null) {
          str = uoeo2.k();
          uoeo = uoeo2.clone();
       }else {
          str = uoeo;
       }
       if (this.b.isLocationCacheEnable()) {
          d tj = this.j;
          if (tj != null) {
             uoeo = tj.a(uoeo, str, this.b.getLastLocationLifeCycle());
          }
       }
       if (this.K.getCacheCallBack()) {
          d tc = this.c;
          if (tc != null) {
             tc.removeMessages(13);
          }
       }
       Bundle uBundle = new Bundle();
       if (uoeo != null) {
          uBundle.putParcelable("loc", uoeo);
          uBundle.putString("nb", uoeo2.k());
          uBundle.putParcelable("statics", uoei);
       }
       this.a(uBundle);
       if (i) {
          d.a(p0, uoeo2);
       }
       if (b1 && (b && !d.g)) {
          d.g = true;
          d.a(p0);
       }
    label_0136 :
       p0.e();
       return uoeo2;
    }
    public final void b(){
       if (this.K.getCacheCallBack()) {
          d tc = this.c;
          if (tc != null) {
             tc.sendEmptyMessageDelayed(13, (long)this.K.getCacheCallBackTime());
          }
       }
       this.a(1003, null, 0);
       return;
    }
    public final void b(Looper p0){
       if (p0 == null) {
          d$c uoc = (Looper.myLooper() == null)? new d$c(this, this.C.getMainLooper()): new d$c(this);
          this.c = uoc;
       }else {
          this.c = new d$c(this, p0);
       }
       this.j = new j(this.C);
       d$b uob = new d$b("amapLocManagerThread", this);
       this.o = uob;
       uob.setPriority(5);
       this.o.start();
       this.z = this.a(this.o.getLooper());
       this.d = new h(this.C, this.c);
       this.D = new g(this.C, this.c);
       if (this.s == null) {
          this.s = new fo();
       }
       d.a(this.C);
       return;
    }
    public final void b(Message p0){
       p0 = p0.obj;
       if (this.h != null && this.k != null) {
          Bundle uBundle = new Bundle();
          uBundle.putBundle("optBundle", fj.a(this.b));
          int i = 0;
          this.a(i, uBundle);
          if (this.F != null) {
             this.a(13, null);
          }
          this.h = i;
       }
       this.a(p0, null);
       this.a(1025);
       this.a(1025, null, 0x493e0);
       return;
    }
    public final void b(AMapLocation p0){
       if (p0 != null) {
          String locationDeta = p0.getLocationDetail();
          locationDeta = (TextUtils.isEmpty(locationDeta))? "": locationDeta;
          boolean b = fq.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF");
          boolean b1 = fq.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==");
          boolean b2 = fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=");
          boolean b3 = fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O");
          boolean b4 = fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=");
          String str = (fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))? "#pm1": "#pm0";
          locationDeta = locationDeta+str;
          str = "1";
          String str1 = (b)? str: "0";
          locationDeta = locationDeta+str1;
          str1 = (b1)? str: "0";
          locationDeta = locationDeta+str1;
          str1 = (b2)? str: "0";
          locationDeta = locationDeta+str1;
          str1 = (b3)? str: "0";
          locationDeta = locationDeta+str1;
          if (!b4) {
             str = "0";
          }
          p0.setLocationDetail(locationDeta+str);
       }
       return;
    }
    public final void b(AMapLocationListener p0){
       this.a(1005, p0, 0);
    }
    public final void c(){
       this.a(1004, null, 0);
    }
    public final void c(Message p0){
       String str = "h";
       if (p0 == null) {
          return;
       }
       Bundle data = p0.getData();
       if (data == null) {
          return;
       }
       Intent intent = this.q();
       intent.putExtra("i", data.getInt("i", 0));
       intent.putExtra(str, data.getParcelable(str));
       intent.putExtra("g", 1);
       this.a(intent, 1);
       return;
    }
    public final void c(AMapLocation p0){
       Message message = this.c.obtainMessage();
       message.what = 10;
       message.obj = p0;
       this.c.sendMessage(message);
    }
    public final void c(AMapLocationListener p0){
       if (p0 == null) {
          throw new IllegalArgumentException("listener参数不能为null");
       }
       if (this.e == null) {
          this.e = new ArrayList();
       }
       if (!this.e.contains(p0)) {
          this.e.add(p0);
       }
       return;
    }
    public final void d(){
       d tL = this.L;
       if (tL != null) {
          tL.b();
          this.L = null;
       }
       this.a(1011, null, 0);
       this.p = true;
       return;
    }
    public final void d(Message p0){
       String str = "j";
       if (p0 == null) {
          return;
       }
       Bundle data = p0.getData();
       if (data == null) {
          return;
       }
       Intent intent = this.q();
       intent.putExtra(str, data.getBoolean(str, true));
       intent.putExtra("g", 2);
       this.a(intent, false);
       return;
    }
    public synchronized final void d(AMapLocation p0){
       if (p0 == null) {
          p0 = new AMapLocation("");
          p0.setErrorCode(8);
          p0.setLocationDetail("coarse amapLocation is null#2005");
       }
       if (this.w == null) {
          this.w = new AMapLocationQualityReport();
       }
       this.w.setLocationMode(this.b.getLocationMode());
       if (this.D != null) {
          this.w.setGPSSatellites(p0.getSatellites());
          this.w.setGpsStatus(this.D.b());
       }
       this.w.setWifiAble(fq.g(this.C));
       this.w.setNetworkType(fq.h(this.C));
       this.w.setNetUseTime(0);
       this.w.setInstallHighDangerMockApp(d.I);
       p0.setLocationQualityReport(this.w);
       if (this.F != null) {
          fo.a(this.C, p0);
          this.c(p0.clone());
          fn.a(this.C).a(p0);
          fn.a(this.C).b();
       }
       if (this.p != null) {
          return;
       }else if(this.D != null){
          this.l();
       }
       this.a(14, null);
       return;
    }
    public final void d(AMapLocationListener p0){
       if (!this.e.isEmpty() && this.e.contains(p0)) {
          this.e.remove(p0);
       }
       if (this.e.isEmpty()) {
          this.l();
       }
       return;
    }
    public final AMapLocation e(){
       AMapLocation uAMapLocatio = null;
       d tj = this.j;
       if (tj != null) {
          uAMapLocatio = tj.b();
          if (uAMapLocatio != null) {
             uAMapLocatio.setTrustedLevel(3);
          }
       }
       return uAMapLocatio;
    }
    public final void e(AMapLocation p0){
       if (p0 == null) {
          return;
       }
       AMapLocation uAMapLocatio = null;
       fa b = j.b;
       if (b == null) {
          d tj = this.j;
          if (tj != null) {
             uAMapLocatio = tj.b();
          }
       }else {
          uAMapLocatio = b.a();
       }
       fo.a(uAMapLocatio, p0);
       return;
    }
    public final void f(){
       d tL = this.L;
       if (tL != null) {
          tL.b();
          this.L = null;
       }
       return;
    }
    public final void f(AMapLocation p0){
       if (this.i != null && this.k != null) {
          Bundle uBundle = new Bundle();
          uBundle.putBundle("optBundle", fj.a(this.b));
          this.a(0, uBundle);
          if (this.F != null) {
             this.a(13, null);
          }
          this.i = false;
       }
       this.d(p0);
       return;
    }
    public final void g(){
       this.a(12, null);
       this.h = true;
       this.i = true;
       boolean b = false;
       this.E = b;
       this.t = b;
       this.l();
       d ts = this.s;
       if (ts != null) {
          ts.b(this.C);
       }
       fn.a(this.C).a();
       fo.a(this.C);
       ts = this.u;
       if (ts != null) {
          ts.b().sendEmptyMessage(11);
       }else {
          ts = this.M;
          if (ts != null) {
             this.C.unbindService(ts);
          }
       }
       if (this.B != null) {
          this.C.stopService(this.q());
       }
       this.B = b;
       ts = this.e;
       if (ts != null) {
          ts.clear();
          this.e = null;
       }
       this.M = null;
       this.h();
       ts = this.o;
       if (ts != null) {
          Object[] objArray = new Object[b];
          fm.a(ts, HandlerThread.class, "quitSafely", objArray);
       }
       this.o = null;
       d tc = this.c;
       if (tc != null) {
          tc.removeCallbacksAndMessages(null);
       }
       tc = this.j;
       if (tc != null) {
          tc.c();
          this.j = null;
       }
       return;
    }
    public final void h(){
       d tr = this.r;
       _monitor_enter(tr);
       d tz = this.z;
       if (tz != null) {
          tz.removeCallbacksAndMessages(null);
       }
       this.z = null;
       _monitor_exit(tr);
       return;
    }
    public final boolean i(){
       boolean b = false;
       int i = 0;
       int i1 = 1;
       while (this.k == null) {
          Thread.sleep(100);
          i = i + i1;
          if (i >= 50) {
             break ;
          }
       }
       if (this.k == null) {
          Message message = Message.obtain();
          Bundle uBundle = new Bundle();
          AMapLocation uAMapLocatio = new AMapLocation("");
          uAMapLocatio.setErrorCode(10);
          String str = (!fq.k(this.C.getApplicationContext()))? "请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003": "启动ApsServcie失败#1001";
          uAMapLocatio.setLocationDetail(str);
          uBundle.putParcelable("loc", uAMapLocatio);
          message.setData(uBundle);
          message.what = i1;
          this.c.sendMessage(message);
       }else {
          b = true;
       }
       if (!b) {
          i = (!fq.k(this.C.getApplicationContext()))? 2103: 2101;
          fo.a(null, i);
       }
       return b;
    }
    public synchronized final void j(){
       boolean sDK_INT = Build$VERSION.SDK_INT;
       d uod = 29;
       if (sDK_INT < uod && (sDK_INT >= 23 && (fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")))) {
          d uod1 = 31;
          if (sDK_INT >= uod1 || (sDK_INT >= uod && (fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O") && (sDK_INT < uod1 || (fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || fq.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")))))) {
             if (this.b == null) {
                this.b = new AMapLocationClientOption();
             }
             if (this.F != null) {
                return;
             }else {
                sDK_INT = true;
                this.F = sDK_INT;
                int i = d$3.a[this.b.getLocationMode().ordinal()];
                long l = 0;
                if (i != sDK_INT) {
                   if (i != 2) {
                      if (i == 3) {
                         if (fq.m(this.C)) {
                            this.a(1016);
                            this.a(1017, null, l);
                            this.a(1026, null, l);
                            return;
                         }else {
                            this.a(1027, null, l);
                            this.a(1015, null, l);
                            if (this.b.isGpsFirst() && this.b.isOnceLocation()) {
                               l = this.b.getGpsFirstTimeout();
                            }
                            this.a(1016, null, l);
                         }
                      }
                      return;
                   }else if(fq.m(this.C)){
                      this.a(1016);
                      this.a(1017, null, l);
                      this.a(1026, null, l);
                      return;
                   }else {
                      this.a(1016);
                      this.a(1027, null, l);
                      this.a(1015, null, l);
                      return;
                   }
                }else {
                   this.a(1027, null, l);
                   this.a(1017, null, l);
                   this.a(1016, null, l);
                   return;
                }
             }
          }
       }
       this.k();
       return;
    }
    public final void k(){
       AMapLocation uAMapLocatio = new AMapLocation("");
       uAMapLocatio.setErrorCode(12);
       uAMapLocatio.setLocationDetail("定位权限被禁用,请授予应用定位权限 #1201");
       if (this.w == null) {
          this.w = new AMapLocationQualityReport();
       }
       AMapLocationQualityReport uAMapLocatio1 = new AMapLocationQualityReport();
       this.w = uAMapLocatio1;
       uAMapLocatio1.setGpsStatus(4);
       this.w.setGPSSatellites(0);
       this.w.setLocationMode(this.b.getLocationMode());
       this.w.setWifiAble(fq.g(this.C));
       this.w.setNetworkType(fq.h(this.C));
       this.w.setNetUseTime(0);
       uAMapLocatio.setLocationQualityReport(this.w);
       fo.a(null, 2121);
       this.c(uAMapLocatio);
       return;
    }
    public final void l(){
       this.a(1025);
       d td = this.d;
       if (td != null) {
          td.a();
       }
       td = this.D;
       if (td != null) {
          td.a();
       }
       this.a(1016);
       this.F = false;
       this.n = 0;
       return;
    }
    public final void m(){
       eo uoeo = this.b(new ej(true));
       if (this.i()) {
          Bundle uBundle = new Bundle();
          String str = (uoeo != null && (uoeo.getLocationType() == 2 || uoeo.getLocationType() == 4))? "1": "0";
          uBundle.putBundle("optBundle", fj.a(this.b));
          uBundle.putString("isCacheLoc", str);
          this.a(0, uBundle);
          if (this.F != null) {
             this.a(13, null);
          }
       }
       return;
    }
    public final void n(){
       boolean b = false;
       if (d.G || (this.t == null && this.N == null)) {
          d.G = b;
          this.N = true;
          this.m();
       }else if(this.t != null && (!this.a() && this.y == null)){
          this.y = true;
          this.p();
       }
    label_002d :
       if (this.i()) {
          this.y = b;
          Bundle uBundle = new Bundle();
          uBundle.putBundle("optBundle", fj.a(this.b));
          uBundle.putString("d", UmidtokenInfo.getUmidtoken());
          if (!this.d.b()) {
             this.a(true, uBundle);
          }
       }
       if (!this.b.isOnceLocation()) {
          this.o();
       }
       return;
    }
    public final void o(){
       if (this.b.getLocationMode() != AMapLocationClientOption$AMapLocationMode.Device_Sensors) {
          long l = 1000;
          if (this.b.getInterval() - l >= 0) {
             l = this.b.getInterval();
          }
          this.a(1016, null, l);
       }
       return;
    }
    public final void p(){
       if (this.l == null) {
          this.l = new Messenger(this.c);
       }
       this.a(this.q());
       return;
    }
    public final Intent q(){
       if (this.m == null) {
          this.m = new Intent(this.C, APSService.class);
       }
       String aPIKEY = (!TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()))? AMapLocationClientOption.getAPIKEY(): l.f(this.C);
    label_002f :
       this.m.putExtra("a", aPIKEY);
       this.m.putExtra("b", l.c(this.C));
       this.m.putExtra("d", UmidtokenInfo.getUmidtoken());
       return this.m;
    }
    public final void r(){
       new ei().f("#2001");
       fo.a(null, 2153);
       eo uoeo = new eo("");
       uoeo.setErrorCode(20);
       uoeo.setLocationDetail("模糊权限下不支持低功耗定位#2001");
       this.f(uoeo);
    }
    public final void s(){
       d ts;
       d tC;
       int i;
       this.d.b(this.b);
       this.D.b(this.b);
       if (this.F != null && !this.b.getLocationMode().equals(this.q)) {
          this.l();
          this.j();
       }
       this.q = this.b.getLocationMode();
       if (this.s != null) {
          if (this.b.isOnceLocation()) {
             ts = this.s;
             tC = this.C;
             i = 0;
          }else {
             ts = this.s;
             tC = this.C;
             i = 1;
          }
          ts.a(tC, i);
          this.s.a(this.C, this.b);
       }
       return;
    }
    public final boolean t(){
       if (fq.j(this.C)) {
          Object[] objArray = new Object[]{"android.permission.FOREGROUND_SERVICE"};
          int i = fm.b(this.C.getApplicationContext().getBaseContext(), "checkSelfPermission", objArray);
          if (i) {
             return 0;
          }
       }
       return 1;
    }
}
