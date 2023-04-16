package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$asyncGetDisplayAuthorState$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import z1.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteDisplayAuthorStateManager$asyncGetDisplayAuthorState$1 extends Lambda implements a	// class@0007f8
{
    public final a $consumer;
    public final LiveLiteDisplayAuthorStateManager this$0;

    public void LiveLiteDisplayAuthorStateManager$asyncGetDisplayAuthorState$1(LiveLiteDisplayAuthorStateManager p0,a p1){
       this.this$0 = p0;
       this.$consumer = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteDisplayAuthorStateManager$asyncGetDisplayAuthorState$1.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_LITE_COMMENT.appendTag("LiveLiteDisplayAuthorStateManager"), "use cache");
       LiveLiteDisplayAuthorStateManager$asyncGetDisplayAuthorState$1 t$consumer = this.$consumer;
       if (t$consumer != null) {
          t$consumer.accept(this.this$0.d);
       }
       return;
    }
}
