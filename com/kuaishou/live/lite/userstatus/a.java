package com.kuaishou.live.lite.userstatus.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;

public final class a implements g	// class@000b91
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLiteLogTag.USER_STATUS, "LiteDelayInfoController.fetchDelayInfo failed", p0);
       if (!SystemUtil.K()) {
          return;
       }
       throw new RuntimeException(p0);
    }
}
