package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$prepare$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import gp2.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PlayEvent;
import op2.a;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;

public final class AudienceTheaterManager$prepare$1 extends Lambda implements l	// class@0013d0
{
    public final AudienceTheaterManager this$0;

    public void AudienceTheaterManager$prepare$1(AudienceTheaterManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterManager$prepare$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.r(new TheaterManager$PlayEvent(p0));
       return;
    }
}
