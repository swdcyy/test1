package com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyObjectiveStateAreaItem;
import io3.a;
import eo3.w;
import bo3.g;
import com.kwai.framework.model.user.UserInfo;
import bo3.g$a;
import on3.c$b;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import on3.k;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import on3.c;
import bn3.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$b;
import android.view.View$OnClickListener;
import bn3.b;
import com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$c;
import bn3.c;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketShareConditionPreparePolicyObjectiveStateAreaItem extends a	// class@000ec5
{

    public void RedPacketShareConditionPreparePolicyObjectiveStateAreaItem(w p0){
       super(p0);
    }
    public static void lambda$bind$0(g p0,UserInfo p1){
       p0.C0(new g$a(p1));
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketPopupPrepareSharePolicyAreaView p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketShareConditionPreparePolicyObjectiveStateAreaItem.class, "3")) {
          return;
       }
       SubLifecycleController subLifecycle = this.mRedPacketContext.k();
       g.a(p0.getFirstLineTextView(), subLifecycle, p1.E0());
       g.a(p0.getSecondLineTextView(), subLifecycle, p1.F0());
       p1.A0().observe(subLifecycle, new a(p0));
       p0.getRefreshView().setOnClickListener(new RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$b(this, p1));
       p1.p.observe(subLifecycle, new b(p0));
       g.a(p0.getAvatarRightTipTextView(), subLifecycle, p1.q);
       p0.getAvatarRightTipTextView().setOnClickListener(new RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$c(this, p1));
       p0.setOnItemClickedListener(new c(p1));
       return;
    }
    public g createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPreparePolicyObjectiveStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketShareConditionPreparePolicyObjectiveStateAreaItem$a(this, g.class));
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
    public RedPacketPopupPrepareSharePolicyAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPreparePolicyObjectiveStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketPopupPrepareSharePolicyAreaView(this.mRedPacketContext.b());
    }
}
