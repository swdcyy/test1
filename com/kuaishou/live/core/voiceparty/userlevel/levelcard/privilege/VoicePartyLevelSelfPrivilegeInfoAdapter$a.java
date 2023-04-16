package com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelSelfPrivilegeInfoAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelSelfPrivilegeInfoAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelPrivilegeItemViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;

public final class VoicePartyLevelSelfPrivilegeInfoAdapter$a extends ViewControllerAdapter$a	// class@001ab4
{
    public final VoicePartyLevelSelfPrivilegeInfoAdapter f;

    public void VoicePartyLevelSelfPrivilegeInfoAdapter$a(VoicePartyLevelSelfPrivilegeInfoAdapter p0,View p1,LifecycleOwner p2,Activity p3){
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       this.E2(p1, new VoicePartyLevelPrivilegeItemViewController(this.b()));
    }
}
