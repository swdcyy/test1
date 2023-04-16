package com.kwai.plugin.dva.hook.component.PluginContext;
import android.content.ContextWrapper;
import android.content.Context;
import com.kwai.plugin.dva.entity.Plugin;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.plugin.dva.hook.component.service.ServiceManager;
import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ClassLoader;
import cj7.a;
import android.view.LayoutInflater;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import android.content.ComponentName;

public class PluginContext extends ContextWrapper	// class@00132f
{
    public final Plugin a;
    public LayoutInflater b;
    public Resources c;
    public Context d;

    public void PluginContext(Context p0,Plugin p1){
       super(p0);
       this.a = p1;
       this.d = p0;
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       if (PatchProxy.isSupport(PluginContext.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginContext.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ServiceManager.a(this.getPlugin(), this.getBaseContext(), p0, p1, p2);
    }
    public Context getApplicationContext(){
       Object obj = PatchProxy.apply(null, this, PluginContext.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getApplication();
    }
    public AssetManager getAssets(){
       Object obj = PatchProxy.apply(null, this, PluginContext.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getResources().getAssets();
    }
    public ClassLoader getClassLoader(){
       Object obj = PatchProxy.apply(null, this, PluginContext.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getClassLoader();
    }
    public Plugin getPlugin(){
       return this.a;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PluginContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new a(this.d.getResources(), this.getPlugin().getResources());
       }
       return this.c;
    }
    public Object getSystemService(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginContext.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!("layout_inflater").equals(p0)) {
          return super.getSystemService(p0);
       }
       if (this.b == null) {
          this.b = PluginLayoutInflater.build(super.getSystemService(p0), this, this.getPlugin().getName());
       }
       return this.b;
    }
    public ComponentName startForegroundService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginContext.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.c(this.getPlugin(), this.getBaseContext(), p0);
    }
    public ComponentName startService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginContext.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.d(this.getPlugin(), this.getBaseContext(), p0);
    }
    public boolean stopService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginContext.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ServiceManager.e(this.getPlugin(), this.getBaseContext(), p0);
    }
    public void unbindService(ServiceConnection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginContext.class, "10")) {
          return;
       }
       ServiceManager.f(this.getPlugin(), p0);
       return;
    }
}
