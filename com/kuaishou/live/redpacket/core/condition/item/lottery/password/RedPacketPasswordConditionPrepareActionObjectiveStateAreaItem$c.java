package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView$a;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem;
import ao3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c$a;
import ao3.c$b;

public class RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c implements RedPacketConditionPopupPrepareActionAreaView$a	// class@000eb3
{
    public final c a;
    public final RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem b;

    public void RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c(RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c.class, "1")) {
          return;
       }
       this.a.D0(new RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c$a(this));
       return;
    }
    public void onDetachedFromWindow(){
    }
}
