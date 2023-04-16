package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$followStatusWatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;

public final class LiteAnchorInfoFollowController$followStatusWatcher$2 extends Lambda implements a	// class@001e55
{
    public final LiteAnchorInfoFollowController this$0;

    public void LiteAnchorInfoFollowController$followStatusWatcher$2(LiteAnchorInfoFollowController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoFollowController$followStatusWatcher$2.class, "1")) {
          return;
       }
       if (!this.this$0.V2().isFollowingOrFollowRequesting()) {
          this.this$0.W2();
       }else {
          LiteAnchorInfoFollowController$followStatusWatcher$2 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoid(null, tthis$0, LiteAnchorInfoFollowController.class, "9")) {
             LiteAnchorInfoFollowController j = tthis$0.j;
             if (j != null) {
                b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO_FOLLOW, "removeFollowItem");
                tthis$0.q.a(j);
                tthis$0.j = null;
             }
          }
       }
       return;
    }
}
