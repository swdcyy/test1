package com.kuaishou.tuna.plc.logic.PlcPreDecideOpenApp$mNeedJudgeDeepLink$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PlcPreDecideOpenApp$mNeedJudgeDeepLink$2 extends Lambda implements a	// class@00102c
{
    public static final PlcPreDecideOpenApp$mNeedJudgeDeepLink$2 INSTANCE;

    static {
       PlcPreDecideOpenApp$mNeedJudgeDeepLink$2.INSTANCE = new PlcPreDecideOpenApp$mNeedJudgeDeepLink$2();
    }
    public void PlcPreDecideOpenApp$mNeedJudgeDeepLink$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PlcPreDecideOpenApp$mNeedJudgeDeepLink$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("plc_open_app", false);
    }
}
