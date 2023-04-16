package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$play$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;

public final class AudienceTheaterManager$play$2 extends Lambda implements p	// class@0013cf
{
    public final AudienceTheaterManager this$0;

    public void AudienceTheaterManager$play$2(AudienceTheaterManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.longValue(), p1.longValue());
       return l1.a;
    }
    public final void invoke(long p0,long p1){
       if (PatchProxy.isSupport(AudienceTheaterManager$play$2.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, AudienceTheaterManager$play$2.class, "1")) {
          return;
       }
       this.this$0.c(p0, p1);
       return;
    }
}
