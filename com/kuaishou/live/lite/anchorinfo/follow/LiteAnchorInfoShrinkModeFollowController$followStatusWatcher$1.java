package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;

public final class LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1 extends Lambda implements a	// class@001e5d
{
    public final LiteAnchorInfoShrinkModeFollowController this$0;

    public void LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1(LiteAnchorInfoShrinkModeFollowController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1 obj = PatchProxy.apply(objArray, this, LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiteAnchorInfoShrinkModeFollowController.class, "3");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.k.c();
       return b;
    }
}
