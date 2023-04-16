package com.kwai.yoda.function.system.GetNetworkTypeFunction;
import ay7.a;
import com.kwai.yoda.function.system.GetNetworkTypeFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.system.GetNetworkTypeFunction$NetworkTypeResultParams;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import yz7.i;

public final class GetNetworkTypeFunction extends a	// class@0011ed
{
    public static final GetNetworkTypeFunction$a d;

    static {
       GetNetworkTypeFunction.d = new GetNetworkTypeFunction$a(null);
    }
    public void GetNetworkTypeFunction(){
       super();
    }
    public String c(){
       return "getNetworkType";
    }
    public String d(){
       return "system";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetNetworkTypeFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       GetNetworkTypeFunction$NetworkTypeResultParams networkTypeR = new GetNetworkTypeFunction$NetworkTypeResultParams();
       networkTypeR.mResult = 1;
       networkTypeR.setMNet(i.a(Azeroth2.B.d()));
       return networkTypeR;
    }
}
