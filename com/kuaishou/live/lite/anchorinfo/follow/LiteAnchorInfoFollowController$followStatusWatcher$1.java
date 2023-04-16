package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$followStatusWatcher$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;

public final class LiteAnchorInfoFollowController$followStatusWatcher$1 extends Lambda implements a	// class@001e54
{
    public final LiteAnchorInfoFollowController this$0;

    public void LiteAnchorInfoFollowController$followStatusWatcher$1(LiteAnchorInfoFollowController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiteAnchorInfoFollowController obj = PatchProxy.apply(null, this, LiteAnchorInfoFollowController$followStatusWatcher$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.j;
       boolean b = true;
       if (obj == null || obj.c() != b) {
          b = false;
       }
       return b;
    }
}
