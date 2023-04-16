package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyMainStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyMainStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import on3.g;
import io3.a;
import eo3.w;

public class RedPacketConditionPreparePolicyMainStateAreaItem$a extends d	// class@000e7d
{
    public final RedPacketConditionPreparePolicyMainStateAreaItem b;

    public void RedPacketConditionPreparePolicyMainStateAreaItem$a(RedPacketConditionPreparePolicyMainStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       g og = PatchProxy.apply(null, this, RedPacketConditionPreparePolicyMainStateAreaItem$a.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(this.b.mRedPacketContext);
       }
       return og;
    }
}
