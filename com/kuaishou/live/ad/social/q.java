package com.kuaishou.live.ad.social.q;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.lang.String;
import java.util.Map;
import com.kuaishou.android.live.log.b;

public final class q implements g	// class@000a1d
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       b.J(LiveLogTag.AD, "submit task count fail", ImmutableMap.of("exception", p0));
    }
}
