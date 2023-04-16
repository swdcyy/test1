package com.yxcorp.gifshow.init.module.DebugLogInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import sxa.e;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.framework.debuglog.g;
import t87.f;
import y87.b;
import t87.d;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import c97.d;
import z87.a;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import q87.f;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import q87.e;
import com.kwai.logger.KwaiLog;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import f66.a;
import com.kwai.framework.cache.a$a;
import com.kwai.framework.cache.a;
import com.kwai.framework.debuglog.realtime.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.middleware.azeroth.Azeroth2;
import com.yxcorp.utility.TextUtils;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Action;
import java.lang.Throwable;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.kwai.framework.debuglog.realtime.RealTimeLogConfig;
import g66.a;
import com.kwai.framework.debuglog.realtime.KwaiRealTimeLogger$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.init.module.p;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import ayb.l;

public class DebugLogInitModule extends a	// class@0011cc
{
    public static final int q;

    public void DebugLogInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, DebugLogInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(DebugLogInitModule.class, "4");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DebugLogInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{AzerothInitModule.class,SwitchConfigInitModule.class};
       PatchProxy.onMethodExit(DebugLogInitModule.class, "3");
       return Lists.e(obj);
    }
    public void k0(a p0){
       boolean b;
       d f;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DebugLogInitModule.class, "1")) {
          return;
       }
       e.d(new e(this), "DebugLogInitModule");
       g og = g.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, og, "2")) {
          d.a("ObiwanUploader", "KLinkRetriever init");
          String[] stringArray = new String[]{"Push.Notifier.V3"};
          f.e().o(b.b, stringArray);
          d.a("ObiwanUploader", "PushRetriever init");
          d uod = d.a();
          String str = "command.obiwan";
          a a = a.a;
          Objects.requireNonNull(uod);
          if (!TextUtils.isEmpty(str)) {
             f = uod.f;
             _monitor_enter(f);
             List list = uod.f.get(str);
             if (list == null) {
                list = new ArrayList(2);
             }
             list.add(a);
             uod.f.put(str, list);
             _monitor_exit(f);
          }
          Map map = f.a();
          b = true;
          if (map != null && !map.isEmpty()) {
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().k();
             }
             KwaiLog.c = b;
          }
          boolean b1 = b.a(0x5f2ddeb4).h();
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), objArray, og, "10")) {
             SharedPreferences$Editor uEditor = g.e.edit();
             uEditor.putBoolean("IsDiskSpaceSufficient", b1);
             g.a(uEditor);
          }
          a.p(new a());
          og = a.class;
          if (!PatchProxy.applyVoid(objArray, objArray, og, "1")) {
             String str1 = "init";
             int i = 0;
             if (SystemUtil.L(a.b())) {
                f obj = PatchProxy.apply(objArray, objArray, og, "2");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else {
                   String str2 = Azeroth2.B.o("obiwan");
                   if (!TextUtils.x(str2)) {
                      try{
                         ObiwanConfig obiwanConfig = GsonUtil.fromJson(str2, ObiwanConfig.class);
                         if (obiwanConfig != null && obiwanConfig.action != null) {
                            Object[] objArray2 = new Object[i];
                            KwaiLog.m("KwaiRealTimeLogger", "enableRealTimeLog", str2, objArray2);
                            ObiwanConfig$Action uAction = obiwanConfig.action.supportRealTimeLog;
                         }
                      }catch(java.lang.Exception e6){
                         KwaiLog.f("KwaiRealTimeLogger", "parseException", str2, e6);
                      }
                   }
                }
                if (b1 != null) {
                   obj = a.t().f("obiwanRealLogConfig");
                   if (obj != null) {
                      Object[] objArray1 = new Object[i];
                      KwaiLog.m("KwaiRealTimeLogger", str1, obj.toString(), objArray1);
                      a.a = GsonUtil.fromJson(obj.toString(), RealTimeLogConfig.class);
                   }else {
                      a.a = new RealTimeLogConfig();
                   }
                   if (a.a.enableObiwanRealLog != null && !PatchProxy.applyVoid(objArray, objArray, og, "5")) {
                      if (a.a.launchEnable != null) {
                         a.b("LAUNCH");
                      }
                      RealTimeLogConfig a1 = a.a;
                      if (a1.timeIntervalEnable != null) {
                         a.a = b;
                         a.a();
                      }
                   }
                }
             }else {
                Object[] objArray3 = new Object[i];
                KwaiLog.m("KwaiRealTimeLogger", str1, SystemUtil.r(a.b()), objArray3);
                if (!PatchProxy.applyVoid(objArray, objArray, og, "4")) {
                   UniversalReceiver.e(Azeroth2.B.d(), new KwaiRealTimeLogger$1(), new IntentFilter("com.kwai.framework.debuglog.realtime.FLUSH_LOG"));
                }
             }
          }
       }
    label_01b4 :
       RxBus.f.f(b.class).observeOn(d.a).subscribe(p.b);
       PatchProxy.onMethodExit(DebugLogInitModule.class, "1");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, DebugLogInitModule.class, "2")) {
          return;
       }
       g.a(a.b());
       int i = 0x38955e85;
       if (d.a(i).iQ()) {
          d.a(i).K8(true);
       }
       PatchProxy.onMethodExit(DebugLogInitModule.class, "2");
       return;
    }
}
