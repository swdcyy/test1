package com.kwai.yoda.function.system.GetLocationFunction;
import ay7.a;
import com.kwai.yoda.function.system.GetLocationFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import com.kwai.yoda.function.system.GetLocationFunction$LocationResultParams;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;

public final class GetLocationFunction extends a	// class@0011e9
{
    public static final GetLocationFunction$a d;

    static {
       GetLocationFunction.d = new GetLocationFunction$a(null);
    }
    public void GetLocationFunction(){
       super();
    }
    public String c(){
       return "getLocation";
    }
    public String d(){
       return "system";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetLocationFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       d uod = Azeroth2.B.m();
       GetLocationFunction$LocationResultParams locationResu = new GetLocationFunction$LocationResultParams();
       locationResu.mResult = 1;
       double d = uod.i();
       double d1 = uod.j();
       if (0 - d && 0 - d1) {
          locationResu.setMLatitude(String.valueOf(d));
          locationResu.setMLongitude(String.valueOf(d1));
       }
       return locationResu;
    }
}
