package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$c;
import erd.g;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayUserStateResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteDisplayUserStateManager$c implements g	// class@0007f0
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$c(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager$c.class, "1")) {
       }else {
          a.p(p0, "response");
          this.b.d = p0.mIntervalMs;
       }
       return;
    }
}
