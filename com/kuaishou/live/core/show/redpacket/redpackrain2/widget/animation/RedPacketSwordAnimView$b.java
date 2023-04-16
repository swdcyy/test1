package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView$b;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public final class RedPacketSwordAnimView$b implements TimeInterpolator	// class@000f35
{
    public final RedPacketSwordAnimView a;

    public void RedPacketSwordAnimView$b(RedPacketSwordAnimView p0){
       this.a = p0;
       super();
    }
    public float getInterpolation(float p0){
       if (PatchProxy.isSupport(RedPacketSwordAnimView$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, RedPacketSwordAnimView$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return Math.abs((p0 - 0x3f800000));
    }
}
