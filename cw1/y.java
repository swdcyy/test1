package cw1.y;
import aq5.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import java.lang.Object;
import aq5.a;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class y implements b	// class@001e82
{
    public final d b;

    public void y(d p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       y tb = this.b;
       d uod = tb.c.A0();
       AudienceBizRelation cHAT_CENTER_ = AudienceBizRelation.CHAT_CENTER_STATUS_VIEW;
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
