package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import nn3.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPrepareActionObjectiveStateAreaItem extends a	// class@000e7b
{

    public void RedPacketConditionPrepareActionObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareActionAreaView p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPrepareActionObjectiveStateAreaItem.class, "3")) {
          return;
       }
       RedPacketConditionPrepareActionObjectiveStateAreaItem$b.a(this.mRedPacketContext.k(), p0, p1);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public i createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareActionObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPrepareActionObjectiveStateAreaItem$a(this, i.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPrepareActionAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareActionObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareActionAreaView(this.mRedPacketContext.b());
    }
}
