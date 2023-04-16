package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;

public final class LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2 extends Lambda implements a	// class@001e5f
{
    public final LiteAnchorInfoShrinkModeFollowController this$0;

    public void LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2(LiteAnchorInfoShrinkModeFollowController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.this$0.V2().isFollowingOrFollowRequesting() ^ 0x01);
    }
}
