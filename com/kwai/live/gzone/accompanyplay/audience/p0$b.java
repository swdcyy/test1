package com.kwai.live.gzone.accompanyplay.audience.p0$b;
import mq5.h;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.b0;

public class p0$b implements h	// class@000ba3
{
    public final p0 b;

    public void p0$b(p0 p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, p0$b.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
