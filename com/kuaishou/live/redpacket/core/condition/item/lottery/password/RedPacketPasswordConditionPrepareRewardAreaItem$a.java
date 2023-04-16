package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ao3.i;
import io3.a;
import eo3.w;

public class RedPacketPasswordConditionPrepareRewardAreaItem$a extends d	// class@000eb9
{
    public final RedPacketPasswordConditionPrepareRewardAreaItem b;

    public void RedPacketPasswordConditionPrepareRewardAreaItem$a(RedPacketPasswordConditionPrepareRewardAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       i oi = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareRewardAreaItem$a.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(this.b.mRedPacketContext);
       }
       return oi;
    }
}
