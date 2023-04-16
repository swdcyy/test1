package com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController;
import ds2.c;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.fragment.app.c;
import qu2.a;
import t02.a0;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import co2.f2;
import com.kuaishou.live.core.voiceparty.b;
import bb1.o;
import x61.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController$onCreate$viewModel$2;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import es2.c;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import es2.b;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import ds2.d;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import es2.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController$a;
import yx2.a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$b;

public final class VoicePartyAudienceInviteButtonViewController extends ViewController implements c	// class@00151b
{
    public final c j;
    public final a k;
    public final a0 l;
    public final AudienceVoicePartyManager m;
    public final f2 n;
    public final b o;
    public final o p;
    public final c q;

    public void VoicePartyAudienceInviteButtonViewController(c p0,a p1,a0 p2,AudienceVoicePartyManager p3,f2 p4,b p5,o p6,c p7){
       a.p(p0, "fragmentManager");
       a.p(p1, "liveBaseContext");
       a.p(p2, "livePlayCallerContext");
       a.p(p3, "voicePartyManager");
       a.p(p4, "voicePartyContext");
       a.p(p5, "micSeatDispatcher");
       a.p(p6, "adminService");
       a.p(p7, "bottomBarService");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.p = p6;
       this.q = p7;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceInviteButtonViewController.class, str)) {
          return;
       }
       b uob = new b(this, this, this.q);
       c value = new ViewModelLazy(m0.d(c.class), new VoicePartyAudienceInviteButtonViewController$onCreate$$inlined$viewModels$2(new VoicePartyAudienceInviteButtonViewController$onCreate$$inlined$viewModels$1(this)), new VoicePartyAudienceInviteButtonViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, uob, b.class, str)) {
          a.p(value, "viewModel");
          uob.a(value);
          value.k.observe(uob.e, new a(uob));
       }
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceInviteButtonViewController.class, "2")) {
          return;
       }
       LiveVoicePartyInvitationPanelFragment liveVoicePar = new LiveVoicePartyInvitationPanelFragment(this.n, this.k, this.l, null, VoicePartyMicSeatData.EMPTY, new VoicePartyAudienceInviteButtonViewController$a(this), 12, a.a(this.n.h()));
       v0.Bh(this.j);
       return;
    }
}
