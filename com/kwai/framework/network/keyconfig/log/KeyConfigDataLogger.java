package com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.network.keyconfig.BaseConfig;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import e66.a;
import t45.d;
import rb6.a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;
import brd.z;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.content.SharedPreferences;
import com.kwai.framework.network.idc.config.ScheduleConfig;
import com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger$reportIdcList$1;
import java.util.Map;
import t45.c;

public final class KeyConfigDataLogger	// class@0017f5
{
    public static final AtomicReference a;
    public static final KeyConfigDataLogger b;

    static {
       KeyConfigDataLogger.b = new KeyConfigDataLogger();
       KeyConfigDataLogger.a = new AtomicReference(null);
    }
    public void KeyConfigDataLogger(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, KeyConfigDataLogger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enable_keyconfig_stat", false);
    }
    public final void b(BaseConfig p0,String p1){
       KeyConfigDataLogger keyConfigDat = KeyConfigDataLogger.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, keyConfigDat, "8")) {
          return;
       }
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, keyConfigDat, "4");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(KeyConfigDataLogger.a.get() == null){
          if (!PatchProxy.applyVoid(objArray, this, keyConfigDat, "5") && SystemUtil.L(a.b())) {
             if (this.a()) {
                a.l(true);
             }
             a.o(d.c.e(a.b, 5, TimeUnit.SECONDS), "KwaiSchedulers.ASYNC.sch¡­  }, 5, TimeUnit.SECONDS\)");
          }
       label_0081 :
          boolean booleanx = a.a.getBoolean("ReportIDCSwitch", b);
          KeyConfigDataLogger.a.compareAndSet(objArray, Boolean.valueOf(booleanx));
          Log.g("KeyConfigDataLogger", "canReportIdcList="+booleanx);
       }
       Boolean uBoolean = KeyConfigDataLogger.a.get();
       if (uBoolean != null) {
          b = uBoolean.booleanValue();
       }
       if (!b) {
          return;
       }else if(p0 != null){
          p0 = p0.mSchedule;
          if (p0 != null) {
             objArray = p0.mHttpsHosts;
          }
       }
       c.a(new KeyConfigDataLogger$reportIdcList$1(objArray, p1));
       return;
    }
}
