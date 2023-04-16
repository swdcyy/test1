package com.yxcorp.gifshow.ad.report.ReportModuleUseTools$mRuleMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.ad.report.UtilzationSampleRule;
import el.a;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.util.LinkedHashMap;

public final class ReportModuleUseTools$mRuleMap$2 extends Lambda implements a	// class@0017aa
{
    public static final ReportModuleUseTools$mRuleMap$2 INSTANCE;

    static {
       ReportModuleUseTools$mRuleMap$2.INSTANCE = new ReportModuleUseTools$mRuleMap$2();
    }
    public void ReportModuleUseTools$mRuleMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       a obj = PatchProxy.apply(null, this, ReportModuleUseTools$mRuleMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Type[] typeArray = new Type[]{String.class,UtilzationSampleRule.class};
       obj = a.getParameterized(Map.class, typeArray);
       a.o(obj, "TypeToken.getParameteriz¡­pleRule::class.java\n    \)");
       return a.t().getValue("adModuleUtilizationRate", obj.getType(), new LinkedHashMap());
    }
}
