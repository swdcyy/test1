package com.kuaishou.live.lite.userstatus.g;
import erd.g;
import com.kuaishou.live.lite.userstatus.k;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.y;
import td3.n;
import mrd.c;
import java.util.List;

public final class g implements g	// class@000b98
{
    public final k b;
    public final String c;
    public final boolean d;

    public void g(k p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.getUserStatus - success", "liveStreamId", this.c);
       tb.h = p0;
       tb.i.onNext(p0);
       if (this.d != null) {
          tb.i.onComplete();
       }else {
          k i = tb.i;
          Objects.requireNonNull(i);
          tb.l.add(new n(i));
       }
       return;
    }
}
