package ft2.j;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import ft2.h;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import z12.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogButtonType;
import co2.f2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;

public final class j implements VoicePartyAudienceInvitationDialog$b	// class@0029d1
{
    public final h a;
    public final SCMicSeatsInvitationInfo b;

    public void j(h p0,SCMicSeatsInvitationInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showAudienceBeingInvitedBottomPanel onCountDownEnd");
       f.a(this.a.g);
       this.a.g = null;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showAudienceBeingInvitedBottomPanel onAccept");
       this.a.R(this.b);
       j ta = this.a;
       VoicePartyMicSeatLogger.b(ta.k, ta.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.ACCEPT, this.b.friendshipType);
       f.a(this.a.g);
       this.a.g = null;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showAudienceBeingInvitedBottomPanel onReject");
       this.a.S(this.b);
       this.a.T();
       j ta = this.a;
       VoicePartyMicSeatLogger.b(ta.k, ta.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.CONSIDER, this.b.friendshipType);
       f.a(this.a.g);
       this.a.g = null;
       return;
    }
    public void onDismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showAudienceBeingInvitedBottomPanel onDismiss");
       j ta = this.a;
       ta.g = objArray;
       VoicePartyMicSeatLogger.b(ta.k, ta.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.CLOSE, this.b.friendshipType);
       return;
    }
}
