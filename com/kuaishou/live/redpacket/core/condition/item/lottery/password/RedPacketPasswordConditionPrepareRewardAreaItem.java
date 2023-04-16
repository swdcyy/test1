package com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem;
import io3.a;
import eo3.w;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPasswordConditionPopupPrepareRewardAreaView;
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
import java.lang.String;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import ao3.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LiveData;
import pn3.e;
import androidx.lifecycle.LifecycleOwner;
import go3.c;
import an3.b;
import androidx.lifecycle.Observer;
import an3.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import go3.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.RedPacketPasswordConditionPrepareRewardAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketPasswordConditionPrepareRewardAreaItem extends a	// class@000eba
{

    public void RedPacketPasswordConditionPrepareRewardAreaItem(w p0){
       super(p0);
    }
    public static void lambda$bind$0(RedPacketPasswordConditionPopupPrepareRewardAreaView p0,RedPacketBaseViewModel$State p1){
       b[] uobArray;
       if (RedPacketBaseViewModel$State.Error.equals(p1)) {
          p0.getWifiErrorRootView().setVisibility(0);
          p0.getRewardInfoView().setVisibility(8);
          p0.setPasswordTextViewVisibility(8);
          p0.getLoadingView().setVisibility(8);
          uobArray = new b[]{b.e};
          c.d(p0.getLoadingView(), uobArray);
       }else if(RedPacketBaseViewModel$State.Loading.equals(p1)){
          p0.getWifiErrorRootView().setVisibility(8);
          p0.getRewardInfoView().setVisibility(8);
          p0.setPasswordTextViewVisibility(8);
          p0.getLoadingView().setVisibility(0);
          c.h(p0.getLoadingView(), b.e);
       }else {
          p0.getWifiErrorRootView().setVisibility(8);
          p0.getRewardInfoView().setVisibility(0);
          p0.setPasswordTextViewVisibility(0);
          p0.getLoadingView().setVisibility(8);
          uobArray = new b[]{b.e};
          c.d(p0.getLoadingView(), uobArray);
       }
       return;
    }
    public static void lambda$bind$1(RedPacketPasswordConditionPopupPrepareRewardAreaView p0,String p1){
       p0.setPasswordText(a1.p(R.string.arg_RES_7f101fc1)+p1);
       int i = (TextUtils.x(p1))? 8: 0;
       p0.setVisibility(i);
       return;
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketPasswordConditionPopupPrepareRewardAreaView p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPasswordConditionPrepareRewardAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       c.a(p0.getRewardInfoView(), subLifecycle, p1.A0());
       p1.w0().observe(subLifecycle, new b(p0));
       p1.o.observe(subLifecycle, new c(p0));
       e.b(p0.getWifiErrorIconView(), subLifecycle, p1.C0());
       return;
    }
    public i createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareRewardAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketPasswordConditionPrepareRewardAreaItem$a(this, i.class));
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
    public RedPacketPasswordConditionPopupPrepareRewardAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketPasswordConditionPrepareRewardAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketPasswordConditionPopupPrepareRewardAreaView(this.mRedPacketContext.b());
    }
}
