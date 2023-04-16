package com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView;
import nn3.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPrepareActionAreaView;
import vm3.a;
import android.view.View$OnClickListener;
import androidx.lifecycle.LiveData;
import nn3.c;
import android.view.View;
import xh3.l;
import xh3.g;
import go3.t;
import com.kuaishou.live.redpacket.core.condition.item.lottery.base.preparepage.actionarea.RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketConditionPopupPrepareActionAreaView$a;

public class RedPacketConditionPrepareActionObjectiveStateAreaItem$b	// class@000e7a
{

    public void RedPacketConditionPrepareActionObjectiveStateAreaItem$b(){
       super();
    }
    public static void a(LifecycleOwner p0,RedPacketConditionPopupPrepareActionAreaView p1,i p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, RedPacketConditionPrepareActionObjectiveStateAreaItem$b.class, "1")) {
          return;
       }
       TextView actionView = p1.getActionView();
       actionView.setOnClickListener(new a(p2));
       l.d(actionView, p0, p2.A0(), true);
       g.a(actionView, p0, p2.m);
       t.a(p1, p0, p2.n);
       p1.setVisibilityListener(new RedPacketConditionPrepareActionObjectiveStateAreaItem$b$a(p2));
       return;
    }
}
