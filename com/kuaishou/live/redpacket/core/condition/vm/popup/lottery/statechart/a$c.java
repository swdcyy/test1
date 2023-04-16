package com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$c;
import com.kwai.statechart.a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a;
import java.lang.String;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$State;
import java.lang.Object;
import ut7.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$f;

public class a$c extends a	// class@000ee9
{
    public final RedPacketConditionPopupViewModel$State d;
    public final a e;

    public void a$c(a p0,String p1,RedPacketConditionPopupViewModel$State p2){
       this.e = p0;
       super(p1);
       this.d = p2;
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "1")) {
          return;
       }
       super.e(p0, p1);
       p0 = this.e;
       a b = p0.b;
       a$c td = this.d;
       if (b != td) {
          p0.b = td;
          this.a().a(this.e.b, b);
       }
       return;
    }
}
