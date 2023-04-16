package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardWithCountAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardWithCountAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bo3.h;
import io3.a;
import eo3.w;

public class RedPacketConditionPrepareRewardWithCountAreaItem$a extends d	// class@000e86
{
    public final RedPacketConditionPrepareRewardWithCountAreaItem b;

    public void RedPacketConditionPrepareRewardWithCountAreaItem$a(RedPacketConditionPrepareRewardWithCountAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       h oh = PatchProxy.apply(null, this, RedPacketConditionPrepareRewardWithCountAreaItem$a.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(this.b.mRedPacketContext);
       }
       return oh;
    }
}
