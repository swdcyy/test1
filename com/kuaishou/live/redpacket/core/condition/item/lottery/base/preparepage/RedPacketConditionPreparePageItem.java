package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.RedPacketConditionPreparePageItem;
import com.kuaishou.live.redpacket.core.ui.item.RedPacketPageItem;
import eo3.w;
import java.util.Map;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePageView;
import mn3.a;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView;
import com.kuaishou.live.redpacket.core.ui.vm.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io3.a;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import go3.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.RedPacketConditionPreparePageItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPreparePageItem extends RedPacketPageItem	// class@000e74
{

    public void RedPacketConditionPreparePageItem(w p0,Map p1){
       super(p0, p1);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketBasePageView p0,a p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPreparePageView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPreparePageItem.class, "3")) {
          return;
       }
       super.bind(p0, p1);
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       e.b(p0.getTopCoverImageView(), subLifecycle, p1.k);
       e.b(p0.getBottomCoverImageView(), subLifecycle, p1.l);
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public a createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPreparePageItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPreparePageItem$a(this, a.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketBasePageView createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPreparePageView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPreparePageItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPreparePageView(this.mRedPacketContext.b());
    }
}
