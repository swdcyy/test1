package com.kwai.framework.plugin.PluginManager$c;
import ij7.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.log.PluginLogger;
import java.util.Objects;
import nd6.n;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.plugin.log.PluginInstallResultLogger;
import java.lang.Boolean;
import java.util.concurrent.ConcurrentHashMap;
import nd6.d;
import java.lang.System;

public final class PluginManager$c implements c	// class@000c62
{

    public void PluginManager$c(){
       super();
    }
    public void a(long p0,String p1,int p2,int p3,String p4){
       object oobject = p1;
       PluginManager$c uoc = PluginManager$c.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[i3];
          objArray[i5] = Long.valueOf(p0);
          objArray[i4] = oobject;
          objArray[i2] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
             return;
          }
       }else {
          int i6 = this;
       }
       a.p(oobject, "pluginName");
       PluginLogger pluginLogger = PluginManager.H.r();
       Objects.requireNonNull(pluginLogger);
       PluginLogger pluginLogger1 = PluginLogger.class;
       if (PatchProxy.isSupport(pluginLogger1)) {
          Object[] objArray1 = new Object[i3];
          objArray1[i5] = Long.valueOf(p0);
          objArray1[i4] = oobject;
          objArray1[i2] = Integer.valueOf(p2);
          objArray1[i1] = Integer.valueOf(p3);
          objArray1[i] = p4;
          if (PatchProxy.applyVoid(objArray1, pluginLogger, pluginLogger1, "20")) {
          label_0081 :
             PluginInstallResultLogger g = PluginInstallResultLogger.g;
             if (p2 != 0x27d8) {
                i4 = false;
             }
             String str = (p4 != null)? p4: "";
             _monitor_enter(g);
             if (PatchProxy.isSupport(PluginInstallResultLogger.class) && PatchProxy.applyVoidFourRefs(p1, Boolean.valueOf(i4), Integer.valueOf(p3), str, g, PluginInstallResultLogger.class, "12")) {
                _monitor_exit(g);
             }else {
                a.p(oobject, "pluginName");
                a.p(str, "errMsg");
                g.b().get(oobject);
                long l = g.b().get(oobject);
                if (l != null) {
                   l.loadedTimestamp = System.currentTimeMillis();
                   l.costTime = System.currentTimeMillis() - l.a();
                   if (l.downloadPriority == 40) {
                      l.uiPriorityCostTime = g.a(p1, l.a(), l.loadedTimestamp);
                   }
                   l.i(i4);
                   l.f(p3);
                   l.g(str);
                   g.f(oobject);
                }
                _monitor_exit(g);
             }
             return;
          }
       }
       a.p(oobject, "pluginName");
       n on = new n(pluginLogger, p0, p1, p2, p3, p4);
       c.a(v12);
       goto label_0081 ;
    }
}
