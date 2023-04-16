package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import gp2.m;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import op2.c;
import op2.g;
import java.lang.System;

public final class AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1 extends Lambda implements l	// class@0013c6
{
    public final int $reason;
    public final m this$0;

    public void AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1(m p0,int p1){
       this.this$0 = p0;
       this.$reason = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ClientContent$LiveVoicePartyTheaterPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.landscapeDuration = this.this$0.e().c;
       p0.fullscreenDuration = this.this$0.e().b;
       p0.clearscteenDuration = this.this$0.e().d;
       p0.audienceLeaveTheaterSeriesReason = this.$reason;
       p0.enterTheaterSeriesTimestamp = this.this$0.e().a;
       p0.leaveTheaterSeriesTimestamp = System.currentTimeMillis();
       return;
    }
}
