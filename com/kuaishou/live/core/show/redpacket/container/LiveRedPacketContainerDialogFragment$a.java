package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveRedPacketContainerDialogFragment$a extends AnimatorListenerAdapter	// class@000e61
{
    public final LiveRedPacketContainerDialogFragment a;

    public void LiveRedPacketContainerDialogFragment$a(LiveRedPacketContainerDialogFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketContainerDialogFragment$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.Ah();
       return;
    }
}
