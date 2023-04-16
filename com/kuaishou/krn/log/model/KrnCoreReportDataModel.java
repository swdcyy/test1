package com.kuaishou.krn.log.model.KrnCoreReportDataModel;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import com.kuaishou.krn.log.model.KrnCoreReportDataModel$a;
import nsd.u;
import com.kuaishou.krn.log.model.KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2;
import msd.a;
import qrd.p;
import qrd.s;
import lj0.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.yxcorp.utility.RomUtils;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnCoreReportDataModel extends KrnLogCommonParams	// class@0008de
{
    public Object mData;
    public final HashMap mExtra;
    public static final p a;
    public static final KrnCoreReportDataModel$a b;

    static {
       KrnCoreReportDataModel.b = new KrnCoreReportDataModel$a(null);
       KrnCoreReportDataModel.a = s.c(KrnCoreReportDataModel$Companion$ROM_BUILD_VERSION$2.INSTANCE);
    }
    public void KrnCoreReportDataModel(c p0,Object p1){
       a.p(p0, "krnContext");
       a.p(p1, "data");
       super(p0, null, 2, null);
       this.mData = p1;
       HashMap hashMap = new HashMap();
       this.mExtra = hashMap;
       p1 = RomUtils.f();
       a.o(p1, "RomUtils.getName2\(\)");
       hashMap.put("romName", p1);
       p1 = RomUtils.i();
       a.o(p1, "RomUtils.getVersion\(\)");
       hashMap.put("romVersion", p1);
       p1 = KrnCoreReportDataModel.b;
       Objects.requireNonNull(p1);
       p1 = PatchProxy.apply(null, p1, KrnCoreReportDataModel$a.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = KrnCoreReportDataModel.a.getValue();
       }
       hashMap.put("romBuildVersion", p1);
       return;
    }
}
