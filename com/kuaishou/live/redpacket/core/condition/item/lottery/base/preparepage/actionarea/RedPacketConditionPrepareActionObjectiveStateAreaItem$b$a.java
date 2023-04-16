package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView$a;
import nn3.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a$a;
import nn3.i$b;

public class RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a implements RedPacketConditionPopupPrepareActionAreaView$a	// class@000e79
{
    public final i a;

    public void RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a(i p0){
       this.a = p0;
       super();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a.class, "1")) {
          return;
       }
       this.a.E0(new RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a$a(this));
       return;
    }
    public void onDetachedFromWindow(){
    }
}
