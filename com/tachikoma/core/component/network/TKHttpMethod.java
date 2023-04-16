package com.tachikoma.core.component.network.TKHttpMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKHttpMethod extends Enum	// class@000d80
{
    public static final TKHttpMethod[] $VALUES;
    public static final TKHttpMethod GET;
    public static final TKHttpMethod POST;

    static {
       TKHttpMethod tKHttpMethod = new TKHttpMethod("GET", 0);
       TKHttpMethod.GET = tKHttpMethod;
       TKHttpMethod tKHttpMethod1 = new TKHttpMethod("POST", 1);
       TKHttpMethod.POST = tKHttpMethod1;
       TKHttpMethod[] tKHttpMethod2 = new TKHttpMethod[]{tKHttpMethod,tKHttpMethod1};
       TKHttpMethod.$VALUES = tKHttpMethod2;
    }
    public void TKHttpMethod(String p0,int p1){
       super(p0, p1);
    }
    public static TKHttpMethod valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKHttpMethod.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKHttpMethod.class, p0);
    }
    public static TKHttpMethod[] values(){
       Object obj = PatchProxy.apply(null, null, TKHttpMethod.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKHttpMethod.$VALUES.clone();
    }
}
