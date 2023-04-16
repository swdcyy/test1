package com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class TheaterAudienceChatViewLogic$micSeatDataManager$4 extends Lambda implements l	// class@001963
{
    public static final TheaterAudienceChatViewLogic$micSeatDataManager$4 INSTANCE;

    static {
       TheaterAudienceChatViewLogic$micSeatDataManager$4.INSTANCE = new TheaterAudienceChatViewLogic$micSeatDataManager$4();
    }
    public void TheaterAudienceChatViewLogic$micSeatDataManager$4(){
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TheaterAudienceChatViewLogic$micSeatDataManager$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.g(p0, 6);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
