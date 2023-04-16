package com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewBottomAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketConditionPendantBottomView;
import kn3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import com.kuaishou.live.redpacket.core.ui.view.pendant.RedPacketPendantBottomView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.l;
import android.widget.TextView;
import xh3.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.pendant.RedPacketConditionPendantViewBottomAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPendantViewBottomAreaItem extends a	// class@000ec7
{

    public void RedPacketConditionPendantViewBottomAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPendantBottomView p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPendantViewBottomAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       LiveTextView countDownTex = p0.getCountDownTextView();
       l.c(countDownTex, subLifecycle, p1.n);
       g.a(countDownTex, subLifecycle, p1.o);
       l.c(p0.getBottomAreaRootView(), subLifecycle, p1.v0());
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public d createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPendantViewBottomAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPendantViewBottomAreaItem$a(this, d.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPendantBottomView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPendantViewBottomAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPendantBottomView(this.mRedPacketContext.b());
    }
}
