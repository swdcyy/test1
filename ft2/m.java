package ft2.m;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import ft2.h;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx2.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogButtonType;
import co2.f2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import ft2.g;

public final class m implements VoicePartyAudienceInvitationDialog$b	// class@0029d4
{
    public final h a;
    public final SCMicSeatsInvitationInfo b;

    public void m(h p0,SCMicSeatsInvitationInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, m.class, "3")) {
          return;
       }
       m obj = PatchProxy.apply(objArray, objArray, k.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!k.a.a()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showInvitationDialog onCountDownEnd accept");
          this.a.R(this.b);
          obj = this.a;
          VoicePartyMicSeatLogger.b(obj.k, obj.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.ACCEPT, this.b.friendshipType);
       }
       x.E(this.a.f);
       PatchProxy.onMethodExit(m.class, "3");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, m.class, "1")) {
          return;
       }
       this.a.R(this.b);
       m ta = this.a;
       VoicePartyMicSeatLogger.b(ta.k, ta.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.ACCEPT, this.b.friendshipType);
       x.E(this.a.f);
       PatchProxy.onMethodExit(m.class, "1");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoidWithListener(null, this, m.class, "2")) {
          return;
       }
       this.a.S(this.b);
       this.a.T();
       m ta = this.a;
       VoicePartyMicSeatLogger.b(ta.k, ta.j.a(), this.a.j.y(), VoicePartyMicSeatLogger$InvitationDialogButtonType.CONSIDER, this.b.friendshipType);
       x.E(this.a.f);
       PatchProxy.onMethodExit(m.class, "2");
       return;
    }
    public void onDismiss(){
       g.a(this);
    }
}
