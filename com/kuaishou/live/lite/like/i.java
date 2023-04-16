package com.kuaishou.live.lite.like.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class i implements g	// class@0009f7
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_LIKE, "LiveLiteLikePresenter :: get audience status failed ", p0);
    }
}
