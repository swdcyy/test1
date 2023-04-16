package com.kwai.plugin.dva.install.PluginUrlManager;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.plugin.dva.install.PluginUrlManager$mPluginNameAndConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;
import zsd.u;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import android.content.Context;
import java.lang.Boolean;
import com.kwai.plugin.dva.entity.Plugin;
import qj7.d;
import com.kwai.plugin.dva.work.c;
import qj7.h;
import jj7.e;
import java.util.Objects;
import java.lang.StringBuilder;
import qj7.f;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;

public final class PluginUrlManager	// class@001348
{
    public static final PluginUrlManager a;
    public static final ConcurrentHashMap b;
    public static final p c;

    static {
       PluginUrlManager.a = new PluginUrlManager();
       PluginUrlManager.b = new ConcurrentHashMap();
       PluginUrlManager.c = s.c(PluginUrlManager$mPluginNameAndConfig$2.INSTANCE);
    }
    public void PluginUrlManager(){
       super();
    }
    public final ConcurrentHashMap a(){
       Object obj = PatchProxy.apply(null, this, PluginUrlManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginUrlManager.c.getValue();
    }
    public final String b(PluginConfig p0){
       PluginConfig obj = PatchProxy.applyOneRefs(p0, this, PluginUrlManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "config");
       obj = p0.name;
       a.o(obj, "config.name");
       String[] urls = p0.getUrls();
       a.o(urls, "config.urls");
       return this.d(obj, urls);
    }
    public final String c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginUrlManager pluginUrlMan = PluginUrlManager.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, pluginUrlMan, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "pluginName");
       String[] stringArray = PatchProxy.applyOneRefs(p0, this, pluginUrlMan, "8");
       if (stringArray != patchProxyRe) {
       }else {
          PluginConfig pluginConfig = this.f(p0);
          if (pluginConfig == null) {
             stringArray = new String[0];
          }else {
             stringArray = pluginConfig.getUrls();
             a.o(stringArray, "config.urls");
          }
       }
       return this.d(p0, stringArray);
    }
    public final String d(String p0,String[] p1){
       object oobject;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginUrlManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (!p1.length)? 1: 0;
       if (i) {
          return "";
       }else if(p1.length == 1){
          return p1[0];
       }else {
          Integer integer = PluginUrlManager.b.get(p0);
          if (integer == null) {
             integer = Integer.valueOf(2);
          }
          integer = this.e(integer.intValue(), p1);
          if (integer == null) {
             oobject = p1[0];
          }
          return oobject;
       }
    }
    public final String e(int p0,String[] p1){
       String str;
       object oobject;
       PluginUrlManager pluginUrlMan = PluginUrlManager.class;
       if (PatchProxy.isSupport(pluginUrlMan)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, pluginUrlMan, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
             label_0029 :
                str = "http";
             }else {
                str = "file";
             }
          }else {
             str = "asset";
          }
       }else {
          goto label_0029 ;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          Object obj1 = null;
          if (i >= len) {
             return obj1;
          }
          oobject = p1[i];
          i = i + 1;
          if (u.q2(oobject, str, false, 2, obj1)) {
             break ;
          }
       }
       return oobject;
    }
    public final PluginConfig f(String p0){
       PluginConfig pluginConfig;
       PluginConfig obj = PatchProxy.applyOneRefs(p0, this, PluginUrlManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a().get(p0);
       if (obj == null) {
          List list = Dva.instance().getPluginInstallManager().b();
          a.o(list, "instance\(\).pluginInstall¡­           .pluginConfigs");
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                pluginConfig = iterator.next();
                if (!a.g(pluginConfig.name, p0)) {
                   continue ;
                }
             }else {
                pluginConfig = null;
             }
             obj = pluginConfig;
             if (obj == null) {
                return null;
             }else {
                this.a().put(p0, obj);
                break ;
             }
          }
       }
       return obj;
    }
    public final boolean g(Context p0,String p1,int p2){
       c obj2;
       String[] urls;
       PluginConfig pluginConfig1;
       String[] stringArray;
       PluginConfig pluginConfig2;
       int i2;
       e len1;
       Object obj3;
       e a;
       PluginUrlManager pluginUrlMan = this;
       Object obj = p0;
       String[] obj1 = p1;
       int i = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PluginUrlManager.class)) {
          obj2 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PluginUrlManager.class, "2");
          if (obj2 != patchProxyRe) {
             return obj2.booleanValue();
          }
       }
       a.p(obj, "context");
       a.p(obj1, "pluginName");
       boolean b = false;
       if (Dva.instance().getPlugin(obj1) != null) {
          d.c(a.C(obj1, " has been installed."));
          return b;
       }else {
          obj2 = Dva.instance().getPluginInstallManager().n(obj1);
          if (obj2 != null && obj2.g() > 0x2710) {
             d.c(a.C(obj1, " is installing."));
             return b;
          }else {
             PluginConfig pluginConfig = pluginUrlMan.f(obj1);
             if (pluginConfig == null) {
                return b;
             }else if(h.b(p0)){
                urls = pluginConfig.getUrls();
                a.o(urls, "config.urls");
                int len = urls.length;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      object oobject = urls[i1];
                      e uoe = e.a(p0);
                      PluginConfig name = pluginConfig.name;
                      PluginConfig version = pluginConfig.version;
                      Objects.requireNonNull(uoe);
                      if (PatchProxy.isSupport(e.class)) {
                         pluginConfig1 = version;
                         stringArray = urls;
                         pluginConfig2 = name;
                         i2 = len;
                         len1 = uoe;
                         obj3 = PatchProxy.applyThreeRefs(name, Integer.valueOf(version), oobject, uoe, e.class, "2");
                         if (obj3 != patchProxyRe) {
                         label_00d3 :
                            if (obj3 != null) {
                               d.c("PluginInstallServiceDelegate: "+obj1+" is installing.");
                               return false;
                            }else {
                               i1 = i1 + 1;
                               urls = stringArray;
                               len = i2;
                               pluginConfig1 = null;
                            }
                         }
                      }else {
                         stringArray = urls;
                         i2 = len;
                         pluginConfig1 = version;
                         pluginConfig2 = name;
                         len1 = uoe;
                      }
                      a = len1.a;
                      _monitor_enter(a);
                      obj3 = len1.a.get(len1.b(pluginConfig2, pluginConfig1, oobject));
                      _monitor_exit(a);
                      goto label_00d3 ;
                   }
                }
             }
             if (pluginConfig.type == 1) {
                String str = f.a(p0, p1);
                a.o(str, "splitName");
                if (pluginUrlMan.f(str) != null && !pluginUrlMan.g(obj, str, i)) {
                   return false;
                }
             }
             String[] urls1 = pluginConfig.getUrls();
             a.o(urls1, "config.urls");
             if (pluginUrlMan.e(i, urls1) != null) {
                PluginUrlManager.b.put(obj1, Integer.valueOf(p2));
                d.c(obj1+" set url type\("+i+"\) success.");
                b = true;
             }else {
                obj1 = pluginConfig.getUrls();
                a.o(obj1, "config.urls");
                d.c("urlType="+i+", but urls = "+ArraysKt___ArraysKt.Gg(obj1, null, null, null, 0, null, null, 63, null));
                b = false;
             }
             return b;
          }
       }
    }
}
