package com.kwai.library.push.http.InPushApiExt;
import com.kwai.library.push.http.InPushApiExt$apiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import c97.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import h97.g;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Exception;
import com.kwai.library.push.utils.InPushSettingExt;
import ky6.a;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kwai.library.push.http.InPushApiExt$a;
import crd.b;
import oy6.a;

public final class InPushApiExt	// class@0008c7
{
    public static final p a;
    public static final InPushApiExt b;

    static {
       InPushApiExt.b = new InPushApiExt();
       InPushApiExt.a = s.c(InPushApiExt$apiService$2.INSTANCE);
    }
    public void InPushApiExt(){
       super();
    }
    public static final Map b(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       d uod = d.a();
       String str = "Azeroth.get\(\)";
       a.o(uod, str);
       g og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       String appVersion = og.getAppVersion();
       a.o(appVersion, "Azeroth.get\(\).commonParams.appVersion");
       linkedHashMa.put("app_ver", appVersion);
       linkedHashMa.put("sdk_ver", "0.7.5");
       uod = d.a();
       a.o(uod, str);
       og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       appVersion = og.getManufacturerAndModel();
       a.o(appVersion, "Azeroth.get\(\).commonParams.manufacturerAndModel");
       linkedHashMa.put("mod", appVersion);
       uod = d.a();
       a.o(uod, str);
       og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       appVersion = og.getSysRelease();
       a.o(appVersion, "Azeroth.get\(\).commonParams.sysRelease");
       String str1 = "sys";
       try{
          linkedHashMa.put(str1, appVersion);
          appVersion = o.c(d.a().d(), "inapp_kvt", 0).getInt("CONFS_VERSION", 0)+"";
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          appVersion = "0";
       }
       a.o(appVersion, "InAppSPUtils.getCfgVer\(\)");
       linkedHashMa.put("conf_ver", appVersion);
       linkedHashMa.put("uid", InPushSettingExt.f());
       uod = d.a();
       a.o(uod, str);
       og = uod.b();
       a.o(og, "Azeroth.get\(\).commonParams");
       appVersion = og.getDeviceId();
       a.o(appVersion, "Azeroth.get\(\).commonParams.deviceId");
       linkedHashMa.put("did", appVersion);
       return linkedHashMa;
    }
    public static final void d(Map p0){
       a.p(p0, "params");
       InPushApiExt b = InPushApiExt.b;
       a uoa = b.a();
       uoa.e(b.c(), p0).subscribeOn(AzerothSchedulers.b.d()).subscribe(Functions.d(), InPushApiExt$a.b);
    }
    public final a a(){
       return InPushApiExt.a.getValue();
    }
    public final String c(){
       a a = InPushSettingExt.a;
       if (a != null) {
          a = a.f;
          if (a != null) {
          label_000b :
             return a;
          }
       }
       String str = "";
       goto label_000b ;
    }
}
