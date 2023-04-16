package cw1.u;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import java.lang.Object;
import aq5.a;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class u implements b	// class@001e7e
{
    public final d b;

    public void u(d p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       this.b.b().a(LivePendantRelation.MERCHANT_FAST_PAY_BUBBLE, p1);
    }
}
