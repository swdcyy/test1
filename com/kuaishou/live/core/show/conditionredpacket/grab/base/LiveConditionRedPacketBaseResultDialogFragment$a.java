package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment$a;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveConditionRedPacketBaseResultDialogFragment$a implements View$OnTouchListener	// class@000a7a
{
    public final LiveConditionRedPacketBaseResultDialogFragment b;

    public void LiveConditionRedPacketBaseResultDialogFragment$a(LiveConditionRedPacketBaseResultDialogFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveConditionRedPacketBaseResultDialogFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!n.N(this.b.v, p1)) {
          return false;
       }
       this.b.dismissAllowingStateLoss();
       return true;
    }
}
