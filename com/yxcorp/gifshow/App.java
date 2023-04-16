package com.yxcorp.gifshow.App;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.os.Handler;
import android.content.Intent;
import android.content.ContextWrapper;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ukd.a;
import com.yxcorp.gifshow.ApplicationLike;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Configuration;
import java.lang.Integer;
import android.content.ComponentCallbacks;
import uv8.b;
import z1.k;
import uv8.c;
import uv8.d;
import uv8.e;

public class App extends Application	// class@001024
{
    public ApplicationLike b;

    public void App(){
       super();
    }
    public static Intent a(App p0,BroadcastReceiver p1,IntentFilter p2,String p3,Handler p4){
       return super.registerReceiver(p1, p2, p3, p4);
    }
    public static Intent b(App p0,BroadcastReceiver p1,IntentFilter p2){
       return super.registerReceiver(p1, p2);
    }
    public static Intent c(App p0,BroadcastReceiver p1,IntentFilter p2,int p3){
       return super.registerReceiver(p1, p2, p3);
    }
    public static Intent d(App p0,BroadcastReceiver p1,IntentFilter p2,String p3,Handler p4,int p5){
       return super.registerReceiver(p1, p2, p3, p4, p5);
    }
    public void attachBaseContext(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, App.class, "1")) {
          return;
       }
       super.attachBaseContext(p0);
       Object[] objArray = new Object[]{this};
       ApplicationLike uApplication = a.l("com.yxcorp.gifshow.AppLike", objArray);
       this.b = uApplication;
       uApplication.attachBaseContext(p0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, App.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getResources(super.getResources());
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, App.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.b.onConfigurationChanged(p0);
       return;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, App.class, "2")) {
          return;
       }
       super.onCreate();
       this.b.onCreate();
       return;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, App.class, "3")) {
          return;
       }
       super.onLowMemory();
       this.b.onLowMemory();
       return;
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(App.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, App.class, "4")) {
          return;
       }
       super.onTrimMemory(p0);
       this.b.onTrimMemory(p0);
       return;
    }
    public void registerComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, App.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       super.registerComponentCallbacks(p0);
       return;
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, App.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.registerReceiver(p0, p1, new b(this, p0, p1));
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,int p2){
       if (PatchProxy.isSupport(App.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, App.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.registerReceiver(p0, p1, p2, new c(this, p0, p1, p2));
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, App.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = new d(this, p0, p1, p2, p3);
       return this.b.registerReceiver(p0, p1, p2, p3, obj);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,int p4){
       Object obj;
       if (PatchProxy.isSupport(App.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, App.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e uoe = new e(this, p0, p1, p2, p3, p4);
       return this.b.registerReceiver(p0, p1, p2, p3, p4, obj);
    }
    public void unregisterComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, App.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       super.unregisterComponentCallbacks(p0);
       return;
    }
}
