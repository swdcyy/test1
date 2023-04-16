package com.kwai.framework.kgi.sdk.internal.config.KgiConfig$a;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import zsd.u;
import y76.c;
import lnc.i3;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig;
import java.lang.reflect.Type;
import com.yxcorp.utility.SystemUtil;
import n76.a;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig$a;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import java.lang.StringBuilder;
import y76.b;
import u76.a;
import u76.a$a;

public final class KgiConfig$a implements a	// class@001586
{
    public static final KgiConfig$a b;

    static {
       KgiConfig$a.b = new KgiConfig$a();
    }
    public void KgiConfig$a(){
       super();
    }
    public final void a(String p0,f p1){
       String str = "response";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KgiConfig$a.class, "1")) {
          return;
       }
       if (a.g("kgiSwitch", p0)) {
          if (p1 != null) {
             JsonElement jsonElement = p1.c();
             if (jsonElement != null) {
                String str1 = jsonElement.toString();
                if (str1 != null) {
                   a.o(str1, "it");
                   if (!(u.S1(str1) ^ 0x01)) {
                      str1 = null;
                   }
                   if (str1 != null) {
                      a.o(str1, str);
                      if (!PatchProxy.applyVoidOneRefs(str1, null, c.class, "2")) {
                         a.p(str1, str);
                         i3 oi3 = i3.f();
                         oi3.d("switch_info", str1);
                         str = oi3.e();
                         a.o(str, "jsb.build\(\)");
                         c.a.b("SERVER_RESPONSE_SWITCH", str);
                      }
                   }
                }
             }
          }
          KgiSwitchConfig kgiSwitchCon = (p1 != null)? p1.d(KgiSwitchConfig.class, null): null;
          if (SystemUtil.K() && a.b()) {
             kgiSwitchCon = KgiSwitchConfig.Companion.a();
          }
          if (kgiSwitchCon != null) {
             KgiConfig.a = kgiSwitchCon;
             b.e("ConfigValueChangedObserver#onChanged : mSwitchConfig = "+KgiConfig.a, false, 2, null);
             a.a.c(kgiSwitchCon);
          }
       }
    label_00b8 :
       return;
    }
}
