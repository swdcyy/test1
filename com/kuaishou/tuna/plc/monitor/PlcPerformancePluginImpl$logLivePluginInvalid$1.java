package com.kuaishou.tuna.plc.monitor.PlcPerformancePluginImpl$logLivePluginInvalid$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.tuna.plc_base.monitor.model.PlcMonitorDetailInfo$b;
import com.kuaishou.tuna.plc_base.monitor.model.PlcMonitorDetailInfo;
import com.kuaishou.tuna.plc_base.monitor.model.PlcMonitorDetailInfo$a;
import fg6.a;
import com.google.gson.Gson;

public final class PlcPerformancePluginImpl$logLivePluginInvalid$1 extends Lambda implements a	// class@001032
{
    public final int $livePluginStag;

    public void PlcPerformancePluginImpl$logLivePluginInvalid$1(int p0){
       this.$livePluginStag = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonObject obj = PatchProxy.apply(null, this, PlcPerformancePluginImpl$logLivePluginInvalid$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JsonObject();
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("plcPublishLivePluginStag", Integer.valueOf(this.$livePluginStag));
       obj.G("plcPublishInfo", jsonObject);
       PlcMonitorDetailInfo$b uob = new PlcMonitorDetailInfo$b();
       uob.a = 8;
       uob.b = obj.toString();
       PlcMonitorDetailInfo plcMonitorDe = PatchProxy.apply(null, uob, PlcMonitorDetailInfo$b.class, "1");
       if (plcMonitorDe != patchProxyRe) {
       }else {
          plcMonitorDe = new PlcMonitorDetailInfo(null);
          plcMonitorDe.mProcessState = uob.a;
          plcMonitorDe.mParamsJson = uob.b;
          plcMonitorDe.mExtra = uob.c;
          plcMonitorDe.mWeakType = uob.d;
          plcMonitorDe.mStrongType = uob.e;
          plcMonitorDe.mSlideStyle = uob.f;
       }
       return a.a.q(plcMonitorDe);
    }
}
