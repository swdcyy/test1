package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiveLiteLongConnectionManager$a	// class@000a24
{

    public void LiveLiteLongConnectionManager$a(){
       super();
    }
    public void LiveLiteLongConnectionManager$a(u p0){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteLongConnectionManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiteNewLongConnectionManager", false);
    }
}
