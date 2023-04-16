package cs2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel$a;
import t02.a0;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;

public final class c implements View$OnClickListener	// class@0023d4
{
    public final GuestInvitationPanel b;

    public void c(GuestInvitationPanel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.b.s+" switchMicSeatButton clicked");
       d0.c(this.b);
       this.b.x.a();
       a0 z2 = this.b.u.Z2;
       a.o(z2, "playCallerContext.mLiveBasicContext");
       a0 z21 = this.b.u.Z2;
       a.o(z21, "playCallerContext.mLiveBasicContext");
       a0 z22 = this.b.u.Z2;
       a.o(z22, "playCallerContext.mLiveBasicContext");
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = z22.y();
       c.a(z2.b(), z21.a(), liveVoicePar, "CHANGE_SEAT");
       return;
    }
}
