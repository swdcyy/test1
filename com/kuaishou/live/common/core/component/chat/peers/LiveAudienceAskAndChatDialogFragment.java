package com.kuaishou.live.common.core.component.chat.peers.LiveAudienceAskAndChatDialogFragment;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.chat.peers.LiveAudienceAskAndChatPeersTabHostFragment;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment;
import p91.m;

public class LiveAudienceAskAndChatDialogFragment extends BaseLiveAskAndChatDialogFragment	// class@00104c
{
    public static final int F;

    public void LiveAudienceAskAndChatDialogFragment(){
       super();
    }
    public Fragment Eh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       BaseLiveAskAndChatDialogFragment obj = PatchProxy.apply(objArray, this, LiveAudienceAskAndChatDialogFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.A;
       LiveAudienceAskAndChatPeersTabHostFragment liveAudience = PatchProxy.applyOneRefs(obj, objArray, LiveAudienceAskAndChatPeersTabHostFragment.class, "1");
       if (liveAudience != patchProxyRe) {
       }else {
          liveAudience = new LiveAudienceAskAndChatPeersTabHostFragment();
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "key_tab_config", obj);
          liveAudience.setArguments(uBundle);
       }
       liveAudience.Uh(this.B);
       liveAudience.Vh(this.C);
       return liveAudience;
    }
}
