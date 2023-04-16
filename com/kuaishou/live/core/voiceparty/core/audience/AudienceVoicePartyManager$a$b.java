package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a$b;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.MaybeVideoChatOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import hp2.c$d;
import ut7.h;

public final class AudienceVoicePartyManager$a$b implements o	// class@001389
{
    public static final AudienceVoicePartyManager$a$b a;

    static {
       AudienceVoicePartyManager$a$b.a = new AudienceVoicePartyManager$a$b();
    }
    public void AudienceVoicePartyManager$a$b(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, AudienceVoicePartyManager$a$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, c$d.d);
       }
       return uoa;
    }
}
