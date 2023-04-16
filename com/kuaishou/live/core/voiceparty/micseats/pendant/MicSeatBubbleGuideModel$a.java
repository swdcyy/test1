package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel$a;
import erd.o;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import java.util.Collection;

public final class MicSeatBubbleGuideModel$a implements o	// class@001660
{
    public final MicSeatBubbleGuideModel b;

    public void MicSeatBubbleGuideModel$a(MicSeatBubbleGuideModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       MicSeatBubbleGuideModel micSeatBubbl = PatchProxy.applyOneRefs(p0, this, MicSeatBubbleGuideModel$a.class, "1");
       if (micSeatBubbl != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleGuide");
          if (p0.f() == MicSeatGuideState.IDLE) {
             this.b.a.remove(p0.g());
          }else {
             this.b.a.add(p0.g());
          }
          micSeatBubbl = this.b.a;
       }
       return micSeatBubbl;
    }
}
