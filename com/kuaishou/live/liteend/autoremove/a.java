package com.kuaishou.live.liteend.autoremove.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000bba
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLiteLogTag.LIVE_LITE_END, "LiveLiteEndAutoRemoveFeedPresenter.onCreate failed", p0);
    }
}
