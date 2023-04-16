package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$StartOffline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class AudienceKtvManager$d extends KtvManager$g	// class@0013bb
{
    public final AudienceKtvManager h;

    public void AudienceKtvManager$d(AudienceKtvManager p0){
       this.h = p0;
       super(p0);
    }
    public final boolean k(AudienceKtvManager$StartOffline p0){
       AudienceKtvManager$d obj = PatchProxy.applyOneRefs(p0, this, AudienceKtvManager$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "offline");
       obj = this.h;
       int i = (p0.a != null)? 7: 6;
       obj.o(i);
       return true;
    }
}
