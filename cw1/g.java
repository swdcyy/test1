package cw1.g;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.b;
import java.lang.Object;
import aq5.a;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class g implements b	// class@001e65
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       g tb = this.b;
       d uod = tb.c.A0();
       AnchorBizRelation cHAT_CENTER_ = AnchorBizRelation.CHAT_CENTER_VIEW;
       boolean b = true;
       if (p0 == cHAT_CENTER_) {
          if (p1 || !tb.g()) {
          label_001f :
             b = false;
          }
       }else if(p1 && !uod.r2(cHAT_CENTER_)){
       }
       tb.b().a(LivePendantRelation.CHAT, b);
       return;
    }
}
