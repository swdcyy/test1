package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusObjectiveStateAreaView$a;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem;
import un3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$c$a;
import un3.b$b;

public class RedPacketConditionResultStatusObjectiveStateAreaItem$c implements RedPacketConditionPopupResultStatusObjectiveStateAreaView$a	// class@000ea2
{
    public final b a;
    public final RedPacketConditionResultStatusObjectiveStateAreaItem b;

    public void RedPacketConditionResultStatusObjectiveStateAreaItem$c(RedPacketConditionResultStatusObjectiveStateAreaItem p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionResultStatusObjectiveStateAreaItem$c.class, "1")) {
          return;
       }
       this.a.A0(new RedPacketConditionResultStatusObjectiveStateAreaItem$c$a(this));
       return;
    }
    public void onDetachedFromWindow(){
    }
}
