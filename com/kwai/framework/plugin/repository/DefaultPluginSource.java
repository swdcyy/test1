package com.kwai.framework.plugin.repository.DefaultPluginSource;
import rd6.d;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import ae6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.repository.DefaultPluginSource$mConfigValidator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.plugin.repository.DefaultPluginSource$pluginDatabase$2;
import sd6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.repository.persistence.PluginDatabase;
import sd6.d;
import java.lang.Boolean;
import ad6.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import od6.x;
import km8.b;
import o56.a;
import od6.k;
import java.lang.reflect.Type;
import java.util.List;
import brd.a0;
import fg6.a;
import com.google.gson.Gson;
import td6.a;
import com.kwai.framework.plugin.repository.DefaultPluginSource$a;
import erd.o;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.CharSequence;
import java.lang.Long;
import com.kwai.framework.plugin.repository.DefaultPluginSource$b;

public final class DefaultPluginSource implements d	// class@000cba
{
    public final p a;
    public final p b;
    public final RemoteProvider c;
    public final f d;

    public void DefaultPluginSource(RemoteProvider p0,f p1){
       a.p(p0, "remoteProvider");
       a.p(p1, "pluginDatabaseGetter");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(DefaultPluginSource$mConfigValidator$2.INSTANCE);
       this.b = s.c(new DefaultPluginSource$pluginDatabase$2(this));
    }
    public g a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPluginSource.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pluginName");
       return this.s().E().a(p0);
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.getBoolean("enablePathClassLoaderMode", true);
    }
    public void c(boolean p0){
       DefaultPluginSource uDefaultPlug = DefaultPluginSource.class;
       if (PatchProxy.isSupport(uDefaultPlug) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDefaultPlug, "14")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("enablePathClassLoaderMode", p0);
       g.a(uEditor);
       return;
    }
    public void d(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPluginSource.class, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("current_plugin_wrap", b.e(p0));
       g.a(uEditor);
       return;
    }
    public void e(boolean p0){
       DefaultPluginSource uDefaultPlug = DefaultPluginSource.class;
       if (PatchProxy.isSupport(uDefaultPlug) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDefaultPlug, "18")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("hookDynamicFeatureResources", p0);
       g.a(uEditor);
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d()) {
          return true;
       }
       return b.a.getBoolean("enableHostLibraryFirst", true);
    }
    public k g(){
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, DefaultPluginSource.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.class;
       String str = b.a.getString("current_feature_wrap", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d()) {
          return true;
       }
       return b.a.getBoolean("verifyPluginFileByFastMode", false);
    }
    public x i(){
       Object[] objArray = null;
       x obj = PatchProxy.apply(objArray, this, DefaultPluginSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = x.class;
       String str = b.a.getString("current_plugin_wrap", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.getBoolean("hookDynamicFeatureResources", false);
    }
    public void k(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPluginSource.class, "12")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("current_feature_wrap", b.e(p0));
       g.a(uEditor);
       return;
    }
    public void l(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPluginSource.class, "9")) {
          return;
       }
       a.p(p0, "state");
       this.s().E().b(p0);
       return;
    }
    public void m(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPluginSource.class, "7")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("pending_plugin_wrap", b.e(p0));
       g.a(uEditor);
       return;
    }
    public a0 n(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPluginSource.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "plugins");
       String str = a.a.q(p0);
       a.o(str, "params");
       a0 uoa0 = this.c.a().a(str).C(DefaultPluginSource$a.b);
       a.o(uoa0, "remoteProvider.getServic¡­it.rollbackTasks\)\n      }");
       return uoa0;
    }
    public x o(){
       Object[] objArray = null;
       x obj = PatchProxy.apply(objArray, this, DefaultPluginSource.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = x.class;
       String str = b.a.getString("pending_plugin_wrap", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public void p(boolean p0){
       DefaultPluginSource uDefaultPlug = DefaultPluginSource.class;
       if (PatchProxy.isSupport(uDefaultPlug) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDefaultPlug, "16")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("enableHostLibraryFirst", p0);
       g.a(uEditor);
       return;
    }
    public a0 q(){
       Object[] objArray2;
       Object[] objArray = null;
       x obj = PatchProxy.apply(objArray, this, DefaultPluginSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       x plugins = (obj != null)? obj.plugins: objArray;
       int i = 0;
       String str = (plugins == null || plugins.isEmpty())? 1: null;
       if (str) {
          str = "[]";
       }else {
          a.m(obj);
          str = new Gson().q(obj.plugins);
       }
       String str1 = str;
       a uoa = this.c.a();
       String m = a.m;
       a.o(m, "AppEnv.VERSION");
       a.o(str1, "plugins");
       plugins = (obj != null)? obj.source: objArray;
       if (plugins == null || !plugins.length()) {
          i = 1;
       }
       Object[] objArray1 = (!i && obj != null)? obj.source: objArray;
       DefaultPluginSource$b uob = null;
       x updateTime = (obj != null)? obj.updateTime: uob;
       if (updateTime - uob > 0 && obj != null) {
          objArray = Long.valueOf(obj.updateTime);
       }
       a0 uoa0 = uoa.i(m, "0.5.0", str1, objArray1, objArray).C(new DefaultPluginSource$b(this, obj));
       a.o(uoa0, "remoteProvider.getServic¡­t.result}\"\)\n      }\n    }");
       return uoa0;
    }
    public void r(boolean p0){
       DefaultPluginSource uDefaultPlug = DefaultPluginSource.class;
       if (PatchProxy.isSupport(uDefaultPlug) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDefaultPlug, "20")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("verifyPluginFileByFastMode", p0);
       g.a(uEditor);
       return;
    }
    public final PluginDatabase s(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
