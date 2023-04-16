package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ao3.c;
import io3.a;
import eo3.w;

public class RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a extends d	// class@000eb0
{
    public final RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem b;

    public void RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a(RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       c uoc = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this.b.mRedPacketContext);
       }
       return uoc;
    }
}
