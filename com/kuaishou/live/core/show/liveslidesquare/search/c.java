package com.kuaishou.live.core.show.liveslidesquare.search.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.show.liveslidesquare.search.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000c9c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.LIVE_SQUARE.appendTag("LiveSquareSideBarTopSearchEntranceV2Presenter"), "request search words failed", p0);
    }
}
