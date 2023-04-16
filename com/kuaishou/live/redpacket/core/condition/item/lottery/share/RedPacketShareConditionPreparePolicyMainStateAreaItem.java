package com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyMainStateAreaItem;
import io3.a;
import lnc.a1;
import eo3.w;
import android.view.View;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePolicyAreaView;
import bo3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import on3.g;
import androidx.lifecycle.LifecycleOwner;
import wm3.a;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePolicyAreaView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils$TruncateAt;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.redpacket.core.condition.item.lottery.share.RedPacketShareConditionPreparePolicyMainStateAreaItem$a;
import nm3.d;
import android.content.Context;

public class RedPacketShareConditionPreparePolicyMainStateAreaItem extends a	// class@000ec0
{
    public static final int TIP_LEFT_RIGHT_MARGIN;

    static {
       RedPacketShareConditionPreparePolicyMainStateAreaItem.TIP_LEFT_RIGHT_MARGIN = a1.e(16.00f);
    }
    public void RedPacketShareConditionPreparePolicyMainStateAreaItem(w p0){
       super(p0);
    }
    public void bind(View p0,RedPacketBaseViewModel p1){
       this.bind(p0, p1);
    }
    public void bind(RedPacketConditionPopupPreparePolicyAreaView p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketShareConditionPreparePolicyMainStateAreaItem.class, "3")) {
          return;
       }
       a.a(p0, p1, this.mRedPacketContext.k());
       TextView secondLineTe = p0.getSecondLineTextView();
       if (secondLineTe.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          int tIP_LEFT_RIG = RedPacketShareConditionPreparePolicyMainStateAreaItem.TIP_LEFT_RIGHT_MARGIN;
          p1.leftMargin = tIP_LEFT_RIG;
          p1.rightMargin = tIP_LEFT_RIG;
          secondLineTe.setMaxLines(1);
          secondLineTe.setEllipsize(TextUtils$TruncateAt.END);
       }
       return;
    }
    public d createVM(){
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPreparePolicyMainStateAreaItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.createVM(new RedPacketShareConditionPreparePolicyMainStateAreaItem$a(this, d.class));
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
    public RedPacketConditionPopupPreparePolicyAreaView createView(){
       Object obj = PatchProxy.apply(null, this, RedPacketShareConditionPreparePolicyMainStateAreaItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RedPacketConditionPopupPreparePolicyAreaView(this.mRedPacketContext.b());
    }
}
