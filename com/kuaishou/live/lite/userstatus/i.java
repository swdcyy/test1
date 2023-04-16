package com.kuaishou.live.lite.userstatus.i;
import erd.g;
import com.kuaishou.live.lite.userstatus.k;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.y;
import td3.n;
import mrd.c;
import java.util.List;

public final class i implements g	// class@000b9a
{
    public final k b;
    public final String c;
    public final boolean d;

    public void i(k p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       b.H(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.getUserStatus - error", "liveStreamId", this.c, p0);
       if (this.d != null) {
          tb.i.onError(p0);
       }else {
          k i = tb.i;
          Objects.requireNonNull(i);
          tb.l.add(new n(i));
       }
       return;
    }
}
