package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyObjectiveStateAreaItem$b;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPreparePolicyAreaView;
import on3.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePolicyAreaView;
import androidx.lifecycle.LiveData;
import xh3.g;
import on3.c;
import go3.s;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.policyarea.RedPacketConditionPreparePolicyObjectiveStateAreaItem$b$a;
import android.view.View$OnClickListener;

public class RedPacketConditionPreparePolicyObjectiveStateAreaItem$b	// class@000e82
{

    public void RedPacketConditionPreparePolicyObjectiveStateAreaItem$b(){
       super();
    }
    public static void a(LifecycleOwner p0,RedPacketConditionPopupPreparePolicyAreaView p1,k p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, RedPacketConditionPreparePolicyObjectiveStateAreaItem$b.class, "1")) {
          return;
       }
       g.a(p1.getFirstLineTextView(), p0, p2.E0());
       g.a(p1.getSecondLineTextView(), p0, p2.F0());
       s.a(p1, p0, p2.A0());
       p1.getRefreshView().setOnClickListener(new RedPacketConditionPreparePolicyObjectiveStateAreaItem$b$a(p2));
       return;
    }
}
