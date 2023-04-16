package c.t.m.g.ce;
import android.content.Context;
import java.lang.Object;
import android.content.pm.PackageManager;
import java.lang.String;
import android.telephony.TelephonyManager;
import android.net.wifi.WifiManager;
import android.location.LocationManager;
import c.t.m.g.cy;
import c.t.m.g.ek;
import c.t.m.g.ce$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import android.os.HandlerThread;
import java.util.HashMap;
import c.t.m.g.ch;
import c.t.m.g.cf;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import c.t.m.g.eh;
import java.util.concurrent.CountDownLatch;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.lang.System;
import c.t.m.g.dl;
import c.t.m.g.cg;
import java.lang.Thread;
import c.t.m.g.ce$2;
import java.lang.Runnable;
import java.util.ArrayList;
import c.t.m.g.cv;
import java.util.Iterator;
import java.util.List;
import c.t.m.g.fl;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.IllegalArgumentException;
import c.t.m.g.dj;
import java.lang.Throwable;
import java.util.concurrent.ExecutorService;
import android.os.Looper;
import android.content.pm.PackageInfo;
import java.lang.CharSequence;
import c.t.m.g.cb;
import c.t.m.g.eg;
import java.util.regex.Pattern;
import java.util.Locale;
import android.os.Build$VERSION;

public class ce	// class@000c0b
{
    public final Context a;
    public final cf b;
    public final ExecutorService c;
    public final HashMap d;
    public final PackageManager e;
    public final TelephonyManager f;
    public final WifiManager g;
    public final LocationManager h;
    public final dl i;
    public CountDownLatch j;
    public String k;
    public List n;
    public static HandlerThread l;
    public static ce m;

    public void ce(Context p0){
       super();
       this.a = p0;
       this.e = p0.getPackageManager();
       this.f = p0.getSystemService("phone");
       this.g = p0.getSystemService("wifi");
       this.h = p0.getSystemService("location");
       this.i = new cy(p0, ek.a(p0.getPackageName()));
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 5, 0xea60, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ce$1(this));
       v1.allowCoreThreadTimeOut(true);
       this.c = v1;
       HandlerThread handlerThrea = new HandlerThread("GeoLocationService");
       ce.l = handlerThrea;
       handlerThrea.start();
       HashMap hashMap = new HashMap();
       this.d = hashMap;
       String str = "cell";
       hashMap.put(str, new ch(str));
       cf uocf = new cf();
       try{
          this.b = uocf;
          String str1 = ce.b(p0);
          if (ed.a) {
             ed.b("AppContext", "key = "+str1);
          label_0097 :
             uocf.f(str1);
          }else {
             goto label_0097 ;
          }
       }catch(java.lang.Exception e0){
          if (ed.a) {
             ed.b(e0, "transactionTooLarge");
          }
       }
       eh.a(p0.getApplicationContext());
       this.a();
       return;
    }
    public static ce a(Context p0){
       if (ce.m == null) {
          _monitor_enter(ce.class);
          if (ce.m == null) {
             ce.m = new ce(p0);
          }
          _monitor_exit(ce.class);
       }
       return ce.m;
    }
    public static CountDownLatch a(ce p0){
       return p0.j;
    }
    public static String b(Context p0){
       String str = "TencentGeoLocationSDK";
       String str1 = "";
       try{
          ApplicationInfo metaData = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128).metaData;
          if (metaData != null) {
             if (metaData.containsKey(str)) {
                return metaData.getString(str);
             }else if(metaData.containsKey("TencentMapSDK")){
                return metaData.getString("TencentMapSDK");
             }
          }
          return str1;
       }catch(java.lang.Exception e0){
       }
    }
    public Bundle a(String p0,byte[] p1,boolean p2){
       String str1;
       Bundle uBundle = this.i.a(p0, p1);
       ed.a("HalleyTimeCost: "+(System.currentTimeMillis() - System.currentTimeMillis())+", reqKey: "+uBundle.getString("req_key"));
       String str = "data_bytes";
       byte[] uobyteArray = (p2)? ek.b(uBundle.getByteArray(str)): uBundle.getByteArray(str);
       if (uobyteArray != null) {
          str1 = new String(uobyteArray, uBundle.getString("data_charset"));
       }else if(ed.a){
          ed.a("AppContext", "postSync: inflate failed");
       }
       str1 = "{}";
       uBundle.remove("data_charset");
       uBundle.remove(str);
       uBundle.putString("result", str1);
       return uBundle;
    }
    public cg a(String p0){
       return this.d.get(p0);
    }
    public void a(){
       this.j = new CountDownLatch(1);
       new Thread(new ce$2(this)).start();
    }
    public synchronized void a(Object p0){
       Class uClass;
       if (this.n == null) {
          this.n = new ArrayList();
       }
       if (p0 instanceof cv && ed.a) {
          ed.a("AppContext", "postEvent register TxLocationManagerImpl");
       }
       Iterator iterator = this.n.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p0 == iterator.next().b()) {
                uClass = 1;
             }
          }else {
             uClass = null;
          }
          if (uClass) {
             break ;
          }else {
             Method[] declaredMeth = p0.getClass().getDeclaredMethods();
             int len = declaredMeth.length;
             int i = 0;
             while (true) {
                if (i >= len) {
                   return;
                }
                object oobject = declaredMeth[i];
                String name = oobject.getName();
                if (name.startsWith("on") && name.endsWith("Event")) {
                   Class[] parameterTyp = oobject.getParameterTypes();
                   if (parameterTyp.length == 1) {
                      this.n.add(new fl(parameterTyp[0], oobject, p0, 0));
                   }else {
                   }
                }
                i = i + 1;
             }
             throw new IllegalArgumentException("EventHandler methods must specify a single Object paramter.");
          }
       }
       return;
    }
    public TelephonyManager b(){
       return this.f;
    }
    public synchronized void b(Object p0){
       if (p0 instanceof dj && ed.a) {
          ed.a("AppContext", "postEvent TxWifiInfo");
       }
       if (p0 == null) {
          return;
       }else {
          ce tn = this.n;
          if (tn != null) {
             Iterator iterator = tn.iterator();
             while (iterator.hasNext()) {
                fl uofl = iterator.next();
                if (!uofl.a(p0)) {
                   continue ;
                }else if(p0 instanceof dj && ed.a){
                   ed.a("AppContext", "postEvent TxWifiInfo in loop");
                }
                try{
                   Object[] objArray = new Object[]{p0};
                   uofl.a().invoke(uofl.b(), objArray);
                }catch(java.lang.Exception e1){
                   if (ed.a) {
                      ed.a("AppContext", "", e1);
                      goto label_001c ;
                   }else {
                      goto label_001c ;
                   }
                }
             }
          }
          return;
       }
    }
    public WifiManager c(){
       return this.g;
    }
    public LocationManager d(){
       return this.h;
    }
    public boolean e(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public boolean f(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public cf h(){
       return this.b;
    }
    public ExecutorService i(){
       return this.c;
    }
    public HandlerThread j(){
       _monitor_enter(ce.class);
       HandlerThread l = ce.l;
       if (l != null && (l.getLooper() == null || !ce.l.isAlive())) {
          l = new HandlerThread("GeoLocationService");
          ce.l = l;
          l.start();
       }
       _monitor_exit(ce.class);
       return ce.l;
    }
    public void k(){
       if (ed.a) {
          ed.a("AppContext", "doInBg: app status init start");
       }
       this.m();
       if (ed.a) {
          ed.a("AppContext", "doInBg: app status init done");
       }
    label_0022 :
       return;
    }
    public final PackageInfo l(){
       try{
          return this.e.getPackageInfo(this.a.getPackageName(), 0);
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          return new PackageInfo();
       }
    }
    public final void m(){
       String str = "";
       ce tb = this.b;
       PackageInfo packageInfo = this.l();
       tb.b(packageInfo.versionCode);
       tb.g(packageInfo.versionName);
       CharSequence uCharSequenc = this.a.getApplicationInfo().loadLabel(this.e);
       String str1 = (uCharSequenc != null)? uCharSequenc.toString(): "unknown";
       tb.h(str1);
       TelephonyManager telephonyMan = this.b();
       if (telephonyMan != null) {
          this.k = (eg.a(cb.b(), eg.a)).toUpperCase(Locale.ENGLISH);
          String str2 = eg.a(cb.c(), eg.b);
          tb.a(telephonyMan.getPhoneType());
          tb.a(this.k);
          tb.b(str2);
          if (ed.a) {
             ed.a("AppContext", "mDeviceId: "+this.k+"; subscriberId: "+str2+";");
          }
       }
       tb.c(eg.a(((cb.f()).replaceAll(":", str)).toUpperCase(Locale.ENGLISH), eg.d));
       ce te = this.e;
       boolean b = te.hasSystemFeature("android.hardware.location.gps");
       boolean b1 = te.hasSystemFeature("android.hardware.wifi");
       boolean b2 = te.hasSystemFeature("android.hardware.telephony");
       tb.c(b);
       tb.b(b1);
       tb.a(b2);
       if (ed.a) {
          ed.a("AppContext", "doInBg: hasGps="+b+",hasWifi="+b1+",hasCell="+b2);
       }
       if (ed.a) {
          ed.a("AppContext", "os:"+cb.g()+" "+Build$VERSION.RELEASE+" "+tb.b()+" "+" app:"+packageInfo.versionCode+" "+packageInfo.versionName+" sdk:"+" "+"7.3.7.0.official_1"+" "+"210910");
       }
       return;
    }
}
