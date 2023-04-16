package com.kuaishou.live.core.show.closepage.audience.basicinfo.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@000a37
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenterV2"), "request feed error", p0);
    }
}
