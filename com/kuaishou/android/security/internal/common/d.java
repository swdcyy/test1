package com.kuaishou.android.security.internal.common.d;
import u38.a;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import com.kuaishou.android.security.internal.common.KSecurityContext;

public class d extends a	// class@000f45
{

    public void d(){
       super();
    }
    public Application getContext(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().j().c().getApplicationContext();
    }
    public String getProductName(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.i().h().getProductName();
    }
    public boolean isDebugMode(){
       return false;
    }
    public boolean isTestMode(){
       return false;
    }
}
