package com.yxcorp.gifshow.camerasdk.YtechBizLogger;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import com.yxcorp.gifshow.camerasdk.YtechBizLogger$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.camerasdk.YtechBizLogger$Companion$holder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.biz.monitor.log.LogOption;
import com.yxcorp.gifshow.biz.monitor.log.LogOption$LogPlatform;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import java.lang.Number;

public final class YtechBizLogger extends BizLogger	// class@001005
{
    public static final p d;
    public static final YtechBizLogger$a e;

    static {
       YtechBizLogger.e = new YtechBizLogger$a(null);
       YtechBizLogger.d = s.b(LazyThreadSafetyMode.NONE, YtechBizLogger$Companion$holder$2.INSTANCE);
    }
    public void YtechBizLogger(){
       super();
    }
    public static final YtechBizLogger i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YtechBizLogger$a obj = PatchProxy.apply(null, null, YtechBizLogger.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = YtechBizLogger.e;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, YtechBizLogger$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = YtechBizLogger.d.getValue();
       }
       return obj1;
    }
    public LogOption e(){
       LogOption obj = PatchProxy.apply(null, this, YtechBizLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LogOption();
       obj.d("ytech");
       obj.c(26);
       LogOption$LogPlatform sDK = LogOption$LogPlatform.SDK;
       if (!PatchProxy.applyVoidOneRefs(sDK, obj, LogOption.class, "3")) {
          a.p(sDK, "<set-?>");
          obj.b = sDK;
       }
       Object value = a.t().getValue("ytechErrorLogSampleRate", Double.TYPE, Double.valueOf(0x3fb999999999999a));
       a.o(value, "SwitchConfigManager.getI¡­ Double::class.java, 0.1\)");
       obj.e(value.doubleValue());
       return obj;
    }
}
