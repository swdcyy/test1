package com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollScrollAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollScrollAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wn3.c;
import io3.a;
import eo3.w;

public class RedPacketConditionScrollScrollAreaItem$a extends d	// class@000ea6
{
    public final RedPacketConditionScrollScrollAreaItem b;

    public void RedPacketConditionScrollScrollAreaItem$a(RedPacketConditionScrollScrollAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       c uoc = PatchProxy.apply(null, this, RedPacketConditionScrollScrollAreaItem$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this.b.mRedPacketContext);
       }
       return uoc;
    }
}
