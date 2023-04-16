package com.kwai.yoda.function.system.GetAppInfoFunction;
import ay7.a;
import com.kwai.yoda.function.system.GetAppInfoFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.system.GetAppInfoFunction$AppInfoResultParams;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import java.util.Locale;
import kotlin.jvm.internal.a;
import android.content.Context;
import kotlin.TypeCastException;

public final class GetAppInfoFunction extends a	// class@0011de
{
    public static final GetAppInfoFunction$a d;

    static {
       GetAppInfoFunction.d = new GetAppInfoFunction$a(null);
    }
    public void GetAppInfoFunction(){
       super();
    }
    public String c(){
       return "getAppInfo";
    }
    public String d(){
       return "system";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetAppInfoFunction.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       GetAppInfoFunction$AppInfoResultParams uAppInfoResu = new GetAppInfoFunction$AppInfoResultParams();
       Azeroth2 b = Azeroth2.B;
       d uod = b.m();
       uAppInfoResu.mResult = 1;
       uAppInfoResu.setMKpn(uod.m());
       uAppInfoResu.setMKpf(uod.l());
       uAppInfoResu.setMUserId(uod.r());
       uAppInfoResu.setMDeviceId(uod.f());
       String str = uod.d();
       Locale uS = Locale.US;
       a.h(uS, "Locale.US");
       if (str == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
       str = str.toUpperCase(uS);
       a.h(str, "\(this as java.lang.String\).toUpperCase\(locale\)");
       uAppInfoResu.setMC(str);
       uAppInfoResu.setMVer(uod.c());
       uAppInfoResu.setMAppVer(uod.b());
       uAppInfoResu.setMLanguage(uod.h());
       String str1 = uod.e();
       a.h(uS, "Locale.US");
       if (str1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
       str1 = str1.toUpperCase(uS);
       a.h(str1, "\(this as java.lang.String\).toUpperCase\(locale\)");
       uAppInfoResu.setMCountryCode(str1);
       uAppInfoResu.setMBundleId(b.d().getPackageName());
       return uAppInfoResu;
    }
}
