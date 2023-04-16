package com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic;
import msd.l;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import com.google.common.base.Optional;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ep2.a;
import com.yxcorp.gifshow.model.Lyrics;
import ep2.e;
import zo2.a0;

public final class AudiencePrepareWatchLogic$b implements g	// class@0013c0
{
    public final AudiencePrepareWatchLogic b;
    public final l c;
    public final KtvMusicOrderInfo d;

    public void AudiencePrepareWatchLogic$b(AudiencePrepareWatchLogic p0,l p1,KtvMusicOrderInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudiencePrepareWatchLogic$b.class, "1")) {
       }else {
          p0 = this.b;
          a uoa = new a(this.d, p0.orNull(), p0.e, p0.c.e);
          this.c.invoke(v7);
       }
       return;
    }
}
