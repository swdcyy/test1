package com.oplus.ocs.base.common.api.a$2;
import com.oplus.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.api.a;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class a$2 extends IAuthenticationListener$Stub	// class@000ad8
{
    public final a a;

    public void a$2(a p0){
       this.a = p0;
       super();
    }
    public final void onFail(int p0){
       a.c(a.b(this.a), ("handleAsyncAuthenticate, onFailed errorCode: ").concat(String.valueOf(p0)));
       a.a(this.a, p0);
    }
    public final void onSuccess(CapabilityInfo p0){
       a.b(a.b(this.a), "handleAsyncAuthenticate, onSuccess");
       a.a(this.a, p0);
    }
}
