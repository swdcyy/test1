package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import on3.k;
import io3.a;
import eo3.w;

public class RedPacketConditionPreparePolicyObjectiveStateAreaItem$a extends d	// class@000e7f
{
    public final RedPacketConditionPreparePolicyObjectiveStateAreaItem b;

    public void RedPacketConditionPreparePolicyObjectiveStateAreaItem$a(RedPacketConditionPreparePolicyObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       k ok = PatchProxy.apply(null, this, RedPacketConditionPreparePolicyObjectiveStateAreaItem$a.class, "1");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(this.b.mRedPacketContext);
       }
       return ok;
    }
}
