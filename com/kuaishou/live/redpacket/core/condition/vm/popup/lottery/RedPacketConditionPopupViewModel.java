package com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import zh3.c;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$b;
import ln3.a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.a$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import eo3.s;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$InitCountDowningEvent;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.statechart.RedPacketPopEvent$InitCountDownFinishEvent;
import eo3.i;
import eo3.n;
import java.lang.Long;
import crd.b;
import java.lang.StringBuilder;
import t45.d;
import ln3.b;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import brd.z;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$e;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$e$b;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$c;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$e$a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$d;
import com.kuaishou.live.redpacket.core.condition.vm.popup.lottery.RedPacketConditionPopupViewModel$State;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import eo3.a;
import om3.d;
import om3.a;
import eo3.b0;

public class RedPacketConditionPopupViewModel extends RedPacketBaseViewModel	// class@000ee0
{
    public final long k;
    public final c l;
    public final MutableLiveData m;
    public final n n;
    public final a$f o;
    public final a p;
    public b q;

    public void RedPacketConditionPopupViewModel(w p0){
       boolean b;
       super(p0);
       this.k = 1000;
       this.l = new c();
       this.m = new RedPacketConditionPopupViewModel$a(this);
       RedPacketConditionPopupViewModel$b uob = new RedPacketConditionPopupViewModel$b(this);
       this.n = uob;
       a uoa = new a(this);
       this.o = uoa;
       a uoa1 = new a(p0, uoa);
       this.p = uoa1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RedPacketConditionPopupViewModel.class, "2")) {
       }else {
          Object obj = PatchProxy.apply(objArray, this, RedPacketBaseViewModel.class, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if((this.j.a() - this.d.i()) < 0){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             uoa1.a(new RedPacketPopEvent$InitCountDowningEvent());
          }else {
             uoa1.a(new RedPacketPopEvent$InitCountDownFinishEvent());
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, RedPacketConditionPopupViewModel.class, "1")) {
          this.d.d().f(uob);
       }
       return;
    }
    public void A0(long p0){
       RedPacketConditionPopupViewModel redPacketCon = RedPacketConditionPopupViewModel.class;
       if (PatchProxy.isSupport(redPacketCon) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, redPacketCon, "8")) {
          return;
       }
       redPacketCon = this.q;
       if (redPacketCon != null) {
          redPacketCon.dispose();
       }
       this.y0("PopupViewModel", "handleDelaySwitchResultPageEvent delayTimeMS = "+p0);
       this.q = d.a.e(new b(this, p0), p0, TimeUnit.MILLISECONDS);
       return;
    }
    public void C0(RedPacketConditionPopupViewModel$e p0){
       RedPacketConditionPopupViewModel redPacketCon = RedPacketConditionPopupViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, redPacketCon, "5")) {
          return;
       }
       if (p0 instanceof RedPacketConditionPopupViewModel$e$b) {
          RedPacketConditionPopupViewModel$e$b a = p0.a;
          if (!PatchProxy.applyVoidOneRefs(a, this, redPacketCon, "7") && a instanceof RedPacketConditionPopupViewModel$c) {
             this.l.q(a);
          }
       }
       if (p0 instanceof RedPacketConditionPopupViewModel$e$a) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, redPacketCon, "6")) {
             RedPacketConditionPopupViewModel$d value = this.m.getValue();
             if (value == null || (value.a == RedPacketConditionPopupViewModel$State.PRE_STATE && !PatchProxy.applyVoid(objArray, this, redPacketCon, "3"))) {
                RedPacketConditionRedPackInfoWrapper redPacketCon1 = this.d.c();
                if (redPacketCon1 != null) {
                   b0 uob0 = this.d.h();
                   int i = uob0.b();
                   redPacketCon1.n(this.d.f().e().a().getLiveStreamId(), i, uob0.a());
                }
             }
          }
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionPopupViewModel.class, "4")) {
          return;
       }
       super.onCleared();
       this.d.d().d(this.n);
       RedPacketConditionPopupViewModel tq = this.q;
       if (tq != null) {
          tq.dispose();
       }
       return;
    }
}
