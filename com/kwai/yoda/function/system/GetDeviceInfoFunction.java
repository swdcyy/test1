package com.kwai.yoda.function.system.GetDeviceInfoFunction;
import ay7.a;
import com.kwai.yoda.function.system.GetDeviceInfoFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.system.GetDeviceInfoFunction$DeviceInfoResultParams;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import android.content.Context;
import ca7.t;
import yb7.k;

public final class GetDeviceInfoFunction extends a	// class@0011e5
{
    public static final GetDeviceInfoFunction$a d;

    static {
       GetDeviceInfoFunction.d = new GetDeviceInfoFunction$a(null);
    }
    public void GetDeviceInfoFunction(){
       super();
    }
    public String c(){
       return "getDeviceInfo";
    }
    public String d(){
       return "system";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetDeviceInfoFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       GetDeviceInfoFunction$DeviceInfoResultParams uDeviceInfoR = new GetDeviceInfoFunction$DeviceInfoResultParams();
       uDeviceInfoR.mResult = 1;
       Azeroth2 b = Azeroth2.B;
       uDeviceInfoR.setMSys(b.m().q());
       uDeviceInfoR.setMMod(b.m().k());
       uDeviceInfoR.setMDeviceName(t.e(b.d()));
       uDeviceInfoR.setMIMEI(k.a(b.d()));
       return uDeviceInfoR;
    }
}
