package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$b;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCMicSeatsVideoOpenInvitation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$videoOpenInviteListener$1$2;
import msd.l;
import ev2.m;
import java.util.Objects;
import iv2.b;
import yx2.d;
import yx2.h;
import lnc.i3;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogRelationshipType;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;
import java.lang.Enum;
import co2.f2;
import yx2.n;
import qrd.l1;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import lf3.f;

public final class AudienceVideoCameraControlViewController$b implements g	// class@0018c1
{
    public final AudienceVideoCameraControlViewController b;

    public void AudienceVideoCameraControlViewController$b(AudienceVideoCameraControlViewController p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       AudienceVideoCameraControlViewController a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVideoCameraControlViewController$b.class, "1")) {
       }else {
          a.p(p0, "message");
          if (this.b.W2(String.valueOf(p0.guestId)) && this.b.X2(String.valueOf(p0.guestId))) {
             b.Z(LiveVoicePartyLogTag.PORTRAIT_VIDEO, "receive open video invite");
             UserInfo userInfo = UserInfo.convertFromProto(p0.inviter);
             m.b(this.b.j);
             String str = "inviter";
             a.o(userInfo, str);
             this.b.j = new VoicePartyOpenVideoInvitationDialogFragment(userInfo, new AudienceVideoCameraControlViewController$videoOpenInviteListener$1$1(this), new AudienceVideoCameraControlViewController$videoOpenInviteListener$1$2(this));
             a = this.b.A;
             m om = new m(userInfo, p0.friendshipType);
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(om, a, b.class, "2")) {
                a.p(om, str);
                d uod = a.e("ANCHOR_INVITE_MIC_AUTOMATION_CARD");
                i3 oi3 = i3.f();
                oi3.d("relationship_type", VoicePartyMicSeatLogger.a(om.b).name());
                oi3.d("invite_type", "VIDEO");
                n.b(a.d(), oi3);
                String str1 = oi3.e();
                a.o(str1, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
                uod.a(str1);
                uod.g();
             }
             AudienceVideoCameraControlViewController j = this.b.j;
             a.m(j);
             j.Cb(this.b.y, "VoicePartyOpenVideoInvitation");
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
