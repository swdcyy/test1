package aegon.chrome.net.ProxyChangeListener;
import java.lang.Object;
import android.os.Looper;
import android.os.Handler;
import android.content.Intent;
import aegon.chrome.net.ProxyChangeListener$d;
import android.os.Bundle;
import java.lang.String;
import android.net.ProxyInfo;
import java.lang.System;
import h0.a;
import java.lang.IllegalStateException;
import android.content.Context;
import a0.f;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import aegon.chrome.net.ProxyChangeListener$b;
import aegon.chrome.net.ProxyChangeListener$c;
import aegon.chrome.net.k;
import K.S;
import android.content.IntentFilter;
import aegon.chrome.net.ProxyChangeListener$ProxyReceiver;
import aegon.chrome.net.ProxyChangeListener$a;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import aegon.chrome.net.ProxyBroadcastReceiver;
import java.lang.Runnable;

public class ProxyChangeListener	// class@000089
{
    public final Looper a;
    public final Handler b;
    public long c;
    public ProxyChangeListener$ProxyReceiver d;
    public BroadcastReceiver e;
    public ProxyChangeListener$b f;
    public static boolean g = true;
    public static final boolean h;

    public void ProxyChangeListener(){
       super();
       Looper looper = Looper.myLooper();
       this.a = looper;
       this.b = new Handler(looper);
    }
    public static ProxyChangeListener$d b(Intent p0){
       Bundle extras = p0.getExtras();
       if (extras == null) {
          return null;
       }
       return ProxyChangeListener$d.a(extras.get("android.intent.extra.PROXY_INFO"));
    }
    public static ProxyChangeListener create(){
       return new ProxyChangeListener();
    }
    public static String getProperty(String p0){
       return System.getProperty(p0);
    }
    public final void a(){
       if (!a.b || this.d()) {
          return;
       }
       throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
    }
    public final ProxyChangeListener$d c(Intent p0){
       try{
          ProxyInfo defaultProxy = f.a().getSystemService("connectivity").getDefaultProxy();
          if (defaultProxy == null || defaultProxy.getHost() == null) {
             return ProxyChangeListener$d.e;
          }
          if (Build$VERSION.SDK_INT >= 29 && ((defaultProxy.getHost()).equals("localhost") && defaultProxy.getPort() == -1)) {
             return ProxyChangeListener.b(p0);
          }
          return ProxyChangeListener$d.a(defaultProxy);
       }catch(java.lang.Exception e0){
          return ProxyChangeListener$d.e;
       }
    }
    public final boolean d(){
       boolean b = (this.a == Looper.myLooper())? true: false;
       return b;
    }
    public void e(ProxyChangeListener$d p0){
       this.a();
       if (!ProxyChangeListener.g) {
          return;
       }
       ProxyChangeListener tf = this.f;
       if (tf != null) {
          tf.a();
       }
       if (!this.c) {
          return;
       }else if(p0 != null){
          k.c();
          S.MyoFZt$2(this.c, this, p0.a, p0.b, p0.c, p0.d);
       }else {
          k.c();
          S.MCIk73GZ(this.c, this);
       }
       return;
    }
    public final void f(){
       this.a();
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.PROXY_CHANGE");
       this.d = new ProxyChangeListener$ProxyReceiver(this, null);
       if (Build$VERSION.SDK_INT < 23) {
          UniversalReceiver.e(f.a(), this.d, intentFilter);
       }else {
          UniversalReceiver.e(f.a(), this.d, new IntentFilter());
          this.e = new ProxyBroadcastReceiver(this);
          UniversalReceiver.e(f.a(), this.e, intentFilter);
       }
       return;
    }
    public void g(Runnable p0){
       if (this.d()) {
          p0.run();
       }else {
          this.b.post(p0);
       }
       return;
    }
    public void start(long p0){
       this.a();
       this.c = p0;
       this.f();
    }
    public void stop(){
       this.a();
       this.c = 0;
       this.a();
       UniversalReceiver.f(f.a(), this.d);
       if (this.e != null) {
          UniversalReceiver.f(f.a(), this.e);
       }
       this.d = null;
       this.e = null;
       return;
    }
}
