package com.kuaishou.live.core.show.redpacket.krn.f$a;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$b;
import com.kuaishou.live.core.show.redpacket.krn.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;

public class f$a implements LiveActivityRedPacketPendantView$b	// class@000ed5
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       b.P(f.j, "onPendantDetach, releaseCountDownTimer, redPacketId = "+this.a.b);
       this.a.d();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       b.P(f.j, "onPendantAttach, startCountDownTimer, redPacketId = "+this.a.b);
       this.a.f();
       return;
    }
}
