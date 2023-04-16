package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$c;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import gp2.b;
import java.lang.Object;
import com.google.common.base.Optional;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import op2.k;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class AudienceTheaterManager$c implements g	// class@0013cc
{
    public final AudienceTheaterManager b;
    public final b c;

    public void AudienceTheaterManager$c(AudienceTheaterManager p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterManager$c.class, "1")) {
       }else {
          this.b.f().y(p0.orNull(), this.c.getQualityList());
       }
       return;
    }
}
