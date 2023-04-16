package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$e;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import java.lang.Object;
import zo2.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$StartOffline;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;

public final class AudienceKtvManager$e implements g	// class@0013bc
{
    public final AudienceKtvManager b;

    public void AudienceKtvManager$e(AudienceKtvManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceKtvManager$e.class, "1")) {
       }else if(p0.a()){
          this.b.r(new AudienceKtvManager$StartOffline(p0.b()));
       }
       return;
    }
}
