package com.kwai.live.gzone.accompanyplay.audience.d0$a;
import mq5.h;
import com.kwai.live.gzone.accompanyplay.audience.d0;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.b0;

public class d0$a implements h	// class@000b73
{
    public final d0 b;

    public void d0$a(d0 p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, d0$a.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
