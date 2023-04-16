package com.kuaishou.live.playback.play.progresspreview.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000d34
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_PLAYBACK_PREVIEW, "fetchSpriteImages, fail", p0);
    }
}
