package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$g;
import erd.g;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteDisplayAuthorStateManager$g implements g	// class@0007fe
{
    public final LiveLiteDisplayAuthorStateManager b;

    public void LiveLiteDisplayAuthorStateManager$g(LiveLiteDisplayAuthorStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager$g.class, "1")) {
       }else {
          a.p(p0, "state");
          this.b.d = p0;
          b.P(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayAuthorStateManager"), "request subscribe ");
       }
       return;
    }
}
