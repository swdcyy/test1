package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import ao3.c;
import android.view.View;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import java.lang.String;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.b;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.a;
import java.lang.Object;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$b;
import ao3.c$b;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareActionAreaView;
import an3.a;
import android.view.View$OnClickListener;
import androidx.lifecycle.LiveData;
import nn3.c;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import xh3.g;
import go3.t;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem extends a	// class@000eb4
{

    public void RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public static void a(RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem p0,c p1,View p2){
       p0.lambda$bind$1(p1, p2);
    }
    public static String lambda$bind$0(LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo p0){
       return p0.mRedPacketPassword;
    }
    private void lambda$bind$1(c p0,View p1){
       p0.D0(new RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$b(this, k0.b(this.mRedPacketContext.c(), b.a, a.a).or("")));
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareActionAreaView p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       TextView actionView = p0.getActionView();
       actionView.setOnClickListener(new a(this, p1));
       l.d(actionView, subLifecycle, p1.A0(), true);
       g.a(actionView, subLifecycle, p1.m);
       t.a(p0, subLifecycle, p1.n);
       p0.setVisibilityListener(new RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$c(this, p1));
       return;
    }
    public c createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem$a(this, c.class));
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPrepareActionAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareActionObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareActionAreaView(this.mRedPacketContext.b());
    }
}
