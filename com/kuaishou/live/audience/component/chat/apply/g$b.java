package com.kuaishou.live.audience.component.chat.apply.g$b;
import vb1.b$a;
import com.kuaishou.live.audience.component.chat.apply.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import lp3.i;
import lp3.c;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import com.kuaishou.live.audience.component.chat.apply.d;

public class g$b implements b$a	// class@000a6d
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void S2(boolean p0){
       LiveAudienceApplyChatService liveAudience = LiveAudienceApplyChatService.class;
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       g$b tb = this.b;
       tb.u.h(tb.R8(tb.P8().a(liveAudience).isEnabled()), this.b.P8().a(liveAudience).jh(), this.b.S8());
       return;
    }
}
