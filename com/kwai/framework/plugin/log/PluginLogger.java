package com.kwai.framework.plugin.log.PluginLogger;
import com.kwai.framework.plugin.log.PluginLogger$a;
import nsd.u;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import rd6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.log.PluginLogger$mGson$2;
import msd.a;
import qrd.p;
import qrd.s;
import nd6.h;
import kotlin.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import od6.x;
import java.util.Iterator;
import java.lang.Iterable;
import od6.v;
import java.lang.CharSequence;
import qrd.r0;
import com.google.gson.Gson;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.framework.plugin.log.PluginLogger$b;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.plugin.log.PluginRatioLoggerKt;
import k2b.u1;
import com.kwai.framework.plugin.log.PluginLogger$c;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import sd6.g;
import java.lang.StringBuilder;
import com.kwai.plugin.dva.install.PluginUrlManager;
import com.yxcorp.utility.Log;
import dd6.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import td6.a;
import brd.a;
import java.lang.Throwable;
import com.kwai.framework.plugin.log.PluginLogger$j;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.plugin.log.PluginLogger$d;
import java.util.Objects;
import java.lang.Number;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.plugin.log.PluginLogger$e;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.log.PluginLogger$k;
import java.lang.Float;
import com.kwai.framework.plugin.log.PluginLogger$l;
import com.kwai.framework.plugin.log.PluginLogger$m;

public final class PluginLogger	// class@000c9f
{
    public final String a;
    public final p b;
    public final h c;
    public final RemoteProvider d;
    public final d e;
    public static final PluginLogger$a f;

    static {
       PluginLogger.f = new PluginLogger$a(null);
    }
    public void PluginLogger(RemoteProvider p0,d p1){
       a.p(p0, "remoteProvider");
       a.p(p1, "pluginSource");
       super();
       this.d = p0;
       this.e = p1;
       this.a = "PluginManager";
       this.b = s.c(PluginLogger$mGson$2.INSTANCE);
       this.c = new h();
    }
    public final Pair a(String p0){
       Object obj1;
       v uid;
       Pair pair;
       x obj = PatchProxy.applyOneRefs(p0, this, PluginLogger.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.i();
       String str = "";
       if (obj != null) {
          x plugins = obj.plugins;
          if (plugins != null) {
             Iterator iterator = plugins.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (!a.g(obj1.name, p0)) {
                      continue ;
                   }
                }else {
                   obj1 = null;
                }
                if (obj1 != null) {
                   uid = obj1.uid;
                   if (uid != null) {
                   label_0042 :
                      iterator = (!uid.length())? 1: 0;
                      if (iterator) {
                         pair = r0.a(str, str);
                         break ;
                      }else if(obj != null){
                         obj = obj.source;
                         if (obj != null) {
                            str = obj;
                         }
                      }
                      pair = r0.a(uid, str);
                      break ;
                   }
                }
             }
             return pair;
          }
       }
       uid = str;
       goto label_0042 ;
    }
    public final Gson b(){
       Object obj = PatchProxy.apply(null, this, PluginLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void c(String p0,boolean p1,int p2,String p3,long p4,boolean p5){
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,Long.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, pluginLogger, "5")) {
             return;
          }
       }else {
          int i = this;
       }
       PluginLogger$b uob = new PluginLogger$b(p0, p1, p5, p2, p3, p4, SystemUtil.r(a.b()), false, 128, null);
       String str = this.b().q(pluginLogger);
       if (pluginLogger.isSuccess != null) {
          a.o(str, "data");
          PluginRatioLoggerKt.a("plugin_install_task_result", str);
       }else {
          u1.Q("plugin_install_task_result", str);
       }
       return;
    }
    public final void d(String p0,boolean p1,int p2,String p3,long p4){
       String str;
       Object[] objArray1;
       Object[] objArray2;
       Object obj = this;
       object oobject = p0;
       PluginLogger pluginLogger = PluginLogger.class;
       int i = 0;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Integer.valueOf(p2),p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, pluginLogger, "13")) {
             return;
          }
       }
       Pair pair = this.a(p0);
       PluginLogger$c uoc = v12;
       PluginLogger$c uoc1 = v12;
       uoc = new PluginLogger$c(p0, pair.getFirst(), pair.getSecond(), p1, p2, p3, p4, false, 128, 0);
       u1.Q("plugin_load_result", this.b().q(uoc1));
       if (!PatchProxy.isSupport(pluginLogger) || !PatchProxy.applyVoidTwoRefs(oobject, Boolean.valueOf(p1), obj, pluginLogger, "15")) {
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          b pluginInstal = uDva.getPluginInstallManager();
          a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
          List list = pluginInstal.b();
          a.o(list, "Dva.instance\(\).pluginInstallManager.pluginConfigs");
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                objArray2 = iterator.next();
                if (!a.g(objArray2.name, oobject)) {
                   continue ;
                }
             }else {
                objArray2 = null;
             }
             if (objArray2 != null) {
                String str1 = String.valueOf(objArray2.version);
                g obj1 = obj.e.a(oobject);
                if (obj1 == null) {
                   obj1 = new g(p0, str1, 0, 0, 0, 0);
                }
                if (a.g(obj1.f(), str1) ^ 0x01) {
                   if (!PatchProxy.applyVoidOneRefs(str1, obj1, g.class, "1")) {
                      a.p(str1, "<set-?>");
                      obj1.b = str1;
                   }
                   int i1 = 0;
                   obj1.f = i1;
                   obj1.e = i1;
                   obj1.g(i1);
                   obj1.h(i1);
                }else {
                   str = null;
                }
                if (p1) {
                   obj1.h((obj1.d() + 1));
                }else {
                   obj1.g((obj1.c() + 1));
                }
                obj.e.l(obj1);
             label_011d :
                if (p1) {
                   uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   pluginInstal = uDva.getPluginInstallManager();
                   a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
                   list = pluginInstal.b();
                   a.o(list, "Dva.instance\(\).pluginInstallManager.pluginConfigs");
                   iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         objArray1 = iterator.next();
                         if (!a.g(objArray1.name, oobject)) {
                            continue ;
                         }
                      }else {
                         objArray1 = null;
                      }
                      if (objArray1 != null) {
                         Log.g("PluginManager", "load plugin success, name: "+objArray1.name+", version: "+objArray1.version+", url: "+PluginUrlManager.a.b(objArray1)+", md5: "+objArray1.md5);
                      }
                      CharSequence uCharSequenc = (pair.getFirst().length() > 0)? 1: null;
                      if (uCharSequenc) {
                         uoc1 = (pair.getSecond().length() > 0)? 1: 0;
                         if (uoc1) {
                            obj1 = PatchProxy.apply(null, null, a.class, "2");
                            boolean b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.a("/rest/zt/appsupport/plugin/report/load", RequestTiming.DEFAULT);
                            if (!b) {
                               obj.d.a().g(pair.getFirst(), pair.getSecond()).f();
                               break ;
                            }
                         }
                      }
                   }
                }
                break ;
             }
          }
          return;
       }
       str = null;
       goto label_011d ;
    }
    public final void e(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PluginLogger.class, "11")) {
          return;
       }
       if (p1 != null) {
          c.a(new PluginLogger$j(this, p0, p1, p2));
       }
       return;
    }
    public final void f(String p0,String p1,long p2,boolean p3,int p4,String p5,boolean p6){
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, pluginLogger, "6")) {
             return;
          }
       }else {
          int i = this;
       }
       PluginLogger$d uod = new PluginLogger$d(p0, p1, p3, p4, p5, SystemUtil.r(a.b()), p2, true, p6);
       String str = this.b().q(pluginLogger);
       if (pluginLogger.isSuccess != null) {
          a.o(str, "data");
          PluginRatioLoggerKt.a("plugin_install_task_result", str);
       }else {
          u1.Q("plugin_install_task_result", str);
       }
       pluginLogger.toString();
       return;
    }
    public final void g(String p0,String p1,long p2,boolean p3,int p4,String p5,String p6){
       long l;
       String str1;
       PluginLogger$e obj = this;
       object oobject = p0;
       object oobject1 = p6;
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[]{oobject,p1,Long.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5,oobject1};
          if (PatchProxy.applyVoid(objArray, obj, pluginLogger, "16")) {
             return;
          }
       }
       pluginLogger = obj.c;
       Objects.requireNonNull(pluginLogger);
       Object obj1 = PatchProxy.applyOneRefs(oobject, pluginLogger, h.class, "2");
       if (obj1 != PatchProxyResult.class) {
          l = obj1.longValue();
       }else {
          a.p(oobject, "featureName");
          Long longx = pluginLogger.a.get(oobject);
          l = (longx != null)? longx.longValue(): null;
       }
       long l1 = l;
       String str = SystemUtil.r(a.b());
       Integer integer = PluginManager.H.h(oobject, oobject1);
       if (integer != null) {
          str1 = String.valueOf(integer.intValue());
          if (str1 != null) {
          label_008a :
             obj = v15;
             PluginLogger$e uoe = new PluginLogger$e(p0, p1, p3, p4, p5, str, p2, l1, str1, false, 512, 0);
             u1.Q("plugin_load_result", this.b().q(obj));
             obj.toString();
             return;
          }
       }
       str1 = "0";
       goto label_008a ;
    }
    public final void h(String p0,int p1,boolean p2,String p3){
       if (PatchProxy.isSupport(PluginLogger.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, PluginLogger.class, "19")) {
          return;
       }
       PluginLogger$k ok = new PluginLogger$k(this, p0, p1, p2, p3);
       c.a(v0);
       return;
    }
    public final void i(String p0,String p1,boolean p2,float p3,boolean p4,long p5,String p6,boolean p7,String p8){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p8;
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Long.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject2;
          if (PatchProxy.applyVoid(objArray, this, pluginLogger, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p0, "name");
       a.p(oobject1, "url");
       a.p(oobject2, "downloadPriority");
       PluginLogger$l ol = new PluginLogger$l(this, p0, p2, p3, p4, p5, p1, p6, p7, p8);
       c.a(v13);
       return;
    }
    public final void j(String p0,String p1,String p2,boolean p3,int p4,String p5,long p6,long p7,boolean p8,float p9,boolean p10,float p11,String p12,String p13,String p14,boolean p15){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p12;
       object oobject5 = p13;
       object oobject6 = p14;
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger)) {
          Object[] objArray = new Object[16];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Long.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Float.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = Float.valueOf(p11);
          objArray[12] = oobject4;
          objArray[13] = oobject5;
          objArray[14] = oobject6;
          objArray[15] = Boolean.valueOf(p15);
          if (PatchProxy.applyVoid(objArray, this, pluginLogger, "3")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "pluginName");
       a.p(oobject1, "oldMd5");
       a.p(oobject2, "newMd5");
       a.p(oobject3, "errorMsg");
       a.p(oobject4, "downloadPriority");
       a.p(oobject5, "appVersion");
       a.p(oobject6, "patchCondition");
       PluginLogger$m om = new PluginLogger$m(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       c.a(v20);
       return;
    }
    public final void k(String p0,long p1){
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, pluginLogger, "21")) {
          return;
       }
       String str = "featureName";
       a.p(p0, str);
       PluginLogger tc = this.c;
       Objects.requireNonNull(tc);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), tc, oh, "1")) {
          a.p(p0, str);
          tc.a.put(p0, Long.valueOf(p1));
       }
       return;
    }
}
