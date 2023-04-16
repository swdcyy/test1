package com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zn3.b;
import io3.a;
import eo3.w;

public class RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a extends d	// class@000eac
{
    public final RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem b;

    public void RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a(RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       b uob = PatchProxy.apply(null, this, RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.b.mRedPacketContext);
       }
       return uob;
    }
}
