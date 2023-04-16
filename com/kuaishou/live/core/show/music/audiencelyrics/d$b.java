package com.kuaishou.live.core.show.music.audiencelyrics.d$b;
import aq5.b;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import qc2.s;

public class d$b implements b	// class@000d30
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void e6(a p0,boolean p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       d$b tb = this.b;
       int i = 0;
       p1 = (tb.q.N().r2(AudienceBizRelation.CHAT) || this.b.q.N().r2(AudienceBizRelation.VOICE_PARTY_GUEST))? true: false;
       tb.M = p1;
       tb = this.b;
       if (tb.H != null) {
          d n = tb.N;
          if (tb.M != null) {
             i = 8;
          }
          n.a = i;
          tb.W8();
       }
       return;
    }
}
