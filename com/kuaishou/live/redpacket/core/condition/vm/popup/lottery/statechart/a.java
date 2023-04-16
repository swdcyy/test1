package com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a;
import eo3.w;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$b;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$e;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$d;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$State;
import com.kwai.statechart.StateChart$b;
import co3.g;
import com.kwai.statechart.a;
import msd.a;
import java.lang.StringBuilder;
import eo3.b0;
import co3.h;
import eo3.a;
import nm3.b;
import ut7.g;
import co3.f;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$InitCountDowningEvent;
import co3.a;
import ut7.o;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$InitCountDownFinishEvent;
import co3.b;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$CountDownFinishEvent;
import co3.c;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$HasResultEvent;
import co3.d;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$HasResultDelayEvent;
import co3.e;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent;
import ut7.e;

public class a	// class@000eed
{
    public StateChart a;
    public RedPacketConditionPopupViewModel$State b;

    public void a(w p0,a$f p1){
       super();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
       }else {
          a$a uoa = new a$a(this);
          a$b uob = new a$b(this);
          a$e uoe = new a$e(this);
          a$d uod = new a$d(this);
          this.b = RedPacketConditionPopupViewModel$State.DEFAULT_STATE;
          Object obj = new Object();
          a$a uoa1 = uoa;
          a$e uoe1 = uoe;
          StateChart$b uob1 = new StateChart$b().e(uoa, new g(obj)).c(p0.h().a()+"_"+p0.h().b()).d(new h(p0.f().b(), p0.h())).b(new f(p1)).f(uoa).f(uob).f(uoe).f(uod).h("defaultState -> preState", uoa1, uob, RedPacketPopEvent$InitCountDowningEvent.class, new a(obj)).h("defaultState -> scrollState", uoa1, uoe1, RedPacketPopEvent$InitCountDownFinishEvent.class, new b(obj));
          uob1 = uob1.h("preState -> scrollState", uob, uoe1, RedPacketPopEvent$CountDownFinishEvent.class, new c(obj));
          a$e uoe2 = uoe;
          a$d uod1 = uod;
          StateChart stateChart = uob1.h("scrollState -> resultState", uoe2, uod1, RedPacketPopEvent$HasResultEvent.class, new d(obj)).h("scrollState -> resultState", uoe2, uod1, RedPacketPopEvent$HasResultDelayEvent.class, new e(obj)).a();
          this.a = stateChart;
          stateChart.s();
       }
       return;
    }
    public void a(RedPacketPopEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.l(p0);
       return;
    }
}
