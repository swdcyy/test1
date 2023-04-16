package com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment$a;
import gka.h;
import com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Boolean;

public final class InvitationFragment$a extends h	// class@001558
{
    public final InvitationFragment a;

    public void InvitationFragment$a(InvitationFragment p0){
       this.a = p0;
       super();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, InvitationFragment$a.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.F+" hideEmpty");
       InvitationFragment.Hh(this.a).setVisibility(8);
       InvitationFragment.Ih(this.a).setVisibility(8);
       RecyclerView recyclerView = this.a.h0();
       a.o(recyclerView, "recyclerView");
       recyclerView.setVisibility(0);
       this.a.Jh(0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, InvitationFragment$a.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.F+" showEmpty");
       InvitationFragment.Hh(this.a).setVisibility(0);
       InvitationFragment.Ih(this.a).setVisibility(8);
       RecyclerView recyclerView = this.a.h0();
       a.o(recyclerView, "recyclerView");
       recyclerView.setVisibility(8);
       this.a.Jh(true);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, InvitationFragment$a.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.F+" hideError");
       InvitationFragment.Hh(this.a).setVisibility(8);
       InvitationFragment.Ih(this.a).setVisibility(8);
       RecyclerView recyclerView = this.a.h0();
       a.o(recyclerView, "recyclerView");
       recyclerView.setVisibility(0);
       return;
    }
    public void k(boolean p0,Throwable p1){
       InvitationFragment$a uoa = InvitationFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.F+" showError");
       InvitationFragment.Hh(this.a).setVisibility(8);
       InvitationFragment.Ih(this.a).setVisibility(0);
       RecyclerView recyclerView = this.a.h0();
       a.o(recyclerView, "recyclerView");
       recyclerView.setVisibility(8);
       return;
    }
}
