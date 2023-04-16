package com.kwai.plugin.dva.hook.component.PluginService;
import android.app.Service;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.entity.Plugin;
import android.app.Application;
import com.kwai.plugin.dva.util.b;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.plugin.dva.hook.component.service.ServiceManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.hook.component.service.ProxyService;
import cj7.a;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import android.content.res.Resources$Theme;
import java.lang.Number;
import android.content.ComponentName;

public abstract class PluginService extends Service	// class@001330
{
    public LayoutInflater mLayoutInflater;
    public Plugin mPlugin;
    public ProxyService mProxyService;
    public Resources mResources;
    public boolean mRunningInProxy;
    public Resources$Theme mTheme;

    public void PluginService(){
       super();
       this.mTheme = null;
    }
    public void attach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginService.class, "1")) {
          return;
       }
       b.m(this, "mApplication", this.getPlugin().getApplication());
       this.attachBaseContext(p0);
       return;
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       if (PatchProxy.isSupport(PluginService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginService.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ServiceManager.a(this.getPlugin(), this.getBaseContext(), p0, p1, p2);
    }
    public Context getApplicationContext(){
       Object obj = PatchProxy.apply(null, this, PluginService.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getApplication();
    }
    public AssetManager getAssets(){
       Object obj = PatchProxy.apply(null, this, PluginService.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getResources().getAssets();
    }
    public ClassLoader getClassLoader(){
       Object obj = PatchProxy.apply(null, this, PluginService.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getClassLoader();
    }
    public final Plugin getPlugin(){
       return this.mPlugin;
    }
    public ProxyService getProxyService(){
       return this.mProxyService;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PluginService.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mResources == null) {
          this.mResources = new a(super.getResources(), this.getPlugin().getResources());
       }
       return this.mResources;
    }
    public Object getSystemService(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginService.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!("layout_inflater").equals(p0)) {
          return super.getSystemService(p0);
       }
       if (this.mLayoutInflater == null) {
          this.mLayoutInflater = PluginLayoutInflater.build(super.getSystemService(p0), this, this.getPlugin().getName());
       }
       return this.mLayoutInflater;
    }
    public Resources$Theme getTheme(){
       Object obj = PatchProxy.apply(null, this, PluginService.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mTheme == null) {
          this.mTheme = this.getResources().newTheme();
          this.mTheme.setTo(this.getBaseContext().getTheme());
       }
       return this.mTheme;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (PatchProxy.isSupport(PluginService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PluginService.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0.setExtrasClassLoader(this.getClassLoader());
       return super.onStartCommand(p0, p1, p2);
    }
    public void setPlugin(Plugin p0){
       this.mPlugin = p0;
    }
    public void setProxyService(ProxyService p0){
       this.mProxyService = p0;
    }
    public ComponentName startForegroundService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginService.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.c(this.getPlugin(), this.getBaseContext(), p0);
    }
    public ComponentName startService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginService.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.d(this.getPlugin(), this.getBaseContext(), p0);
    }
    public boolean stopService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginService.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ServiceManager.e(this.getPlugin(), this.getBaseContext(), p0);
    }
    public void unbindService(ServiceConnection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginService.class, "13")) {
          return;
       }
       ServiceManager.f(this.getPlugin(), p0);
       return;
    }
}
