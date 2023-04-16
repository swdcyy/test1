package com.kwai.plugin.dva.hook.component.PluginActivity;
import android.app.Activity;
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
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ClassLoader;
import android.view.LayoutInflater;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import com.kwai.plugin.dva.Dva;
import cj7.a;
import android.view.ContextThemeWrapper;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import java.lang.StringBuilder;
import qj7.d;
import android.content.ComponentName;

public class PluginActivity extends Activity	// class@00132b
{
    public LayoutInflater mLayoutInflater;
    public Plugin mPlugin;
    public Resources mResources;

    public void PluginActivity(){
       super();
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       if (PatchProxy.isSupport(PluginActivity.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginActivity.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ServiceManager.a(this.getPlugin(), this.getBaseContext(), p0, p1, p2);
    }
    public Context getApplicationContext(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getApplication();
    }
    public ApplicationInfo getApplicationInfo(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getPackageInfo().applicationInfo;
    }
    public AssetManager getAssets(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getResources().getAssets();
    }
    public ClassLoader getClassLoader(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPlugin().getClassLoader();
    }
    public Intent getIntent(){
       Intent obj = PatchProxy.apply(null, this, PluginActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getIntent();
       obj.setExtrasClassLoader(this.getClassLoader());
       return obj;
    }
    public LayoutInflater getLayoutInflater(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginLayoutInflater.build(super.getLayoutInflater(), this, this.getPlugin().getName());
    }
    public Plugin getPlugin(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPlugin == null) {
          this.mPlugin = Dva.instance().getPluginByClass(this.getClass().getName());
       }
       return this.mPlugin;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PluginActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mResources == null) {
          this.mResources = new a(super.getResources(), this.getPlugin().getResources());
       }
       return this.mResources;
    }
    public Object getSystemService(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginActivity.class, "8");
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
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginActivity.class, "2")) {
          return;
       }
       this.removeUnSupportReportFragment();
       super.onSaveInstanceState(p0);
       return;
    }
    public final void removeUnSupportReportFragment(){
       if (PatchProxy.applyVoid(null, this, PluginActivity.class, "3")) {
          return;
       }
       FragmentManager fragmentMana = this.getFragmentManager();
       if (fragmentMana != null) {
          Fragment uFragment = fragmentMana.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
          if (uFragment != null && uFragment.getClass().getClassLoader() != this.mPlugin.getClassLoader()) {
             fragmentMana.beginTransaction().remove(uFragment).commitAllowingStateLoss();
             d.a("remove activity "+this+" unsupport report fragment : "+uFragment+" class loader: "+uFragment.getClass().getClassLoader());
          }
       }
       return;
    }
    public ComponentName startForegroundService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.c(this.getPlugin(), this.getBaseContext(), p0);
    }
    public ComponentName startService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ServiceManager.d(this.getPlugin(), this.getBaseContext(), p0);
    }
    public boolean stopService(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ServiceManager.e(this.getPlugin(), this.getBaseContext(), p0);
    }
    public void unbindService(ServiceConnection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginActivity.class, "16")) {
          return;
       }
       ServiceManager.f(this.getPlugin(), p0);
       return;
    }
}
