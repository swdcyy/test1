package com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import co2.f2;
import ru2.c;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class TheaterAudienceChatViewLogic$micSeatDataManager$3 extends Lambda implements l	// class@001962
{
    public final TheaterAudienceChatViewLogic this$0;

    public void TheaterAudienceChatViewLogic$micSeatDataManager$3(TheaterAudienceChatViewLogic p0){
       this.this$0 = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TheaterAudienceChatViewLogic$micSeatDataManager$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.b(p0, this.this$0.z.f(), null, 4, null);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}