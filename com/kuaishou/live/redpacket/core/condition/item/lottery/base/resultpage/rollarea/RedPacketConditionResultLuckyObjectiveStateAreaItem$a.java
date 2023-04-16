package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.rollarea.RedPacketConditionResultLuckyObjectiveStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.rollarea.RedPacketConditionResultLuckyObjectiveStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sn3.b;
import io3.a;
import eo3.w;

public class RedPacketConditionResultLuckyObjectiveStateAreaItem$a extends d	// class@000e95
{
    public final RedPacketConditionResultLuckyObjectiveStateAreaItem b;

    public void RedPacketConditionResultLuckyObjectiveStateAreaItem$a(RedPacketConditionResultLuckyObjectiveStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       b uob = PatchProxy.apply(null, this, RedPacketConditionResultLuckyObjectiveStateAreaItem$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.b.mRedPacketContext);
       }
       return uob;
    }
}
