package com.kuaishou.live.common.core.component.follow.cache.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@001104
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.FOLLOW_CACHE, "refreshFollowingCacheIfNecessary failed", p0);
    }
}
