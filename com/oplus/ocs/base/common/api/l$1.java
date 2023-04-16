package com.oplus.ocs.base.common.api.l$1;
import com.oplus.ocs.base.common.api.j;
import com.oplus.ocs.base.common.api.l;
import com.oplus.ocs.base.common.api.OplusApi;
import java.lang.Object;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.Api$ClientKey;

public final class l$1 implements j	// class@000aef
{
    public final OplusApi a;
    public final l b;

    public void l$1(l p0,OplusApi p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(){
       l.a(this.a.getApi().getClientKey());
    }
}
