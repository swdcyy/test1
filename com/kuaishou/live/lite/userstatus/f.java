package com.kuaishou.live.lite.userstatus.f;
import erd.g;
import com.kuaishou.live.lite.userstatus.k;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.y;
import td3.n;
import mrd.c;
import java.util.List;

public final class f implements g	// class@000b97
{
    public final k b;
    public final String c;
    public final boolean d;

    public void f(k p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.getTimeConsumingUserStatus - success", "liveStreamId", this.c);
       tb.j = p0;
       tb.k.onNext(p0);
       if (this.d != null) {
          tb.k.onComplete();
       }else {
          k k = tb.k;
          Objects.requireNonNull(k);
          tb.l.add(new n(k));
       }
       return;
    }
}
