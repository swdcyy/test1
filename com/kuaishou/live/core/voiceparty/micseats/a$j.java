package com.kuaishou.live.core.voiceparty.micseats.a$j;
import co2.r;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;
import z12.f;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$Entrance;
import android.app.Activity;
import qu2.a;
import t02.a0;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$a;

public final class a$j implements r	// class@00156c
{
    public final a b;

    public void a$j(a p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$j.class, "3")) {
          return;
       }
       this.b.p();
       return;
    }
    public void b0(int p0,boolean p1){
       if (PatchProxy.isSupport(a$j.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, a$j.class, "1")) {
          return;
       }
       this.b.p();
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(a$j.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a$j.class, "4")) {
          return;
       }
       this.b.T();
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(a$j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$j.class, "2")) {
          return;
       }
       a.p(p2, "micSeatInfo");
       this.b.p();
       f.a(this.b.i);
       a$j tb = this.b;
       AutoInviteFriendsGuidingPanel.d.a(tb.o, tb.q, tb.r, AutoInviteFriendsGuidingPanel$Entrance.VoiceParty);
       return;
    }
}
