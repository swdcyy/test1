package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupSourceAreaView;
import qn3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import qn3.d;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupSourceAreaView;
import androidx.lifecycle.LifecycleOwner;
import go3.u;
import android.widget.TextView;
import xh3.g;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketRewardSourceView;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem$c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.sourcearea.RedPacketConditionPrepareSourceObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPrepareSourceObjectiveStateAreaItem extends a	// class@000e8e
{

    public void RedPacketConditionPrepareSourceObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupSourceAreaView p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPrepareSourceObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       u.a(p0, subLifecycle, p1.D0());
       g.a(p0.getRewardDescView(), subLifecycle, p1.C0());
       p0.getCommonRedPacketRewardSourceView().setOnFollowButtonClickListener(new RedPacketConditionPrepareSourceObjectiveStateAreaItem$b(this, p1));
       p0.getCommonRedPacketRewardSourceView().setOnAvatarClickListener(new RedPacketConditionPrepareSourceObjectiveStateAreaItem$c(this, p1));
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public c createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareSourceObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPrepareSourceObjectiveStateAreaItem$a(this, c.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupSourceAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareSourceObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupSourceAreaView(this.mRedPacketContext.b());
    }
}
