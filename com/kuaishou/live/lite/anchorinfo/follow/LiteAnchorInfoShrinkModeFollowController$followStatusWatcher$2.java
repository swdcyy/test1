package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import o83.f;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;

public final class LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2 extends Lambda implements a	// class@001e5e
{
    public final LiteAnchorInfoShrinkModeFollowController this$0;

    public void LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2(LiteAnchorInfoShrinkModeFollowController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2.class, "1")) {
          return;
       }
       LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiteAnchorInfoShrinkModeFollowController.class, "6")) {
          if (tthis$0.V2().isFollowingOrFollowRequesting()) {
             tthis$0.m.a();
          }else {
             tthis$0.k.d();
          }
       }
       return;
    }
}
