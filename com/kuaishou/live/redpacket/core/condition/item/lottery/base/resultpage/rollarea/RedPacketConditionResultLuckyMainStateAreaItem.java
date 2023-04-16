package com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.rollarea.RedPacketConditionResultLuckyMainStateAreaItem;
import io3.a;
import eo3.w;
import com.kwai.framework.model.user.UserInfo;
import eo3.a;
import java.lang.Object;
import om3.d;
import om3.a;
import eo3.b0;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView;
import sn3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultLuckyAreaView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import go3.e;
import go3.p;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.rollarea.RedPacketConditionResultLuckyMainStateAreaItem$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.resultpage.rollarea.RedPacketConditionResultLuckyMainStateAreaItem$a;
import nm3.d;
import android.content.Context;
import ym3.a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.resultpage.RedPacketConditionPopupResultLuckyAreaView$a;
import java.lang.Integer;
import java.lang.Number;
import u52.y;

public class RedPacketConditionResultLuckyMainStateAreaItem extends a	// class@000e94
{

    public void RedPacketConditionResultLuckyMainStateAreaItem(w p0){
       super(p0);
    }
    public static void a(RedPacketConditionResultLuckyMainStateAreaItem p0,UserInfo p1){
       p0.lambda$createView$0(p1);
    }
    private void lambda$createView$0(UserInfo p0){
       this.mRedPacketContext.f().e().a().F0(p0, this.getFollowSource(this.mRedPacketContext.h().b()));
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupResultLuckyAreaView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionResultLuckyMainStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       l.c(p0.getEmptyRootView(), subLifecycle, p1.C0());
       e.b(p0.getEmptyImageView(), subLifecycle, p1.A0());
       l.c(p0.getLuckyUserRootView(), subLifecycle, p1.E0());
       l.d(p0.getTipsView(), subLifecycle, p1.F0(), true);
       p.a(p0, subLifecycle, p1.D0());
       l.c(p0.getWifiErrorRootView(), subLifecycle, p1.H0());
       e.b(p0.getWifiErrorIconView(), subLifecycle, p1.G0());
       p0.getRefreshView().setOnClickListener(new RedPacketConditionResultLuckyMainStateAreaItem$b(this, p1));
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public a createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionResultLuckyMainStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionResultLuckyMainStateAreaItem$a(this, a.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupResultLuckyAreaView createView(){
       RedPacketConditionPopupResultLuckyAreaView obj = PatchProxy.apply(null, this, RedPacketConditionResultLuckyMainStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RedPacketConditionPopupResultLuckyAreaView(this.mRedPacketContext.b());
       obj.setAvatarListener(new a(this));
       return obj;
    }
    public final int getFollowSource(int p0){
       RedPacketConditionResultLuckyMainStateAreaItem redPacketCon = RedPacketConditionResultLuckyMainStateAreaItem.class;
       if (PatchProxy.isSupport(redPacketCon)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, redPacketCon, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == 15) {
          return 46;
       }else {
          return y.s(p0);
       }
    }
}
