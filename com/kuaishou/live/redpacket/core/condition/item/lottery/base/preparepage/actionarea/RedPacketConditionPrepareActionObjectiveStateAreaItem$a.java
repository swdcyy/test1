package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nn3.i;
import io3.a;
import eo3.w;

public class RedPacketConditionPrepareActionObjectiveStateAreaItem$a extends d	// class@000e77
{
    public final RedPacketConditionPrepareActionObjectiveStateAreaItem b;

    public void RedPacketConditionPrepareActionObjectiveStateAreaItem$a(RedPacketConditionPrepareActionObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       i oi = PatchProxy.apply(null, this, RedPacketConditionPrepareActionObjectiveStateAreaItem$a.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(this.b.mRedPacketContext);
       }
       return oi;
    }
}
