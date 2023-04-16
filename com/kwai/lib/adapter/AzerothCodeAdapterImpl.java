package com.kwai.lib.adapter.AzerothCodeAdapterImpl;
import gv6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import c97.d;
import r97.a0;
import r97.r$a;
import r97.r;
import r97.o$a;
import r97.o;
import com.kwai.middleware.azeroth.Azeroth2;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import q97.f;
import h97.g;
import java.lang.Throwable;
import q87.d;
import com.kwai.logger.KwaiLog;

public final class AzerothCodeAdapterImpl implements b	// class@000cfc
{

    public void AzerothCodeAdapterImpl(){
       super();
    }
    public void addCustomStatEvent(float p0,String p1,String p2){
       a.p(p1, "key");
       a.p(p2, "value");
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       r$a uoa = r.b();
       uoa.d(o.builder().i("push").h(p0).b());
       uoa.f(p1);
       uoa.h(p2);
       uod.g().E(uoa.c());
    }
    public boolean azerothHasInit(){
       Objects.requireNonNull(Azeroth2.B);
       return Azeroth2.b;
    }
    public boolean dispatchPushCommand(String p0,String p1){
       boolean b;
       a.p(p0, "command");
       a.p(p1, "extra");
       List list = d.a().f.get(p0);
       if (list != null && list.size()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, p1);
          }
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public String getAppVersion(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String appVersion = og.getAppVersion();
       a.o(appVersion, "Azeroth.get\(\).commonParams.appVersion");
       return appVersion;
    }
    public String getDeviceId(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String deviceId = og.getDeviceId();
       a.o(deviceId, "Azeroth.get\(\).commonParams.deviceId");
       return deviceId;
    }
    public String getGlobalId(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String globalId = og.getGlobalId();
       a.o(globalId, "Azeroth.get\(\).commonParams.globalId");
       return globalId;
    }
    public String getManufacturerAndModel(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String manufacturer = og.getManufacturerAndModel();
       a.o(manufacturer, "Azeroth.get\(\).commonParams.manufacturerAndModel");
       return manufacturer;
    }
    public String getSysRelease(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String sysRelease = og.getSysRelease();
       a.o(sysRelease, "Azeroth.get\(\).commonParams.sysRelease");
       return sysRelease;
    }
    public String getUserId(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String userId = og.getUserId();
       a.o(userId, "Azeroth.get\(\).commonParams.userId");
       return userId;
    }
    public boolean isDebugMode(){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       return uod.i();
    }
    public void logE(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
       KwaiLog.a(KwaiLog.j("push_sdk", 16, p0, p1, p2));
    }
    public void logI(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       Object[] objArray = new Object[0];
       KwaiLog.a(KwaiLog.k("push_sdk", 4, p0, p1, objArray));
    }
}
