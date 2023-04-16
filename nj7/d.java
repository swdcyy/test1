package nj7.d;
import nj7.e;
import android.content.Context;
import oj7.b;
import java.lang.Object;
import java.util.HashSet;
import android.app.Application;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.Iterator;
import java.util.Set;
import qj7.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collections;
import com.kwai.plugin.dva.repository.model.ComponentInfo;
import java.lang.Boolean;
import qj7.g;
import com.kwai.plugin.dva.repository.model.ActivityInfo;
import com.kwai.plugin.dva.repository.model.ServiceInfo;
import com.kwai.plugin.dva.repository.model.BroadcastReceiverInfo;
import com.kwai.plugin.dva.repository.model.ContentProviderInfo;

public class d implements e	// class@001f4f
{
    public final Context a;
    public final b b;
    public final Set c;

    public void d(Context p0,b p1){
       super();
       this.c = new HashSet();
       if (p0 instanceof Application) {
       }else {
          p0 = p0.getApplicationContext();
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public List a(){
       d obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return new ArrayList(this.c);
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.b();
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.b.g(p0);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       this.b.d(p0);
       return;
    }
    public void e(PluginConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.b.e(p0);
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.b.f(p0);
       return;
    }
    public PluginConfig g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a(p0);
    }
    public PluginInfo h(String p0){
       PluginInfo pluginInfo;
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       _monitor_enter(obj);
       Iterator iterator = this.c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             pluginInfo = iterator.next();
             if ((pluginInfo.name).equals(p0)) {
                break ;
             }
          }else {
             _monitor_exit(obj);
             return null;
          }
       }
       _monitor_exit(obj);
       return pluginInfo;
    }
    public Set i(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = h.a(this.a);
       if (TextUtils.isEmpty(obj)) {
          return Collections.emptySet();
       }
       HashSet hashSet = new HashSet();
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          PluginConfig pluginConfig = iterator.next();
          ComponentInfo uComponentIn = this.b.c(pluginConfig);
          if (uComponentIn != null) {
             String obj1 = PatchProxy.applyTwoRefs(obj, uComponentIn, this, d.class, "11");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                obj1 = g.a(obj);
                Iterator iterator1 = uComponentIn.activities.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (!obj1.equals(iterator1.next().process)) {
                         continue ;
                      }
                   }else {
                      iterator1 = uComponentIn.services.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            if (!obj1.equals(iterator1.next().process)) {
                               continue ;
                            }
                         }else {
                            iterator1 = uComponentIn.broadcasts.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  if (!obj1.equals(iterator1.next().process)) {
                                     continue ;
                                  }
                               }else {
                                  Iterator iterator2 = uComponentIn.contentProviders.iterator();
                                  while (true) {
                                     if (iterator2.hasNext()) {
                                        if (!obj1.equals(iterator2.next().process)) {
                                           continue ;
                                        }
                                     }else {
                                        b = false;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                   b = true;
                }
             }
             if (b) {
                hashSet.add(pluginConfig);
             }
          }
       }
       return hashSet;
    }
    public void j(PluginInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       d tc = this.c;
       _monitor_enter(tc);
       this.c.add(p0);
       _monitor_exit(tc);
       return;
    }
}
