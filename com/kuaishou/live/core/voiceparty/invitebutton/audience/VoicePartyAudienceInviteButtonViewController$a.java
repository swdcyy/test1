package com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController$a;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$b;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import pj2.c0;
import com.kuaishou.live.core.show.share.f$b;

public final class VoicePartyAudienceInviteButtonViewController$a implements LiveVoicePartyInvitationPanelFragment$b	// class@001515
{
    public final VoicePartyAudienceInviteButtonViewController a;

    public void VoicePartyAudienceInviteButtonViewController$a(VoicePartyAudienceInviteButtonViewController p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,VoicePartyMicSeatData p1){
       VoicePartyAudienceInviteButtonViewController$a uoa = VoicePartyAudienceInviteButtonViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       VoicePartyAudienceInviteButtonViewController$a ta = this.a;
       Objects.requireNonNull(ta);
       VoicePartyAudienceInviteButtonViewController voicePartyAu = VoicePartyAudienceInviteButtonViewController.class;
       if (!PatchProxy.isSupport(voicePartyAu) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, voicePartyAu, "3")) {
          if (p0 != 15) {
             b.B(LiveVoicePartyLogTag.OTHER, "VoicePartyAudienceInviteButtonViewController processAction switch to default");
          }else {
             a0 o1 = ta.l.o1;
             if (o1 != null) {
                o1.w1(null);
             }
          }
       }
       return;
    }
}
