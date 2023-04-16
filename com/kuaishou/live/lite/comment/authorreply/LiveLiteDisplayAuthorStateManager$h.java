package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteDisplayAuthorStateManager$h implements g	// class@0007ff
{
    public static final LiveLiteDisplayAuthorStateManager$h b;

    static {
       LiveLiteDisplayAuthorStateManager$h.b = new LiveLiteDisplayAuthorStateManager$h();
    }
    public void LiveLiteDisplayAuthorStateManager$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager$h.class, "1")) {
       }else {
          b.y(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayAuthorStateManager"), "request error", p0);
       }
       return;
    }
}
