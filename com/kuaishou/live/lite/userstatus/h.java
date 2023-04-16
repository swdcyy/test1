package com.kuaishou.live.lite.userstatus.h;
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
import td3.m;
import java.util.List;

public final class h implements g	// class@000b99
{
    public final k b;
    public final String c;
    public final boolean d;

    public void h(k p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       b.H(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.getTimeConsumingUserStatus failed", "liveStreamId", this.c, p0);
       if (this.d != null) {
          tb.k.onError(p0);
       }else {
          tb.l.add(new m(tb, p0));
       }
       return;
    }
}
