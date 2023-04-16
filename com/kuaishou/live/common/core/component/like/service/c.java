package com.kuaishou.live.common.core.component.like.service.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@00147b
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_LIKE, "LiveAudienceHeartParticleServiceImpl :: get audience status failed ", p0);
    }
}
