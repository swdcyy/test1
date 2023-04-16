package com.kuaishou.live.audience.component.activitycoupondialog.c$a;
import lf3.g;
import com.kuaishou.live.audience.component.activitycoupondialog.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCKuaishouNightLotteryChanging;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import p91.m;
import java.util.Objects;
import java.lang.Integer;
import java.util.Random;
import xw0.a;
import java.lang.Runnable;
import e93.f;
import lf3.f;

public class c$a implements g	// class@000a3f
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, str)) {
       }else if(c.u >= p0.maxRequestTimes){
          b.Z(LiveLogTag.LIVE_ACTIVITY_RN_POPUP, "coupon dialog reach max request time");
       }else if(this.b.p.s() - p0.maxDelayDeadlineTimeMs > 0){
          this.b.S8();
       }else {
          c$a tb = this.b;
          int i = (int)p0.maxDelayMs;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, c.class, str)) {
             Random random = new Random();
             int i1 = (i <= 0)? 0: random.nextInt(i);
             if (i <= 0) {
                tb.S8();
             }else {
                f.k("requestCouponInfo", new a(tb), tb, (long)i1);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
