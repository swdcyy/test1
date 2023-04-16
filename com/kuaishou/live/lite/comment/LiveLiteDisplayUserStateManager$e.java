package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$e;
import brd.w;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import java.lang.Object;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteDisplayUserStateManager$e implements w	// class@0007f2
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$e(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public final void subscribe(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager$e.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       b.P(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayUserStateManager"), "request timeout");
       p0.onNext(this.b.c);
       p0.onComplete();
       return;
    }
}
