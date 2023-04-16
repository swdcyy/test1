package com.tencent.map.geolocation.TencentLocationManager;
import android.content.Context;
import java.lang.Object;
import com.tencent.map.geolocation.TencentLocationManager$1;
import com.tencent.map.geolocation.TencentLocationBridge;
import java.lang.NullPointerException;
import java.lang.String;
import c.t.m.g.ex;
import c.t.m.g.ez;
import java.lang.ClassLoader;
import dalvik.system.PathClassLoader;
import c.t.m.g.dx;
import dalvik.system.DexClassLoader;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.tencent.map.geolocation.s;
import android.content.ServiceConnection;
import c.t.m.g.cd;
import android.app.Notification;
import android.content.Intent;
import android.os.Parcelable;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.IllegalArgumentException;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationRequest;
import android.os.Looper;
import java.util.Objects;
import java.lang.StringBuilder;

public final class TencentLocationManager	// class@000e5e
{
    public boolean a;
    public final byte[] b;
    public TencentLocationBridge d;
    public Context e;
    public ServiceConnection f;
    public static TencentLocationManager c;

    public void TencentLocationManager(Context p0){
       super();
       this.a = false;
       byte[] uobyteArray = new byte[false];
       this.b = uobyteArray;
       this.f = new TencentLocationManager$1(this);
       this.e = p0;
       this.d = this.a();
    }
    public static synchronized TencentLocationManager getInstance(Context p0){
       _monitor_enter(TencentLocationManager.class);
       if (TencentLocationManager.c == null) {
          if (p0 != null) {
             if (p0.getApplicationContext() != null) {
                TencentLocationManager.c = new TencentLocationManager(p0.getApplicationContext());
             }else {
                throw new NullPointerException("application context is null");
             }
          }else {
             throw new NullPointerException("context is null");
          }
       }
       _monitor_exit(TencentLocationManager.class);
       return TencentLocationManager.c;
    }
    public final TencentLocationBridge a(){
       TencentLocationManager td = this.d;
       if (td != null) {
          return td;
       }
       if (ex.a) {
          ex.a("resetEntry", "iLocationManager will be init");
       }
       dx uodx = null;
       ClassLoader uClassLoader = ez.a(this.e).a();
       if (uClassLoader instanceof PathClassLoader) {
          uodx = new dx(this.e);
       }else if(uClassLoader instanceof DexClassLoader){
          Class[] uClassArray = new Class[]{Context.class};
          Object[] objArray = new Object[]{this.e};
          uodx = uClassLoader.loadClass("com.tencent.map.geolocation.proxy.TLManagerProxy").getConstructor(uClassArray).newInstance(objArray);
       }
       if (uodx == null) {
          uodx = new dx(this.e);
       }
       return uodx;
    }
    public void disableForegroundLocation(boolean p0){
       if (this.a != null) {
          s.removeNotification = p0;
          this.e.unbindService(this.f);
          this.a = false;
          cd.c().a("LOC", "disableForegroundLocation");
       }
       return;
    }
    public void enableForegroundLocation(int p0,Notification p1){
       if (p0 <= 0 || p1 == null) {
          throw new IllegalArgumentException("enableForegroundLocation illegalArgument");
       }
       if (this.a == null) {
          Intent intent = new Intent(this.e, s.class);
          intent.putExtra("LocNotification", p1);
          intent.putExtra("LocNotificationId", p0);
          a.a(this.e, intent, this.f, 1);
          this.a = true;
          cd.c().a("LOC", "enableForegroundLocation");
       }
       return;
    }
    public String getBuild(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.getBuild();
    }
    public int getCoordinateType(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.getCoordinateType();
    }
    public TencentLocation getLastKnownLocation(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.getLastKnownLocation();
    }
    public String getVersion(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.getVersion();
    }
    public void removeUpdates(TencentLocationListener p0){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       tencentLocat.removeUpdates(p0);
       _monitor_exit(tb);
    }
    public int requestLocationUpdates(TencentLocationRequest p0,TencentLocationListener p1){
       return this.requestLocationUpdates(p0, p1, Looper.myLooper());
    }
    public int requestLocationUpdates(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       Objects.requireNonNull(p0, "request is null");
       Objects.requireNonNull(p1, "listener is null");
       Objects.requireNonNull(p2, "looper is null");
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.requestLocationUpdates(p0, p1, p2);
    }
    public int requestSingleFreshLocation(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       Objects.requireNonNull(p1, "listener is null");
       Objects.requireNonNull(p2, "looper is null");
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.requestSingleFreshLocation(p0, p1, p2);
    }
    public void setCoordinateType(int p0){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       if (p0 != 1 && p0) {
          throw new IllegalArgumentException("unknown coordinate type: "+p0);
       }
       TencentLocationManager tb1 = this.b;
       _monitor_enter(tb1);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       tencentLocat.setCoordinateType(p0);
       _monitor_exit(tb1);
       _monitor_exit(tb);
       return;
    }
    public void setDebuggable(boolean p0){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       tencentLocat.setDebuggable(p0);
       _monitor_exit(tb);
    }
    public void setDeviceID(Context p0,String p1){
       if (p1.length() > 32 || p1.length() <= 0) {
          throw new IllegalArgumentException("setDeviceID, deviceID length must equal or less than 32 AND more than 0");
       }
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       tencentLocat.setDeviceID(p0, p1);
       _monitor_exit(tb);
       return;
    }
    public boolean startIndoorLocation(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.startIndoorLocation();
    }
    public boolean stopIndoorLocation(){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       _monitor_exit(tb);
       return tencentLocat.stopIndoorLocation();
    }
    public void triggerCodeGuarder(boolean p0){
       TencentLocationManager tb = this.b;
       _monitor_enter(tb);
       TencentLocationBridge tencentLocat = this.a();
       this.d = tencentLocat;
       tencentLocat.triggerCodeGuarder(p0);
       _monitor_exit(tb);
    }
}
