package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.RedPacketConditionPreparePageItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.RedPacketConditionPreparePageItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn3.a;
import io3.a;
import eo3.w;

public class RedPacketConditionPreparePageItem$a extends d	// class@000e73
{
    public final RedPacketConditionPreparePageItem b;

    public void RedPacketConditionPreparePageItem$a(RedPacketConditionPreparePageItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       a uoa = PatchProxy.apply(null, this, RedPacketConditionPreparePageItem$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.b.mRedPacketContext);
       }
       return uoa;
    }
}
