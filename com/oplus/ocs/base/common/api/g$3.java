package com.oplus.ocs.base.common.api.g$3;
import com.oplus.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.api.g;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class g$3 extends IAuthenticationListener$Stub	// class@000ae6
{
    public final g a;

    public void g$3(g p0){
       this.a = p0;
       super();
    }
    public final void onFail(int p0){
       this.a.a(p0);
    }
    public final void onSuccess(CapabilityInfo p0){
       g.a(this.a, p0);
    }
}
