package com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ru2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2 extends Lambda implements l	// class@00191b
{
    public final AudienceTeamPkViewController this$0;

    public void AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2(AudienceTeamPkViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.f(p0, this.this$0.N.e());
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}