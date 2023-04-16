package com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewBottomAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewBottomAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kn3.d;
import io3.a;
import eo3.w;

public class RedPacketConditionPendantViewBottomAreaItem$a extends d	// class@000ec6
{
    public final RedPacketConditionPendantViewBottomAreaItem b;

    public void RedPacketConditionPendantViewBottomAreaItem$a(RedPacketConditionPendantViewBottomAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       d uod = PatchProxy.apply(null, this, RedPacketConditionPendantViewBottomAreaItem$a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this.b.mRedPacketContext);
       }
       return uod;
    }
}
