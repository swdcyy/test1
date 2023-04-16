package com.kuaishou.android.security.internal.common.h$a;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import java.lang.String;
import com.kuaishou.android.security.internal.common.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class h$a	// class@0006d0
{

    public void h$a(){
       super();
    }
    public abstract h$a a(Context p0);
    public abstract h$a a(KSecuritySdkILog p0);
    public abstract h$a a(KSecurityTrack$IKSecurityTrackCallback p0);
    public abstract h$a a(KSecurityContext$Mode p0);
    public abstract h$a a(String p0);
    public abstract h a();
    public abstract h$a b(String p0);
    public h b(){
       Object obj = PatchProxy.apply(null, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a();
    }
}
