package com.kwai.feature.platform.misc.multilang.DynamicMultiLang$enabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$ABTestConfig;
import java.lang.reflect.Type;

public final class DynamicMultiLang$enabled$2 extends Lambda implements a	// class@0012b5
{
    public static final DynamicMultiLang$enabled$2 INSTANCE;

    static {
       DynamicMultiLang$enabled$2.INSTANCE = new DynamicMultiLang$enabled$2();
    }
    public void DynamicMultiLang$enabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DynamicMultiLang$enabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().getValue("multiLanguageConfig", DynamicMultiLang$ABTestConfig.class, new DynamicMultiLang$ABTestConfig()).getEnable();
    }
}
