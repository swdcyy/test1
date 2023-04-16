package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import un3.b;
import io3.a;
import eo3.w;

public class RedPacketConditionResultStatusObjectiveStateAreaItem$a extends d	// class@000e9f
{
    public final RedPacketConditionResultStatusObjectiveStateAreaItem b;

    public void RedPacketConditionResultStatusObjectiveStateAreaItem$a(RedPacketConditionResultStatusObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       b uob = PatchProxy.apply(null, this, RedPacketConditionResultStatusObjectiveStateAreaItem$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.b.mRedPacketContext);
       }
       return uob;
    }
}
