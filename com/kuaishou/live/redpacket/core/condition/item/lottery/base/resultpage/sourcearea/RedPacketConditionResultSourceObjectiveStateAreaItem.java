package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultSourceAreaView;
import tn3.b;
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
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.sourcearea.RedPacketConditionResultSourceObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionResultSourceObjectiveStateAreaItem extends a	// class@000e9c
{

    public void RedPacketConditionResultSourceObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupResultSourceAreaView p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionResultSourceObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       u.a(p0, subLifecycle, p1.D0());
       g.a(p0.getRewardDescView(), subLifecycle, p1.C0());
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public b createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultSourceObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionResultSourceObjectiveStateAreaItem$a(this, b.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupResultSourceAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultSourceObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupResultSourceAreaView(this.mRedPacketContext.b());
    }
}
