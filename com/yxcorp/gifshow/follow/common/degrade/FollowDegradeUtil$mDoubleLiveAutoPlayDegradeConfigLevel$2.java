package com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2 extends Lambda implements a	// class@001038
{
    public static final FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2 INSTANCE;

    static {
       FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2.INSTANCE = new FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2();
    }
    public void FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().c("followDoubleLiveAutoDegradeConfig", "NON_GRADE");
    }
}
