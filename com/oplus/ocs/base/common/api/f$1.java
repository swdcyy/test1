package com.oplus.ocs.base.common.api.f$1;
import com.coloros.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.api.f;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class f$1 extends IAuthenticationListener$Stub	// class@000ae1
{
    public final f a;

    public void f$1(f p0){
       this.a = p0;
       super();
    }
    public final void onFail(int p0){
       if (f.a(this.a) != null) {
          f.a(this.a).onFail(p0);
       }
       return;
    }
    public final void onSuccess(CapabilityInfo p0){
       if (f.a(this.a) != null) {
          if (p0 == null) {
             f.a(this.a).onFail(7);
             return;
          }else {
             f.a(this.a).onSuccess(p0);
          }
       }
       return;
    }
}
