package com.kwai.sdk.eve.c;
import sm7.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;

public final class c implements o	// class@00144b
{

    public void c(){
       super();
    }
    public Object getValue(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = a.t().getValue("eveLocalGuardConfig", EveLocalGuardConfig.class, new EveLocalGuardConfig());
          a.o(obj, "SwitchConfigManager.getI¡­GuardConfig\(\)\n          \)");
       }
       return obj;
    }
}
