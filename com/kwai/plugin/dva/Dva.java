package com.kwai.plugin.dva.Dva;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.a;
import com.kwai.plugin.dva.a$b;
import qj7.b;
import qj7.c;
import com.kwai.plugin.dva.install.remote.download.a;
import com.kwai.plugin.dva.install.remote.download.c;
import java.util.HashMap;
import android.app.Application;
import ii7.b;
import nj7.c;
import com.kwai.plugin.dva.hook.component.contentprovider.PluginContentResolverUtil;
import android.content.pm.ApplicationInfo;
import com.kwai.plugin.dva.util.c;
import java.util.Objects;
import kotlin.jvm.internal.a;
import qj7.d;
import nj7.a;
import nj7.d;
import oj7.a;
import oj7.d;
import oj7.b;
import nj7.e;
import lj7.g;
import mj7.c;
import com.kwai.plugin.dva.install.c;
import com.kwai.plugin.dva.install.e;
import java.lang.Long;
import com.kwai.plugin.dva.install.remote.InnerInstallWork;
import java.lang.IllegalStateException;
import java.lang.ClassLoader;
import dalvik.system.PathClassLoader;
import ji7.a;
import android.content.ContextWrapper;
import com.kwai.plugin.dva.util.b;
import com.kwai.plugin.dva.install.remote.download.DefaultCoroutineDownloader;
import mj7.a;
import com.kwai.plugin.dva.entity.Plugin;
import java.util.Iterator;
import java.util.List;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import com.kwai.plugin.dva.repository.model.ActivityInfo;
import com.kwai.plugin.dva.install.b;
import lj7.d;
import java.lang.Integer;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Boolean;
import java.util.Set;
import qj7.h;
import java.lang.StringBuilder;
import com.kwai.plugin.dva.repository.model.PluginConfig;

public class Dva	// class@000e54
{
    public Context a;
    public g b;
    public b c;
    public e d;
    public c e;
    public a f;
    public Map g;
    public static final AtomicReference h;

    static {
       Dva.h = new AtomicReference();
    }
    public void Dva(Context p0){
       a uoa = PatchProxy.apply(null, null, Dva.class, "16");
       if (uoa != PatchProxyResult.class) {
       }else {
          a$b uob = a.a();
          uob.h(new b());
          uob.e(new a());
          uoa = uob.a();
       }
       super(p0, uoa);
       return;
    }
    public void Dva(Context p0,a p1){
       super();
       this.g = new HashMap();
       Context uContext = (p0 instanceof Application)? p0: p0.getApplicationContext();
       this.a = uContext;
       Dva uDva = Dva.class;
       if (!PatchProxy.applyVoidOneRefs(p1, this, uDva, "2")) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, uDva, "3")) {
             b.a = p1.g;
             b.b = p1.h;
             b.c = p1.i;
          }
          uDva = this.a;
          if (!PatchProxy.applyVoidOneRefs(uDva, null, c.class, "1")) {
             c.a = (uDva instanceof Application)? uDva: uDva.getApplicationContext();
          }
       label_0051 :
          PluginContentResolverUtil.init(this.a);
          c a = c.a;
          Dva ta = this.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(ta, a, c.class, "1")) {
             a.p(ta, "context");
             c.b = ta;
          }
       }
       d.a = p1.a;
       this.f = p1.b;
       this.e = p1.d;
       a uoa = new a(new d(p0, new a(p0, p1.e)));
       this.d = uoa;
       this.b = new g(p0, uoa, p1.c);
       this.c = new c(p0, this.d, new e(p0), this.b);
       uoa = p1.f;
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(uoa), null, uoe, "1")) {
          Objects.requireNonNull(InnerInstallWork.p);
          InnerInstallWork.q = uoa;
       }
       this.a(p0);
       return;
    }
    public static void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Dva.class, "6")) {
          return;
       }
       Dva uDva = Dva.h.get();
       if (uDva != null) {
          uDva.a(p0);
       }
       return;
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Dva.class, "4")) {
          return;
       }
       Dva.h.compareAndSet(null, new Dva(p0));
       Dva.b(p0);
       return;
    }
    public static void init(Context p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Dva.class, "5")) {
          return;
       }
       Dva.h.compareAndSet(null, new Dva(p0, p1));
       Dva.b(p0);
       return;
    }
    public static Dva instance(){
       Dva obj = PatchProxy.apply(null, null, Dva.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.h.get();
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("Dva must init at first");
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dva.class, "1")) {
          return;
       }
       PathClassLoader classLoader = p0.getClassLoader();
       if (!PatchProxy.applyVoidTwoRefs(classLoader, p0, null, a.class, "2") && !classLoader instanceof a) {
          if (a.b == null) {
             a.b = new a(classLoader);
          }
          Context uContext = PatchProxy.applyOneRefs(p0, null, a.class, "3");
          if (uContext != PatchProxyResult.class) {
          }else if(p0 instanceof Application){
             p0 = p0.getApplicationContext();
          }
          while (p0 instanceof ContextWrapper) {
             p0 = p0.getBaseContext();
          }
          uContext = p0;
          b.m(b.h(uContext, "mPackageInfo"), "mClassLoader", a.b);
       }
       return;
    }
    public c getDownloader(){
       Object obj = PatchProxy.apply(null, this, Dva.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new DefaultCoroutineDownloader();
       }
       return this.e;
    }
    public a getInstallReporter(){
       return this.f;
    }
    public Plugin getPlugin(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dva obj = PatchProxy.applyOneRefs(p0, this, Dva.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Plugin plugin = PatchProxy.applyOneRefs(p0, obj, g.class, "1");
       if (plugin != patchProxyRe) {
       }else {
          g e = obj.e;
          _monitor_enter(e);
          Iterator iterator = obj.e.iterator();
          while (true) {
             if (iterator.hasNext()) {
                plugin = iterator.next();
                if ((plugin.getName()).equals(p0)) {
                   _monitor_exit(e);
                   break ;
                }
             }else {
                _monitor_exit(e);
                plugin = null;
                break ;
             }
          }
       }
       return plugin;
    }
    public Plugin getPluginByClass(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dva obj = PatchProxy.applyOneRefs(p0, this, Dva.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Plugin plugin = PatchProxy.applyOneRefs(p0, obj, g.class, "11");
       if (plugin != patchProxyRe) {
       }else {
          g e = obj.e;
          _monitor_enter(e);
          Iterator iterator = obj.e.iterator();
          while (true) {
             if (iterator.hasNext()) {
                plugin = iterator.next();
                if (plugin.getPluginType() == 2 || plugin.getPluginInfo().activities.isEmpty()) {
                   continue ;
                }else {
                   Iterator iterator1 = plugin.getPluginInfo().activities.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if ((iterator1.next().name).equals(p0)) {
                            _monitor_exit(e);
                            break ;
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }else {
                _monitor_exit(e);
                plugin = null;
                break ;
             }
          }
       }
       return plugin;
    }
    public b getPluginInstallManager(){
       return this.c;
    }
    public d getPluginLoader(int p0){
       Dva uDva = Dva.class;
       if (PatchProxy.isSupport(uDva)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDva, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.get(Integer.valueOf(p0));
    }
    public List getPlugins(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Dva obj = PatchProxy.apply(null, this, Dva.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.apply(null, obj, g.class, "2");
       if (uArrayList != patchProxyRe) {
       }else {
          g e = obj.e;
          _monitor_enter(e);
          uArrayList = new ArrayList(obj.e);
          _monitor_exit(e);
       }
       return uArrayList;
    }
    public boolean isLoaded(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Dva.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.w().contains(p0);
    }
    public void onApplicationCreated(){
       Dva uDva = Dva.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDva, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uDva, "14") && !h.b(this.a)) {
          Set set = this.d.i();
          d.c("try to boot plugin in subprocess "+h.a(this.a)+" with "+set.size());
          if (!set.isEmpty()) {
             Dva tc = this.c;
             if (tc instanceof c) {
                _monitor_enter(tc);
                tc.j = true;
                _monitor_exit(tc);
             }
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                PluginConfig pluginConfig = iterator.next();
                if (this.c.t(pluginConfig.name)) {
                   this.c.v(pluginConfig.name);
                }
             }
          }
       }
       return;
    }
    public void refreshCachePluginSource(){
       if (PatchProxy.applyVoid(null, this, Dva.class, "15")) {
          return;
       }
       Dva td = this.d;
       if (td instanceof a) {
          td.k();
       }
       return;
    }
    public void registerPluginLoader(int p0,d p1){
       Dva uDva = Dva.class;
       if (PatchProxy.isSupport(uDva) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDva, "17")) {
          return;
       }
       this.g.put(Integer.valueOf(p0), p1);
       return;
    }
}
