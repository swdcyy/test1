package com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$c;
import erd.g;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yt2.a;
import java.lang.Boolean;
import java.lang.System;
import qu2.a;
import co2.f2;
import yx2.d;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class VoicePartyMuteServiceImpl$c implements g	// class@0017fa
{
    public final VoicePartyMuteServiceImpl b;
    public final boolean c;
    public final a d;

    public void VoicePartyMuteServiceImpl$c(VoicePartyMuteServiceImpl p0,boolean p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMuteServiceImpl$c.class, str)) {
          return;
       }
       p0 = this.b.g;
       VoicePartyMuteServiceImpl$c tc = this.c;
       Objects.requireNonNull(p0);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), p0, uoa, str)) {
          p0.c();
          if (tc != null) {
             p0.a = System.currentTimeMillis();
          }
       }
       this.b.S(this.c);
       VoicePartyMuteServiceImpl$c tb = this.b;
       p0 = tb.Q();
       f2 uof2 = this.b.R();
       VoicePartyMuteServiceImpl$c tc1 = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(VoicePartyMuteServiceImpl.class) || !PatchProxy.applyVoidThreeRefs(p0, uof2, Boolean.valueOf(tc1), tb, VoicePartyMuteServiceImpl.class, "11")) {
          p0 = i3.f();
          p0.c("status", Integer.valueOf((tc1 ^ 0x01)));
          p0 = p0.e();
          a.o(p0, "JsonStringBuilder.newIns¡­lse 1\)\n          .build\(\)");
          new d("TURN_OFF_MIC", uof2, p0).a(p0).f();
       }
       this.d.invoke();
       return;
    }
}
