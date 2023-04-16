package com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import eo3.d;

public class RedPacketConditionOpenTimeContainer$a extends m	// class@000ece
{
    public final RedPacketConditionOpenTimeContainer c;

    public void RedPacketConditionOpenTimeContainer$a(RedPacketConditionOpenTimeContainer p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionOpenTimeContainer$a.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       RedPacketConditionOpenTimeContainer s = this.c.s;
       if (s != null) {
          s.a(1);
       }
       return;
    }
}
