package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$c;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
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

public class LiveRedPacketContainerDialogFragment$c implements View$OnTouchListener	// class@000e63
{
    public final LiveRedPacketContainerDialogFragment b;

    public void LiveRedPacketContainerDialogFragment$c(LiveRedPacketContainerDialogFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveRedPacketContainerDialogFragment$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       LiveRedPacketContainerDialogFragment$c tb = this.b;
       if (tb.S != null || !n.N(tb.E, p1)) {
          return false;
       }
       this.b.dismissAllowingStateLoss();
       this.b.zh();
       return true;
    }
}
