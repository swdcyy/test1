package com.kuaishou.live.core.show.redpacket.krn.f$b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.krn.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPackShowPage;
import java.lang.Long;
import z12.x;
import lnc.a1;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;

public class f$b extends CountDownTimer	// class@000ed6
{
    public final f a;

    public void f$b(f p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       b.P(f.j, "countDownFinished, redPacketId = "+this.a.b);
       f$b ta = this.a;
       f g = ta.g;
       if (g != null) {
          ta.e(g);
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, f$b.class, "1")) {
          return;
       }
       this.a.a.h(x.g((p0 + 1000)), a1.d(R.dimen.arg_RES_7f070980));
       return;
    }
}
