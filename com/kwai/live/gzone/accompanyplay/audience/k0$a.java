package com.kwai.live.gzone.accompanyplay.audience.k0$a;
import mq5.h;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;

public class k0$a implements h	// class@000b89
{
    public final k0 b;

    public void k0$a(k0 p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, k0$a.class, "1")) {
          return;
       }
       this.b.R8();
       if (!this.b.F.isDisposed()) {
          this.b.F.dispose();
          this.b.F = new a();
       }
       return;
    }
}
