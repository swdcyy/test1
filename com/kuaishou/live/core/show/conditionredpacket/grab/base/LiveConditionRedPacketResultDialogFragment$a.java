package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment$a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;

public class LiveConditionRedPacketResultDialogFragment$a	// class@000a7c
{
    public final LiveConditionRedPacketResultDialogFragment a;

    public void LiveConditionRedPacketResultDialogFragment$a(LiveConditionRedPacketResultDialogFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketResultDialogFragment$a.class, "3")) {
          return;
       }
       if (this.a.isAdded()) {
          this.a.dismissAllowingStateLoss();
       }
       return;
    }
    public LifecycleOwner b(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketResultDialogFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getViewLifecycleOwner();
    }
}
