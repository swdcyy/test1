package com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollSourceAreaItem$a;
import nm3.d;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollSourceAreaItem;
import java.lang.Class;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xn3.a;
import io3.a;
import eo3.w;

public class RedPacketConditionScrollSourceAreaItem$a extends d	// class@000ea8
{
    public final RedPacketConditionScrollSourceAreaItem b;

    public void RedPacketConditionScrollSourceAreaItem$a(RedPacketConditionScrollSourceAreaItem p0,Class p1){
       this.b = p0;
       super(p1);
    }
    public RedPacketBaseViewModel a(){
       a uoa = PatchProxy.apply(null, this, RedPacketConditionScrollSourceAreaItem$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.b.mRedPacketContext);
       }
       return uoa;
    }
}
