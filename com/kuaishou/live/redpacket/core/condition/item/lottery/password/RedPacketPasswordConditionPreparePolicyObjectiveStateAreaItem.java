package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePolicyAreaView;
import ao3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePolicyAreaView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.g;
import on3.c;
import go3.s;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem extends a	// class@000eb8
{

    public void RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPreparePolicyAreaView p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       g.a(p0.getFirstLineTextView(), subLifecycle, p1.n);
       g.a(p0.getSecondLineTextView(), subLifecycle, p1.m);
       s.a(p0, subLifecycle, p1.A0());
       p0.getRefreshView().setOnClickListener(new RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem$b(this, p1));
       return;
    }
    public g createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem$a(this, g.class));
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
    public RedPacketConditionPopupPreparePolicyAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPreparePolicyObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPreparePolicyAreaView(this.mRedPacketContext.b());
    }
}
