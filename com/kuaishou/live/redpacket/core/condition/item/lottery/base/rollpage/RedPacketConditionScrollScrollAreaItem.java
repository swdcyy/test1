package com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollScrollAreaItem;
import io3.a;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.rollpage.RedPacketConditionPopupScrollScrollAreaView;
import wn3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import go3.r;
import kotlin.jvm.internal.a;
import go3.q;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupScrollScrollAreaView;
import xh3.l;
import go3.y;
import go3.x;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.rollpage.RedPacketConditionScrollScrollAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionScrollScrollAreaItem extends a	// class@000ea7
{
    public RedPacketConditionPopupScrollScrollAreaView mRedPacketConditionPopupScrollScrollAreaView;

    public void RedPacketConditionScrollScrollAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupScrollScrollAreaView p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionScrollScrollAreaItem.class, "3")) {
          return;
       }
       this.mRedPacketConditionPopupScrollScrollAreaView = p0;
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       c k = p1.k;
       if (!PatchProxy.applyVoidThreeRefs(p0, subLifecycle, k, null, r.class, "1")) {
          a.p(p0, "$this$bindLuckyUserList");
          a.p(subLifecycle, "lifecycleOwner");
          a.p(k, "luckyUserList");
          k.observe(subLifecycle, new q(p0, subLifecycle));
       }
       l.c(p0.getLoadingView(), subLifecycle, p1.A0());
       View loadingView = p0.getLoadingView();
       LiveData liveData = p1.A0();
       if (!PatchProxy.applyVoidThreeRefs(loadingView, subLifecycle, liveData, null, y.class, "1")) {
          a.p(loadingView, "$this$bindTipsVisibility");
          a.p(subLifecycle, "lifecycleOwner");
          a.p(liveData, "isShow");
          liveData.observe(subLifecycle, new x(loadingView));
       }
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public c createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollScrollAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionScrollScrollAreaItem$a(this, c.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupScrollScrollAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionScrollScrollAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupScrollScrollAreaView(this.mRedPacketContext.b());
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionScrollScrollAreaItem.class, "4")) {
          return;
       }
       RedPacketConditionScrollScrollAreaItem tmRedPacketC = this.mRedPacketConditionPopupScrollScrollAreaView;
       if (tmRedPacketC != null) {
          tmRedPacketC.b();
       }
       return;
    }
}
