package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import rg2.n;
import android.view.View$OnTouchListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import uw1.n;

public class LiveRedPacketContainerPagerAdapter$1 implements LifecycleEventObserver	// class@000e67
{
    public final LiveRedPacketContainerItemBaseFragment b;
    public final int c;
    public final LiveRedPacketContainerPagerAdapter d;

    public void LiveRedPacketContainerPagerAdapter$1(LiveRedPacketContainerPagerAdapter p0,LiveRedPacketContainerItemBaseFragment p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketContainerPagerAdapter$1.class, "1")) {
          return;
       }
       if (p1 == Lifecycle$Event.ON_START) {
          if (this.d.l != null) {
             this.b.getView().setOnTouchListener(new n(this, this.c));
          }
       }else if(p1 == Lifecycle$Event.ON_DESTROY){
          this.b.getLifecycle().removeObserver(this);
          this.b.setDispatchDrawFinishedListener(null);
       }
       return;
    }
}
