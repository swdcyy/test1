package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowQuickCommentStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class FollowConfigUtil$mFollowQuickCommentStyle$2 extends Lambda implements a	// class@0010af
{
    public static final FollowConfigUtil$mFollowQuickCommentStyle$2 INSTANCE;

    static {
       FollowConfigUtil$mFollowQuickCommentStyle$2.INSTANCE = new FollowConfigUtil$mFollowQuickCommentStyle$2();
    }
    public void FollowConfigUtil$mFollowQuickCommentStyle$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mFollowQuickCommentStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("followQuickCommentStyle", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
