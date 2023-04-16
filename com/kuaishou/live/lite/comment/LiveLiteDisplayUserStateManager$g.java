package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$g;
import erd.g;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
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

public final class LiveLiteDisplayUserStateManager$g implements g	// class@0007f4
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$g(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager$g.class, "1")) {
       }else {
          a.p(p0, "state");
          this.b.c = p0;
          b.P(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayUserStateManager"), "request subscribe ");
       }
       return;
    }
}
