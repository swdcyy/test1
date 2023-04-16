package com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$prepare$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;

public final class AudiencePrepareWatchLogic$prepare$4 extends Lambda implements l	// class@0013c2
{
    public final AudiencePrepareWatchLogic this$0;

    public void AudiencePrepareWatchLogic$prepare$4(AudiencePrepareWatchLogic p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(AudiencePrepareWatchLogic$prepare$4.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, AudiencePrepareWatchLogic$prepare$4.class, "1")) {
          return;
       }
       this.this$0.a.onNext(Long.valueOf(p0));
       return;
    }
}
