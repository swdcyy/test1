package com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$a;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.LiveConditionRedPacketNormalCurrentInfoDialogFragment$b;
import e62.i;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.e;

public class LiveConditionRedPacketNormalCurrentInfoDialogFragment extends LiveConditionRedPacketBaseCurrentInfoDialogFragment	// class@000a98
{
    public static final int u;

    public void LiveConditionRedPacketNormalCurrentInfoDialogFragment(String p0){
       super(p0);
    }
    public PresenterV2 mh(){
       LiveConditionRedPacketNormalCurrentInfoDialogFragment$a obj = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketNormalCurrentInfoDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveConditionRedPacketNormalCurrentInfoDialogFragment$a(this);
       obj.c = this.j;
       LiveConditionRedPacketNormalCurrentInfoDialogFragment$b uob = new LiveConditionRedPacketNormalCurrentInfoDialogFragment$b(obj);
       uob.U7(new i());
       uob.U7(new e());
       PatchProxy.onMethodExit(LiveConditionRedPacketNormalCurrentInfoDialogFragment.class, "2");
       return uob;
    }
}
