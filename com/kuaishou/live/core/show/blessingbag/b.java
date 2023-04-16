package com.kuaishou.live.core.show.blessingbag.b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$AudienceStatus;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$a;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$b;
import java.lang.Long;
import n91.f;
import lp3.c;
import lp3.i;
import z12.x;

public class b extends CountDownTimer	// class@000a07
{
    public final long a;
    public final LiveBlessingBagContainer b;

    public void b(LiveBlessingBagContainer p0,long p1,long p2,long p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveBlessingBagContainer"), "countDownFinished");
       b tb = this.b;
       tb.n = 0;
       tb.e.setText(a1.p(R.string.arg_RES_7f101ec2));
       tb = this.b;
       tb.r = true;
       tb.k = LiveBlessingBagContainer$AudienceStatus.WAITING_RECEIVE;
       LiveBlessingBagContainer j = tb.j;
       if (j != null) {
          j.a(tb.m);
          tb = this.b;
          tb.j.b(tb.m, tb.k.value());
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "1")) {
          return;
       }
       if (this.b.n <= 0) {
          b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveBlessingBagContainer"), "onTick, getCountBagEndTime");
          b tb = this.b;
          tb.n = this.a + tb.o.a(f.class).s();
       }
       this.b.e.setText(x.g((p0 + 1000)));
       return;
    }
}
