package com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer$b;
import android.view.View$OnTouchListener;
import com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import eo3.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class RedPacketConditionOpenTimeContainer$b implements View$OnTouchListener	// class@000ecf
{
    public final RedPacketConditionOpenTimeContainer b;

    public void RedPacketConditionOpenTimeContainer$b(RedPacketConditionOpenTimeContainer p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, RedPacketConditionOpenTimeContainer$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!n.N(this.b.t, p1)) {
          return 0;
       }
       RedPacketConditionOpenTimeContainer s = this.b.s;
       if (s != null) {
          s.a(0);
       }
       this.b.dismissAllowingStateLoss();
       return true;
    }
}
