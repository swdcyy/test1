package com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollSourceAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupScrollSourceAreaView;
import xn3.a;
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
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollSourceAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionScrollSourceAreaItem extends a	// class@000ea9
{

    public void RedPacketConditionScrollSourceAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupScrollSourceAreaView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionScrollSourceAreaItem.class, "3")) {
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
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollSourceAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionScrollSourceAreaItem$a(this, a.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupScrollSourceAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollSourceAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupScrollSourceAreaView(this.mRedPacketContext.b());
    }
}
