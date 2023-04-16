package com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.gifshow.DefaultHelper;
import kotlin.jvm.internal.a;

public final class XTabEveRegister$registerCTRPredictorDataProvider$5 extends Lambda implements a	// class@00130b
{
    public static final XTabEveRegister$registerCTRPredictorDataProvider$5 INSTANCE;

    static {
       XTabEveRegister$registerCTRPredictorDataProvider$5.INSTANCE = new XTabEveRegister$registerCTRPredictorDataProvider$5();
    }
    public void XTabEveRegister$registerCTRPredictorDataProvider$5(){
       super(0);
    }
    public final Object invoke(){
       HashMap obj = PatchProxy.apply(null, this, XTabEveRegister$registerCTRPredictorDataProvider$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (DefaultHelper.d() == null)? DefaultHelper.b(): DefaultHelper.d();
       a.o(obj, "if \(DefaultHelper.getHas¡­.getHasEnterChildrenTab\(\)");
       return obj;
    }
}
