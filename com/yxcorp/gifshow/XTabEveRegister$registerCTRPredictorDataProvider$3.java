package com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.yxcorp.gifshow.DefaultHelper;
import kotlin.jvm.internal.a;

public final class XTabEveRegister$registerCTRPredictorDataProvider$3 extends Lambda implements a	// class@001309
{
    public static final XTabEveRegister$registerCTRPredictorDataProvider$3 INSTANCE;

    static {
       XTabEveRegister$registerCTRPredictorDataProvider$3.INSTANCE = new XTabEveRegister$registerCTRPredictorDataProvider$3();
    }
    public void XTabEveRegister$registerCTRPredictorDataProvider$3(){
       super(0);
    }
    public final Object invoke(){
       Long obj = PatchProxy.apply(null, this, XTabEveRegister$registerCTRPredictorDataProvider$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DefaultHelper.f();
       a.o(obj, "DefaultHelper.getLastEnterTime\(\)");
       return obj;
    }
}
