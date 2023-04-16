package com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.kwai.social.config.utils.HoldoutConfigUtilKt$isSocialHoldoutEnabled$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class HoldoutConfigUtilKt	// class@000f46
{
    public static final p a;

    static {
       HoldoutConfigUtilKt.a = s.c(HoldoutConfigUtilKt$isSocialHoldoutEnabled$2.INSTANCE);
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HoldoutConfigUtilKt.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HoldoutConfigUtilKt.a.getValue();
       }
       return obj.booleanValue();
    }
}
