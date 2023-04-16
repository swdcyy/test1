package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView$a;
import ub.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.a;
import java.lang.Runnable;
import ekd.k1;

public final class RedPacketSwordAnimView$a extends a	// class@000f34
{
    public final RedPacketSwordAnimView b;
    public final Uri c;

    public void RedPacketSwordAnimView$a(RedPacketSwordAnimView p0,Uri p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       Integer this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RedPacketSwordAnimView$a.class, "1")) {
       }else {
          LiveNewRedPacketLogTag lIVE_NORMAL_ = LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET;
          int i = 0;
          this = (p1 != null)? Integer.valueOf(p1.getWidth()): i;
          if (p1 != null) {
             i = Integer.valueOf(p1.getHeight());
          }
          b.d0(lIVE_NORMAL_, "[SwordAnimView]Load Image Complete:", "w", this, "h", i);
          if (p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)) {
             k1.o(new a(this));
          }
       }
    label_004b :
       return;
    }
}
