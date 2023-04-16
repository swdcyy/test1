package com.yxcorp.gifshow.XTabEveRegister$registerCTRPredictorDataProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.DefaultHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import tra.a;
import kotlin.jvm.internal.a;

public final class XTabEveRegister$registerCTRPredictorDataProvider$2 extends Lambda implements a	// class@001308
{
    public static final XTabEveRegister$registerCTRPredictorDataProvider$2 INSTANCE;

    static {
       XTabEveRegister$registerCTRPredictorDataProvider$2.INSTANCE = new XTabEveRegister$registerCTRPredictorDataProvider$2();
    }
    public void XTabEveRegister$registerCTRPredictorDataProvider$2(){
       super(0);
    }
    public final Object invoke(){
       String obj = PatchProxy.apply(null, this, XTabEveRegister$registerCTRPredictorDataProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(DefaultHelper.g())) {
          obj = DefaultHelper.g();
       }else {
          Boolean uBoolean = a.f();
          a.o(uBoolean, "DefaultPreferenceHelper.getXBlockUserChangedTab\(\)");
          obj = (uBoolean.booleanValue())? DefaultHelper.c(): "blocks";
       }
       a.o(obj, "if \(!TextUtils.isEmpty\(D¡­    else\n        \"blocks\"");
       return obj;
    }
}
