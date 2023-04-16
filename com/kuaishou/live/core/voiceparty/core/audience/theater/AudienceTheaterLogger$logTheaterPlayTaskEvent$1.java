package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterLogger$logTheaterPlayTaskEvent$1;
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
import op2.g;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import op2.e;
import op2.f;

public final class AudienceTheaterLogger$logTheaterPlayTaskEvent$1 extends Lambda implements l	// class@0013c7
{
    public final int $reason;
    public final m this$0;

    public void AudienceTheaterLogger$logTheaterPlayTaskEvent$1(m p0,int p1){
       this.this$0 = p0;
       this.$reason = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ClientContent$LiveVoicePartyTheaterPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterLogger$logTheaterPlayTaskEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.enterTheaterTimestamp = this.this$0.b();
       p0.leaveTheaterTimestamp = System.currentTimeMillis();
       p0.leaveTheaterReason = this.$reason;
       p0.landscapeDuration = this.this$0.d();
       p0.fullscreenDuration = this.this$0.c();
       f uof = this.this$0.f().e().a();
       String str = (uof != null)? uof.e(): "";
       p0.seriesId = str;
       return;
    }
}
