package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyMainStateAreaItem;
import io3.a;
import lnc.a1;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePolicyAreaView;
import on3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import wm3.a;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePolicyAreaView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils$TruncateAt;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyMainStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketConditionPreparePolicyMainStateAreaItem extends a	// class@000e7e
{
    public static final int TIP_LEFT_RIGHT_MARGIN;

    static {
       RedPacketConditionPreparePolicyMainStateAreaItem.TIP_LEFT_RIGHT_MARGIN = a1.e(16.00f);
    }
    public void RedPacketConditionPreparePolicyMainStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPreparePolicyAreaView p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionPreparePolicyMainStateAreaItem.class, "3")) {
          return;
       }
       a.a(p0, p1, this.mRedPacketContext.k());
       TextView secondLineTe = p0.getSecondLineTextView();
       if (secondLineTe.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          int tIP_LEFT_RIG = RedPacketConditionPreparePolicyMainStateAreaItem.TIP_LEFT_RIGHT_MARGIN;
          p1.leftMargin = tIP_LEFT_RIG;
          p1.rightMargin = tIP_LEFT_RIG;
          secondLineTe.setMaxLines(1);
          secondLineTe.setEllipsize(TextUtils$TruncateAt.END);
       }
       return;
    }
    public RedPacketBaseViewModel createVM(){
       return this.createVM();
    }
    public Object createVM(){
       return this.createVM();
    }
    public g createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPreparePolicyMainStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketConditionPreparePolicyMainStateAreaItem$a(this, g.class));
    }
    public View createView(){
       return this.createView();
    }
    public RedPacketConditionPopupPreparePolicyAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketConditionPreparePolicyMainStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPreparePolicyAreaView(this.mRedPacketContext.b());
    }
}
