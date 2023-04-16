package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pn3.e;
import io3.a;
import eo3.w;

public class RedPacketConditionPrepareRewardAreaItem$a extends d	// class@000e84
{
    public final RedPacketConditionPrepareRewardAreaItem b;

    public void RedPacketConditionPrepareRewardAreaItem$a(RedPacketConditionPrepareRewardAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       e uoe = PatchProxy.apply(null, this, RedPacketConditionPrepareRewardAreaItem$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.b.mRedPacketContext);
       }
       return uoe;
    }
}
