package com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketFloatView;
import java.lang.String;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;

public class LiveFellowRedPacketFloatView$c extends AnimatorListenerAdapter	// class@000ec1
{
    public final String a;
    public final LiveFellowRedPacketFloatView b;

    public void LiveFellowRedPacketFloatView$c(LiveFellowRedPacketFloatView p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketFloatView$c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.f.setText(this.a);
       return;
    }
}
