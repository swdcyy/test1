package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$c;
import erd.g;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayAuthorStateResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteDisplayAuthorStateManager$c implements g	// class@0007fa
{
    public final LiveLiteDisplayAuthorStateManager b;

    public void LiveLiteDisplayAuthorStateManager$c(LiveLiteDisplayAuthorStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager$c.class, "1")) {
       }else {
          a.p(p0, "response");
          this.b.e = p0.getMIntervalMs();
       }
       return;
    }
}
