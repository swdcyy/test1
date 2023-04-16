package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tn3.b;
import io3.a;
import eo3.w;

public class RedPacketConditionResultSourceObjectiveStateAreaItem$a extends d	// class@000e9b
{
    public final RedPacketConditionResultSourceObjectiveStateAreaItem b;

    public void RedPacketConditionResultSourceObjectiveStateAreaItem$a(RedPacketConditionResultSourceObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       b uob = PatchProxy.apply(null, this, RedPacketConditionResultSourceObjectiveStateAreaItem$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.b.mRedPacketContext);
       }
       return uob;
    }
}
