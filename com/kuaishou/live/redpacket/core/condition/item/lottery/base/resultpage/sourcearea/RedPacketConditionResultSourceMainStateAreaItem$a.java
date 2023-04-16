package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceMainStateAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceMainStateAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tn3.a;
import io3.a;
import eo3.w;

public class RedPacketConditionResultSourceMainStateAreaItem$a extends d	// class@000e99
{
    public final RedPacketConditionResultSourceMainStateAreaItem b;

    public void RedPacketConditionResultSourceMainStateAreaItem$a(RedPacketConditionResultSourceMainStateAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       a uoa = PatchProxy.apply(null, this, RedPacketConditionResultSourceMainStateAreaItem$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.b.mRedPacketContext);
       }
       return uoa;
    }
}
