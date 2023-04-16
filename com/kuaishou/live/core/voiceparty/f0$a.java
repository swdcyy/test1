package com.kuaishou.live.core.voiceparty.f0$a;
import aq5.b;
import com.kuaishou.live.core.voiceparty.f0;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import t02.a0;
import oq5.c;
import jv1.b;

public class f0$a implements b	// class@0014e9
{
    public final f0 b;

    public void f0$a(f0 p0){
       this.b = p0;
       super();
    }
    public void e6(a p0,boolean p1){
       f0$a tb;
       f0$a uoa = f0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 == AudienceBizRelation.VOICE_PARTY_THEATER) {
          if (p1) {
             tb = this.b;
             tb.q.x.W0(tb.u, false);
          }else {
             tb = this.b;
             tb.q.x.Q0(tb.u);
          }
       }
       return;
    }
}
