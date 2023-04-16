package com.kwai.corona.CoronaApiExperimentUtil$a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaApiExperimentUtil$a implements x	// class@000ce0
{
    public static final CoronaApiExperimentUtil$a b;

    static {
       CoronaApiExperimentUtil$a.b = new CoronaApiExperimentUtil$a();
    }
    public void CoronaApiExperimentUtil$a(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaApiExperimentUtil$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableSerialPayCommercialCallback";
          int i = b.b(str);
          if (i != 1) {
             uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, false)): Boolean.FALSE;
          }else {
             uBoolean = Boolean.TRUE;
          }
       }
       return uBoolean;
    }
}
