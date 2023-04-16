package com.kwai.feature.platform.misc.multilang.DynamicMultiLang;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$resId$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$enabled$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l06.b;
import q87.c;
import android.os.Build$VERSION;
import o06.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import b66.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$b;
import java.util.Locale;
import lnc.f4;
import kotlin.jvm.internal.a;
import qe6.d;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class DynamicMultiLang	// class@0012b7
{
    public static final p a;
    public static DynamicMultiLang$b b;
    public static final p c;
    public static final DynamicMultiLang d;

    static {
       DynamicMultiLang.d = new DynamicMultiLang();
       DynamicMultiLang.a = s.c(DynamicMultiLang$resId$2.INSTANCE);
       DynamicMultiLang.c = s.c(DynamicMultiLang$enabled$2.INSTANCE);
    }
    public void DynamicMultiLang(){
       super();
    }
    public static final void e(){
       if (PatchProxy.applyVoid(null, null, DynamicMultiLang.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().t("DynamicMultiLang", "register StartUp Consumer", objArray);
       if (Build$VERSION.SDK_INT >= 23) {
          c.a(new b());
       }else {
          Object[] objArray1 = new Object[i];
          b.C().t("DynamicMultiLang", "< M", objArray1);
       }
       return;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, DynamicMultiLang.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = DynamicMultiLang.c.getValue();
       }
       return obj.booleanValue();
    }
    public final DynamicMultiLang$b b(){
       return DynamicMultiLang.b;
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, DynamicMultiLang.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicMultiLang.a.getValue();
    }
    public final boolean d(){
       Locale obj = PatchProxy.apply(null, this, DynamicMultiLang.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = f4.a();
       a.o(obj, "LocaleUpdateUtil.getDefaultLocale\(\)");
       obj = d.d(obj);
       a.o(obj, "current");
       Locale sIMPLIFIED_C = Locale.SIMPLIFIED_CHINESE;
       a.o(sIMPLIFIED_C, "Locale.SIMPLIFIED_CHINESE");
       if (a.g(obj.getLanguage(), sIMPLIFIED_C.getLanguage())) {
          sIMPLIFIED_C = Locale.SIMPLIFIED_CHINESE;
          a.o(sIMPLIFIED_C, "Locale.SIMPLIFIED_CHINESE");
          if (a.g(obj.getCountry(), sIMPLIFIED_C.getCountry())) {
             if (TextUtils.isEmpty(obj.getScript())) {
                return true;
             }else {
                return TextUtils.equals(obj.getScript(), "Hans");
             }
          }
       }
       return false;
    }
}
