package com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import zn3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import nn3.i;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.fansgroup.RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem extends a	// class@000ead
{

    public void RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareActionAreaView p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem.class, "3")) {
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
    public b createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem$a(this, b.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPrepareActionAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketFansGroupConditionPrepareActionObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareActionAreaView(this.mRedPacketContext.b());
    }
}
