package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionMainStateAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import nn3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareActionAreaView;
import androidx.lifecycle.LiveData;
import nn3.c;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import xh3.g;
import go3.t;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionMainStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPrepareActionMainStateAreaItem extends a	// class@000e76
{

    public void RedPacketConditionPrepareActionMainStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareActionAreaView p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPrepareActionMainStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       TextView actionView = p0.getActionView();
       l.d(actionView, subLifecycle, p1.A0(), true);
       g.a(actionView, subLifecycle, p1.n);
       t.a(p0, subLifecycle, p1.o);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public e createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareActionMainStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPrepareActionMainStateAreaItem$a(this, e.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPrepareActionAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareActionMainStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareActionAreaView(this.mRedPacketContext.b());
    }
}
