package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardAreaItem;
import io3.a;
import eo3.w;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareRewardAreaView;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$State;
import java.lang.Object;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareRewardAreaView;
import com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketPopupPrepareRewardInfoView;
import android.widget.FrameLayout;
import android.view.View;
import mkc.b;
import mkc.c;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import pn3.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import go3.c;
import xm3.a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiImageView;
import go3.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.rewardarea.RedPacketConditionPrepareRewardAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPrepareRewardAreaItem extends a	// class@000e85
{

    public void RedPacketConditionPrepareRewardAreaItem(w p0){
       super(p0);
    }
    public static void lambda$bind$0(RedPacketConditionPopupPrepareRewardAreaView p0,RedPacketBaseViewModel$State p1){
       b[] uobArray;
       if (RedPacketBaseViewModel$State.Error.equals(p1)) {
          p0.getWifiErrorRootView().setVisibility(0);
          p0.getRewardInfoView().setVisibility(8);
          p0.getLoadingView().setVisibility(8);
          uobArray = new b[]{b.e};
          c.d(p0.getLoadingView(), uobArray);
       }else if(RedPacketBaseViewModel$State.Loading.equals(p1)){
          p0.getWifiErrorRootView().setVisibility(8);
          p0.getRewardInfoView().setVisibility(8);
          p0.getLoadingView().setVisibility(0);
          c.h(p0.getLoadingView(), b.e);
       }else {
          p0.getWifiErrorRootView().setVisibility(8);
          p0.getRewardInfoView().setVisibility(0);
          p0.getLoadingView().setVisibility(8);
          uobArray = new b[]{b.e};
          c.d(p0.getLoadingView(), uobArray);
       }
       return;
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPrepareRewardAreaView p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPrepareRewardAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       c.a(p0.getRewardInfoView(), subLifecycle, p1.A0());
       p1.w0().observe(subLifecycle, new a(p0));
       e.b(p0.getWifiErrorIconView(), subLifecycle, p1.C0());
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public e createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareRewardAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPrepareRewardAreaItem$a(this, e.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPrepareRewardAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPrepareRewardAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPrepareRewardAreaView(this.mRedPacketContext.b());
    }
}
