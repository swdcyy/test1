package ft2.h$a;
import lf3.g;
import ft2.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qu2.a;
import kotlin.jvm.internal.a;
import z12.e;
import co2.f2;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import yx2.k;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$CountDownAboardConfig;
import com.kuaishou.live.core.voiceparty.micseats.invitation.AudienceBeingInvitedBottomPanel;
import ft2.j;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog;
import java.lang.Integer;
import ft2.k;
import android.content.DialogInterface$OnShowListener;
import ft2.l;
import android.content.DialogInterface$OnDismissListener;
import ft2.m;
import lf3.f;

public final class h$a implements g	// class@0029ca
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       SCMicSeatsInvitationInfo inviter;
       VoicePartyAudienceInvitationDialog voicePartyAu;
       Object obj = this;
       String[] obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, h$a.class, "1")) {
       }else {
          int i = 0;
          String str = "VoicePartyAudienceMicInvitation";
          if (a.g(obj1.liveStreamId, obj.b.j.getLiveStreamId()) ^ 1) {
             obj1 = new String[i];
             e.c(str, "ignoreMicSeatsInvitationMsg invalid liveStreamId", obj1);
          }else if(a.g(obj1.voicePartyId, obj.b.k.y()) ^ 1){
             obj1 = new String[i];
             e.c(str, "ignoreMicSeatsInvitationMsg invalid voicePartyId", obj1);
          }else {
             h$a b = obj.b;
             if (b.k.l != null) {
                obj1 = new String[i];
                e.c(str, "ignoreMicSeatsInvitationMsg because offline", obj1);
             }else {
                a.o(obj1, "it");
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                h oh = h.class;
                if (!PatchProxy.applyVoidOneRefs(obj1, b, oh, "2")) {
                   String[] stringArray = new String[i];
                   e.c(str, "onReceiveInvitation", stringArray);
                   if (QCurrentUser.me().isLogined() && !b.k.F()) {
                      if (obj1.invitationType == 2 && b.e != null) {
                         b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation onReceiveInvitation has show autoInviteDialog return");
                      }else if(obj1.inviter == null){
                         b.Z(LiveVoicePartyLogTag.OTHER, "onReceiveInvitation invalid inviter");
                      }else {
                         LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
                         Object[] objArray = null;
                         AudienceBeingInvitedBottomPanel obj2 = PatchProxy.apply(objArray, objArray, k.class, "5");
                         if (obj2 != patchProxyRe) {
                            i = obj2.booleanValue();
                         }else if(k.a.a() == 2){
                            i = true;
                         }
                         if (i) {
                            if (!PatchProxy.applyVoidTwoRefs(obj1, liveVoicePar, b, oh, "10")) {
                               h g = b.g;
                               if (g != null && g.isAdded() == true) {
                                  b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceMicInvitation showAudienceBeingInvitedBottomPanel duplicate");
                               }else if(liveVoicePar != null){
                                  objArray = liveVoicePar.mCountDownAboardConfig;
                               }
                               long l = (objArray != null)? (long)liveVoicePar.mCountDownAboardConfig.mCountDownSeconds * 1000: null;
                               obj2 = new AudienceBeingInvitedBottomPanel(obj1.inviterTag, obj1.inviter, l, b.P(obj1.micSeatId), new j(b, obj1));
                               l.Cb(b.i, AudienceBeingInvitedBottomPanel.class.getName());
                               b.g = l;
                               VoicePartyMicSeatLogger.c(b.k, b.j.a(), obj1.friendshipType);
                            }
                         }else if(liveVoicePar != null){
                            objArray = liveVoicePar.mCountDownAboardConfig;
                         }
                         if (!PatchProxy.applyVoidTwoRefs(obj1, objArray, b, oh, "3")) {
                            x.E(b.f);
                            inviter = obj1.inviter;
                            SCMicSeatsInvitationInfo inviterTag = obj1.inviterTag;
                            int i1 = b.P(obj1.micSeatId);
                            if (PatchProxy.isSupport(VoicePartyAudienceInvitationDialog.class)) {
                               voicePartyAu = PatchProxy.applyFourRefs(inviter, objArray, inviterTag, Integer.valueOf(i1), null, VoicePartyAudienceInvitationDialog.class, "1");
                               if (voicePartyAu != patchProxyRe) {
                               label_0177 :
                                  voicePartyAu.ph(new k(b, obj1));
                                  voicePartyAu.k0(new l(b, obj1));
                                  voicePartyAu.u = new m(b, obj1);
                                  voicePartyAu.Cb(b.i, VoicePartyAudienceInvitationDialog.class.getName());
                                  b.f = voicePartyAu;
                               }
                            }
                            voicePartyAu = new VoicePartyAudienceInvitationDialog();
                            voicePartyAu.s = inviter;
                            voicePartyAu.t = objArray;
                            voicePartyAu.w = inviterTag;
                            voicePartyAu.x = i1;
                            goto label_0177 ;
                         }
                         if (obj1.invitationType == 2) {
                            b.e = true;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
