package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionMainStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionMainStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nn3.e;
import io3.a;
import eo3.w;

public class RedPacketConditionPrepareActionMainStateAreaItem$a extends d	// class@000e75
{
    public final RedPacketConditionPrepareActionMainStateAreaItem b;

    public void RedPacketConditionPrepareActionMainStateAreaItem$a(RedPacketConditionPrepareActionMainStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       e uoe = PatchProxy.apply(null, this, RedPacketConditionPrepareActionMainStateAreaItem$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.b.mRedPacketContext);
       }
       return uoe;
    }
}
