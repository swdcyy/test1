package com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPrepareActionObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import bo3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import nn3.i;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPrepareActionObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketShareConditionPrepareActionObjectiveStateAreaItem extends a	// class@000ebe
{

    public void RedPacketShareConditionPrepareActionObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareActionAreaView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketShareConditionPrepareActionObjectiveStateAreaItem.class, "3")) {
          return;
       }
       RedPacketConditionPrepareActionObjectiveStateAreaItem$b.a(this.mRedPacketContext.k(), p0, p1);
       return;
    }
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPrepareActionObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketShareConditionPrepareActionObjectiveStateAreaItem$a(this, a.class));
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
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPrepareActionObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareActionAreaView(this.mRedPacketContext.b());
    }
}
