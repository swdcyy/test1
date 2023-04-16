package com.frog.engine.network.xhr.FrogHttpMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FrogHttpMethod extends Enum	// class@001562
{
    public static final FrogHttpMethod[] $VALUES;
    public static final FrogHttpMethod DELETE;
    public static final FrogHttpMethod GET;
    public static final FrogHttpMethod HEAD;
    public static final FrogHttpMethod POST;
    public static final FrogHttpMethod PUT;

    static {
       FrogHttpMethod uFrogHttpMet = new FrogHttpMethod("GET", 0);
       FrogHttpMethod.GET = uFrogHttpMet;
       FrogHttpMethod uFrogHttpMet1 = new FrogHttpMethod("HEAD", 1);
       FrogHttpMethod.HEAD = uFrogHttpMet1;
       FrogHttpMethod uFrogHttpMet2 = new FrogHttpMethod("POST", 2);
       FrogHttpMethod.POST = uFrogHttpMet2;
       FrogHttpMethod uFrogHttpMet3 = new FrogHttpMethod("DELETE", 3);
       FrogHttpMethod.DELETE = uFrogHttpMet3;
       FrogHttpMethod uFrogHttpMet4 = new FrogHttpMethod("PUT", 4);
       FrogHttpMethod.PUT = uFrogHttpMet4;
       FrogHttpMethod[] uFrogHttpMet5 = new FrogHttpMethod[]{uFrogHttpMet,uFrogHttpMet1,uFrogHttpMet2,uFrogHttpMet3,uFrogHttpMet4};
       FrogHttpMethod.$VALUES = uFrogHttpMet5;
    }
    public void FrogHttpMethod(String p0,int p1){
       super(p0, p1);
    }
    public static FrogHttpMethod valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogHttpMethod.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FrogHttpMethod.class, p0);
    }
    public static FrogHttpMethod[] values(){
       Object obj = PatchProxy.apply(null, null, FrogHttpMethod.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FrogHttpMethod.$VALUES.clone();
    }
}
