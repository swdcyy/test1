package com.reactnativecommunity.netinfo.NetInfoModule;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$a;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import ok8.c;
import ok8.b;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import ok8.c$c;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller$Receiver;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.Boolean;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import java.util.Iterator;
import java.lang.ref.WeakReference;

public class NetInfoModule extends ReactContextBaseJavaModule implements AmazonFireDeviceConnectivityPoller$a	// class@000b66
{
    public final AmazonFireDeviceConnectivityPoller mAmazonConnectivityChecker;

    public void NetInfoModule(ReactApplicationContext p0){
       super(p0);
       c.g().f(p0);
       this.mAmazonConnectivityChecker = new AmazonFireDeviceConnectivityPoller(p0, this);
    }
    public void getCurrentState(String p0,Promise p1){
       c uoc = c.g();
       _monitor_enter(uoc);
       c a = uoc.a;
       if (a == null) {
          p1.reject("-999", "not register network info listener");
          _monitor_exit(uoc);
       }else {
          p1.resolve(a.a(p0));
          _monitor_exit(uoc);
       }
       return;
    }
    public String getName(){
       return "RNCNetInfo";
    }
    public void initialize(){
       c uoc = c.g();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       _monitor_enter(uoc);
       if (uoc.b.isEmpty()) {
          uoc.f(reactApplica).d();
       }
       uoc.b.add(new c$c(reactApplica));
       _monitor_exit(uoc);
       NetInfoModule tmAmazonConn = this.mAmazonConnectivityChecker;
       if (tmAmazonConn.a()) {
          if (tmAmazonConn.a.a == null) {
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
             intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
             UniversalReceiver.e(tmAmazonConn.b, tmAmazonConn.a, intentFilter);
             tmAmazonConn.a.a = true;
          }
          if (tmAmazonConn.f == null) {
             Handler handler = new Handler();
             tmAmazonConn.e = handler;
             tmAmazonConn.f = true;
             handler.post(tmAmazonConn.d);
          }
       }
       return;
    }
    public void onAmazonFireDeviceConnectivityChanged(boolean p0){
       c uoc = c.g();
       _monitor_enter(uoc);
       c a = uoc.a;
       if (a == null) {
          _monitor_exit(uoc);
       }else {
          a.h = Boolean.valueOf(p0);
          a.g(a.e, a.f, a.g);
          _monitor_exit(uoc);
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       NetInfoModule tmAmazonConn = this.mAmazonConnectivityChecker;
       boolean b = false;
       if (!tmAmazonConn.a()) {
       }else if(tmAmazonConn.f == null){
          tmAmazonConn.f = b;
          tmAmazonConn.e.removeCallbacksAndMessages(null);
          tmAmazonConn.e = null;
       }
       AmazonFireDeviceConnectivityPoller a1 = tmAmazonConn.a;
       if (a1.a != null) {
          UniversalReceiver.f(tmAmazonConn.b, a1);
          tmAmazonConn.a.a = b;
       }
       c uoc = c.g();
       _monitor_enter(uoc);
       uoc.b.remove(new c$c(this.getReactApplicationContext()));
       Iterator iterator = uoc.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().a.get() == null) {
                continue ;
             }
          }else {
             b = 1;
          }
          if (b) {
             uoc.b.clear();
          }
          if (uoc.b.isEmpty()) {
             c a = uoc.a;
             if (a != null) {
                a.f();
                uoc.a = null;
                break ;
             }
          }
          break ;
       }
       _monitor_exit(uoc);
       return;
    }
}
