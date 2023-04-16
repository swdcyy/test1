package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusObjectiveStateAreaView;
import un3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import android.widget.LinearLayout;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultStatusObjectiveStateAreaView;
import android.widget.TextView;
import xh3.g;
import com.yxcorp.gifshow.image.KwaiImageView;
import go3.e;
import kotlin.jvm.internal.a;
import go3.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardCommonView;
import go3.b;
import go3.a;
import zm3.a;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultStatusObjectiveStateAreaView$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.statusarea.RedPacketConditionResultStatusObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionResultStatusObjectiveStateAreaItem extends a	// class@000ea3
{

    public void RedPacketConditionResultStatusObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupResultStatusObjectiveStateAreaView p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionResultStatusObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       l.d(p0, subLifecycle, p1.v0(), true);
       l.d(p0.getSendGiftRootView(), subLifecycle, p1.m, true);
       l.d(p0.getStatusTextView(), subLifecycle, p1.k, true);
       g.a(p0.getStatusTextView(), subLifecycle, p1.l);
       g.a(p0.getTopLineTipsView(), subLifecycle, p1.p);
       g.a(p0.getBottomLineTipsView(), subLifecycle, p1.q);
       KwaiImageView iconView = p0.getIconView();
       b o = p1.o;
       if (!PatchProxy.applyVoidThreeRefs(iconView, subLifecycle, o, null, e.class, "4")) {
          a.p(iconView, "$this$bindGiftIcon");
          a.p(subLifecycle, "lifecycleOwner");
          a.p(o, "giftId");
          o.observe(subLifecycle, new f(iconView));
       }
       CommonRedPacketCoverRewardCommonView rewardCommon = p0.getRewardCommonView();
       o = p1.r;
       if (!PatchProxy.applyVoidThreeRefs(rewardCommon, subLifecycle, o, null, b.class, "1")) {
          a.p(rewardCommon, "$this$bind");
          a.p(subLifecycle, "livecycleOwner");
          a.p(o, "rewardSourceInfo");
          o.observe(subLifecycle, new a(rewardCommon));
       }
       p1.n.observe(subLifecycle, new a(p0));
       p0.getSendGiftRootView().setOnClickListener(new RedPacketConditionResultStatusObjectiveStateAreaItem$b(this, p1));
       p0.setVisibilityListener(new RedPacketConditionResultStatusObjectiveStateAreaItem$c(this, p1));
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public b createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultStatusObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionResultStatusObjectiveStateAreaItem$a(this, b.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupResultStatusObjectiveStateAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultStatusObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupResultStatusObjectiveStateAreaView(this.mRedPacketContext.b());
    }
}
