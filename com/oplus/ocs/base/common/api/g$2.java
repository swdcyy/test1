package com.oplus.ocs.base.common.api.g$2;
import com.oplus.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.api.g;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class g$2 extends IAuthenticationListener$Stub	// class@000ae5
{
    public final g a;

    public void g$2(g p0){
       this.a = p0;
       super();
    }
    public final void onFail(int p0){
       a.c(this.a.a, ("handleAsyncAuthenticate, onFailed errorCode: ").concat(String.valueOf(p0)));
       this.a.a(p0);
    }
    public final void onSuccess(CapabilityInfo p0){
       a.b(this.a.a, "handleAsyncAuthenticate, onSuccess");
       g.a(this.a, p0);
    }
}
