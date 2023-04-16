package com.kuaishou.live.common.core.component.chat.peers.LiveAudienceAskAndChatPeersTabHostFragment;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment;
import java.util.List;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class LiveAudienceAskAndChatPeersTabHostFragment extends BaseLiveAskAndChatPeersTabHostFragment	// class@00104d
{
    public static final int L;

    public void LiveAudienceAskAndChatPeersTabHostFragment(){
       super();
    }
    public void Qh(List p0,List p1){
    }
    public void Th(int p0){
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceAskAndChatPeersTabHostFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       BaseLiveAskAndChatPeersTabHostFragment tB = this.B;
       if (tB != null) {
          tB.setVisibility(8);
       }
       return;
    }
}
