package cw1.x;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import java.lang.Object;
import aq5.a;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class x implements b	// class@001e81
{
    public final d b;

    public void x(d p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       x tb = this.b;
       m0 om0 = tb.b();
       om0.a(LivePendantRelation.RECRUIT_EXPLAIN, tb.i());
    }
}
