package com.kwai.privacykit.interceptor.LocationInterceptor;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.i0;
import java.util.Objects;
import vk7.o;
import java.util.Collections;
import java.util.concurrent.Callable;
import android.telephony.CellLocation;
import vk7.p;
import android.net.wifi.WifiManager;
import vk7.m;
import android.location.LocationManager;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import vk7.l;
import android.location.Location;
import vk7.v;
import vk7.n;
import java.lang.Void;
import android.telephony.TelephonyManager$CellInfoCallback;
import android.location.LocationListener;
import android.location.Criteria;
import android.os.Looper;
import android.app.PendingIntent;
import vk7.q;
import java.lang.Long;
import java.lang.Float;
import vk7.i;
import vk7.r;
import vk7.s;
import vk7.w;
import vk7.x;
import vk7.y;
import vk7.z;
import vk7.t;
import vk7.u;
import vk7.j;
import vk7.k;

public class LocationInterceptor	// class@0013c6
{

    public void LocationInterceptor(){
       super();
    }
    public static List getAllCellInfo(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationInterceptor.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getAllCellInfo");
       Objects.requireNonNull(p0);
       return new i0("location", "TelephonyManager#getAllCellInfo", new o(p0), Collections.emptyList()).a();
    }
    public static CellLocation getCellLocation(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationInterceptor.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getCellLocation");
       Objects.requireNonNull(p0);
       return new i0("location", "TelephonyManager#getCellLocation", new p(p0), null).a();
    }
    public static List getConfiguredNetworks(WifiManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationInterceptor.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: WifiManager#getConfiguredNetworks");
       Objects.requireNonNull(p0);
       return new i0("location", "WifiManager#getConfiguredNetworks", new m(p0), Collections.emptyList()).a();
    }
    public static void getCurrentLocation(LocationManager p0,String p1,CancellationSignal p2,Executor p3,Consumer p4){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "1")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#getCurrentLocation");
       l ol = new l(p0, p1, p2, p3, p4);
       new i0("location", "LocationManager#getCurrentLocation", objArray, null).a();
       return;
    }
    public static Location getLastKnownLocation(LocationManager p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LocationInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: LocationManager#getLastKnownLocation");
       return new i0("location", "LocationManager#getLastKnownLocation", new v(p0, p1), null).a();
    }
    public static List getScanResults(WifiManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationInterceptor.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: WifiManager#getScanResults");
       Objects.requireNonNull(p0);
       return new i0("location", "WifiManager#getScanResults", new n(p0), Collections.emptyList()).a();
    }
    public static Void lambda$getCurrentLocation$0(LocationManager p0,String p1,CancellationSignal p2,Executor p3,Consumer p4){
       p0.getCurrentLocation(p1, p2, p3, p4);
       return null;
    }
    public static Location lambda$getLastKnownLocation$1(LocationManager p0,String p1){
       return p0.getLastKnownLocation(p1);
    }
    public static Void lambda$requestCellInfoUpdate$13(TelephonyManager p0,Executor p1,TelephonyManager$CellInfoCallback p2){
       p0.requestCellInfoUpdate(p1, p2);
       return null;
    }
    public static Void lambda$requestLocationUpdates$2(LocationManager p0,String p1,long p2,float p3,LocationListener p4){
       p0.requestLocationUpdates(p1, p2, p3, p4);
       return null;
    }
    public static Void lambda$requestLocationUpdates$3(LocationManager p0,long p1,float p2,Criteria p3,LocationListener p4,Looper p5){
       p0.requestLocationUpdates(p1, p2, p3, p4, p5);
       return null;
    }
    public static Void lambda$requestLocationUpdates$4(LocationManager p0,String p1,long p2,float p3,LocationListener p4,Looper p5){
       p0.requestLocationUpdates(p1, p2, p3, p4, p5);
       return null;
    }
    public static Void lambda$requestLocationUpdates$5(LocationManager p0,String p1,long p2,float p3,Executor p4,LocationListener p5){
       p0.requestLocationUpdates(p1, p2, p3, p4, p5);
       return null;
    }
    public static Void lambda$requestLocationUpdates$6(LocationManager p0,long p1,float p2,Criteria p3,PendingIntent p4){
       p0.requestLocationUpdates(p1, p2, p3, p4);
       return null;
    }
    public static Void lambda$requestLocationUpdates$7(LocationManager p0,long p1,float p2,Criteria p3,Executor p4,LocationListener p5){
       p0.requestLocationUpdates(p1, p2, p3, p4, p5);
       return null;
    }
    public static Void lambda$requestLocationUpdates$8(LocationManager p0,String p1,long p2,float p3,PendingIntent p4){
       p0.requestLocationUpdates(p1, p2, p3, p4);
       return null;
    }
    public static Void lambda$requestSingleUpdate$10(LocationManager p0,Criteria p1,PendingIntent p2){
       p0.requestSingleUpdate(p1, p2);
       return null;
    }
    public static Void lambda$requestSingleUpdate$11(LocationManager p0,String p1,LocationListener p2,Looper p3){
       p0.requestSingleUpdate(p1, p2, p3);
       return null;
    }
    public static Void lambda$requestSingleUpdate$12(LocationManager p0,Criteria p1,LocationListener p2,Looper p3){
       p0.requestSingleUpdate(p1, p2, p3);
       return null;
    }
    public static Void lambda$requestSingleUpdate$9(LocationManager p0,String p1,PendingIntent p2){
       p0.requestSingleUpdate(p1, p2);
       return null;
    }
    public static void requestCellInfoUpdate(TelephonyManager p0,Executor p1,TelephonyManager$CellInfoCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LocationInterceptor.class, "18")) {
          return;
       }
       i0.b("onEnter: TelephonyManager#requestCellInfoUpdate");
       new i0("location", "TelephonyManager#requestCellInfoUpdate", new q(p0, p1, p2), null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,long p1,float p2,Criteria p3,PendingIntent p4){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,Long.valueOf(p1),Float.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "7")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       i oi = new i(p0, p1, p2, p3, p4);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,long p1,float p2,Criteria p3,LocationListener p4,Looper p5){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,Long.valueOf(p1),Float.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "4")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       r or = new r(p0, p1, p2, p3, p4, p5);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,long p1,float p2,Criteria p3,Executor p4,LocationListener p5){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,Long.valueOf(p1),Float.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "8")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       s os = new s(p0, p1, p2, p3, p4, p5);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,String p1,long p2,float p3,PendingIntent p4){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,p1,Long.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "9")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       w ow = new w(p0, p1, p2, p3, p4);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,String p1,long p2,float p3,LocationListener p4){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,p1,Long.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "3")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       x ox = new x(p0, p1, p2, p3, p4);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,String p1,long p2,float p3,LocationListener p4,Looper p5){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,p1,Long.valueOf(p2),Float.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "5")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       y oy = new y(p0, p1, p2, p3, p4, p5);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestLocationUpdates(LocationManager p0,String p1,long p2,float p3,Executor p4,LocationListener p5){
       Object[] objArray;
       LocationInterceptor locationInte = LocationInterceptor.class;
       if (PatchProxy.isSupport(locationInte)) {
          objArray = new Object[]{p0,p1,Long.valueOf(p2),Float.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, locationInte, "6")) {
             return;
          }
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       z oz = new z(p0, p1, p2, p3, p4, p5);
       new i0("location", "LocationManager#requestLocationUpdates", objArray, null).a();
       return;
    }
    public static void requestSingleUpdate(LocationManager p0,Criteria p1,PendingIntent p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LocationInterceptor.class, "11")) {
          return;
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       new i0("location", "LocationManager#requestSingleUpdate", new t(p0, p1, p2), null).a();
       return;
    }
    public static void requestSingleUpdate(LocationManager p0,Criteria p1,LocationListener p2,Looper p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, LocationInterceptor.class, "13")) {
          return;
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       new i0("location", "LocationManager#requestSingleUpdate", new u(p0, p1, p2, p3), null).a();
       return;
    }
    public static void requestSingleUpdate(LocationManager p0,String p1,PendingIntent p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LocationInterceptor.class, "10")) {
          return;
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       new i0("location", "LocationManager#requestSingleUpdate", new j(p0, p1, p2), null).a();
       return;
    }
    public static void requestSingleUpdate(LocationManager p0,String p1,LocationListener p2,Looper p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, LocationInterceptor.class, "12")) {
          return;
       }
       i0.b("onEnter: LocationManager#requestLocationUpdates");
       new i0("location", "LocationManager#requestSingleUpdate", new k(p0, p1, p2, p3), null).a();
       return;
    }
}
