package com.kuaishou.krn.experiment.ExpConfigKt$enableKDSPageReportAggregation$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;

public final class ExpConfigKt$enableKDSPageReportAggregation$2 extends Lambda implements a	// class@000884
{
    public static final ExpConfigKt$enableKDSPageReportAggregation$2 INSTANCE;

    static {
       ExpConfigKt$enableKDSPageReportAggregation$2.INSTANCE = new ExpConfigKt$enableKDSPageReportAggregation$2();
    }
    public void ExpConfigKt$enableKDSPageReportAggregation$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$enableKDSPageReportAggregation$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = true;
       if (obj != null) {
          b = obj.getBoolean("KDSPageReportAggregation", b);
       }
       return b;
    }
}
