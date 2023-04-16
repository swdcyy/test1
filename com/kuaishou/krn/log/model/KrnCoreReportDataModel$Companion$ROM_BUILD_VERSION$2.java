package com.kuaishou.krn.log.model.KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.RomUtils;
import kotlin.jvm.internal.a;

public final class KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2 extends Lambda implements a	// class@0008dc
{
    public static final KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2 INSTANCE;

    static {
       KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2.INSTANCE = new KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2();
    }
    public void KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RomUtils.g("ro.build.version.incremental");
       a.o(obj, "RomUtils.getProp\(KEY_ROM_BUILD_VERSION\)");
       return obj;
    }
}
