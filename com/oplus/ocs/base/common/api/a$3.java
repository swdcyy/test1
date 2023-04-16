package com.oplus.ocs.base.common.api.a$3;
import com.coloros.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.api.a;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class a$3 extends IAuthenticationListener$Stub	// class@000ad9
{
    public final a a;

    public void a$3(a p0){
       this.a = p0;
       super();
    }
    public final void onFail(int p0){
       a.a(this.a, p0);
    }
    public final void onSuccess(CapabilityInfo p0){
       if (p0 == null) {
          a.a(this.a, 7);
          return;
       }else {
          a.a(this.a, p0);
          return;
       }
    }
}
