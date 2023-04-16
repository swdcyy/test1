package com.oplus.ocs.base.common.api.l$2;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.l;
import com.oplus.ocs.base.common.api.OplusApi;
import java.lang.Object;
import com.oplus.ocs.base.common.CapabilityInfo;

public final class l$2 implements i	// class@000af0
{
    public final OplusApi a;
    public final l b;

    public void l$2(l p0,OplusApi p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(CapabilityInfo p0){
       if (p0 != null) {
          this.a.checkAuthResult(p0);
       }
       return;
    }
}
