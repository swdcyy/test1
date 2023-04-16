package com.kwai.plugin.dva.hook.component.PluginApplication;
import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.plugin.dva.entity.Plugin;
import android.content.Context;
import com.kwai.plugin.dva.hook.component.service.ServiceManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ClassLoader;
import cj7.a;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import android.view.LayoutInflater;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import android.content.ContextWrapper;
import android.content.res.Resources$Theme;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import com.kwai.plugin.dva.hook.component.PluginApplication$1;
import android.content.ComponentCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.plugin.dva.hook.component.PluginApplication$2;
import android.app.Application$OnProvideAssistDataListener;
import qj7.d;
import android.content.ComponentName;

public class PluginApplication extends Application	// class@00132e
{
    public Application mHostApplication;
    public LayoutInflater mLayoutInflater;
    public Plugin mPlugin;
    public Resources mResources;
    public Resources$Theme mTheme;

    public void PluginApplication(){
       super();
       this.mTheme = null;
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       if (PatchProxy.isSupport(PluginApplication.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginApplication.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ServiceManager.a(this.getPlugin(), this.getBaseContext(), p0, p1, p2);
    }
    public Context getApplicationContext(){
       Object obj = PatchProxy.apply(null, this, PluginApplication.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getApplication();
    }
    public AssetManager getAssets(){
       Object obj = PatchProxy.apply(null, this, PluginApplication.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getResources().getAssets();
    }
    public ClassLoader getClassLoader(){
       Object obj = PatchProxy.apply(null, this, PluginApplication.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mPlugin.getClassLoader();
    }
    public Plugin getPlugin(){
       return this.mPlugin;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PluginApplication.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mResources == null) {
          this.mResources = new a(this.mHostApplication.getResources(), this.getPlugin().getResources());
       }
       return this.mResources;
    }
    public Object getSystemService(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginApplication.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!("layout_inflater").equals(p0)) {
          return super.getSystemService(p0);
       }
       System.out.println("Dva application get layout inflater "+this.mPlugin.getName());
       if (this.mLayoutInflater == null) {
          this.mLayoutInflater = PluginLayoutInflater.build(this.mHostApplication.getSystemService(p0), this, this.getPlugin().getName());
       }
       return this.mLayoutInflater;
    }
    public Resources$Theme getTheme(){
       ApplicationInfo obj = PatchProxy.apply(null, this, PluginApplication.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mTheme == null) {
          this.mTheme = this.getResources().newTheme();
          this.mTheme.setTo(this.mHostApplication.getTheme());
          obj = this.getPlugin().getPackageInfo().applicationInfo.theme;
          if (obj > null) {
             this.mTheme.applyStyle(obj, true);
          }
       }
       return this.mTheme;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, PluginApplication.class, "2")) {
          return;
       }
       this.mHostApplication.registerComponentCallbacks(new PluginApplication$1(this));
       return;
    }
    public void registerActivityLifecycleCallbacks(Application$ActivityLifecycleCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "5")) {
          return;
       }
       this.mHostApplication.registerActivityLifecycleCallbacks(new PluginApplication$2(this, p0));
       return;
    }
    public void registerComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "3")) {
          return;
       }
       this.mHostApplication.registerComponentCallbacks(p0);
       return;
    }
    public void registerOnProvideAssistDataListener(Application$OnProvideAssistDataListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "7")) {
          return;
       }
       this.mHostApplication.registerOnProvideAssistDataListener(p0);
       return;
    }
    public void setCurrentPlugin(Plugin p0){
       if (this.mPlugin == null) {
          this.mPlugin = p0;
       }
       return;
    }
    public void setHostApplication(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "1")) {
          return;
       }
       d.c("set host application for "+this.mPlugin.getName());
       if (this.getBaseContext() == null) {
          this.attachBaseContext(p0);
          this.mHostApplication = p0;
          d.c("set host application for "+this.mPlugin.getName()+" success");
       }else {
          d.c("set host application for "+this.mPlugin.getName()+" fail, baseContext already set");
       }
       return;
    }
    public ComponentName startForegroundService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginApplication.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.c(this.getPlugin(), this.getBaseContext(), p0);
    }
    public ComponentName startService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginApplication.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.d(this.getPlugin(), this.getBaseContext(), p0);
    }
    public boolean stopService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginApplication.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ServiceManager.e(this.getPlugin(), this.getBaseContext(), p0);
    }
    public void unbindService(ServiceConnection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "19")) {
          return;
       }
       ServiceManager.f(this.getPlugin(), p0);
       return;
    }
    public void unregisterActivityLifecycleCallbacks(Application$ActivityLifecycleCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "6")) {
          return;
       }
       this.mHostApplication.unregisterActivityLifecycleCallbacks(p0);
       return;
    }
    public void unregisterComponentCallbacks(ComponentCallbacks p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "4")) {
          return;
       }
       this.mHostApplication.unregisterComponentCallbacks(p0);
       return;
    }
    public void unregisterOnProvideAssistDataListener(Application$OnProvideAssistDataListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication.class, "8")) {
          return;
       }
       this.mHostApplication.unregisterOnProvideAssistDataListener(p0);
       return;
    }
}
