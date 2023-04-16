package com.kwai.yoda.function.system.GetBatteryInfoFunction;
import ay7.a;
import com.kwai.yoda.function.system.GetBatteryInfoFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.system.GetBatteryInfoFunction$GetBatteryResultParams;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;

public final class GetBatteryInfoFunction extends a	// class@0011e1
{
    public static final GetBatteryInfoFunction$a d;

    static {
       GetBatteryInfoFunction.d = new GetBatteryInfoFunction$a(null);
    }
    public void GetBatteryInfoFunction(){
       super();
    }
    public String c(){
       return "getBatteryInfo";
    }
    public String d(){
       return "system";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetBatteryInfoFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       GetBatteryInfoFunction$GetBatteryResultParams getBatteryRe = new GetBatteryInfoFunction$GetBatteryResultParams();
       getBatteryRe.mResult = 1;
       getBatteryRe.isLowPowerMode = Azeroth2.B.m().A();
       return getBatteryRe;
    }
}
