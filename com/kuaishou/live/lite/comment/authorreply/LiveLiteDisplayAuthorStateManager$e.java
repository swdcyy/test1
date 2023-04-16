package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$e;
import brd.w;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
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

public final class LiveLiteDisplayAuthorStateManager$e implements w	// class@0007fc
{
    public final LiveLiteDisplayAuthorStateManager b;

    public void LiveLiteDisplayAuthorStateManager$e(LiveLiteDisplayAuthorStateManager p0){
       this.b = p0;
       super();
    }
    public final void subscribe(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager$e.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       b.P(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayAuthorStateManager"), "request timeout");
       p0.onNext(this.b.d);
       p0.onComplete();
       return;
    }
}
