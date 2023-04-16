package com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zn3.d;
import io3.a;
import eo3.w;

public class RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a extends d	// class@000eae
{
    public final RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem b;

    public void RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a(RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       d uod = PatchProxy.apply(null, this, RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this.b.mRedPacketContext);
       }
       return uod;
    }
}
