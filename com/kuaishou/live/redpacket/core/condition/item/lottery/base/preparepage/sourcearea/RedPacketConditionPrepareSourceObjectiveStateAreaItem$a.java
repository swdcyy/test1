package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qn3.c;
import io3.a;
import eo3.w;

public class RedPacketConditionPrepareSourceObjectiveStateAreaItem$a extends d	// class@000e8b
{
    public final RedPacketConditionPrepareSourceObjectiveStateAreaItem b;

    public void RedPacketConditionPrepareSourceObjectiveStateAreaItem$a(RedPacketConditionPrepareSourceObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       c uoc = PatchProxy.apply(null, this, RedPacketConditionPrepareSourceObjectiveStateAreaItem$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this.b.mRedPacketContext);
       }
       return uoc;
    }
}
