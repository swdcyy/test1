package cw1.e;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.b;
import java.lang.Object;
import aq5.a;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class e implements b	// class@001e61
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       e tb = this.b;
       m0 om0 = tb.b();
       om0.a(LivePendantRelation.LIVE_PK, tb.h());
    }
}
