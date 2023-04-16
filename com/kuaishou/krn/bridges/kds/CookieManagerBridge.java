package com.kuaishou.krn.bridges.kds.CookieManagerBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kj0.f;
import kj0.a;

public final class CookieManagerBridge extends KrnBridge	// class@000810
{

    public void CookieManagerBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public final String getCookie(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, CookieManagerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       return obj.f().h.a(p0);
    }
    public String getName(){
       return "CookieManager";
    }
}
