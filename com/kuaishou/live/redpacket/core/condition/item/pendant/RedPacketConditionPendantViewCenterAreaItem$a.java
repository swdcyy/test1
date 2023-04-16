package com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewCenterAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewCenterAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kn3.f;
import io3.a;
import eo3.w;

public class RedPacketConditionPendantViewCenterAreaItem$a extends d	// class@000ec8
{
    public final RedPacketConditionPendantViewCenterAreaItem b;

    public void RedPacketConditionPendantViewCenterAreaItem$a(RedPacketConditionPendantViewCenterAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       f uof = PatchProxy.apply(null, this, RedPacketConditionPendantViewCenterAreaItem$a.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(this.b.mRedPacketContext);
       }
       return uof;
    }
}
