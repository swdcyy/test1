package com.kwai.video.wayne.player.main.WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.WaynePlayer$mPlayerInstanceHandler$1;
import com.kwai.video.wayne.player.InstancePriority;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;
import com.kwai.video.wayne.player.main.WaynePlayer;

public final class WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1 implements Runnable	// class@000da0
{
    public final InstancePriority $new;
    public final InstancePriority $old;
    public final WaynePlayer$mPlayerInstanceHandler$1 this$0;

    public void WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1(WaynePlayer$mPlayerInstanceHandler$1 p0,InstancePriority p1,InstancePriority p2){
       this.this$0 = p0;
       this.$old = p1;
       this.$new = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1.class, "1")) {
          return;
       }
       InnerPlayerLifeCycleListener mInnerPlayer = this.this$0.this$0.getMInnerPlayerLifeCycleListener();
       if (mInnerPlayer != null) {
          mInnerPlayer.onPlayerPriorityChanged(this.$old, this.$new);
       }
       return;
    }
}
