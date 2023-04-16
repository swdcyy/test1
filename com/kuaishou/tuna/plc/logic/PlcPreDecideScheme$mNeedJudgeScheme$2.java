package com.kuaishou.tuna.plc.logic.PlcPreDecideScheme$mNeedJudgeScheme$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PlcPreDecideScheme$mNeedJudgeScheme$2 extends Lambda implements a	// class@00102f
{
    public static final PlcPreDecideScheme$mNeedJudgeScheme$2 INSTANCE;

    static {
       PlcPreDecideScheme$mNeedJudgeScheme$2.INSTANCE = new PlcPreDecideScheme$mNeedJudgeScheme$2();
    }
    public void PlcPreDecideScheme$mNeedJudgeScheme$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PlcPreDecideScheme$mNeedJudgeScheme$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("plc_scheme", false);
    }
}
