package com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelSelfPrivilegeInfoAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelSelfPrivilegeInfoAdapter$a;
import android.view.View;

public final class VoicePartyLevelSelfPrivilegeInfoAdapter extends ViewControllerAdapter	// class@001ab5
{

    public void VoicePartyLevelSelfPrivilegeInfoAdapter(LifecycleOwner p0,Activity p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       super(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       VoicePartyLevelSelfPrivilegeInfoAdapter$a uoa;
       VoicePartyLevelSelfPrivilegeInfoAdapter voicePartyLe = VoicePartyLevelSelfPrivilegeInfoAdapter.class;
       if (PatchProxy.isSupport(voicePartyLe)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, voicePartyLe, "1");
          if (uoa != PatchProxyResult.class) {
          label_0035 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       uoa = new VoicePartyLevelSelfPrivilegeInfoAdapter$a(this, new FrameLayout(p0.getContext()), this.N0(), this.K0());
       goto label_0035 ;
    }
}
