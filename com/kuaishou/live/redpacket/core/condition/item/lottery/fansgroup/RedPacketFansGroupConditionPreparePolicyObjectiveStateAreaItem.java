package com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePolicyAreaView;
import zn3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import on3.k;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyObjectiveStateAreaItem$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem extends a	// class@000eaf
{

    public void RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPreparePolicyAreaView p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem.class, "3")) {
          return;
       }
       RedPacketConditionPreparePolicyObjectiveStateAreaItem$b.a(this.mRedPacketContext.k(), p0, p1);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public d createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem$a(this, d.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPreparePolicyAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketFansGroupConditionPreparePolicyObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPreparePolicyAreaView(this.mRedPacketContext.b());
    }
}
