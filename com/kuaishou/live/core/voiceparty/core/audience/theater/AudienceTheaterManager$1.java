package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudienceTheaterManager$1 extends Lambda implements a	// class@0013c8
{
    public final a $liveBaseContext;

    public void AudienceTheaterManager$1(a p0){
       this.$liveBaseContext = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, AudienceTheaterManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$liveBaseContext.getLiveStreamId();
    }
}
