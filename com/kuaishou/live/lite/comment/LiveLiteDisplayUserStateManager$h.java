package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$h;
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

public final class LiveLiteDisplayUserStateManager$h implements g	// class@0007f5
{
    public static final LiveLiteDisplayUserStateManager$h b;

    static {
       LiveLiteDisplayUserStateManager$h.b = new LiveLiteDisplayUserStateManager$h();
    }
    public void LiveLiteDisplayUserStateManager$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager$h.class, "1")) {
       }else {
          b.y(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayUserStateManager"), "request error", p0);
       }
       return;
    }
}
