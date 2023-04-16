package com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import hka.a;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatPeersTabHostFragment;

public class BaseLiveAskAndChatDialogFragment$a implements LiveDialogContainerFragment$b	// class@001047
{
    public final BaseLiveAskAndChatDialogFragment a;

    public void BaseLiveAskAndChatDialogFragment$a(BaseLiveAskAndChatDialogFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAskAndChatDialogFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.t() instanceof a) {
          return false;
       }
       this.a.t().onBackPressed();
       return true;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAskAndChatDialogFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.a.t() instanceof BaseLiveAskAndChatPeersTabHostFragment ^ 0x01);
    }
}
